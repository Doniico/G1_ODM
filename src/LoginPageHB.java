import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Users;
import util.Info;
import util.UtilDB;

@WebServlet("/LoginPageHB")
public class LoginPageHB extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public LoginPageHB() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String email = request.getParameter("emailLog").trim();
      String password = request.getParameter("passLog").trim();

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Login Error";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n " + //
            "<head><title>Login Page</title></head>\n" + //
            "<body bgcolor=\"#2D2D2D\">\n");

      if (email == null || email.isEmpty() || password == null || password.isEmpty()) {
    	  out.println("<h1 align=\"center\" style=\"color:white;font-family: monospace;\">" + title + "</h1>\n");
    	  out.println("<h4 style=\"color:white;font-family:monospace;\">One of the fields entered is empty.</h4><br/>");
          out.println("<a href=\"/teamproject/loginPage.html\" style=\"color:white;font-family:monospace;\">Back to Login Page</a><br/>");
          out.println("</body></html>");
    	  throw new IOException("One of the fields entered is empty.");
      }
      
      if (UtilDB.isUser(email, password)) {
    	  title = "Welcome!";
    	  out.println("<h1 align=\"center\" style=\"color:white;font-family: monospace;\">" + title + "</h1>\n");
    	  out.println("<h4 style=\"color:white;font-family:monospace;\">What would you like to see?</h4><br/>");
    	  out.println("<a href=\"/teamproject/ODMDesign.html\" style=\"color:white;font-family:monospace;\">Home Page</a><br/>");
    	  out.println("<a href=\"/teamproject/simpleInsertHB.html\" style=\"color:white;font-family:monospace;\">Insert</a><br/>");
    	  out.println("<a href=\"/teamproject/simpleSearchHB.html\" style=\"color:white;font-family:monospace;\">Search</a><br/>");
    	  out.println("<a href=\"/teamproject/UserCreation.html\" style=\"color:white;font-family:monospace;\">Create User</a><br/>");
          out.println("<a href=\"/teamproject/loginPage.html\" style=\"color:white;font-family:monospace;\">Log Out</a><br/>");
      } else {
    	  out.println("<h1 align=\"center\" style=\"color:white;font-family: monospace;\">" + title + "</h1>\n");
    	  out.println("<h4 style=\"color:white;font-family:monospace;\">The email or password entered could not be found.</h4><br/>");
          out.println("<a href=\"/teamproject/loginPage.html\" style=\"color:white;font-family:monospace;\">Back to Login Page</a><br/>");
      }
      
      out.println("</body></html>");
   }

   void display(List<Users> userList, PrintWriter out) {
      for (Users userPerson : userList) {
         System.out.println("[DBG] " + userPerson.getFirstName() + ", " //
             + userPerson.getLastName() + ", " //
             + userPerson.getId());

         out.println("<li style=\"color:white;font-family:monospace;\">" + userPerson.getFirstName() + " " //
                 + userPerson.getLastName() + ", <br/>" //
                 + userPerson.getId() + "<br/></li>");
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
