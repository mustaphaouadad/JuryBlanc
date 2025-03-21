package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import model.Ressources;

public class RessourcesDao {
	
	
	public static int addRessource(Ressources r) {
		int result=0;
		int idFournisseur=1;
		
		try {
			String sql = "INSERT INTO Ressources (nomRessource, typeRessource, quantite, idFournisseur) VALUES (?, ?, ?, ?)";
			 Connection coon=DBConnect.getCoon();
			PreparedStatement pst = coon.prepareStatement(sql);
     
            pst.setString(1, r.getNomRessource());
            pst.setString(2, r.getTypeRessource());
            pst.setInt(3, r.getQuantite());
            pst.setInt(4, idFournisseur);
            result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public static List<Ressources>getAllRessources(){
		List<Ressources> r=new ArrayList<Ressources>();
		
		try {
			
			 String sql = "SELECT * FROM Ressources";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst =coon.prepareStatement(sql);
			ResultSet rs=pst.executeQuery();
			while (rs.next()) {
				Ressources ressources=new Ressources();
				ressources.setIdRessource(rs.getInt("idRessource"));
				ressources.setNomRessource(rs.getString("nomRessource"));
                ressources.setTypeRessource(rs.getString("typeRessource"));
                ressources.setQuantite(rs.getInt("quantite"));
                ressources.setIdFournisseur(rs.getInt("idFournisseur"));
                r.add(ressources);
				
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return r;
	}
	
	public static Ressources getRessourceById(int idRessource) {
		Ressources r=new Ressources();
		
		try {
			 String sql = "SELECT * FROM Ressources WHERE idRessource = ?";
			 Connection coon=DBConnect.getCoon();
			 PreparedStatement pst =coon.prepareStatement(sql);
			 pst.setInt(1, idRessource);
			 ResultSet rs=pst.executeQuery();
			 while (rs.next()) {
				 
				    r.setIdRessource(rs.getInt("idRessource"));
	                r.setNomRessource(rs.getString("nomRessource"));
	                r.setTypeRessource(rs.getString("typeRessource"));
	                r.setQuantite(rs.getInt("quantite"));
	                r.setIdFournisseur(rs.getInt("idFournisseur"));

			}
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return r;
	}
	
	public static int updateRessource(Ressources r) {
		int result=0;
		
		
		try {
			String sql = "UPDATE Ressources SET nomRessource = ?, typeRessource = ?, quantite = ?, idFournisseur = ? WHERE idRessource = ?";
			Connection coon=DBConnect.getCoon();
			PreparedStatement pst =coon.prepareStatement(sql);
			 pst.setString(1, r.getNomRessource());
	         pst.setString(2, r.getTypeRessource());
	         pst.setInt(3, r.getQuantite());
	         pst.setInt(4, r.getIdFournisseur());
	         pst.setInt(5, r.getIdRessource());
	         result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		return result;
	}
	
	
	
	
	
	

}
