package model;

public class Etudiant extends Utilisateur {

    private int noteGlobal;

    public Etudiant(String prenom, String nom, int noteGlobal) {
        super(prenom, nom);
        this.noteGlobal = noteGlobal;
    }
}
