package model;

public class Restaurant {
	private CentraleReservation<EntiteReservable<FormulaireRestaurant>, FormulaireRestaurant> centrale = new CentraleReservation(
			new Table[100]);

	public int ajouterTable(int nbChaises) {
		int numTable = centrale.ajouterEntite(new Table(nbChaises));
		return numTable;
	}

	public int[] donnerPossibilites(FormulaireRestaurant formulaire) {
		return centrale.donnerPossibilites(formulaire);
	}

	public Reservation reserver(int numEntite, FormulaireRestaurant formulaire) {
		return centrale.reserver(numEntite, formulaire);
	}

	private static class Table extends EntiteReservable<FormulaireRestaurant> {
		private int nbChaises;
		private CalendrierAnnuel calendrierDeuxiemeService = new CalendrierAnnuel();

		public Table(int nbChaises) {
			this.nbChaises = nbChaises;
		}

		@Override
		public boolean compatible(FormulaireRestaurant formulaire) {
			boolean libreService;
			if (formulaire.getNumService() == 1) {
				libreService = super.calendrier.estLibre(formulaire.getJour(), formulaire.getMois());
			} else {
				libreService = calendrierDeuxiemeService.estLibre(formulaire.getJour(), formulaire.getMois());
			}

			return (this.nbChaises == formulaire.getNombrePersonnes()
					|| this.nbChaises == formulaire.getNombrePersonnes() + 1) && libreService;
		}

		/*
		 * @Override public Reservation reserver(FormulaireRestaurant formulaire) { if
		 * (this.compatible(formulaire)) }
		 */

	}
}
