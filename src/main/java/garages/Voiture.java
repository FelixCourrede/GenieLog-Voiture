package garages;

import java.io.PrintStream;
import java.util.*;

public class Voiture {

	private final String immatriculation;
	private List<Stationnement> myStationnements = new ArrayList<>();

	public Voiture(String i) {
		if (null == i) {
			throw new IllegalArgumentException("Une voiture doit avoir une immatriculation");
		}

		immatriculation = i;
	}

	public String getImmatriculation() {
		return immatriculation;
	}

	/**
	 * Fait rentrer la voiture au garage
	 * Précondition : la voiture ne doit pas être déjà dans un garage
	 *
	 * @param g le garage où la voiture va stationner
	 * @throws java.lang.Exception Si déjà dans un garage
	 */
	public void entreAuGarage(Garage g) {
		Stationnement Snew = new Stationnement(this,g);
		if (myStationnements.size()==0){
			myStationnements.add(Snew);
			return;
		}
		Stationnement S = myStationnements.get(myStationnements.size()-1);
		if (S.getFin()==null) {
			throw new UnsupportedOperationException("La voiture est déja dans un garage");

		}
		myStationnements.add(Snew);
	}

	/**
	 * Fait sortir la voiture du garage
	 * Précondition : la voiture doit être dans un garage
	 *
	 * @throws java.lang.Exception si la voiture n'est pas dans un garage
	 */

	public void sortDuGarage() throws Exception {
		Stationnement S = myStationnements.get(myStationnements.size()-1);
		if (S.getFin()==null) {
			S.terminer();
			myStationnements.set(myStationnements.size()-1,S);
		}
		throw new UnsupportedOperationException("La voiture n'est pas dans un garage");

	/**
	 * @return l'ensemble des garages visités par cette voiture
	 */
	public Set<Garage> garagesVisites() {
		ArrayList Garage = new ArrayList();
		for (int k=0; k<=myStationnements.size();k++){

		}
	}

	/**
	 * @return vrai si la voiture est dans un garage, faux sinon
	 */
	public boolean estDansUnGarage() {
		// TODO: Implémenter cette méthode
		throw new UnsupportedOperationException("Pas encore implémenté");
		// Vrai si le dernier stationnement est en cours
	}

	/**
	 * Pour chaque garage visité, imprime le nom de ce garage suivi de la liste des
	 * dates d'entrée / sortie dans ce garage
	 * <br>
	 * Exemple :
	 * 
	 * <pre>
	 * Garage Castres:
	 *		Stationnement{ entree=28/01/2019, sortie=28/01/2019 }
	 *		Stationnement{ entree=28/01/2019, en cours }
	 *  Garage Albi:
	 *		Stationnement{ entree=28/01/2019, sortie=28/01/2019 }
	 * </pre>
	 *
	 * @param out l'endroit où imprimer (ex: System.out)
	 */
	public void imprimeStationnements(PrintStream out) {
		// TODO: Implémenter cette méthode
		throw new UnsupportedOperationException("Pas encore implémenté");
	}

}
