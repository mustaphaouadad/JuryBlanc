package servlet;

import java.io.IOException;

import java.io.PrintWriter;

import dao.TacheDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.Tache;


@WebServlet("/AddTache")
public class AddTache extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
		int idProjet =Integer.parseInt(request.getParameter("idProjet"));
		String descriptionTache =request.getParameter("descriptionTache");
		String dateDebutTache =request.getParameter("dateDebutTache");
		String dateFinTache =request.getParameter("dateFinTache");
		
		 String[] ressourcesSelected = request.getParameterValues("ressources");
		
		Tache t=new Tache();
		t.setDescriptionTache(descriptionTache);
		t.setDateDebutTache(dateDebutTache);
		t.setDateFinTache(dateFinTache);
		t.setIdProjet(idProjet);
		
		int result=TacheDao.addTache(t);
		
		if (result>0) {
			for (String idRessource : ressourcesSelected) {
                TacheDao.addTacheRessource(result, Integer.parseInt(idRessource));
            }
			response.sendRedirect("DesplayTache?idProjet=" + idProjet);
			
		} else {
			PrintWriter out = response.getWriter();
			out.println("Data not add ");

		}
		
		
		
		
	}

}
