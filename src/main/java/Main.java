import exercise.AlgorithmExercise;
import impl.AlgorithmExerciseImpl;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[] {5,5,5,5,6,21};


        AlgorithmExercise algorithmExercise = new AlgorithmExerciseImpl();

        System.out.println("NWD to " +algorithmExercise.nwd(88,16));
        System.out.println("NWD Recursive to " +algorithmExercise.nwdRecursive(88,16));
        System.out.println("SILNIA z liczby to " + algorithmExercise.silnia(11));
        System.out.println("Suma tablicy list " + algorithmExercise.suma(tab));
        System.out.println("Suma Recursive tablicy list " + algorithmExercise.sumaRecursive(tab));
        System.out.println("Nr liczby fibbonaciego to " + algorithmExercise.fibonacci(5));
        System.out.println("Nr liczby fibbonaciego to " + algorithmExercise.fibonacciRecursive(5));
        System.out.println( algorithmExercise.reverse("ggrzyb"));



    }
}
