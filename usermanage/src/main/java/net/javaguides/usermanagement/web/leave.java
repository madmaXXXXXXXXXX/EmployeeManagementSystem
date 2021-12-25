package net.javaguides.usermanagement.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.javaguides.usermanagement.dao.DatabaseConnection;

/**
 * Servlet implementation class leave
 */
@WebServlet("/leave")
public class leave extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public leave() {
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
		{ 
			try { 

				// Initialize the database 
				Connection con = DatabaseConnection.initializeDatabase(); 

				// Create a SQL query to insert data into demo table 
				// demo table consists of two columns, so two '?' is used 
				PreparedStatement st = con 
					.prepareStatement("insert into userleave values(?,?, ?)"); 

				// For the first parameter, 
				// get the data using request object 
				// sets the data to st pointer 
			

				// Same for second parameter 
				st.setString(1, request.getParameter("name")); 
				st.setString(2, request.getParameter("datefrom")); 
				st.setString(3, request.getParameter("dateto")); 

				// Execute the insert command using executeUpdate() 
				// to make changes in database 
				st.executeUpdate(); 

				// Close all the connections 
				st.close(); 
				con.close(); 

				// Get a writer pointer 
				// to display the successful result 
				  response.sendRedirect("leave.jsp");
				  
			} 
			catch (Exception e) { 
				e.printStackTrace(); 
			}}}}
