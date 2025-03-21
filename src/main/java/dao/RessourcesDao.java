package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import model.Ressources;

public class RessourcesDao {
	
	
	public static int addRessource(Ressources r) {
		int result=0;
		
		try {
			Connection coon =DBConnect.getCoon();
			String sql="INSERT INTO Ressources (idRessource, nomRessource, typeRessource, quantite, idFournisseur) VALUES (?, ?, ?, ?, ?)";
			PreparedStatement pst = coon.prepareStatement(sql);
            pst.setInt(1, r.getIdRessource());
            pst.setString(2, r.getNomRessource());
            pst.setString(3, r.getTypeRessource());
            pst.setInt(4, r.getQuantite());
            pst.setInt(5, r.getIdFournisseur());
            result=pst.executeUpdate();
			
		} catch (Exception e) {
			
		}
		
		return result;
		
	}

}
