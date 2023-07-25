import com.workintech.Day2Class;

public class Main {
    public static void main(String[] args) {
        Day2Class intNum1 = new Day2Class(123);
        Day2Class intNum2 = new Day2Class(121);
        Day2Class intNum3 = new Day2Class(6);
        Day2Class intNum4 = new Day2Class(-121);
        System.out.println("Palindrome Test");
        System.out.println(intNum1.isPalindrome());
        System.out.println(intNum2.isPalindrome());
        System.out.println(intNum3.isPalindrome());
        System.out.println(intNum4.isPalindrome());
        System.out.println("Perfect Number Test");
        System.out.println(intNum1.isPerfectNumber());
        System.out.println(intNum2.isPerfectNumber());
        System.out.println(intNum3.isPerfectNumber());
        System.out.println(intNum4.isPerfectNumber());
        System.out.println("Number To Words Test");
        System.out.println(intNum1.numberToWords());
        System.out.println(intNum2.numberToWords());
        System.out.println(intNum3.numberToWords());
        System.out.println(intNum4.numberToWords());

    }
}