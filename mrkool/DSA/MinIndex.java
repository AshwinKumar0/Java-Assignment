package mrkool;

import java.util.HashMap;
import java.util.Map;

public class MinIndex {
    public static void main(String[] args) {
        // Initialize strings str1 and str2
        String str1 = "codebyte";
        String str2 = "abc";
        Map<Character, Integer> my_map = new HashMap<>();

        // Store the first index of every character in str1 in my_map
        for (int i = 0; i < str1.length(); i++) {
            if (!my_map.containsKey(str1.charAt(i))) {
                my_map.put(str1.charAt(i), i);
            }
        }

        // Initialize variable minindex
        int minindex = Integer.MAX_VALUE;
        char minchar = ' ';
        boolean flag = false;
        // Traverse the string "abc" and check for every character if it is present in the hash table
        for (int i = 0; i < str2.length(); i++) {
            char c = str2.charAt(i);
            if (my_map.containsKey(c)) {
                flag = true;
                if (minindex > my_map.get(c)) {
                    minindex = my_map.get(c);
                    minchar = c;
                }
            }
        }
        if (flag) {
            System.out.println(minchar);
        } else {
            System.out.println("No character");
        }
    }
}

