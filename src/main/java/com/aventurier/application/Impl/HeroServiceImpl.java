package com.aventurier.application.Impl;

import com.aventurier.application.HeroService;
import com.aventurier.domain.entity.Carte;
import com.aventurier.domain.entity.Hero;
import com.aventurier.domain.usecase.HeroMoveRepository;
import com.aventurier.domain.usecase.Impl.MoveHeroImpl;

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
