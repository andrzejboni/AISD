import exercise.AlgorithmExercise;
import exercise.SortingExercise;
import impl.AlgorithmExerciseImpl;
import impl.SearchingAlgorithmExercise;
import impl.SortingExerciseImpl;
//import impl.ZaimplementujTablice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        int tab[] = new int[]{5, 5, 5, 5, 6, 21};

        ArrayList list = new ArrayList();

        ArrayList<Integer> myArrayList = new ArrayList<>();

        SortingExerciseImpl sortingExercise = new SortingExerciseImpl();
        System.out.println("Tablica ma : " + list.size() + " elementow");
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


        ArrayList lista1 = new ArrayList();

        Randomowe random = new Randomowe();

//        for (int i = 0; i < 50; i++) {
//            lista1.add(random.randomWithRange(1, 100));
//        }
//
////

        Randomowe lista3 = new Randomowe();

        for (int i = 0; i < 40000; i++) {
            list.add(lista3.randomWithRange(1, 10000));
        }

        Randomowe lista2 = new Randomowe();


//
//        long startTimeInsert = System.nanoTime();
//        sortingExercise.insertSort(list);
//        long estimatedTimeInsert = System.nanoTime() - startTimeInsert;
//        System.out.println("CZas dla insert sortu to: " + estimatedTimeInsert);

//
//        long startTime = System.nanoTime();
//        sortingExercise.bubbleSort(list);
//        long estimatedTime = System.nanoTime() - startTime;
//        System.out.println("Czas dla sortowania bąbelkowego to: " + estimatedTime);



//        long startTime4 = System.nanoTime();
//        Collections.sort(list);
//        long estimatedTime4 = System.nanoTime() - startTime4;
//        System.out.println("Czas dla MERGE SORTu to: " + estimatedTime4);


//
////        ZaimplementujTablice bubble = new ZaimplementujTablice();


//        System.out.println(list);
//        System.out.println(sortingExercise.bubbleSort(list));
//        System.out.println(sortingExercise.insertSort(list));
//        System.out.println(sortingExercise.insertSort2(list));


        SearchingAlgorithmExercise searchingAlgorithmExercise = new SearchingAlgorithmExercise();
        System.out.println(searchingAlgorithmExercise.binarySearch(myArrayList, 25));

    }
}
