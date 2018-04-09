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
public class Stos {
   
    private int tab[];
    private int wskaznik;
    
    
    public Stos(int rozmiar)
    {
    this.tab=new int[rozmiar];
    this.wskaznik=0;
    }
    void push() {
        Scanner s=new Scanner(System.in);
        if (wskaznik >= tab.length) {
            System.out.println("Stos jest pelny");
        } else {

            System.out.println("podaj liczbe na stos");
             
            tab[wskaznik]=s.nextInt();
            wskaznik++;
            
                    
        }

}
    void pop() {
        if (wskaznik>0) {
           System.out.println("usuwamy ze stosu");
           tab[wskaznik]=0;
           wskaznik--;
        } else {    

            System.out.println("stos pusty");

        }

}
    void wyswietlstos(){
        System.out.println("Wyswietlamy stos: ");
        for (int i=tab.length-1;i>=0;i--)
        {
            System.out.println(tab[i]);
        }
    }

}