// Return the absolute difference of the sum of the two diagonals of a square Matrix
    public static int diagonalDifference(List<List<Integer>> arr) {
        int firstDiagonalSum = 0;
        int secondDiagonalSum = 0;
        int size = arr.size();
        
        for (int i=0; i<size; i++){
            firstDiagonalSum += arr.get(i).get(i);
            secondDiagonalSum += arr.get(i).get(size-1 -i);
        }
        
        return Math.abs(firstDiagonalSum - secondDiagonalSum);

    }
