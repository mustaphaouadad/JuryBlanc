package servlet;

import java.io.IOException;

import dao.DashboardDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/Dashboard")
public class Dashboard extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		 int projetsCount = DashboardDao.countProjets();
		 int tachesCount = DashboardDao.countTaches();
		  int ressourcesCount = DashboardDao.countRessources();
		 
		 
		 
		 
		 request.setAttribute("projetsCount", projetsCount);
		  request.setAttribute("tachesCount", tachesCount);
		  request.setAttribute("ressourcesCount", ressourcesCount);

		 
		 request.getRequestDispatcher("AdminDashboard.jsp").forward(request, response);
	}

}
