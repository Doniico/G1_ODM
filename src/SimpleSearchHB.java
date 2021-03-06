import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Appointment;
import util.Info;
import util.UtilDB;

@WebServlet("/SimpleSearchHB")
public class SimpleSearchHB extends HttpServlet implements Info {
   private static final long serialVersionUID = 1L;

   public SimpleSearchHB() {
      super();
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      String keyword = request.getParameter("keywordTitle").trim();

      response.setContentType("text/html");
      PrintWriter out = response.getWriter();
      String title = "Database Results";
      String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n"; //
      out.println(docType + //
            "<html>\n " + //
            "<head><title>" + title + "</title></head>\n" + //
            "<body bgcolor=\"#2D2D2D\">\n" + //
            "<h1 align=\"center\" style=\"color:white;font-family: monospace;\">" + title + "</h1>\n");
      out.println("<ul>");

      List<Appointment> listAppointment = null;
      if (keyword != null && !keyword.isEmpty()) {
    	  listAppointment = UtilDB.listAppointments(keyword);
      } else {
    	  listAppointment = UtilDB.listAppointments();
      }
      display(listAppointment, out);
      out.println("</ul>");
      out.println("<a href=/" + projectName + "/" + searchWebName + " style=\"color:#4286f4;font-family:monospace;\">Search Data</a> <br>");
      out.println("</body></html>");
   }

   void display(List<Appointment> appointmentList, PrintWriter out) {
      for (Appointment appointment : appointmentList) {
         System.out.println("[DBG] " + appointment.getId() + ", " //
    		 + appointment.getFirstName() + ", " //
             + appointment.getLastName() + ", " //
             + appointment.getAddress() + ", " //
             + appointment.getDate() + ", " //
             + appointment.getTime() + ", " //
           	 + appointment.getDetails());

         out.println("<li style=\"color:white;font-family:monospace;\">" + appointment.getId() + ", <br>" //
        		 + appointment.getFirstName() + " " //
                 + appointment.getLastName() + ", <br>" //
                 + appointment.getAddress() + ", <br>" //
                 + appointment.getDate() + ", " //
                 + appointment.getTime() + ", <br>" //
                 + appointment.getDetails() + "<br></li>");
      }
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
