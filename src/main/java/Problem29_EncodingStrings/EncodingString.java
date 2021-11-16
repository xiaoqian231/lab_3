package Problem29_EncodingStrings;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

public class EncodingString {
//Problem 29
// Run-length encoding is a fast and simple method of encoding strings. The basic idea is to represent
// repeated successive characters as a single count and character. For example,
// the string "AAAABBBCCDAA" would be encoded as "4A3B2C1D2A".
//Implement run-length encoding and decoding.
// You can assume the string to be encoded have no digits and consists solely of alphabetic characters.
// You can assume the string to be decoded is valid.

    public String RunLengthEncoding(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : input.toCharArray()) {
            if (map.containsKey(c)) {
                Integer value = map.get(c);
                value++;
                map.put(c, value);
            } else {
                map.put(c, 1);
            }
        }
        String output = "";
        for (Character key : map.keySet()) {
            Integer value = map.get(key);
            output = output + key.toString() + value;
        }
       return output ;

    }

    public String RunLengthDecoding(String input) {
        StringBuilder dest = new StringBuilder();
        for (int i = 0; i < input.length() - 1; i = i + 2) {
            char charAt = input.charAt(i);
            int cnt = input.charAt(i + 1) - '0';
            for (int j = 0; j < cnt; j++) {
                dest.append(charAt);
            }
        }
       return dest.toString();


    }
}
