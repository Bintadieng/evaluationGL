CREATE TABLE Universite (
    id INT PRIMARY KEY AUTO_INCREMENT,
    code INT,
    nom VARCHAR(255)
);

CREATE TABLE Departement (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255),
    universite_id INT,
    chef_id INT,
    FOREIGN KEY (universite_id) REFERENCES Universite(id)
);

CREATE TABLE Enseignant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255),
    age INT,
    debut DATE,
    salaire INT,
    titre ENUM('ma', 'mc', 'pr'),
    departement_id INT,
    FOREIGN KEY (departement_id) REFERENCES Departement(id)
);

CREATE TABLE Etudiant (
    id INT PRIMARY KEY AUTO_INCREMENT,
    nom VARCHAR(255),
    naissance DATE,
    universite_id INT,
    FOREIGN KEY (universite_id) REFERENCES Universite(id)
);

CREATE TABLE Matiere (
    id INT PRIMARY KEY AUTO_INCREMENT,
    heures INT,
    nom VARCHAR(255)
);

CREATE TABLE Enseignant_Matiere (
    enseignant_id INT,
    matiere_id INT,
    PRIMARY KEY (enseignant_id, matiere_id),
    FOREIGN KEY (enseignant_id) REFERENCES Enseignant(id),
    FOREIGN KEY (matiere_id) REFERENCES Matiere(id)
);

CREATE TABLE Etudiant_Matiere (
    etudiant_id INT,
    matiere_id INT,
    PRIMARY KEY (etudiant_id, matiere_id),
    FOREIGN KEY (etudiant_id) REFERENCES Etudiant(id),
    FOREIGN KEY (matiere_id) REFERENCES Matiere(id)
);

CREATE TABLE Note (
    id INT PRIMARY KEY AUTO_INCREMENT,
    date DATE,
    valeur INT,
    etudiant_id INT,
    matiere_id INT,
    FOREIGN KEY (etudiant_id) REFERENCES Etudiant(id),
    FOREIGN KEY (matiere_id) REFERENCES Matiere(id)
);