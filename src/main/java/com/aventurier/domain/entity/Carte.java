package main.java.com.aventurier.domain.entity;

public class Carte {
    private char[][] carte;

    public Carte(char[][] carte) {
        this.carte = carte;
    }

    public boolean isValid(int x, int y) {
        return x >= 0 && x < carte[0].length && y >= 0 && y < carte.length && carte[y][x] == ' ';
    }
}
