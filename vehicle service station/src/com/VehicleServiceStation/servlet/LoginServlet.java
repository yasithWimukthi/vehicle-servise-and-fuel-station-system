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

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.VehicleServiceStation.model.User;
import com.VehicleServiceStation.service.LoginDAO;
import com.VehicleServiceStation.service.UserService;
import com.mysql.cj.Session;


/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * CREATE User CLASS VARIABLE
	 */
	
	private User user;
	
	/**
	 * CREATE USER SERVICE CLASS VARIABLE
	 */
	
	private UserService userService;
	
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		userService = new UserService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
        //userService = new UserService();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		
		//get parameters
		String email = request.getParameter("email").trim();
		String password = request.getParameter("password").trim();
		
		//CRATE LoginDAO OBJECT
		LoginDAO LoginDAO = new LoginDAO();
		
		// VALIDATE USERNAME AND PASSWORD BY CALLING validate FUNCTION
		boolean isValide =LoginDAO.validate(email, password);
		
		//CREATE PRINT WRITER FOR GIVING JAVASCRIPT ALERTS
		PrintWriter out = response.getWriter(); 
		
		if(isValide) {
			
			// CREAT A USER OBJECT WITH DEFAULT CONSTUCTOR
			user = new User();
			
			//ASSIGN CURRENT USER DETAILS TO A User OBJECT
			user = userService.getCurrentUser(email);
			
			
			// SET SESSION ATTRIBUTES
			HttpSession session = request.getSession();
			session.setAttribute("uid", user.getUid());
			session.setAttribute("email", email);
			
			if(user.getType().equalsIgnoreCase("admin")) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Successfully logged in admin!');");
				out.println("location='index.jsp';");
				out.println("</script>");
			}
			else if(user.getType().equalsIgnoreCase("user")) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Successfully logged in user!');");
				out.println("location='your-details.jsp';");
				out.println("</script>");
			}
			
 
			
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('unsuccessfully logged in!');");
			out.println("location='login.jsp';");
			out.println("</script>");
		}
		
		//doGet(request, response);
		
	}

}
