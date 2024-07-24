package com.aventurier.application;

import com.aventurier.application.Impl.HeroServiceImpl;
import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.entity.Hero;
import com.aventurier.domain.usecase.HeroMoveRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class HeroServiceTest {
    private HeroMoveRepository gameRepository;
    private HeroServiceImpl heroService;

    @BeforeEach
    public void init() {
        gameRepository = Mockito.mock(HeroMoveRepository.class);
        heroService = new HeroServiceImpl(gameRepository);
    }

    @Test
    public void testCommencer() {
        String fichierCarte = "./testCarte.txt";
        String mouvements = "SSSSEEEE";
        Hero hero = new Hero(0, 0);
        Carte carte = new Carte(new char[][] {
                {'#', '#', '#', '#'},
                {'#', ' ', ' ', '#'},
                {'#', ' ', ' ', '#'},
                {'#', '#', '#', '#'}
        });

        when(gameRepository.chargerCarte(fichierCarte)).thenReturn(carte);
        when(gameRepository.chargerHero("1,1")).thenReturn(hero);
        when(gameRepository.chargerMouvements(mouvements)).thenReturn(mouvements);

        Hero result = heroService.commencer(fichierCarte, mouvements,"1,1");

        assertEquals(4, result.getX());
        assertEquals(4, result.getY());
    }
}
