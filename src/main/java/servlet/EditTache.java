package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.RessourcesDao;
import dao.TacheDao;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Tache;


@WebServlet("/EditTache")
public class EditTache extends HttpServlet {
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idTache=Integer.parseInt(request.getParameter("idTache"));
		
		Tache t= TacheDao.getTachebyId(idTache);
		request.setAttribute("t", t);
		request.getRequestDispatcher("EditTache.jsp").forward(request, response);
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idTache = Integer.parseInt(request.getParameter("idTache"));
		String descriptionTache=request.getParameter("descriptionTache");
		String dateDebutTache=request.getParameter("dateDebutTache");
		String dateFinTache=request.getParameter("dateFinTache");
		int idProjet = Integer.parseInt(request.getParameter("idProjet"));
		
		Tache t=new Tache();
		t.setIdTache(idTache);
		t.setDescriptionTache(descriptionTache);
		t.setDateDebutTache(dateDebutTache);
		t.setDateFinTache(dateFinTache);
		t.setIdProjet(idProjet);
		int result=TacheDao.updateTache(t);
		
		
		
		if (result>0) {
        	response.sendRedirect("DesplayTache?idProjet=" + idProjet);
			
		} else {
			PrintWriter out=response.getWriter();
			out.println("Eroor while updating");

		}
		
		
	}

}
