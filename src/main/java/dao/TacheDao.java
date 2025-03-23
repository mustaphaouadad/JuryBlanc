package dao;

import java.sql.Connection;



import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Ressources;
import model.Tache;

public class TacheDao {
	
	public static int addTache(Tache t) {
		int idTache = -1;
		
		try {
			String sql= "INSERT INTO Taches (descriptionTache, dateDebutTache, dateFinTache, idProjet) VALUES (?, ?, ?, ?)";
			Connection coon =DBConnect.getCoon();
			
			PreparedStatement stm =coon.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
			stm.setString(1,t.getDescriptionTache());
			stm.setString(2,t.getDateDebutTache());
			stm.setString(3,t.getDateFinTache());
			stm.setInt(4,t.getIdProjet());
			int result= stm.executeUpdate();
			
			 if (result > 0) {
		            ResultSet rs = stm.getGeneratedKeys();
		            if (rs.next()) {
		                idTache = rs.getInt(1);  
		                
		            }
		        }
			
		} catch (Exception e) {
			e.printStackTrace();
		}	
		return idTache;
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
	
	public static int addTacheRessource(int idTache, int idRessource) {
	    int result = 0;
	    try {
	    	
	        String sql = "INSERT INTO TacheRessources (idTache, idRessource, quantiteAssocier) VALUES (?, ?, 1)";
	        Connection conn = DBConnect.getCoon();
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, idTache);
	        stmt.setInt(2, idRessource);
	        result = stmt.executeUpdate();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return result;
	}
	
	
	
	public static List<Ressources> getRessourcesByTache(int idTache) {
	    List<Ressources> ressources = new ArrayList<>();
	    try {
	        String sql = "SELECT r.* FROM Ressources r INNER JOIN TacheRessources tr ON r.idRessource = tr.idRessource WHERE tr.idTache = ?";
	        Connection conn = DBConnect.getCoon();
	        PreparedStatement stmt = conn.prepareStatement(sql);
	        stmt.setInt(1, idTache);
	        ResultSet rs = stmt.executeQuery();

	        while (rs.next()) {
	        	Ressources res = new Ressources();
	            res.setIdRessource(rs.getInt("idRessource"));
	            res.setNomRessource(rs.getString("nomRessource"));
	            res.setTypeRessource(rs.getString("typeRessource"));
	            res.setQuantite(rs.getInt("quantite"));
	            ressources.add(res);
	        }
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    return ressources;
	}


	
	
	
	
	
	

}
