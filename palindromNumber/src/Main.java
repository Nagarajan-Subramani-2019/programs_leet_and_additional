//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        int a = 101;
        String aa = Integer.toString(a);
        char[] a_char_arr = aa.toCharArray();
        boolean isPalindrome = true;

        for (int i = 0; i < a_char_arr.length; i++) {
            if (a_char_arr[i] == a_char_arr[a_char_arr.length - (1 + i)])
                continue;
            isPalindrome = false;
            break;
        }
        System.out.println();
        System.out.println(isPalindrome);

        System.out.println(aa.charAt(0));

        for (int i = 0; i < aa.length(); i++) {
            if (aa.charAt(i) == aa.charAt(a_char_arr.length - (1 + i)))
                continue;
            isPalindrome = false;
            break;
        }

        System.out.println();
        System.out.println(isPalindrome);
    }
}