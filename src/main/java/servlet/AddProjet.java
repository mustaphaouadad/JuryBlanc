package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Projet;



@WebServlet("/AddProjet")
public class AddProjet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String NomProjet =request.getParameter("projectName");
		String descriptionProjet=request.getParameter("projectDescription");
		String dateDebutProjrt=request.getParameter("startDate");
		String dateFinProjet=request.getParameter("endDate");
		Double budget=Double.parseDouble( request.getParameter("budget"));
		
		
		Projet p=new Projet();
		p.setNomProjet(NomProjet);
		p.setDescriptionProjet(descriptionProjet);
		p.setDateDebutProjrt(dateDebutProjrt);
		p.setDateFinProjet(dateFinProjet);
		p.setBudget(budget);
		int result=dao.Projet.SaveProjet(p);
		
		if (result>0) {
			response.sendRedirect("DesplayProjet");
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("Data not add ");

		}
	}

}
