import java.util.*;

public class Main {
    String input = "calte&%$ietlacin";

    int toggle(int bitVector, int index) {
        if(index < 0) {
            return bitVector;
        }

        //Creates a 1 and puts it (by shifting) to the position index.
        int mask = 1 << index;
        //If at the position of index there was a 0, it puts a 1; if there was a 1, it puts a 0. Basically it does an XOR.
        bitVector ^= mask;
        return bitVector;
    }

    int createBitVector(String sentence) {
        int bitVector = 0;
        for (char c : sentence.toCharArray()) {
            int x = Character.getNumericValue(c);
            bitVector = toggle(bitVector, x);
        }
        return bitVector;
    }

    boolean checkAtMostOneBitSet(int bitVector) {
        //Doing the following operation only returns 0 if there only was one bit set at the bitVector. Check it out on paper!!
        return (bitVector & (bitVector - 1)) == 0;
    }

    boolean isPermutationOfPalindrome(String sentence) {
        int bitVector = createBitVector(sentence);
        return checkAtMostOneBitSet(bitVector);
    }

    public static void main(String[] args) {
        Main program = new Main();
        boolean result =  program.isPermutationOfPalindrome(program.input);
        System.out.println(result);
    }

}
