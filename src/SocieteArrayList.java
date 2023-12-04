import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SocieteArrayList implements IGestion<Employe> {
    List<Employe> employes = new ArrayList<>();
    @Override
    public void ajouterEmploye(Employe employe) {
        employes.add(employe);
    }

    @Override
    public boolean rechercheEmploye(String nom) {
        for (Employe e: employes) {
            if(e.getNom().equals(nom)) return true;
        }
        return false;
    }

    @Override
    public boolean recherchye(Employe employe) {
        return employes.contains(employe);
    }

    @Override
    public void suppimerEmploye(Employe employe) {
        employes.remove(employe);

    }

    @Override
    public void displayEmploe() {
        System.out.println(employes);

    }

    @Override
    public void trierEmployerParld() {
        Comparator<Employe> comp = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getId()-o2.getId();
            }
        };
        Collections.sort(employes,comp);

    }

    @Override
    public void trierEmplyerParNomDepartementEtGrade() {
        /*Comparator<Employe> comp = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if(!o1.getNomDep().equals(o2.getNomDep())){
                    return o1.getNomDep().compareTo(o2.getNomDep());
                }
                else{
                    return o1.getGrade()-o2.getGrade();
                }
            }
        };
        Collections.sort(employes,comp);
        */
        Comparator<Employe> compDep = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                if(!o1.getNom().equals(o2.getNom())){
                    return o1.getNom().compareTo(o2.getNom());
                }
                return 0;
            }
        };
        Comparator<Employe> compGrade = new Comparator<Employe>() {
            @Override
            public int compare(Employe o1, Employe o2) {
                return o1.getGradie()-o2.getGradie();
            }
        };
        Collections.sort(employes,compGrade);
        Collections.sort(employes,compDep);
    }
}
