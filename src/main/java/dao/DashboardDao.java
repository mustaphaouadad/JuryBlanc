package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class DashboardDao {
	
	 public static int countProjets() {
	        int count = 0;
	        try {
	            String sql = "SELECT COUNT(*) FROM Projets";
	            Connection coon = DBConnect.getCoon();
	            PreparedStatement pst = coon.prepareStatement(sql);
	            ResultSet rs = pst.executeQuery();
	            if (rs.next()) {
	                count = rs.getInt(1);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return count;
	    }
	 
	 public static int countTaches() {
	        int count = 0;
	        try {
	            String sql = "SELECT COUNT(*) FROM Taches";
	            Connection coon = DBConnect.getCoon();
	            PreparedStatement pst = coon.prepareStatement(sql);
	            ResultSet rs = pst.executeQuery();
	            if (rs.next()) {
	                count = rs.getInt(1);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return count;
	    }
	 
	 public static int countRessources() {
	        int count = 0;
	        try {
	            String sql = "SELECT COUNT(*) FROM Ressources";
	            Connection coon = DBConnect.getCoon();
	            PreparedStatement pst = coon.prepareStatement(sql);
	            ResultSet rs = pst.executeQuery();
	            if (rs.next()) {
	                count = rs.getInt(1);
	            }
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return count;
	    }

}
