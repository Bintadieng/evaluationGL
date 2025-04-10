package java;

public class Universite {

    // Fichier: Universite.java
    import java.util.*;
    private int code;
    private String nom;
    private List<Etudiant> etudiants = new ArrayList<>();
    private List<Departement> departements = new ArrayList<>();

    public Universite(int code, String nom) {
        this.code = code;
        this.nom = nom;
    }

    public void ajouterEtudiant(Etudiant e) {
        etudiants.add(e);
    }

    public void ajouterDepartement(Departement d) {
        departements.add(d);
    }

    // Getters & setters (facultatifs ici)
}
