package impl;

import java.util.List;

public class SearchingAlgorithmExercise {

    public boolean binarySearch(List<Integer> elements, int searchedElement) {
        boolean isFound = false;
        if (elements.isEmpty()) {
            return isFound;
        }
        elements = new SortingExerciseImpl().insertSort(elements);
        int middle = (elements.size() ) / 2;


        while (middle != 0) {

            if (elements.get(middle) == searchedElement) {
                isFound = true;
                break;
            } else if (elements.get(middle) < searchedElement) {
                elements = elements.subList(middle , elements.size() - 1);

            } else {
                elements = elements.subList(0, middle - 1);
            }
            middle = (elements.size() + 1) / 2;

        }
        return isFound;
    }

}
