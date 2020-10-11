package com.VehicleServiceStation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VehicleServiceStation.service.ReservationService;

/**
 * Servlet implementation class AddReservationServlet
 */
@WebServlet("/AddReservationServlet")
public class AddReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/** CREATE ReservationSevice CLASS VARIABLE*/
	private ReservationService reservationSevice;
	
	/** INITIALIZE CLASS VARIABLES*/
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		reservationSevice = new ReservationService();
	}

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddReservationServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/** GET PARAMETERS*/
		String vahicleNo = request.getParameter("vehicle-number");
		String brand = request.getParameter("brand");
		String model = request.getParameter("vehicle model");
		String edition = request.getParameter("vehicle edition");
		String bodyType = request.getParameter("body-type");
		String transmission = request.getParameter("transmission");
		String fuel = request.getParameter("fuel");
		String date = request.getParameter("date");
		String uid = request.getParameter("userID");
		
		boolean isAdd = reservationSevice.saveReservation(vahicleNo, brand, model, edition, bodyType, transmission, date, fuel,uid);
		
		//CREATE PRINT WRITER FOR GIVING JAVASCRIPT ALERTS
		PrintWriter out = response.getWriter();
		
		if(isAdd) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Add the reservation Successfully !');");
			out.println("location='view-reservation.jsp';");
			out.println("</script>");
		}
		
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Reservation is not completed. Please check again !');");
			out.println("location='reservation.jsp';");
			out.println("</script>");
		}
		//doGet(request, response);
	}

}
