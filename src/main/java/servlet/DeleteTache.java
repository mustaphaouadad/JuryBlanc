package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import dao.TacheDao;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/DeleteTache")
public class DeleteTache extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        
        int idTache = Integer.parseInt(request.getParameter("idTache"));
        int idProjet = Integer.parseInt(request.getParameter("idProjet"));
        
        int result=TacheDao.DeleteTache(idTache);
        
        if (result>0) {
	    	   response.sendRedirect("DesplayTache?idProjet=" + idProjet );
		} else {
			PrintWriter out=response.getWriter();
			out.println("Tache id not avilibal");

		}
		
		
	}

}
