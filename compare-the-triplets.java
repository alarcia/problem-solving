/*
    If a[i] > b[i], then Alex is awarded 1 point.
    If a[i] < b[i], then Brandon is awarded 1 point.
    If a[i] = b[i], then neither person receives a point.

Comparison points is the total points a person earned.

Given a and b, determine their respective comparison points and return them as a list. 
*/
static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        
        int scoreA = 0;
        int scoreB = 0;
        
        for (int i=0; i<3; i++){
            if (a.get(i)>b.get(i))
                scoreA++;
            if (a.get(i)<b.get(i))
                scoreB++;
        }
        
        List<Integer> res = new ArrayList<Integer>();
        res.add(scoreA);
        res.add(scoreB);
        
        
        return res;
    }
