/**
 * VEHICLE SERVICE AND FUEL SATATION MANAGEMENT SYSTEM
 * @author yasith wimukthi
 * IT 19966922
 * 
 * Y2S1 2.2
 * OOP
 *
 */


package com.VehicleServiceStation.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VehicleServiceStation.model.Reservation;
import com.VehicleServiceStation.service.ReservationService;

/**
 * Servlet implementation class UpdateReservationServlet
 */
@WebServlet("/EditReservationServlet")
public class EditReservationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * CREATE RESERVATION MODEL CLASS VARIABLE
	 */
	private Reservation reservation;
	
	/**
	 * CREATE RESERVATION SERVICE CLASS VARIABLE
	 */
	private ReservationService reservationService ;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		reservation = new Reservation();
		reservationService = new ReservationService();
	}



	/**
     * @see HttpServlet#HttpServlet()
     */
    public EditReservationServlet() {
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
		
		response.setContentType("text/html");
		
		/** GET PARAMETERS */
		String reservationID = request.getParameter("resID");
		
		// CALL getReservationByReservationID FUNCTION IN THE ReservationService CLASS
		reservation = reservationService.getReservationByReservationID(reservationID);
		
		request.setAttribute("reservation",reservation );
		
		//DIRECT TO THE update-reservation.jsp PAGE
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/update-reservation.jsp");
		dispatcher.forward(request, response);
		
		
		//doGet(request, response);
	}

}
