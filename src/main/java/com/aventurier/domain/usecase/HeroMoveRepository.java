package com.aventurier.domain.usecase;

import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.entity.Hero;

public interface HeroMoveRepository {
    Carte chargerCarte(String file);
    Hero chargerHero(String xy);
    String chargerMouvements(String mouvement);
}
