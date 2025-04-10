<?php
class DateObj {
    public $jour, $mois, $annee;
}

abstract class Titre {
    const MA = 'ma';
    const MC = 'mc';
    const PR = 'pr';
}

class Universite {
    public $code, $nom;
    public $etudiants = [];
    public $departements = [];
}

class Etudiant {
    public $nom;
    public $naissance;
    public $notes = [];

    public function estAdmis() {
        return true;
    }

    public function age() {
        return 0;
    }
}

class Note {
    public $date, $valeur;
}

class Departement {
    public $nom;
    public $enseignants = [];

    public function ajouter($enseignant) {
        $this->enseignants[] = $enseignant;
    }
}

class Enseignant {
    public $nom, $age, $debut, $salaire, $titre;
    public $matieres = [];

    public function enseigner($matiere) {
        $this->matieres[] = $matiere;
    }

    public function augmenterSal($v) {
        $this->salaire += $v;
    }
}

class Matiere {
    public $heures, $nom;
}
?>