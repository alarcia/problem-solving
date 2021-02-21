    // Given an array of integers, find out the fraction of
    // positive, negative and zeroes present in the array
    // and print it
    static void plusMinus(int[] arr) {
        double posCount = 0;
        double negCount = 0;
        double posFraction = 0;
        double negFraction = 0;
        double zeroFraction = 0;
        
        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                posCount++;
            } else if (arr[i]<0){
                negCount++;
            }
        }
        
        posFraction = posCount / arr.length;
        negFraction = negCount / arr.length;
        zeroFraction = 1 - (posFraction + negFraction);
        
        System.out.println(posFraction);
        System.out.println(negFraction);
        System.out.println(zeroFraction);
    }
