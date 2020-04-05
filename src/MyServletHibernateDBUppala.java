import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Appointment;
import util.UtilDB;
import util.UtilFile;

@WebServlet("/MyServletHibernateDB")
public class MyServletHibernateDBUppala extends HttpServlet {
   private static final long serialVersionUID = 1L;

   public MyServletHibernateDBUppala() {
      super();
   }

   int i = 0;
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      response.setContentType("text/html");
      
      retrieveDisplayData(response.getWriter());
   }

   void retrieveDisplayData(PrintWriter out) {
      String title = "Database Result";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + //
            "transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n" + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#f0f0f0\">\n" + //
            "<h1 align=\"center\">" + title + "</h1>\n");
      out.println("<ul>");
      List<Appointment> appointmentsList = UtilDB.listAppointments();
      for (Appointment appointment : appointmentsList) {
         System.out.println("[DBG] " + appointment.getId() + ", " //
               + appointment.getFirstName() + ", " //
               + appointment.getLastName() + ", " //
               + appointment.getAddress() + ", " //
               + appointment.getDate() + ", " //
               + appointment.getTime() + ", " //
         	   + appointment.getDetails());

         out.println("<li>" + appointment.getId() + ", " //
    		 + appointment.getFirstName() + ", " //
             + appointment.getLastName() + ", " //
             + appointment.getAddress() + ", " //
             + appointment.getDate() + ", " //
             + appointment.getTime() + ", " //
             + appointment.getDetails() + "</li>");
      }
      out.println("</ul>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
