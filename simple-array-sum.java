    // Given an array of integers, find the sum of its elements.
    
    static int simpleArraySum(int[] ar) {
        
        int sum = 0;
        
        for (int i=0; i<ar.length; i++){
            sum += ar[i];
        }
        
        return sum;
    }
