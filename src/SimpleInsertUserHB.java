import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Info;
import util.UtilDB;
import util.UtilFile;

@WebServlet("/SimpleInsertUserHB")
public class SimpleInsertUserHB extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;
   public ArrayList<Integer> UsersIDs = new ArrayList<Integer>();

   public SimpleInsertUserHB() {
      super();
   }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	   
	   
	  String firstName = request.getParameter("firstName").trim();
      String lastName = request.getParameter("lastName").trim();
      String dateOfBirth = request.getParameter("dateOfBirth").trim();
      String email = request.getParameter("email").trim();
      String phone = request.getParameter("phone").trim();
      String address = request.getParameter("address").trim();
      String generateID = "";
      do
      {
      Random rnd = new Random();
	   int number = rnd.nextInt(999999);
	   generateID = String.format("%06d", number);
	   
      } 
      while (UsersIDs.contains(Integer.parseInt(generateID)));
      UsersIDs.add(Integer.parseInt(generateID));
      
      UtilDB.createUsers(Integer.parseInt(generateID), firstName, lastName, dateOfBirth, email, phone, address);

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String DBTitle = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + DBTitle + "</title></head>\n" + //
            "<body bgcolor=\"#2D2D2D\">\n" + //
            "<h1 align=\"center\" style=\"color:white;font-family:monospace;\">" + DBTitle + "</h1>\n");
      out.println("<ul>");
      String styling = "style=\"color:white;font-family:monospace;\"";
      out.println("<li " + styling + "> ID Number: " + Integer.parseInt(generateID));
      out.println("<li " + styling + "> First Name: " + firstName);
      out.println("<li " + styling + "> Last Name: " + lastName);
      out.println("<li " + styling + "> Date Of Birth: " + dateOfBirth);
      out.println("<li " + styling + "> Phone: " + phone);		      
      out.println("<li " + styling + "> Email: " + email);		      
      out.println("<li " + styling + "> Address: " + address);	

      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + insertUser + " style=\"color:#4286f4;font-family:monospace;\">Search Data</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
