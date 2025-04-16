package model;

// cette classe est inutile

public class EntiteTable extends EntiteReservable<FormulaireRestaurant> {
	private int nbPersonnes;
	private int nbService;

	EntiteTable(int nbPersonnes, int nbServices) {
		super();
		this.nbPersonnes = nbPersonnes;
		this.nbService = nbServices;
	}

	@Override
	public boolean compatible(FormulaireRestaurant F) {
		return this.estLibre(F);
	}

	@Override
	public Reservation reserver(FormulaireRestaurant F) {
		if (this.compatible(F)) {
			return new ReservationRestaurant(F.getMois(), F.getJour(), F.getNumService(), F.getNombrePersonnes());
		}
		return null;
	}
}
