package com.aventurier.application;

import com.aventurier.domain.entity.Hero;

public interface HeroService {
    Hero commencer(String file,String movement,String xy);
}
