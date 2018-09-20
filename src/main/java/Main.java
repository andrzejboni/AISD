import exercise.AlgorithmExercise;
import exercise.SortingExercise;
import impl.AlgorithmExerciseImpl;
import impl.SortingExerciseImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[] {5,5,5,5,6,21};


//        AlgorithmExercise algorithmExercise = new AlgorithmExerciseImpl();
//
//        System.out.println("NWD to " +algorithmExercise.nwd(88,16));
//        System.out.println("NWD Recursive to " +algorithmExercise.nwdRecursive(88,16));
//        System.out.println("SILNIA z liczby to " + algorithmExercise.silnia(11));
//        System.out.println("Suma tablicy list " + algorithmExercise.suma(tab));
//        System.out.println("Suma Recursive tablicy list " + algorithmExercise.sumaRecursive(tab));
//        System.out.println("Nr liczby fibbonaciego to " + algorithmExercise.fibonacci(5));
//        System.out.println("Nr liczby fibbonaciego to " + algorithmExercise.fibonacciRecursive(5));
//        System.out.println( algorithmExercise.reverse("ggrzyb"));


        SortingExerciseImpl s1 = new SortingExerciseImpl();

        ArrayList list = new ArrayList();
        list.add(12);
        list.add(3);
        list.add(87);
        list.add(15);
        list.add(119);
        list.add(1);

        s1.bubbleSort(list);
        System.out.println(s1.bubbleSort(list));


    }
}
