package main.java.com.aventurier.domain.usecase.Impl;

import main.java.com.aventurier.domain.entity.Carte;
import main.java.com.aventurier.domain.entity.Hero;
import main.java.com.aventurier.domain.usecase.MoveHero;

public class MoveHeroImpl implements MoveHero {
    @Override
    public void move(Hero hero, Carte carte, char direction){
        int X = hero.getX();
        int Y = hero.getY();

        switch (direction){
            case 'N': Y--; break;
            case 'S': Y++; break;
            case 'E': X++; break;
            case 'O': X--; break;
            default: break;
        }
        if(carte.isValid(X,Y)){
            hero.setPosition(X,Y);
        }
    }
}
