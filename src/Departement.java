import java.util.Objects;

public class Departement implements Comparable<Departement>{
    public int id ;
    public String nom_departement ;
    public int nb_employes;

    public Departement(int id, String nom_departement, int nb_employes) {
        this.id = id;
        this.nom_departement = nom_departement;
        this.nb_employes = nb_employes;
    }

    public Departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom_departement() {
        return nom_departement;
    }

    public void setNom_departement(String nom_departement) {
        this.nom_departement = nom_departement;
    }

    public int getNb_employes() {
        return nb_employes;
    }

    public void setNb_employes(int nb_employes) {
        this.nb_employes = nb_employes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement that)) return false;
        return id == that.id && nb_employes == that.nb_employes && Objects.equals(nom_departement, that.nom_departement);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, nom_departement);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nom_departement='" + nom_departement + '\'' +
                ", nb_employes=" + nb_employes +
                '}';
    }
    public int compareTo(Departement o) {

        return id-o.getId();
    }

    
}
