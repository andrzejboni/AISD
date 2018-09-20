package exercise;

public interface AlgorithmExercise {
    /**
     * Metoda zwracająca Największy Wspólny Dzielnik dwóch liczb
     * @param a
     * @param b
     * @return
     */
    int nwd(int a, int b);

    /**
     * Metoda rekurencyjna zwracająca Największy Wspólny Dzielnik dwóch liczb
     * @param a
     * @param b
     * @return
     */
    int nwdRecursive(int a, int b);

    /**
     * Metoda zwracająca wartość silni dla podanego n.
     * @param n
     * @return
     */
    long silnia(int n);

    /**
     * Metoda rekurencyjna zwracająca wartość silni dla podanego n.
     * @param n
     * @return
     */
    long silniaRecursive(int n);

    /**
     * Metoda zwracająca sumę wszystkich liczb w tablicy.
     * @param tab
     * @return
     */
    long suma(int[] tab);

    /**
     * Metoda rekurencyjna zwracająca sumę wszystkich liczb w tablicy.
     * @param tab
     * @return
     */
    long sumaRecursive(int[] tab);

    /**
     * Metoda zwracająca n wyraz ciągu fibonacciego.
     * @param n
     * @return
     */
    int fibonacci(int n);

    /**
     * Metoda rekurencyjna zwracająca n wyraz ciągu fibonacciego.
     * @param n
     * @return
     */
    int fibonacciRecursive(int n);

    /**
     * Metoda zwracająca wprowadzony tekst wspak np. reverse("drzewo") = "owezrd"
     * @param text
     * @return
     */
    String reverse(String text);

    /**
     * Metoda rekurencyjna zwracająca wprowadzony tekst wspak np. reverse("drzewo") = "owezrd"
     * @param text
     * @return
     */
    String reverseRecursive(String text);
}