package servlet;

import java.io.IOException;


import java.io.PrintWriter;

import dao.Projet;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteProjet")
public class DeleteProjet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProjet = Integer.parseInt(request.getParameter("idProjet"));
		int result=Projet.deletProjet(idProjet);
		 if (result>0) {
	    	   response.sendRedirect("DesplayProjet");
		} else {
			PrintWriter out=response.getWriter();
			out.println("Project id not avilibal");

		}
		
	}

}
