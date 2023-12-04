package prosit12.entities;

import prosit12.interfaces.IManagement;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class EtudiantMangement implements IManagement {
    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            con.accept(etudiant);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> pre, Consumer<Etudiant> con) {
        for (Etudiant etudiant : students) {
            if (pre.test(etudiant)) {
                con.accept(etudiant);
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> fun) {
        String names = "";
        for (Etudiant etudiant : students) {
            names += fun.apply(etudiant) + "\n";
        }
        return names;
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> sup) {
        return sup.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> com) {
        students.sort(com);
        return students;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return null;
    }
}
