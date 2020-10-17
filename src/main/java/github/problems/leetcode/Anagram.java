package github.problems.leetcode;

import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String s, String t) {

        if (s.length() != t.length())
            return false;

        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();

        Arrays.sort(tArray);
        Arrays.sort(sArray);

        for (int i = 0; i < sArray.length; i++) {
            if (sArray[i] != tArray[i])
                return false;
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(new Anagram().isAnagram("anagram", "nagaram"));
    }
}
