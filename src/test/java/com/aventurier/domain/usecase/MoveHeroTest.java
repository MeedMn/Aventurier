package com.aventurier.domain.usecase;

import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.entity.Hero;
import com.aventurier.domain.usecase.Impl.MoveHeroImpl;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MoveHeroTest {
    @Test
    public void testMoveNorth() {
        Hero hero = new Hero(2, 3);
        Carte carte = new Carte(new char[][] {
                {'#', '#', '#'},
                {'#', ' ', '#'},
                {'#', ' ', '#'}
        });
        MoveHeroImpl moveHero = new MoveHeroImpl();
        moveHero.move(hero, carte, 'N');
        assertEquals(2, hero.getX());
        assertEquals(2, hero.getY());
    }

    @Test
    public void testInvalidMove() {
        Hero hero = new Hero(2, 2);
        Carte carte = new Carte(new char[][] {
                {'#', '#', '#'},
                {'#', ' ', '#'},
                {'#', '#', '#'}
        });
        MoveHeroImpl moveHero = new MoveHeroImpl();
        moveHero.move(hero, carte, 'N');
        assertEquals(2, hero.getX());
        assertEquals(2, hero.getY());
    }
}

