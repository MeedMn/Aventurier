package main.java.com.aventurier.application.Impl;

import main.java.com.aventurier.application.HeroService;
import main.java.com.aventurier.domain.entity.Carte;
import main.java.com.aventurier.domain.entity.Hero;
import main.java.com.aventurier.domain.usecase.HeroMoveRepository;
import main.java.com.aventurier.domain.usecase.Impl.MoveHeroImpl;

public class HeroServiceImpl implements HeroService {

    private final HeroMoveRepository heroMoveRepository;
    private final MoveHeroImpl moveHero;

    public HeroServiceImpl(HeroMoveRepository heroMoveRepository) {
        this.heroMoveRepository = heroMoveRepository;
        this.moveHero = new MoveHeroImpl();
    }


    @Override
    public Hero commencer(String file, String movement,String xy) {
        Carte carte = heroMoveRepository.chargerCarte(file);
        Hero hero = heroMoveRepository.chargerHero(xy);
        String mouvements = heroMoveRepository.chargerMouvements(movement);

        for (char move : mouvements.toCharArray()) {
            moveHero.move(hero, carte, move);
        }

        return hero;
    }
}
