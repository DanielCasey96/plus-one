import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Main main = new Main();
        main.plusOne(new int[]{5,9,9});
    }

    public int[] plusOne(int[] digits) {

        int x = 1;

        if(digits[digits.length - 1] != 9) {
            digits[digits.length - 1] = digits[digits.length - 1] + 1;
            return digits;
        } else while(digits[digits.length - x] == 9) {
            digits[digits.length - x] = 0;
            if (x == digits.length) {
                break;
            }
            x++;
        }
        if (digits[digits.length - x] == 0) {
            int[] digitsExtra = new int[digits.length + 1];
            digitsExtra[0] = 1;
            return digitsExtra;
        } else {
            digits[digits.length - x] = digits[digits.length - x] + 1;
            return digits;
        }
    }

    //take the number and add one to the last digit
    //if that last digit is 9 it becomes 0
    //if the previous to that 9 was also a 9 apply the same thing
    //till we reach the first digit, if that wasnt a 9 add 1
}
