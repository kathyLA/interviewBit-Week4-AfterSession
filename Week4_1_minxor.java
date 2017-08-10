public class Solution {
    public class Solution {
        public int findMinXor(ArrayList<Integer> A) {
            Collections.sort(A);
            int min = Integer.MAX_VALUE;
            
            for (int i = 0; i< A.size()-1; i++) {
                int sum =  (A.get(i))^(A.get(i+1));
                if (sum < min) {
                    min = sum;
                }
            }
            
            return min;
        }
    }
}
