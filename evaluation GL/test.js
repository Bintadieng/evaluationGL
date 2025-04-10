class DateObj {
    constructor(jour, mois, annee) {
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }
}

const Titre = { MA: 'ma', MC: 'mc', PR: 'pr' };

class Universite {
    constructor(code, nom) {
        this.code = code;
        this.nom = nom;
        this.etudiants = [];
        this.departements = [];
    }
}

class Etudiant {
    constructor(nom, naissance) {
        this.nom = nom;
        this.naissance = naissance;
        this.notes = [];
    }

    estAdmis() { return true; }
    age() { return 0; }
}

class Note {
    constructor(date, valeur) {
        this.date = date;
        this.valeur = valeur;
    }
}

class Departement {
    constructor(nom) {
        this.nom = nom;
        this.enseignants = [];
    }

    ajouter(enseignant) {
        this.enseignants.push(enseignant);
    }
}

class Enseignant {
    constructor(nom, age, debut, salaire, titre) {
        this.nom = nom;
        this.age = age;
        this.debut = debut;
        this.salaire = salaire;
        this.titre = titre;
        this.matieres = [];
    }

    enseigner(matiere) {
        this.matieres.push(matiere);
    }

    augmenterSal(v) {
        this.salaire += v;
    }
}

class Matiere {
    constructor(heures, nom) {
        this.heures = heures;
        this.nom = nom;
    }
}