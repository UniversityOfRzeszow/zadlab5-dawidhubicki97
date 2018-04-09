/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl5;

import pl.edu.ur.oopl5.Liczba;
import pl.edu.ur.oopl5.Firma;
import java.util.Scanner;


/**
 *
 * @author Dawid
 */
public class OOPL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int wybor;
        Scanner s = new Scanner(System.in);
        System.out.println("Ktore zadanie:");
        System.out.println("1.2 zadanie:");
        System.out.println("2.5 zadanie");
        System.out.println("3.6 zadanie");
        wybor = s.nextInt();
        switch (wybor) {
            case 1: {
                int rozmiar, drugiwybor = 5;
                System.out.println("Podaj rozmiar stosu");
                rozmiar = s.nextInt();
                Stos nowystos = new Stos(rozmiar);
                while (drugiwybor != 0) {
                    System.out.println("Co chcesz zrobic?");
                    System.out.println("1.dodac liczbe do stosu");
                    System.out.println("2.usunac liczbe ze stosu");
                    System.out.println("3.wyswietlic stos");
                    System.out.println("0.koniec programu");
                    drugiwybor = s.nextInt();
                    switch (drugiwybor) {
                        case 1:
                            nowystos.push();
                            break;
                        case 2:
                            nowystos.pop();
                            break;
                        case 3:
                            nowystos.wyswietlstos();
                            break;
                    }
                }
                 break;
            }
            case 2: {
                int drugiwybor = 0;
                Firma nowafirma = new Firma();
                while (drugiwybor != 4) {
                    System.out.println("Co chcesz zrobic?");
                    System.out.println("1.dodac pracownika");
                    System.out.println("2.wyswietlic pracownikow");
                    System.out.println("0.koniec programu");
                    drugiwybor = s.nextInt();
                    switch (drugiwybor) {
                        case 1:
                            nowafirma.dodajPracownika();
                            break;
                        case 2:
                            nowafirma.wypiszPracownikow();
                            break;

                    }
                }
                break;
            }
            case 3: {
                String liczba;
                int drugiwybor = 5;
                System.out.println("Podaj liczbe:");
                liczba = s.next();
                Liczba pierwszaliczba = new Liczba(liczba);
                while (drugiwybor != 0) {
                    System.out.println("Co chcesz zrobic?");
                    System.out.println("1.wypisac liczbe");
                    System.out.println("2.pomnozyc liczbe");
                    System.out.println("3.obliczyc silnie");
                    System.out.println("0.koniec programu");
                    drugiwybor = s.nextInt();
                    switch (drugiwybor) {
                        case 1:
                            pierwszaliczba.wypiszLiczbe();
                            break;
                        case 2:
                            pierwszaliczba.pomnozLiczbe();
                            break;
                        case 3: {
                            int silnia;
                            System.out.println("Z jakiej liczby silnia");
                            silnia=s.nextInt();
                            pierwszaliczba.silnia(silnia);
                            break;
                            
                        }
                    }
                }
                break;
            }
        }
    }

}
