public class main {
    // Fichier: Main.java
import java.time.*;
    public static void main(String[] args) {
        Universite u = new Universite(101, "Université de Paris");

        Etudiant e1 = new Etudiant("Alice", LocalDate.of(2003, 4, 15));
        u.ajouterEtudiant(e1);

        Departement info = new Departement("Informatique");
        Enseignant prof = new Enseignant("Dr. Dupont", 45, LocalDate.of(2010, 9, 1), 3200, Titre.MC);
        info.ajouterEnseignant(prof);
        info.definirChef(prof);

        u.ajouterDepartement(info);

        Matiere java = new Matiere("Programmation Java", 48);
        prof.enseigner(java);

        System.out.println(e1.getNom() + " a " + e1.age() + " ans.");
    
    }
}
