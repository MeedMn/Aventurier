package com.aventurier.domain.usecase;

import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.entity.Hero;

public interface MoveHero {
    void move(Hero hero, Carte carte, char direction);
}
