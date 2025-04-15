package model;

public class FormulaireRestaurant extends Formulaire {
	private int nbPersones;
	private int numService;

	public FormulaireRestaurant(int jour, int mois, int nbPersonnes, int numService) {
		super(mois, jour);
		this.nbPersones = nbPersonnes;
		this.numService = numService;
	}

	public Integer getNombrePersonnes() {
		return this.nbPersones;
	}

	public Integer getNumService() {
		return this.numService;
	}

	/*
	 * public Integer getJour() { // TODO Auto-generated method stub return null; }
	 * 
	 * public void setIdentificationEntite(int identification2) { // TODO
	 * Auto-generated method stub
	 * 
	 * }
	 * 
	 * public Integer getIdentificationEntite() { // TODO Auto-generated method stub
	 * return null; }
	 * 
	 * public Integer getMois() { // TODO Auto-generated method stub return null; }
	 */

}
