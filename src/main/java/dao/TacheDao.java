package dao;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Tache;

public class TacheDao {
	
	public static int addTache(Tache t) {
		int result=0;
		
		try {
			String sql= "INSERT INTO Taches (descriptionTache, dateDebutTache, dateFinTache, idProjet) VALUES (?, ?, ?, ?)";
			Connection coon =DBConnect.getCoon();
			PreparedStatement stm =coon.prepareStatement(sql);
			stm.setString(1,t.getDescriptionTache());
			stm.setString(2,t.getDateDebutTache());
			stm.setString(3,t.getDateFinTache());
			stm.setInt(4,t.getIdProjet());
			result= stm.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return result;
	}
	
	
	public static List<Tache> getTachesByProjet(int idProjet) {
	    List<Tache> taches = new ArrayList<>();
	   
	    try {
	        String sql = "SELECT * FROM Taches WHERE idProjet = ?";
	        Connection coon = DBConnect.getCoon();
	        PreparedStatement stmt = coon.prepareStatement(sql);
	        stmt.setInt(1, idProjet);
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	            Tache tache = new Tache();
	            tache.setIdTache(rs.getInt("idTache"));
	            tache.setDescriptionTache(rs.getString("descriptionTache"));
	            tache.setDateDebutTache(rs.getString("dateDebutTache"));
	            tache.setDateFinTache(rs.getString("dateFinTache"));
	            tache.setIdProjet(rs.getInt("idProjet"));
	            taches.add(tache);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    } 

	    return taches;
	}
	
	public static int DeleteTache(int idTache) {
		int result=0;
		try {
			String sql="DELETE FROM Taches WHERE idTache = ?";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst=coon.prepareStatement(sql);
			pst.setInt(1,idTache);
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	public static Tache getTachebyId(int idTache) {
		Tache t=new Tache();
		try {
			String sql="SELECT * FROM Taches WHERE idTache = ?";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst = coon.prepareStatement(sql);
	        pst.setInt(1, idTache);
	        ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				t.setIdTache(rs.getInt("idTache"));
				t.setDescriptionTache(rs.getString("descriptionTache"));
				t.setDateDebutTache(rs.getString("dateDebutTache"));
				t.setDateFinTache(rs.getString("dateFinTache"));
				t.setIdProjet(rs.getInt("idProjet"));

				
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		return t;
	}
	
	public static int updateTache(Tache t) {
		int result=0;
		
		try {
			String sql="UPDATE Taches SET descriptionTache = ?, dateDebutTache = ?, dateFinTache = ?, idProjet = ? WHERE idTache = ?";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst =coon.prepareStatement(sql);
			pst.setString(1,t.getDescriptionTache());
			pst.setString(2,t.getDateDebutTache());
			pst.setString(3,t.getDateFinTache());
			pst.setInt(4,t.getIdProjet());
			pst.setInt(5,t.getIdTache());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		return result;
	}

	
	
	
	
	
	

}
