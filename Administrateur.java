public class Administrateur implements Utilisateur {

    private String Nom;
    private String Prenom;
    private String Sexe;
    private String Adresse;
    private String Email;
    private String Telephone;
    private String DateDeNaissance;
    private String MotDePasse;


    public Administrateur(String Nom, String Prenom, String DateDeNaissance){
        this.Nom = Nom;
        this.Prenom = Prenom;
        this.DateDeNaissance = DateDeNaissance;
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

    public String getMotDePasse() {
        return MotDePasse;
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

}