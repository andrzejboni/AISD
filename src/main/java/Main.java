import exercise.AlgorithmExercise;
import exercise.SortingExercise;
import impl.AlgorithmExerciseImpl;
import impl.SortingExerciseImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[]{5, 5, 5, 5, 6, 21};


        SortingExerciseImpl sortingExercise = new SortingExerciseImpl();

        ArrayList list = new ArrayList();
        list.add(12);
        list.add(3);
        list.add(7887);
        list.add(97819);
        list.add(91919);
        list.add(18719);
        list.add(789119);
        list.add(978119);
        list.add(156819);
        list.add(10819);
        list.add(568119);
        list.add(685119);
        list.add(567119);
        list.add(778979119);
        list.add(75119);
        list.add(456119);
        list.add(8761);
        list.add(34577);
        list.add(6732);
        list.add(34532);
        list.add(33452);
        list.add(74532);
        list.add(56832);
        list.add(39782);
        list.add(322346);
        list.add(99);
        list.add(326);
        list.add(3212);
        list.add(32221);
        list.add(32553);
        list.add(213);


        AlgorithmExercise algorithmExercise = new AlgorithmExerciseImpl();

//        System.out.println("NWD to " +algorithmExercise.nwd(88,16));
//        System.out.println("NWD Recursive to " +algorithmExercise.nwdRecursive(88,16));
//        System.out.println("SILNIA z liczby to " + algorithmExercise.silnia(11));
//        System.out.println("SILNIA recursive z liczby to " + algorithmExercise.silniaRecursive(11));
//        System.out.println("Suma tablicy list " + algorithmExercise.suma(tab));
//        System.out.println("Suma Recursive tablicy list " + algorithmExercise.sumaRecursive(tab));
//        System.out.println("Nr liczby fibbonaciego to " + algorithmExercise.fibonacci(5));
//        System.out.println("Nr liczby fibbonaciego rekursywnie to to " + algorithmExercise.fibonacciRecursive(5));
//        System.out.println( algorithmExercise.reverse("grzyb"));

        long startTime = System.nanoTime();
        sortingExercise.bubbleSort(list);
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("Czas dla sortowania bąbelkowego to: "+ estimatedTime);

        long startTimeInsert = System.nanoTime();
        sortingExercise.insertSort(list);
        long estimatedTimeInsert = System.nanoTime() - startTimeInsert;
        System.out.println("CZas dla insert sortu to: " +estimatedTimeInsert);


        long startTimeInsert2 = System.nanoTime();
        sortingExercise.insertSort2(list);
        long estimatedTimeInsert2 = System.nanoTime() - startTimeInsert2;
        System.out.println("CZas dla insert  2   sortu to: " +estimatedTimeInsert2);

        System.out.println(sortingExercise.bubbleSort(list));
        System.out.println(sortingExercise.insertSort(list));
        System.out.println(sortingExercise.insertSort2(list));


    }
}
