import java.util.Objects;

public class Employe implements Comparable<Employe>{
    public int id;
    public String nom ;
    public String prenom;
    public int gradie;

    public Employe(int ifentifant, String nom, String prenom, int gradie) {
        this.id = ifentifant;
        this.nom = nom;
        this.prenom = prenom;
        this.gradie = gradie;
    }

    public Employe() {

    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getGradie() {
        return gradie;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setGradie(int gradie) {
        this.gradie = gradie;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o instanceof Employe) {
            Employe other = (Employe) o;
            return (id == other.getId() && nom.equals(other.getNom()));
        }
        return false;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", gradie=" + gradie +
                '}';
    }
    @Override
    public int compareTo(Employe o) {
        return id-o.getId();
    }
}
