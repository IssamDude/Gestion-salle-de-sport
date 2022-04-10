import java.util.ArrayList;

/** CompteMembre est une classe qui modélise  le compte
 * d'un utilisateur de la salle de sport.
 * Elle pourra prochainement hériter de la classe.
 * @author  Issam El Kadiri <issam.elkadiri@etu.inp-n7.fr>
 * @coauthor Yasmine Charifi <yasmine.charifi@etu.inp-n7.fr>
 * @version 1.0
 */




public class CompteMembre {

    private ArrayList<Seance> Reservations = new ArrayList<Seance>(5); // Create an ArrayList de Seance

    /** Mot de passe du compte. */
    private Membre proprietaire;
    /** Propriétaire du compte. */
    private Souscription abonnement;
    /** Mot de passe du compte */
    private String MotDePasse;

    /** Construire un compte d'utilisateur et son mot de passe.
     * @param membre propriétaire.
     * @param MDP  mot de passe.
     */
    public CompteMembre(Membre membre, String MDP) {
        this.proprietaire = membre;
        this.MotDePasse = MDP;
    }

    /** Modifier la carte bancaire associé à un compte utilisateur.
     * @param nouvelle nouvelle carte bancaire.
     */
    public void modifierCB(CarteBancaire nouvelle) {
        this.proprietaire.setCarteBancaire(nouvelle);
    }

    /** Ajouter une souscription à un compte utilisateur.
     * @param souscription souscription à ajouter.
     */
    public void AjouterSouscription(Souscription souscription) {
        this.abonnement=souscription;
    }

    /** Modifier la souscription d'un compte.
     * @param nouvelle nouvelle souscription.
     */
    public void ChangerSouscrption(Souscription nouvelle) {
        this.abonnement=nouvelle;
    }

    /** Afficher l'abonnement d'un compte.*/
    public void AfficherSouscription() {
        this.abonnement.toString();
    }

    /** Reserver une séance d'entrainement.
     * @param seance séance à reserver.
     * @param Reservations liste des réservations.
     */
    public void ReserverSeance(Seance seance, ArrayList<Seance> Reservations ) { // Il faut s'assurer que la seance n'a pas été reservée
        for(Seance i : Reservations) {//On parcourt les éléments de Reservations avec foreach
            if(i != seance) {//Si la séance n'est pas déjà parmi les séances résérvées par l'utilisateur
                Reservations.add(seance);//On ajoute la séance parmi les séances résérvées
                seance.ReserverSeance();//On décremente le nombre de séance disponibles
            }
            else {
                System.out.println("La séance est déjà résérvée");
            }
        }
    }

    /** Annuler une séance reservée.
     * @param seance réservation à annuler.
     * @param Reservations liste des réservations.
     */
    public void AnnulerSeance(Seance seance, ArrayList<Seance> Reservations ) {
        for(int i = 0; i < Reservations.size(); i++) {
            if(Reservations.get(i) == seance) {
                Reservations.remove(i);
                seance.AnnulerSeance();
            }
        }
    }

    /** Afficher une réservation faite.
     * @param seance séance à afficher.
     */
    public void AfficherReservation(Seance seance) {
        seance.toString();
    }

    /** Méthode pour l'affichage du compte.
     *
     * @return le compte affiché.
     */
    @Override
    public String toString() {
        return "CompteMembre{" +
                "proprietaire=" + proprietaire +
                ", abonnement=" + abonnement +
                '}';
    }


}
