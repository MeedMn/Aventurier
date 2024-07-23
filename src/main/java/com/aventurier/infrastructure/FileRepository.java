package main.java.com.aventurier.infrastructure;

import main.java.com.aventurier.domain.entity.Carte;
import main.java.com.aventurier.domain.entity.Hero;
import main.java.com.aventurier.domain.usecase.HeroMoveRepository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileRepository implements HeroMoveRepository {
    @Override
    public Carte chargerCarte(String file) {
        try {
            List<String> lignes = Files.readAllLines(Paths.get(file));
            char[][] grid = new char[lignes.size()][];
            for (int i = 0; i < lignes.size(); i++) {
                grid[i] = lignes.get(i).toCharArray();
            }
            return new Carte(grid);
        } catch (IOException e) {
            throw new RuntimeException("Erreur de chargement de la carte", e);
        }
    }

    @Override
    public Hero chargerHero(String xy) {
        try {
            String[] startCoords = xy.split(",");
            int x = Integer.parseInt(startCoords[0]);
            int y = Integer.parseInt(startCoords[1]);
            return new Hero(x, y);
        } catch (Exception e) {
            throw new RuntimeException("Erreur de chargement de hero", e);
        }
    }

    @Override
    public String chargerMouvements(String mouvement) {
        return mouvement;
    }
}
