package main.java.com.aventurier.domain.usecase;

import main.java.com.aventurier.domain.entity.Carte;
import main.java.com.aventurier.domain.entity.Hero;

public interface MoveHero {
    void move(Hero hero, Carte carte, char direction);
}
