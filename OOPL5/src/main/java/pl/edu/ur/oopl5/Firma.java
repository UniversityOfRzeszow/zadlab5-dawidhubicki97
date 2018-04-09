/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import java.util.Scanner;

/**
 *
 * @author Dawid
 */
public class Firma {

    Pracownik[] pracownicy = new Pracownik[100];

    void dodajPracownika() {
        Scanner s = new Scanner(System.in);
        String imie, nazwisko, stanowisko;
        int wiek, nr;
        System.out.println("Ktory na liscie ma byc pracownik?");
        nr = s.nextInt();

        System.out.println("Podaj imie");
        imie = s.next();
        System.out.println("Podaj Nazwisko");
        nazwisko = s.next();
        System.out.println("Podaj wiek");
        wiek = s.nextInt();
        System.out.println("Podaj Stanowisko");
        stanowisko = s.next();
        pracownicy[nr - 1] = new Pracownik(imie, nazwisko, wiek, stanowisko);

    }

    void wypiszPracownikow() {
        for (int i = 0; i < 100; i++) {
           if(pracownicy[i]!=null)
            System.out.println("Imie: "+pracownicy[i].getImie()+"Nazwisko: "+pracownicy[i].getNazwisko()+"wiek: "+pracownicy[i].getWiek()+"Stanowisko: "+pracownicy[i].getStanowisko());
        }
    }
}
