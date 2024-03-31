package pkg06.proyectodibujos;

import java.awt.Color;
import java.awt.Point;

public class Nodo {

    Nodo siguiente; //apuntador a otro Nodo
    TipoTrazo trazo;
    Point inicio;
    Point fin;
    private Color color;
    private int grosor;
    private boolean resaltado = false;

    public Nodo(TipoTrazo trazo, Point inicio, Point fin) {
        this.trazo = trazo;
        this.inicio = inicio;
        this.fin = fin;
        this.resaltado = false;
    }

    public Nodo() {
        this.trazo = null;
        this.inicio = null;
        this.fin = null;
    }

    public TipoTrazo getTrazo() {
        return trazo;
    }

    public Point getInicio() {
        return inicio;
    }

    public Point getFin() {
        return fin;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setGrosor(int grosor) {
        this.grosor = grosor;
    }

    public int getGrosor() {
        return grosor;
    }

    public boolean isResaltado() {
        return resaltado;
    }

    public void setResaltado(boolean resaltado) {
        this.resaltado = resaltado;
    }

    
    @Override
    public String toString() {
        return "Nodo: Tipo de trazo: " + trazo + ", Inicio: (" + inicio.x + ", " + inicio.y + "), Fin: (" + fin.x + ", " + fin.y + ")";
    }
}
