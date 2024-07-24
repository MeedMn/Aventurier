package com.aventurier.infrastructure;

import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.usecase.HeroMoveRepository;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class FileRepositoryTest {
    private final HeroMoveRepository gameRepository = new FileRepository();

    @Test
    public void testChargerCarte() {
        Path path = Paths.get(".\\testCarte.txt");
        try {
            Files.write(path, "# #\n# #\n###".getBytes());
            Carte carte = gameRepository.chargerCarte("testCarte.txt");
            char[][] carte1 = {
                    {'#', ' ', '#'},
                    {'#', ' ', '#'},
                    {'#', '#', '#'}
            };
            assertArrayEquals(carte1, carte.getCarte());
            Files.delete(path);
        } catch (Exception e) {
            fail("Erreur de creation de fichier de test");
        }
    }
}
