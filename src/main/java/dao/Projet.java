package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class Projet {
	
	public static int SaveProjet(model.Projet p) {
		int result=0;
		try {
			String sql="INSERT INTO Projets(idProjet, NomProjet,descriptionProjet,dateDebutProjrt ,dateFinProjet ,budget) VALUES (?,?,?,?,?,?)";
			Connection coon=DBConnect.getCoon();
			
			PreparedStatement stm= coon.prepareStatement(sql);
			stm.setInt(1,p.getIdProjet());
			stm.setString(2,p.getNomProjet());
			stm.setString(3, p.getDescriptionProjet());
			stm.setString(4, p.getDateDebutProjrt());
			stm.setString(5, p.getDateFinProjet());
			stm.setDouble(6, p.getBudget());
			result=stm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public static List<model.Projet> getAllProjets(){
		List<model.Projet>  p =new ArrayList<model.Projet>();
		
		
		try {
			 String sql ="SELECT * FROM Projets";
			 Connection coon=DBConnect.getCoon();
			 Statement smt =coon.createStatement();
			 ResultSet rs=smt.executeQuery(sql);
			 while (rs.next()) {
				 model.Projet pr= new model.Projet();
				 pr.setIdProjet(rs.getInt("idProjet"));
				 pr.setNomProjet(rs.getString("NomProjet"));
				 pr.setDescriptionProjet(rs.getString("descriptionProjet"));
				 pr.setDateDebutProjrt(rs.getString("dateDebutProjrt"));
				 pr.setDateFinProjet(rs.getString("dateFinProjet"));
				 pr.setBudget(rs.getDouble("budget"));
			      p.add(pr);
				
				 
				 
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return p;
	}
	

}
