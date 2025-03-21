package model;

public class Ressources {
	
	 private int idRessource;
	  private String nomRessource;
	  private String typeRessource;
	  private int quantite;
	  private int idFournisseur;
	  
	  
	  
	public Ressources() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Ressources(int idRessource, String nomRessource, String typeRessource, int quantite, int idFournisseur) {
		super();
		this.idRessource = idRessource;
		this.nomRessource = nomRessource;
		this.typeRessource = typeRessource;
		this.quantite = quantite;
		this.idFournisseur = idFournisseur;
	}



	public Ressources(String nomRessource, String typeRessource, int quantite, int idFournisseur) {
		super();
		this.nomRessource = nomRessource;
		this.typeRessource = typeRessource;
		this.quantite = quantite;
		this.idFournisseur = idFournisseur;
	}



	public int getIdRessource() {
		return idRessource;
	}



	public void setIdRessource(int idRessource) {
		this.idRessource = idRessource;
	}



	public String getNomRessource() {
		return nomRessource;
	}



	public void setNomRessource(String nomRessource) {
		this.nomRessource = nomRessource;
	}



	public String getTypeRessource() {
		return typeRessource;
	}



	public void setTypeRessource(String typeRessource) {
		this.typeRessource = typeRessource;
	}



	public int getQuantite() {
		return quantite;
	}



	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}



	public int getIdFournisseur() {
		return idFournisseur;
	}



	public void setIdFournisseur(int idFournisseur) {
		this.idFournisseur = idFournisseur;
	}
	
	
	  
	  

}
