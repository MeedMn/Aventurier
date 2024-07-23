package main.java.com.aventurier;

import main.java.com.aventurier.application.Impl.HeroServiceImpl;
import main.java.com.aventurier.domain.entity.Hero;
import main.java.com.aventurier.infrastructure.FileRepository;

import java.util.Scanner;

public class AventurierApplication {
    public static void main(String[] args) {
        String fichierCarte = "C:\\Users\\menfa\\Desktop\\godev\\carte.txt";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer x,y de hero : ");
        String xy = scanner.nextLine();
        System.out.println("Veuillez entrer les mouvements : ");
        String movements = scanner.nextLine();
        scanner.close();

        HeroServiceImpl heroService = new HeroServiceImpl(new FileRepository());
        Hero hero = heroService.commencer(fichierCarte, movements,xy);

        System.out.println("Le personnage se trouve en (" + hero.getX() + "," + hero.getY() + ")");
    }
}
