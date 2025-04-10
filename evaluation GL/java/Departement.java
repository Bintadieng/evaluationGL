package java;

import java.util.ArrayList;
import java.util.List;

public class Departement {
    private String nom;
    private Enseignant chef;
    private List<Enseignant> enseignants = new ArrayList<>();

    public Departement(String nom) {
        this.nom = nom;
    }

    public void ajouterEnseignant(Enseignant e) {
        enseignants.add(e);
    }

}
