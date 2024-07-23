package main.java.com.aventurier.domain.usecase;

import main.java.com.aventurier.domain.entity.Carte;
import main.java.com.aventurier.domain.entity.Hero;

public interface HeroMoveRepository {
    Carte chargerCarte(String file);
    Hero chargerHero(String xy);
    String chargerMouvements(String mouvement);
}
