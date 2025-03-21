package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

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

}
