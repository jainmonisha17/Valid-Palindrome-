
// Name: Monisha Jain G.N
// Higher Qualification: MCA (Master of Computer Applications)
// College: PES Banglore
// github: https://github.com/jainmonisha17?tab=repositories

import java.util.*;

class Solution {

    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length() - 1;

        while(first < last) { // continue until the two pointers cross over
            while(first < last && !Character.isLetterOrDigit(s.charAt(first))) {
                first++; // move i forward until a letter or digit is found
            }
            while(first < last && !Character.isLetterOrDigit(s.charAt(last))) {
                last--; // move j backward until a letter or digit is found
            }

            String sentence = s.toLowerCase();
            // compare the characters at i and j after converting them to lowercase


            if(sentence.charAt(first) != sentence.charAt(last)) {
                return false;
            } 

            first++;
            last--;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Test case 1: "A man, a plan, a canal, Panama!"
        // Expected output: true

        System.out.println(obj.isPalindrome("A man, a plan, a canal, Panama!"));
        
        // Test case 2: "race a car"
        // Expected output: false
        System.out.println(obj.isPalindrome("race a car"));
    
        // Test case 3: "Was it a car or a cat I saw?"
        // Expected output: true
        System.out.println(obj.isPalindrome("Was it a car or a cat I saw?"));
    
        // Test case 4: "Madam, in Eden, I'm Adam."
        // Expected output: true
        System.out.println(obj.isPalindrome("Madam, in Eden, I'm Adam."));
    
        // Test case 5: "empty string"
        // Expected output: true
        System.out.println(obj.isPalindrome(""));
  } 
}

// TC -> O(N), N is the no of characters in the sentence, coz it iterates over each character once.

// SC -> O(1), our algo uses constant space to store few variables, not using any extra space to return the result
// size of these variables does not grow with the input size.

// valid palindrome contains numbers/ digits/ letters ..