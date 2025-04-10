
// Fichier: Enseignant.java
import java.time.*;
import java.util.*;

public class Enseignant {
    private String nom;
    private int age;
    private LocalDate debut;
    private int salaire;
    private Titre titre;
    private List<Matiere> matieres = new ArrayList<>();

    public Enseignant(String nom, int age, LocalDate debut, int salaire, Titre titre) {
        this.nom = nom;
        this.age = age;
        this.debut = debut;
        this.salaire = salaire;
        this.titre = titre;
    }

    public void enseigner(Matiere m) {
        matieres.add(m);
    }

    public void augmenterSal(int montant) {
        this.salaire += montant;
    }
}