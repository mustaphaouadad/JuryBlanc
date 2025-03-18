package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Tache;

public class TacheDao {
	
	public static int addTache(Tache t) {
		int result=0;
		
		try {
			String sql="INSERT INTO Taches (descriptionTache, dateDebutTache, dateFinTache, idProjet) VALUES (?, ?, ?, ?)";
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
	
	
	
	
	
	

}
