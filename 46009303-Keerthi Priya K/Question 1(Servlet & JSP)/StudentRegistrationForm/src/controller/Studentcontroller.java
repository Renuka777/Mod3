package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class StudentController
 */
@WebServlet("/StudentController")
public class Studentcontroller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Studentcontroller() {
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
		doGet(request, response);
		PrintWriter pw = response.getWriter();
		// Returning values of named parameters. This data is sent from client
		// to server, thus it would be reflected using the request object
		String username = request.getParameter("name");
		String password = request.getParameter("department");
		String marks = request.getParameter("marks");
		String mobile = request.getParameter("mobile");
		String percentage = request.getParameter("percentage");

		pw.println("Student Name>>" + username + "Password>>" + password
				+ "marks>>" + marks  + "mobile>>" + mobile + "percentage" + percentage);
		 RequestDispatcher rd = request.getRequestDispatcher("success.jsp");
         rd.forward(request, response);
	}

}
