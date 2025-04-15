package model;

public class ReservationRestaurant extends Reservation {
	private int nbService;
	private int nbTableReservee;

	public ReservationRestaurant(int mois, int jour, int nbService, int nbTableReservee) {
		super(mois, jour);
		this.nbService = nbService;
		this.nbTableReservee = nbTableReservee;
	}

	@Override
	public String toString() {
		String service;
		if (nbService == 1) {
			service = "premier";
		} else {
			service = "deuxi�me";
		}
		return "Le " + mois + "/" + jour + "\nTable " + this.nbTableReservee + " pour le " + service + " service.";
	}

}
