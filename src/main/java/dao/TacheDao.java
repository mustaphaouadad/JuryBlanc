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
	public static List<Tache> getTachesByProjet(){
		List<Tache> t=new ArrayList<Tache>();
		try {
			String sql="SELECT * FROM Taches WHERE idProjet = ?";
			Connection coon=DBConnect.getCoon();
			Statement smt = coon.createStatement();
			ResultSet rs=smt.executeQuery(sql);
			while (rs.next()) {
				Tache tache =new Tache();
				tache.setIdTache(rs.getInt("idTache"));
				tache.setDescriptionTache(rs.getString("descriptionTache"));
				tache.setDateDebutTache(rs.getString("dateDebutTache"));
				tache.setDateFinTache(rs.getString("dateFinTache"));
				tache.setIdProjet(rs.getInt("idProjet"));
				t.add(tache);
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		return t;
	}
	
	
	
	
	
	

}
