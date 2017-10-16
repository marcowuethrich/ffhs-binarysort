package binSearch;


class BinSearch {
    /**
     * For a subordinate ordered array, find a value that contains the smallest and largest indexes.
     * @param array Array with some sorted int numbers
     * @param value Searchable Value in array List
     * @return A Pair with smallest and largest indexes, or null.
     */
    static Pair search(int[] array, int value) {
        //Break up, if array empty or number not exist
        if (array.length == 0 || binarySearch(array, value, 0, array.length - 1) == -1) return null;

        int lower = 0, higher = array.length - 1;
        int lowestMatch = 0;
        int highestMatch = 0;

        //Search Binary for lowest Value Index
        while (lower <= higher) {
            int tempIndex = binarySearch(array, value, lower, higher);

            if (tempIndex == -1) {
                break;
            }
            lowestMatch = tempIndex;
            higher = tempIndex - 1;
        }

        //improve search
        lower = lowestMatch;

        //Is lower the last element
        if (lower == higher) {
            return new Pair(lowestMatch, lowestMatch);
        }

        //Search Binary for highest Value Index
        higher = array.length - 1;
        while (lower <= higher) {
            int tempIndex = binarySearch(array, value, lower, higher);

            if (tempIndex == -1) {
                break;
            }

            highestMatch = tempIndex;
            lower = tempIndex + 1;
        }

        return new Pair(lowestMatch, highestMatch);
    }

    private static int binarySearch(int[] a, int value, int low, int high) {
        int index;
        int l = low, h = high;
        while (l <= h) {
            index = (l + h) / 2; //  index in the middle
            if (a[index] == value) return index;

            if (value < a[index]) {
                h = index - 1;
            } else {
                l = index + 1; // update bounds
            }
        }
        return -1;//If not exist return -1
    }
}
