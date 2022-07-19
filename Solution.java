import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ps = new ArrayList<List<Integer>>();
        
        for(int i = 0; i < numRows; i++) {
            List<Integer> single_floor = new ArrayList<Integer>();
            
            if(i == 0) // top floor
            {
                single_floor.add(1);
                ps.add(single_floor);
            }
            else //other lower floors
            {
                single_floor.add(1); //first & last is always 1
                for(int j = 0; j < i - 1; j++) {
                    int left_tail = ps.get(i - 1).get(j);
                    int right_tail = ps.get(i - 1).get(j + 1);
                    single_floor.add(left_tail + right_tail);
                }
                single_floor.add(1); //first & last is always 1
                ps.add(single_floor);
            }
            
            
        }
        return ps;
        
    }
}