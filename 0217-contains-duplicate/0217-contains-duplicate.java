import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        // C++ std::unordered_set<int> st -> Java HashSet<Integer> set
        HashSet<Integer> set = new HashSet<>();
        
        for (int num : nums) {
            // C++ st.count(num) -> Java set.contains(num)
            if (set.contains(num)) {
                return true;
            }
            // C++ st.insert(num) -> Java set.add(num)
            set.add(num);
        }
        return false;
    }
}
