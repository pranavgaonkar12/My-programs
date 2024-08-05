package Infosys_Frequency_counter;
import java.util.*;

public class frequency {

    public static void main(String[] args) {
        System.out.println(getUniqueLetter("statistics"));
    }

    public static int getUniqueLetter(String s) {
        HashMap<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            h.put(s.charAt(i), h.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            if (h.get(s.charAt(i)) == 1) {
                return i + 1; // Return the 1-based index
            }
        }

        return -1; // Return -1 if no unique character is found
    }
}
