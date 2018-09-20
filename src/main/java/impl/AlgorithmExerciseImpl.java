package impl;

import exercise.AlgorithmExercise;

public class AlgorithmExerciseImpl implements AlgorithmExercise {
    public int nwd(int a, int b) {

        while (a != b) {

            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }

    public int nwdRecursive(int a, int b) {

        if (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
            return nwdRecursive(a, b);
        } else {
            return a;
        }
    }

    public long silnia(int n) {
        int silnia = 1;
        int i = 1;

        while (i <= n) {
            silnia = silnia * i;
            i++;
        }

        return silnia;
    }

    public long silniaRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * silniaRecursive(n - 1);
    }

    public long suma(int[] tab) {
        int suma = 0;
        int i = 0;
        while (i < tab.length) {
            suma += tab[i];
            i++;
        }

        return suma;
    }

    int suma = 0;
    int i = 0;

    public long sumaRecursive(int[] tab) {

        if (i < tab.length) {
            suma += tab[i];
            i++;
            sumaRecursive(tab);
        }

        return suma;
    }

    public int fibonacci(int n) {

        int tab[] = new int[n];
        tab[1] = 1;
        tab[0] = 1;
        for (int i = 2; i < n; i++)
            tab[i] = tab[i - 2] + tab[i - 1];

        return tab[n - 1];
    }


    public int fibonacciRecursive(int n) {

    if (n == 0) return 0;
    if (n ==1) return 1;

    return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);

    }

    public String reverse(String text) { // Tekst wspak!
        int i = 0;
        char[] reverseText = new char[text.length()];

        while (i < text.length()) {
//            reverseText[i] = text.charAt() ;

            i++;
        }


        return null;
    }

    public String reverseRecursive(String text) {
        return null;
    }
}
