package servlet;

import java.io.IOException;
import java.util.List;

import dao.RessourcesDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Ressources;


@WebServlet("/DesplayRessources")
public class DesplayRessources extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Ressources>r=RessourcesDao.getAllRessources();
		request.setAttribute("r",r);
		 request.getRequestDispatcher("/GestionDesRessources.jsp").forward(request, response);
	}

}
