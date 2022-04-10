public interface Utilisateur {

    String getNom();
    String getPrenom();
    String getSexe();
    String getAdresse();
    String getEmail();
    String getTelephone();
    String getDateDeNaissance();

    void setNom(String NouveauNom);
    void setPrenom(String NouveauPrenom);
    void setSexe(String NouveauSexe);
    void setAdresse(String NouvelleAdresse);
    void setEmail(String NouvelEmail);
    void setTelephone(String NouveauNumero);
    void setDateDeNaissance(String NouvelleDateDeNaissance);
    void setMotDePasse(String NouveauMotDePasse);

}