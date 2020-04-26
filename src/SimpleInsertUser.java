import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.Info;
import util.UtilDB;

@WebServlet("/SimpleInserUser")
public class SimpleInsertUser  extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;
   public ArrayList<Integer> UsersIDs = new ArrayList<Integer>();

   public SimpleInsertUser() {
      super();
   }
   
  // protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	   
	   /*//int id = Integer.parseInt(request.getParameter("id").trim());
	   String firstName = request.getParameter("firstName").trim();
       String lastName = request.getParameter("lastName").trim();
       String dateOfBirth = request.getParameter("dateOfBirth").trim();
       String email = request.getParameter("email").trim();
       String phone = request.getParameter("phone").trim();
       String address = request.getParameter("address").trim();
       int userid = Integer.parseInt(request.getParameter("userid").trim());
       
       
       String generateID = "";
       do
       {
       Random rnd = new Random();
	   int number = rnd.nextInt(999999);
	   generateID = String.format("%06d", number);
	   
       } 
       while (UsersIDs.contains(Integer.parseInt(generateID)));
       UsersIDs.add(Integer.parseInt(generateID));
	   
      UtilDB.createUsers(Integer.parseInt(generateID), firstName, lastName);
      

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");
      out.println("<ul>");
      String styling = "style=\"color:white;font-family:monospace;\"";
      out.println("<li " + styling + "> First Name: " + firstName);
      out.println("<li " + styling + "> Last Name: " + lastName);
      out.println("<li " + styling + "> Date Of Birth: " + dateOfBirth);
      out.println("<li " + styling + "> Phone: " + phone);		      
      out.println("<li " + styling + "> Email: " + email);		      
      out.println("<li " + styling + "> Address: " + address);		      
      out.println("<li " + styling + "> User ID: " + userid);	
      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + searchWebName + ">Search Data</a> <br>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
	 //int id = Integer.parseInt(request.getParameter("id").trim());
	   
		  String firstName = request.getParameter("firstName").trim();
	      String lastName = request.getParameter("lastName").trim();
	      //int id = Integer.parseInt(request.getParameter("id").trim());

	      String generateID = "";
	      do
	      {
	      Random rnd = new Random();
		   int number = rnd.nextInt(999999);
		   generateID = String.format("%06d", number);
		   
	      } 
	      while (UsersIDs.contains(Integer.parseInt(generateID)));
	      UsersIDs.add(Integer.parseInt(generateID));
	      
	      UtilDB.createUsers(Integer.parseInt(generateID), firstName, lastName);

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

	      out.println("</ul>");
	      out.println("<a href=/" + projectName + "/" + insertUser + " style=\"color:#4286f4;font-family:monospace;\">Insert Data</a> <br>");
	      out.println("</body></html>");
	   }

	   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      doGet(request, response);
	   }*/
}//
