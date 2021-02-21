    // Given an integer, print a staircase consisting on # and spaces, like this:
    // Input: 6 
    // Output:
    //     #
    //    ##
    //   ###
    //  ####
    // #####
    //######

    
    static void staircase(int n) {

        for (int i=0; i<n; i++){
            
            for (int k=0; k<n-i-1; k++){
                System.out.print(" ");
            }
            
            for (int j=0; j<i+1; j++){
                System.out.print("#");
            }
            
            System.out.println();       
        }

    }
