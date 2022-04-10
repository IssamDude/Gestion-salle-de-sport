/** Compte est une classe abstraite qui représente un compte
 * sur l'application de gestion de salle de sport.
 * Peut être utilisée prochainement.
 * @author  Issam El Kadiri <issam.elkadiri@etu.inp-n7.fr>
 * @version 1.0
 */

public abstract class Compte {

    /** Mot de passe du compte. */
    private String MotDePasse;
    /** Propriétaire du compte. */
    private Utilisateur proprietaire;

    /** Construire un compte à partir de son propriétaire et son mot de passe.
     * @param user propriétaire.
     * @param MDP mot de passe.
     */
    protected Compte(Utilisateur user, String MDP) {
        this.proprietaire = user;
        this.MotDePasse = MDP;
    }

}
