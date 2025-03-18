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
			 String sql ="select * from Projets";
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
	
	public static int deletProjet(int idProjet) {
		int result =0;
		try {
			String sql="Delete from gestionConstruction.Projets where idProjet=?";
			 Connection coon=DBConnect.getCoon();
			 PreparedStatement pst=coon.prepareStatement(sql);
			 pst.setInt(1, idProjet);
			 result=pst.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	public static model.Projet getProjetById(int idProjet){
		model.Projet p =new model.Projet();
		try {
			String sql="select * from gestionConstruction.Projets where idProjet="+idProjet;
			Connection coon=DBConnect.getCoon();
			 Statement smt =coon.createStatement();
			 ResultSet rs=smt.executeQuery(sql);
			 while (rs.next()) {
				 p.setIdProjet(rs.getInt("idProjet"));
				 p.setNomProjet(rs.getString("NomProjet"));
				 p.setDescriptionProjet(rs.getString("descriptionProjet"));
				 p.setDateDebutProjrt(rs.getString("dateDebutProjrt"));
				 p.setDateFinProjet(rs.getString("dateDebutProjrt"));
				 p.setBudget(rs.getDouble("budget"));
				 
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return p;
	}
	
	public static int updateProjet(model.Projet p) {
		int result=0;
		
		try {
			String sql="update gestionConstruction.Projets set NomProjet=?,descriptionProjet=?,dateDebutProjrt=?,dateFinProjet=?,budget=? where idProjet=?";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst=coon.prepareStatement(sql);
			pst.setString(1,p.getNomProjet());
			pst.setString(2,p.getDescriptionProjet());
			pst.setString(3,p.getDateDebutProjrt());
			pst.setString(4,p.getDateFinProjet());
			pst.setDouble(5,p.getBudget());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return result;
	}
	

}
