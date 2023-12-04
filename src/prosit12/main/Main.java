package prosit12.main;

import prosit12.entities.Etudiant;
import prosit12.entities.EtudiantMangement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;


public class Main {
    public static void main(String[] args) {

        EtudiantMangement et = new EtudiantMangement();
        Etudiant e1 =new Etudiant(1,"el banneni khlifa",40);
        Etudiant e2 =new Etudiant(3,"leo Messi",35);
        List<Etudiant> listEtudiants = new ArrayList();
        listEtudiants.add(e1);
        listEtudiants.add(e2);
        et.displayStudents(listEtudiants, System.out::println);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        et.displayStudentsByFilter(listEtudiants,e->e.getAge()>36, System.out::println);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println(et.returnStudentsNames(listEtudiants,e->e.getNom()));
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        Supplier<Etudiant> etudiantSupplier = () -> new Etudiant(2, "cristiano ronaldo", 37);
        Etudiant e3 = et.createStudent(etudiantSupplier);
        listEtudiants.add(e3);
        et.displayStudents(listEtudiants, System.out::println);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$");
        Comparator <Etudiant> studentIdCompartor = (etudiant1,etudiant2)->Integer.compare(etudiant1.getId(),etudiant2.getId());
        et.sortStudentsById(listEtudiants,studentIdCompartor);
        System.out.println("Sorted students by ID:");
        for (Etudiant student : listEtudiants) {
            System.out.println(student);
        }

    }
}