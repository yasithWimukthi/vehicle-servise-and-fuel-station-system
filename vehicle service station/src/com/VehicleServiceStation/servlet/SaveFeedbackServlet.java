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
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VehicleServiceStation.service.FeedbackService;

/**
 * Servlet implementation class SaveFeedbackServlet
 */
@WebServlet("/SaveFeedbackServlet")
public class SaveFeedbackServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * CREATE FEEDBACK SERVICE CLASS VARIABLE
	 */
	private FeedbackService feedbackService;
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		feedbackService = new FeedbackService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public SaveFeedbackServlet() {
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
		
		/** GET PARAMETERS*/
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String message = request.getParameter("message");
		
		boolean isSuccess = feedbackService.saveFeedback(name, email, message);
		
		//CREATE PRINT WRITER FOR GIVING JAVASCRIPT ALERTS
		PrintWriter out = response.getWriter();
		
		if(isSuccess) {
				out.println("<script type=\"text/javascript\">");
				out.println("location='index.jsp';");
				out.println("</script>");
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Feedback is not submited. Please try again !');");
			out.println("location='feedback.jsp';");
			out.println("</script>");
		}
		
		doGet(request, response);
	}

}
