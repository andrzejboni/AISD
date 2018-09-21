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
        int a;
        int b;
        for (int i = 0; i < unsorted.size() - 1; i++) {
            if (unsorted.get(i) > unsorted.get(i + 1)) {
                a = unsorted.get(i);
                b = unsorted.get(i + 1);
                unsorted.set(i, b);
                unsorted.set(i + 1, a);
                for (int k = 0; k < i; i--) {
                    if (unsorted.get(i) < unsorted.get(i - 1)) {
                        a = unsorted.get(i);
                        b = unsorted.get(i - 1);
                        unsorted.set(i, b);
                        unsorted.set(i - 1, a);
                    }
                }
            }
        }
        return unsorted;
    }

    public List<Integer> insertSort2(List<Integer> unsorted) {
        for (int i = 0; i < unsorted.size(); i++) {
            int toInsert = unsorted.get(i);
            int j = i - 1;
            while (j >= 0 && toInsert < unsorted.get(j)) {
                unsorted.set(j+1, unsorted.get(j));
                j--;
            }
            j++;
            unsorted.set(j,toInsert);
        }
        return unsorted;
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
