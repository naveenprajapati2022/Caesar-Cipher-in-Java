
import java.util.*;

public class Main {
    public static final String word = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String msg, int key) {
        msg = msg.toLowerCase();
        String Text = "";
        for (int i = 0; i < msg.length(); i++) {
            int CP = word.indexOf(msg.charAt(i));
            int k = (key + CP) % 26;
            char replaceVal = word.charAt(k);
            Text += replaceVal;
        }
        return Text;
    }

    public static final String word1 = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt(String Text, int Key) {
        Text = Text.toLowerCase();
        String message = "";
        for (int ii = 0; ii < Text.length(); ii++) {
            int CP = word1.indexOf(Text.charAt(ii));
            int k = (CP - Key) % 26;
            if (k < 0) {
                k = word1.length() + k;
            }
            char replaceVal = word1.charAt(k);
            message += replaceVal;
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String msg = new String();
        int key = 0;
        System.out.print("Please Enter the String:");
        msg = sc.next();

        System.out.println("Please Enter Shift Key:");

        key = sc.nextInt();
        System.out.println("What do you want \nEnter 1 for Encryption \nEnter 2 for Decryption");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out
                        .println("Your Message Is Successfully Encrypted... \nEncrypted msg is :" + encrypt(msg, key));
                break;
            case 2:
                System.out
                        .println("Your Message Is Successfully Decrypted... \nDecrypted msg is :" + decrypt(msg, key));
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
    }
}