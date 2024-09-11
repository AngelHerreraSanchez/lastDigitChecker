public class Main {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 22, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 99, 999));

    }

    private static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if (isValid(num1) && isValid(num2) && isValid(num3)) {
            int count = 0;
            if(num1 % 10 == num2 % 10) {
                count++;
            }
            if(num2 % 10 == num3 % 10) {
                count++;
            }
            if(num3 % 10 == num1 % 10) {
                count++;
            }
            if(count >= 1) {
                return true;
            } else {
                return false;
            }
        }


        return false;
    }

    private static boolean isValid(int num) {
        return num >= 10 && num <= 100;
    }


}
