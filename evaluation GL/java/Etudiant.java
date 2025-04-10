
// Fichier: Etudiant.java
import java.time.*;

public class Etudiant {
    private String nom;
    private LocalDate naissance;

    public Etudiant(String nom, LocalDate naissance) {
        this.nom = nom;
        this.naissance = naissance;
    }

    public boolean estAdmis() {
        return true; // simplification
    }

    public int age() {
        return Period.between(naissance, LocalDate.now()).getYears();
    }

    // Getters
    public String getNom() {
        return nom;
    }
}
