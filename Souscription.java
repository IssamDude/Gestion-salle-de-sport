import java.util.Date;
/**
 * Réalisation de la souscription dans un club.
 * @author brahim anfoud
 * @version 1.0
 */
public class Souscription {
    /** le type de l'abonnement. */
    private String type;
    /** le prix de l'abonnement. */
    private float prix;
    /** la date du début de l'abonnement. */
    private Date DateDebut;
    /** la date d'expiration de l'abonnement. */
    private Date DateExpiration;

    /**
     * Construction d'un abonnement.
     * @param type
     * @param prix
     * @param datainitiale
     * @param datefinale
     */
    public Souscription(String type, float prix, Date datainitiale, Date datefinale) {
        this.type = type;
        this.prix = prix;
        this.DateDebut = datainitiale;
        this.DateExpiration = datefinale;

    }
    /**
     * Obtenir le type d'abonnement.
     * @return tring type.
     */
    public String GetType() {
        return this.type;
    }
    /**
     * Obtenir le prix d'abonnement.
     * @return int prix.
     */
    public float GetPrix() {
        return this.prix;
    }
    /**
     * Obtenir la date de début de l'abonnement
     * @return String DateDebut.
     */
    public Date GetDateDebut() {
        return this.DateDebut;
    }
    /**
     * Obtenir la date d'expiration de l'abonnement
     * @return String DateExpiration.
     */
    public Date GetDateExpiration() {
        return this.DateExpiration;
    }
    /**
     * vérifier la validité de l'abonnement.
     * @param date
     * @return boolean
     */
    public boolean EstValide(Date date) {
        return date.before(DateExpiration);
    }

    @Override
    public String toString() {
        return "Souscription{" +
                "type='" + type + '\'' +
                ", prix=" + prix +
                ", date de début=" + DateDebut +
                ", date d'expiration=" + DateExpiration +
                '}';
    }
}