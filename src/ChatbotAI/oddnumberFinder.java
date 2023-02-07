package ChatbotAI;

import java.util.ArrayList;
import java.util.List;

public class oddnumberFinder {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // group of numbers

        List<Integer> oddNumbers = new ArrayList<>(); // list to store odd numbers

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) { // check if number is odd
                oddNumbers.add(numbers[i]);
            }
        }

        System.out.println("Odd numbers in the group: " + oddNumbers);
    }
}
