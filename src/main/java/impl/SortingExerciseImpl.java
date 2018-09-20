package impl;

import exercise.SortingExercise;

import java.util.ArrayList;
import java.util.List;

public class SortingExerciseImpl implements SortingExercise {


    @Override
    public List<Integer> bubbleSort(List<Integer> unsorted) {
        int a;
        int b;

        for (int j = 0; j < unsorted.size(); j++) {
            for (int i = 0; i < unsorted.size() - 1; i++) {
                if (unsorted.get(i) > unsorted.get(i + 1)) {
                    a = unsorted.get(i);
                    b = unsorted.get(i + 1);
                    unsorted.set(i, b);
                    unsorted.set(i + 1, a);
                }
            }
        }
        return unsorted;
    }

    @Override
    public List<Integer> insertSort(List<Integer> unsorted) {

        return null;
    }

    @Override
    public List<Integer> selectionSort(List<Integer> unsorted) {
        return null;
    }

    @Override
    public List<Integer> mergeSort(List<Integer> unsorted) {
        return null;
    }

    @Override
    public List<Integer> quickSort(List<Integer> unsorted) {
        return null;
    }
}
