import java.util.HashSet;
public class longest_Substring {
    /* Given a string s, find the length of the longest substring without repeating characters */

    public int longestSubstring(String s){
        HashSet<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE, slow = 0, fast = 0; // Create a max to keep track of max; slow and fast pointer
        while(fast < s.length()){ 
            if(!set.contains(s.charAt(fast))){   //if the set doesn't contain the char at fast then its a non-repeating substring 
                
                set.add(s.charAt(fast++)); //therefore add it to the set and increment the fast pointer
                max = Math.max(max,set.size()); //check the max between current set size and last max
            }
            else{
                set.remove(s.charAt(slow++)); //if the set contains the char then we must increment the slow pointer and remove elements in the set until the substring is non-repeating
            }
        }
        return max;

    }

    
}
