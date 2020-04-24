import java.io.IOException;
import java.io.PrintWriter;

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

   public SimpleInsertUser() {
      super();
   }
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	   
	   int id = Integer.parseInt(request.getParameter("id").trim());
	   String firstName = request.getParameter("firstName").trim();
       String lastName = request.getParameter("lastName").trim();
       String dateOfBirth = request.getParameter("dateOfBirth").trim();
       String email = request.getParameter("email").trim();
       String phone = request.getParameter("phone").trim();
       String address = request.getParameter("address").trim();
       String userid = request.getParameter("userid").trim();
      
      UtilDB.createUsers(id, firstName, lastName, dateOfBirth, email, phone, address, userid);
      

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
}
