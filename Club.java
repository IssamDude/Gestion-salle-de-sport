/**
 * Modélisation d'un club à partir de son nom, adresse,capacité.
 * @author brahim anfoud.
 * @version 1.0
 */
public class Club {
    /** le nom du club. */
    private String nom;
    /** l'adresse du club. */
    private String adresse;
    /** la capacité du club. */
    private int capacite;
    /**
     * Construction d'un club.
     * @param nom
     * @param adresse
     * @param capacite
     */
    public Club(String nom, String adresse, int capacite) {
        this.nom = nom;
        this.adresse = adresse;
        this.capacite = capacite;
    }
    /**
     * Obtenir le nom du club
     * @return le nom du club.
     */
    public String getNom() {
        return this.nom;
    }
    /**
     * Obtenir l'adresse du club.
     * @return adresse.
     */
    public String getAdresse() {
        return this.adresse;

    }
    /**
     * Obtenir la capacité du club.
     * @return capacité
     */
    public int GetCapacité() {
        return this.capacite;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                ", capacite=" + capacite +
                '}';
    }
}