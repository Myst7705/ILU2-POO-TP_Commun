package model;

public class CalendrierAnnuel {
	private Mois calendrier[];

	public CalendrierAnnuel() {
		calendrier = new Mois[12];
		String[] nomMois = { "Janvier", "Fevrier", "Mars", "Avril", "Mai", "Juin", "Juillet", "Aout", "Septembre",
				"Octobre", "Novembre", "Decembre" };
		int[] nbJoursMois = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int i = 0; i < 12; i++) {
			calendrier[i] = new Mois(nomMois[i], nbJoursMois[i]);
		}
	}

	public boolean estLibre(int jour, int mois) {
		return calendrier[mois - 1].estLibre(jour - 1);
	}

	public boolean reserver(int jour, int mois) {
		try {
			calendrier[mois - 1].reserver(jour - 1);
		} catch (IllegalStateException e) {
			return false;
		}
		return true;
	}

	private static class Mois {
		private String nom;
		private boolean[] jours;

		private Mois(String nom, int nbJours) {
			this.nom = nom;
			jours = new boolean[nbJours];
			for (int i = 0; i < nbJours; i++) {
				jours[i] = false;
			}
		}

		private boolean estLibre(int jour) {
			return !jours[jour];
		}

		private void reserver(int jour) throws IllegalStateException {
			if (jours[jour]) {
				throw new IllegalStateException();
			}
			jours[jour] = true;
		}
	}
}
