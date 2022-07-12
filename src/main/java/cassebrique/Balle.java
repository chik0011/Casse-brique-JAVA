package cassebrique;

import java.awt.*;

public class Balle extends Sprite implements Dessinable {

    public int vitesseVertical;
    public int vitesseHorizontal;

    public Balle(int x, int y, int vitesseVertical, int vitesseHorizontal) {
        super(x, y, 30, Color.darkGray);
        this.vitesseVertical = vitesseVertical;
        this.vitesseHorizontal = vitesseHorizontal;
    }

    public int getVitesseVertical() {
        return vitesseVertical;
    }

    public void setVitesseVertical(int vitesseVertical) {
        this.vitesseVertical = vitesseVertical;
    }

    public int getVitesseHorizontal() {
        return vitesseHorizontal;
    }

    public void setVitesseHorizontal(int vitesseHorizontal) {
        this.vitesseHorizontal = vitesseHorizontal;
    }


    @Override
    public void dessinner(Graphics2D dessin) {
        dessin.setColor(this.couleur);
        dessin.fillOval(this.x, this.y, largeur, largeur);
    }

    public void mouvement(int hauteur, int largeur) {
        this.x += this.vitesseHorizontal;
        this.y += this.vitesseVertical;

        if (this.y > hauteur-30) {
            vitesseVertical *= -1;
        } else if (this.y < 0) {
            vitesseVertical *= -1;
        }

        if (this.x > largeur-30) {
            vitesseHorizontal *= -1;
        } else if (this.x < 0) {
            vitesseHorizontal *= -1;
        }
    }
}