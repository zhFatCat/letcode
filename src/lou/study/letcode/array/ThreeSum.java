package lou.study.letcode.array;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums.length < 3) {
            return Collections.emptyList();
        }
        Set<List<Integer>> result = new HashSet<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    final int fst = nums[i];
                    final int sec = nums[j];
                    final int third = nums[k];
                    if (fst + sec + third == 0) {
                        List<Integer> tmp = new MyList<Integer>();
                        tmp.add(fst);
                        tmp.add(sec);
                        tmp.add(third);
                        result.add(tmp);
                        break;
                    }
                }
            }
        }
        return new ArrayList<>(result);
    }

    public class MyList<K> extends ArrayList<K> {
        public boolean equals(Object o) {
            return this.containsAll((ArrayList<?>) o) && ((ArrayList<?>) o).containsAll(this);
        }

        public int hashCode() {
            return 3;
        }

        public boolean contains(Object o) {

            return o.equals(this.get(0)) || o.equals(this.get(1)) || o.equals(this.get(2));
        }
    }
}
