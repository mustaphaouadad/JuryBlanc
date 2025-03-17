package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
	

}
