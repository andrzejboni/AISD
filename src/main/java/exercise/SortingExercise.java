package exercise;


import java.util.ArrayList;
import java.util.List;

public interface SortingExercise {
    /**
     * Metoda sortująca listę liczb sortowaniem bąbelkowym
     * @param unsorted
     * @return
     */
    List<Integer> bubbleSort(List<Integer> unsorted);

    /**
     * Metoda sortująca listę liczb sortowaniem przez wstawianie
     * @param unsorted
     * @return
     */
    List<Integer> insertSort(List<Integer> unsorted);

    /**
     * Metoda sortująca listę liczb sortowaniem przez wybieranie
     * @param unsorted
     * @return
     */
    List<Integer> selectionSort(List<Integer> unsorted);

    /**
     * Metoda sortująca listę liczb sortowaniem przez scalanie
     * @param unsorted
     * @return
     */
    ArrayList<String> mergeSort(ArrayList<String> unsorted);

    /**
     * Metoda sortująca listę liczb sortowaniem szybkim
     * @param unsorted
     * @return
     */
    List<Integer> quickSort(List<Integer> unsorted);
}
