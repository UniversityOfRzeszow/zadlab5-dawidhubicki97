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
public class Liczba {

    String liczba;

    public Liczba(String liczba) {
        this.liczba = liczba;
    }

    void wypiszLiczbe() {
        System.out.println(liczba);
    }

    void pomnozLiczbe() {
        int domnozenia, drugaliczba, wynik;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj liczbe: ");
        domnozenia = s.nextInt();
        drugaliczba = Integer.parseInt(liczba);
        wynik = domnozenia * drugaliczba;
        this.liczba = String.valueOf(wynik);
    }

    void silnia(int n) {
        int iloczyn = 1;
        for (int i = 1; i <= n; i++) {
            iloczyn *= i;
        }
        this.liczba=String.valueOf(iloczyn);
    }
}
