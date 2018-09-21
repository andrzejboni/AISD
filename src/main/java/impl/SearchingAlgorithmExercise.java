package impl;

import java.util.List;

public class SearchingAlgorithmExercise {

    public boolean binarySearch(List<Integer> elements, int searchedElement) {
        boolean isFoud = false;

        elements = new SortingExerciseImpl().insertSort2(elements);
        int middle = (elements.size() + 1) / 2;


        while (middle != 0) {

            if (elements.get(middle) == searchedElement) {
                isFoud = true;
                break;
            } else if (elements.get(middle) > searchedElement) {
                elements = elements.subList(middle + 1, elements.size() - 1);

            } else {
                elements = elements.subList(0,middle-1);
            }


        }
        return true;
    }

}
