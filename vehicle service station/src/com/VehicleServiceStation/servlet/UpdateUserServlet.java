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

import com.VehicleServiceStation.service.UserService;

/**
 * Servlet implementation class UpdateUserServlet
 */
@WebServlet("/UpdateUserServlet")
public class UpdateUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/** CREATE USER SERVICE VARIABLE*/
	private UserService userService ;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		userService = new UserService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserServlet() {
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
		String uid = request.getParameter("userID");
		String fname = request.getParameter("first-name");
		String lname = request.getParameter("last-name");
		String email = request.getParameter("email");
		String mobile = request.getParameter("phone");
		
		//CREATE PRINT WRITER FOR GIVING JAVASCRIPT ALERTS
		PrintWriter out = response.getWriter();
		
		/** Confirm before update*/
		out.println("<script type=\"text/javascript\">");
		out.println("let retVal = confirm(\"Do you want to update ?\");");
		out.println("if(!retVal){"
				+ "location='your-details.jsp'};");
		out.println("</script>");
		
		boolean isSuccess = userService.updateUser(uid, fname, lname, email, mobile);
		
		if(isSuccess) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Update Successfully !');");
			out.println("location='your-details.jsp';");
			out.println("</script>");
		}
		
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Update is not completed !');");
			out.println("location='update-user.jsp';");
			out.println("</script>");
		}
		
		doGet(request, response);
	}

}
