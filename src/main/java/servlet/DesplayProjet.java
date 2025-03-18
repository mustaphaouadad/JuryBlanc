package servlet;

import java.io.IOException;
import java.util.List;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Projet;


@WebServlet("/DesplayProjet")
public class DesplayProjet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Projet>p=dao.Projet.getAllProjets();
		request.setAttribute("p", p);
		 request.getRequestDispatcher("/GestionDesProjets.jsp").forward(request, response);
		
		
	}

}
