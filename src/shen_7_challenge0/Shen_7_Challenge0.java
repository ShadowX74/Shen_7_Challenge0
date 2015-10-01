/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shen_7_challenge0;

/**
 *
 * @author ShadowX
 */
public class Shen_7_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for (int i = 0; i < 650; i++) {
            if ((isDivisiblebytwo(i)) & (isDivisiblebythree(i)) & (isDivisiblebyfive(i))) {
                System.out.println("Team Building");
            } else if ((isDivisiblebythree(i)) & (isDivisiblebyfive(i))) {
                System.out.println("Old School");
            } else if ((isDivisiblebytwo(i)) & (isDivisiblebythree(i))) {
                System.out.println("chismé");
            } else if ((isDivisiblebyfive(i)) & (isDivisiblebyeleven(i))) {
                System.out.println("Animate this!");
            } else if ((isDivisiblebythree(i)) & (isDivisiblebyeleven(i))) {
                System.out.println("Herr Direktor");
            } else if ((isDivisiblebytwo(i)) & (isDivisiblebyeleven(i))) {
                System.out.println("ninja");
            } else if ((isDivisiblebyfive(i))) {
                System.out.println("Vidal");
            } else if ((isDivisiblebythree(i))) {
                System.out.println("Claughton");
            } else if ((isDivisiblebytwo(i))) {
                System.out.println("Davis");
            } else {
                System.out.println(i);
            }
        }
    }
    static boolean isDivisiblebytwo(int number) {
        return (number % 2 == 0);
    }
    static boolean isDivisiblebythree(int number) {
        return (number % 3 == 0);
    }
    static boolean isDivisiblebyfive(int number) {
        return (number % 5 == 0);
    }
    static boolean isDivisiblebyeleven(int number) {
        return (number % 11 == 0);
    }
}
