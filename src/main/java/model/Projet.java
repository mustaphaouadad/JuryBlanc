package model;

public class Projet {
	private int idProjet;
	private String NomProjet;
	private String descriptionProjet;
	private String dateDebutProjrt;
	private String dateFinProjet;
	private Double budget;
	
	
	
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Projet(String nomProjet, String descriptionProjet, String dateDebutProjrt, String dateFinProjet,
			Double budget) {
		super();
		NomProjet = nomProjet;
		this.descriptionProjet = descriptionProjet;
		this.dateDebutProjrt = dateDebutProjrt;
		this.dateFinProjet = dateFinProjet;
		this.budget = budget;
	}


	public Projet(int idProjet, String nomProjet, String descriptionProjet, String dateDebutProjrt,
			String dateFinProjet, Double budget) {
		super();
		this.idProjet = idProjet;
		NomProjet = nomProjet;
		this.descriptionProjet = descriptionProjet;
		this.dateDebutProjrt = dateDebutProjrt;
		this.dateFinProjet = dateFinProjet;
		this.budget = budget;
	}


	public int getIdProjet() {
		return idProjet;
	}


	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}


	public String getNomProjet() {
		return NomProjet;
	}


	public void setNomProjet(String nomProjet) {
		NomProjet = nomProjet;
	}


	public String getDescriptionProjet() {
		return descriptionProjet;
	}


	public void setDescriptionProjet(String descriptionProjet) {
		this.descriptionProjet = descriptionProjet;
	}


	public String getDateDebutProjrt() {
		return dateDebutProjrt;
	}


	public void setDateDebutProjrt(String dateDebutProjrt) {
		this.dateDebutProjrt = dateDebutProjrt;
	}


	public String getDateFinProjet() {
		return dateFinProjet;
	}


	public void setDateFinProjet(String dateFinProjet) {
		this.dateFinProjet = dateFinProjet;
	}


	public Double getBudget() {
		return budget;
	}


	public void setBudget(Double budget) {
		this.budget = budget;
	}
	
	
	
	
	
	

}
