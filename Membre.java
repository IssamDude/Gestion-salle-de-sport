public class Membre implements Utilisateur {

    private String Nom;
    private String Prenom;
    private String Sexe;
    private String Adresse;
    private String Email;
    private String Telephone;
    private String DateDeNaissance;
    private String MotDePasse;
    private CarteBancaire CarteBancaire;

    public Membre(String Nom, String Prenom, String DateDeNaissance, CarteBancaire CarteBancaire){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DateDeNaissance = DateDeNaissance;
        this.CarteBancaire = CarteBancaire;
    }

    @Override
    public String getNom() {
        return Nom;
    }

    @Override
    public String getPrenom() {
        return Prenom;
    }

    @Override
    public String getSexe() {
        return Sexe;
    }

    @Override
    public String getAdresse() {
        return Adresse;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public String getTelephone() {
        return Telephone;
    }

    @Override
    public String getDateDeNaissance() {
        return DateDeNaissance;
    }

    @Override
    public void setNom(String NouveauNom) {
        Nom = NouveauNom;
    }

    @Override
    public void setPrenom(String NouveauPrenom) {
        Prenom = NouveauPrenom;
    }

    @Override
    public void setSexe(String NouveauSexe) {
        Sexe = NouveauSexe;
    }

    @Override
    public void setAdresse(String NouvelleAdresse) {
        Adresse = NouvelleAdresse;
    }

    @Override
    public void setEmail(String NouvelEmail) {
        Email = NouvelEmail;
    }

    @Override
    public void setTelephone(String NouveauNumero) {
        Telephone = NouveauNumero;
    }

    @Override
    public void setDateDeNaissance(String NouvelleDateDeNaissance) {
        DateDeNaissance = NouvelleDateDeNaissance;
    }

    @Override
    public void setMotDePasse(String NouveauMotDePasse) {
        MotDePasse = NouveauMotDePasse;
    }

    public CarteBancaire getCarteBancaire() {
        return CarteBancaire;
    }

    public String getMotDePasse() {
        return MotDePasse;
    }

    public void setCarteBancaire(CarteBancaire carteBancaire) {
        CarteBancaire = carteBancaire;
    }

    @Override
    public String toString() {
        return "Membre{" +
                "Nom='" + Nom + '\'' +
                ", Prenom='" + Prenom + '\'' +
                ", Sexe='" + Sexe + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", Email='" + Email + '\'' +
                ", Telephone='" + Telephone + '\'' +
                ", Date de naissance='" + DateDeNaissance + '\'' +
                ", Carte bancaire=" + CarteBancaire +
                '}';
    }
}