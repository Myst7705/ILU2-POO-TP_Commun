package model;

public abstract class Formulaire {
	protected int mois;
	protected int jour;
	protected int idEntite;

	Formulaire(int mois, int jour) {
		this.mois = mois;
		this.jour = jour;
	}

	public int getJour() {
		return this.jour;
	}

	public int getMois() {
		return this.mois;
	}

	public int getIdentificationEntite() {
		return idEntite;
	}

	public void setIdentificationEntite(int idEntite) {
		this.idEntite = idEntite;
	}
}
