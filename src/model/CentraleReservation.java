package model;

public class CentraleReservation<E extends EntiteReservable<F>, F extends Formulaire> {
	private int nbEntite;
	private E[] tabEntite;

	public CentraleReservation(E[] tabEntite) {
		this.tabEntite = tabEntite;
		this.nbEntite = 0;
	}

	public int ajouterEntite(E entite) {
		this.tabEntite[this.nbEntite] = entite;
		this.nbEntite++;
		return this.nbEntite - 1;
	}

	public int[] donnerPossibilites(F formulaire) {
		int[] tabRetour = new int[this.nbEntite];
		for (int i = 0; i < this.nbEntite; i++) {
			tabRetour[i] = 0;
			if (this.tabEntite[i].compatible(formulaire)) {
				tabRetour[i] = i;
			}
		}

		return tabRetour;
	}

	public Reservation reserver(int numEntite, F formulaire) {
		E entite = this.tabEntite[numEntite];
		formulaire.setIdentificationEntite(numEntite);
		return entite.reserver(formulaire);
	}
}
