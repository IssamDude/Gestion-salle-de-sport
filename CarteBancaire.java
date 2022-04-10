public class CarteBancaire {
    private final String proprietaire;
    private final String numeroCB;
    private String Cryptogrammevisuel;
    /**
     * Construire une carte bancaire à la base de
     * @param proprietaire : nom et prenom du propriétaire de la carte
     * @param numeroCB : numéro de la carte
     * @param cvc
     */
    public CarteBancaire(String proprietaire, String numeroCB, String cvc) {
        this.proprietaire = proprietaire;
        this.numeroCB = numeroCB;
        this.Cryptogrammevisuel = cvc;
    }

    @Override
    public String toString() {
        return "CarteBancaire{" +
                "proprietaire='" + proprietaire + '\'' +
                ", numeroCB='**** **** **** ****" +  + '\'' +
                ", Cryptogrammevisuel='***" + '\'' +
                '}';
    }
}