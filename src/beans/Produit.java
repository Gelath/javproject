/**
 * 
 */
package beans;

/**
 * @author Stagiaire
 *
 */
public class Produit {
	private Integer id;
	private String nomProduit;
	private double prix;
	private String photoProduit;
	private String categorie;
	private String description;
	
	
	/**
	 * @param nomProduit
	 * @param prix
	 * @param photoProduit
	 * @param categorie
	 */
	public Produit(String nomProduit, double prix, String photoProduit, String categorie, Integer id, String description) {
		this.id = id;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.photoProduit = photoProduit;
		this.categorie = categorie;
		this.description = description;
	}
	/**
	 * @param nomProduit
	 * @param prix
	 * @param photoProduit
	 */
	public Produit(String nomProduit, double prix, String photoProduit, Integer id) {
		this.id = id;
		this.nomProduit = nomProduit;
		this.prix = prix;
		this.photoProduit = photoProduit;
		
	}
	/**
	 * @return the nomProduit
	 */
	public String getNomProduit() {
		return nomProduit;
	}
	/**
	 * @param nomProduit the nomProduit to set
	 */
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	/**
	 * @return the prix
	 */
	public double getPrix() {
		return prix;
	}
	/**
	 * @param prix the prix to set
	 */
	public void setPrix(double prix) {
		this.prix = prix;
	}
	/**
	 * @return the photoProduit
	 */
	public String getPhotoProduit() {
		return photoProduit;
	}
	/**
	 * @param photoProduit the photoProduit to set
	 */
	public void setPhotoProduit(String photoProduit) {
		this.photoProduit = photoProduit;
	}
	/**
	 * @return the categorie
	 */
	public String getCategorie() {
		return categorie;
	}
	/**
	 * @param categorie the categorie to set
	 */
	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
