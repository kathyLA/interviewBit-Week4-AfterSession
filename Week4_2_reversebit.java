public class Solution {
    public long reverse(long a) {
        if (a == 0) {
            return 0;
        }
        StringBuilder binary = new StringBuilder();
        
        while (a>0) {
            if((a&1)==1){
                binary.append(1);
            } else {
                binary.append(0);
            }
            a>>=1;
        }
        
        while (binary.length() < 32){
            binary.append(0);
        }
        
        return Long.parseLong(binary.toString(),2);
    }
}
