package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.TempConverter;


/**
 * @author Jamison Bice - jdbice
 * CIS175 - Fall 2021
 * Sep 23, 2021
 */
@WebServlet("/CelToFahServlet")
public class CelToFahServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CelToFahServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String celsiusTemp = request.getParameter("celsiusTemp");
		
		double doubleCelsiusTemp = Double.parseDouble(celsiusTemp);
		TempConverter convertedTemp = new  
		TempConverter(doubleCelsiusTemp, true);
		request.setAttribute("userTemp", convertedTemp); 
		getServletContext().getRequestDispatcher("/celResult.jsp").forward(request, response); 
		
		//PrintWriter writer = response.getWriter(); 
		//writer.println(convertedTemp.toString()); 
		//writer.close();
		


		// TODO Auto-generated method stub
	}

}
