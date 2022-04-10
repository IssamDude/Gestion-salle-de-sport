public class Seance {
    private String heure;
    private String date;
    final private int capacite = 100;
    private int PlacesDisponibles = 100;
    /**Construire une seance à la base de
     * @param heure
     * @param date
     */
    public Seance(String heure, String date) {
        this.date = date;
        this.heure = heure;
    }
    //Avoir le nombre de places disponibles
    public int getPlacesDisponibles() {
        return this.PlacesDisponibles;
    }
    //Savoir si une seance est disponible ou pas
    public Boolean EstDisponible() {
        return PlacesDisponibles != 0;
    }
    //Reserver une séance
    public void ReserverSeance() {
        assert this.EstDisponible();
        this.PlacesDisponibles = this.PlacesDisponibles - 1;
    }
    //Annuler une seance
    public void AnnulerSeance() {
        assert this.PlacesDisponibles != 100;
        this.PlacesDisponibles = this.PlacesDisponibles + 1;
    }

    @Override
    public String toString() {
        return "Seance{" +
                "heure='" + heure + '\'' +
                ", date='" + date + '\'' +
                ", capacité=" + capacite +
                ", places disponibles=" + PlacesDisponibles +
                '}';
    }
}