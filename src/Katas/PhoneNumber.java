package Katas;

public class PhoneNumber {

    public static void main(String[] args){
        System.out.println(createPhoneNumber(new int[] {8, 0, 4, 2, 5, 3, 6, 7, 2, 3}));
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        String one = "" + numbers[0] + numbers[1] + numbers[2];
        String two = "" + numbers[3] + numbers[4] + numbers[5];
        String three = "" + numbers[6] + numbers[7] + numbers[8] + numbers[9];

        return String.format("(%s) %s-%s", one, two, three);
    }
}
