package servlet;

import java.io.IOException;


import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Projet;


@WebServlet("/EditProjet")
public class EditProjet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProjet =Integer.parseInt(request.getParameter("idProjet"));
		
	Projet p= dao.Projet.getProjetById(idProjet);
	RequestDispatcher dispatcher =request.getRequestDispatcher("EditProjet.jsp");
	request.setAttribute("p",p);
	dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProjet =Integer.parseInt(request.getParameter("idProjet"));
		String NomProjet = request.getParameter("projectName");
		String descriptionProjet=request.getParameter("projectDescription");
		String dateDebutProjrt=request.getParameter("startDate");
		String dateFinProjet=request.getParameter("endDate");
		Double budget=Double.parseDouble(request.getParameter("budget"));
		
		Projet p=new Projet();
		p.setIdProjet(idProjet);
		p.setNomProjet(NomProjet);
		p.setDescriptionProjet(descriptionProjet);
		p.setDateDebutProjrt(dateDebutProjrt);
		p.setDateFinProjet(dateFinProjet);
		p.setBudget(budget);
		int result=dao.Projet.updateProjet(p);
		if (result>0) {
        	response.sendRedirect("DesplayProjet");
			
		} else {
			PrintWriter out=response.getWriter();
			out.println("Eroor while updating");

		}
		
		
	}

}
