import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import datamodel.Appointment;
import util.UtilDB;

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
      List<Appointment> appointmentsList = UtilDB.listAppointments();
      for (Appointment appointment : appointmentsList) {
         System.out.println("[DBG] " + appointment.getId() + ", " + appointment.getFirstName() + ", " + appointment.getLastName() + ", " + appointment.getAddress() + ", " + appointment.getDate() + ", " + appointment.getTime() + ", " + appointment.getDetails());

         out.println(
		 "<li class=\"noListStyle\">" +
	         "<div class=\"cardBlock\">" +
	         	"<h2 class=\"clientID\">" +
	         		appointment.getId() + "|" + appointment.getFirstName() + appointment.getLastName() + ", " + appointment.getAddress() + ", " + 
	     		"</h2>" +
	     		"<h2 class=\"clientApt\">" +
	     			appointment.getDate() + " @ " + appointment.getTime() + 
	     		"</h2>" +
     		 "</div>" +
 		"</li>"
 		);
      }
      out.println("</ul>");
      out.println("</body></html>");
   }

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request, response);
   }
}
