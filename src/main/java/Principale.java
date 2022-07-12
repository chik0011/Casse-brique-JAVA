import model.Fenetre;
import model.Utilisateur;

public class Principale {

    public static void main(String[] args) {

        maMethod();

        Utilisateur franck = new Utilisateur("Franck", "Doe");

        int[] monTableauEntier = {1,2,3,4,5,60};

        int[] mondeuxiemeTableau = new int[5];

        Fenetre fn = new Fenetre(1000, 700);
    }

    public static void maMethod() {
        System.out.println("hello");
    }

}
