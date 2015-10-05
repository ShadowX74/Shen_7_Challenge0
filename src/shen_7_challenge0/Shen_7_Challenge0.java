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
            if ((isDivisiblebytwo(i)) & (isDivisiblebythree(i)) & (isDivisiblebyfive(i))) { //by 2, 3, and 5
                System.out.println("Team Building");
            } else if ((isDivisiblebythree(i)) & (isDivisiblebyfive(i))) { //by 3 and 5
                System.out.println("Old School");
            } else if ((isDivisiblebytwo(i)) & (isDivisiblebythree(i))) { //by 2 and 3
                System.out.println("chismé");
            } else if ((isDivisiblebyfive(i)) & (isDivisiblebyeleven(i))) { //by 55
                System.out.println("Animate this!");
            } else if ((isDivisiblebythree(i)) & (isDivisiblebyeleven(i))) { //by 33
                System.out.println("Herr Direktor");
            } else if ((isDivisiblebytwo(i)) & (isDivisiblebyeleven(i))) { //by 22
                System.out.println("ninja");
            } else if ((isDivisiblebyfive(i))) { //by 5
                System.out.println("Vidal");
            } else if ((isDivisiblebythree(i))) { //by 3
                System.out.println("Claughton");
            } else if ((isDivisiblebytwo(i))) { //by 2
                System.out.println("Davis");
            } else {
                System.out.println(i);
            }
        }
    }
    static boolean isDivisiblebytwo(int number) { //method for divisible by 2
        return (number % 2 == 0);
    }
    static boolean isDivisiblebythree(int number) { //methods for divisible by 3
        return (number % 3 == 0);
    }
    static boolean isDivisiblebyfive(int number) { //methods for divisible by 5
        return (number % 5 == 0);
    }
    static boolean isDivisiblebyeleven(int number) { //methods for divisible by 11
        return (number % 11 == 0);
    }
}
