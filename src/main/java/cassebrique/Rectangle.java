package cassebrique;

import java.awt.*;

public class Rectangle extends Sprite implements Dessinable {

    public int hauteur;

    public Rectangle(int hauteur) {
        super(500,650 ,100, Color.orange);
        this.hauteur = hauteur;
    }

    public int getHauteur() {
        return hauteur;
    }

    public void setHauteur(int hauteur) {
        this.hauteur = hauteur;
    }

    @Override
    public void dessinner(Graphics2D dessin) {
        dessin.setColor(this.couleur); //use g2 instead
        dessin.fillRect(this.x,this.y,this.largeur,this.hauteur);//use g2 instead
    }
}
