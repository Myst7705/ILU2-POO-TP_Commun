package model;

public abstract class Reservation {
	protected int mois;
	protected int jour;

	Reservation(int mois, int jour) {
		this.mois = mois;
		this.jour = jour;
	}

	@Override
	public abstract String toString();
}
