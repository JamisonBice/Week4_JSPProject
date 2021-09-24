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
@WebServlet("/FahToCelServlet")
public class FahToCelServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FahToCelServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String fahrenheitTemp = request.getParameter("fahrenheitTemp");
		
		double doubleFahrenheitTemp = Double.parseDouble(fahrenheitTemp);
		TempConverter convertedTemp = new  
		TempConverter(doubleFahrenheitTemp, false);
		request.setAttribute("userTemp", convertedTemp); 
		getServletContext().getRequestDispatcher("/fahResult.jsp").forward(request, response); 
		
		//PrintWriter writer = response.getWriter(); 
		//writer.println(convertedTemp.toString()); 
		//writer.close();
		


		// TODO Auto-generated method stub
	}

}
