package org.biglietteria;

import java.util.Scanner;

public class Biglietteria {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        boolean isValid=false;
        while (!isValid) {
            System.out.println( "inserisci quanti chilometri devi fare");
            int chilometri = Integer.parseInt(scan.nextLine());
            System.out.println( "inserisci la tua eta");
            int eta = Integer.parseInt(scan.nextLine());
            try {
                Biglietto biglietto = new Biglietto(chilometri, eta);
                isValid = true;
                System.out.println("biglietto valido");
                System.out.println(biglietto.calcolaPrezzo());
            } catch (RuntimeException e ){
                System.out.println("il numero di chilometri non può essere negativo");
            } catch (Exception e ){
                System.out.println("eta non può essere negativa");
            }
        }




    }
}
