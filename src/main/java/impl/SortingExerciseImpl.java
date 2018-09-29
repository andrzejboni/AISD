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


    public List<Integer> insertSort(List<Integer> unsorted) {
        for (int i = 0; i < unsorted.size(); i++) {
            int toInsert = unsorted.get(i);
            int j = i - 1;
            while (j >= 0 && toInsert < unsorted.get(j)) {
                unsorted.set(j + 1, unsorted.get(j));
                j--;
            }
            j++;
            unsorted.set(j, toInsert);
        }
        return unsorted;
    }

    @Override
    public List<Integer> selectionSort(List<Integer> unsorted) {
        return null;
    }

    public ArrayList<String> mergeSort(ArrayList<String> whole) {
        ArrayList<String> left = new ArrayList<String>();
        ArrayList<String> right = new ArrayList<String>();
        int center;

        if (whole.size() == 1) {
            return whole;
        } else {
            center = whole.size() / 2;

            for (int i = 0; i < center; i++) {
                left.add(whole.get(i));
            }
            for (int i = center; center < whole.size(); i++) {
                right.add(whole.get(i));
            }
            left = mergeSort(left);
            right = mergeSort(right);
        }
        return whole;
    }


    public void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        while (leftIndex < left.size() && rightIndex < right.size()) {


        }

    }

    @Override
    public List<Integer> quickSort(List<Integer> unsorted) {
        return null;
    }
}


// Cieakwe:
// metoda reverse i reverseREcursive
// algorytm sorotwaania jakiś sobie klepnać
//