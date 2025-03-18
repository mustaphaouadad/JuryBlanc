package model;



public class Tache {
	
	private int idTache;
    private String descriptionTache;
    private String dateDebutTache;
    private String dateFinTache;
    private int idProjet;
    
    
	public Tache(int idTache, String descriptionTache, String dateDebutTache, String dateFinTache, int idProjet) {
		super();
		this.idTache = idTache;
		this.descriptionTache = descriptionTache;
		this.dateDebutTache = dateDebutTache;
		this.dateFinTache = dateFinTache;
		this.idProjet = idProjet;
	}


	public Tache(String descriptionTache, String dateDebutTache, String dateFinTache, int idProjet) {
		super();
		this.descriptionTache = descriptionTache;
		this.dateDebutTache = dateDebutTache;
		this.dateFinTache = dateFinTache;
		this.idProjet = idProjet;
	}


	public Tache() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getIdTache() {
		return idTache;
	}


	public void setIdTache(int idTache) {
		this.idTache = idTache;
	}


	public String getDescriptionTache() {
		return descriptionTache;
	}


	public void setDescriptionTache(String descriptionTache) {
		this.descriptionTache = descriptionTache;
	}


	public String getDateDebutTache() {
		return dateDebutTache;
	}


	public void setDateDebutTache(String dateDebutTache) {
		this.dateDebutTache = dateDebutTache;
	}


	public String getDateFinTache() {
		return dateFinTache;
	}


	public void setDateFinTache(String dateFinTache) {
		this.dateFinTache = dateFinTache;
	}


	public int getIdProjet() {
		return idProjet;
	}


	public void setIdProjet(int idProjet) {
		this.idProjet = idProjet;
	}
    
	
   
    

    

}
