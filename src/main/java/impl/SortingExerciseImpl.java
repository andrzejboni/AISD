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


    private void merge(ArrayList<String> left, ArrayList<String> right, ArrayList<String> whole) {
        int leftIndex = 0;
        int rightIndex = 0;
        int wholeIndex = 0;

        // As long as neither the left nor the right ArrayList has
        // been used up, keep taking the smaller of left.get(leftIndex)
        // or right.get(rightIndex) and adding it at both.get(bothIndex).
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if ( (left.get(leftIndex).compareTo(right.get(rightIndex))) < 0) {
                whole.set(wholeIndex, left.get(leftIndex));
                leftIndex++;
            } else {
                whole.set(wholeIndex, right.get(rightIndex));
                rightIndex++;
            }
            wholeIndex++;
        }

        ArrayList<String> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            // The left ArrayList has been use up...
            rest = right;
            restIndex = rightIndex;
        } else {
            // The right ArrayList has been used up...
            rest = left;
            restIndex = leftIndex;
        }

        // Copy the rest of whichever ArrayList (left or right) was not used up.
        for (int i=restIndex; i<rest.size(); i++) {
            whole.set(wholeIndex, rest.get(i));
            wholeIndex++;
        }
    }

    @Override
    public ArrayList<String> mergeSort(ArrayList<String> whole) {

            ArrayList<String> left = new ArrayList<String>();
            ArrayList<String> right = new ArrayList<String>();
            int center;

            if (whole.size() == 1) {
                return whole;
            } else {
                center = whole.size()/2;
                // copy the left half of whole into the left.
                for (int i=0; i<center; i++) {
                    left.add(whole.get(i));
                }

                //copy the right half of whole into the new arraylist.
                for (int i=center; i<whole.size(); i++) {
                    right.add(whole.get(i));
                }

                // Sort the left and right halves of the arraylist.
                left  = mergeSort(left);
                right = mergeSort(right);

                // Merge the results back together.
                merge(left, right, whole);
            }
            return whole;

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