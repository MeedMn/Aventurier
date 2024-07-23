package main.java.com.aventurier.application;

import main.java.com.aventurier.domain.entity.Hero;

public interface HeroService {
    Hero commencer(String file,String movement,String xy);
}
