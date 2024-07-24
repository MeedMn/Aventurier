package com.aventurier.domain.entity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HeroTest {
    @Test
    public void testHeroinitialisation() {
        Hero hero = new Hero(2, 3);
        assertEquals(2, hero.getX());
        assertEquals(3, hero.getY());
    }

    @Test
    public void testSetPosition() {
        Hero hero = new Hero(0, 0);
        hero.setPosition(4, 5);
        assertEquals(4, hero.getX());
        assertEquals(5, hero.getY());
    }
}
