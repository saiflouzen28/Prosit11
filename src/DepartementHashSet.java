import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.*;
public class DepartementHashSet implements IDepartement<Departement>{
    Set<Departement> Deps = new HashSet<>();
    @Override
    public void ajouterDepartement(Departement departement) {
        Deps.add(departement);
    }

    @Override
    public boolean recherDepartement(String nom) {
        for (Departement d: Deps) {
            if(d.getNom_departement().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return Deps.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        Deps.remove(departement);
    }

    @Override
    public void displayDepartement() {
        Iterator<Departement> it = Deps.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }

    @Override
    public TreeSet<Departement> trerDepartementById() {
        return new TreeSet<>(Deps);
    }
}
