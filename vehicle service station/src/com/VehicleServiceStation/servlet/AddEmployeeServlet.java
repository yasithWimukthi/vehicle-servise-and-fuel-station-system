package com.VehicleServiceStation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VehicleServiceStation.service.EmployeeService;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/AddEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**CREATE EmployeeService VARIABLE*/
	EmployeeService employeeService;
	
       
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		employeeService = new EmployeeService();
	}

	/**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
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
		String fname= request.getParameter("fname");
		String lname = request.getParameter("lname");
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		String dob = request.getParameter("dob");
		String age = request.getParameter("age");
		String address = request.getParameter("address");
		String type = request.getParameter("type");
		String salary = request.getParameter("salary");
		
		//CREATE PRINT WRITER FOR GIVING JAVASCRIPT ALERTS
		PrintWriter out = response.getWriter();
		/**VALIDATE SALARY*/
		try {
			float sal = Float.parseFloat(salary);
			int checkAge = Integer.parseInt(age);
		}catch (Exception e) {
			// TODO: handle exception
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Salary and age should be a numeric value !');");
			out.println("location='add-employee.jsp';");
			out.println("</script>");
		}
		
		boolean isSuccess = employeeService.addEmployee(fname, lname, email, mobile, dob, age, address, type, salary);
		
		if(isSuccess) {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('successfully added !');");
			out.println("location='add-employee.jsp';");
			out.println("</script>");
		}
		else {
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Error occured. Try again !');");
			out.println("location='add-employee.jsp';");
			out.println("</script>");
		}
		
		doGet(request, response);
	}

}
