import java.util.Scanner;

public class EncryptWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word which will be encrypted: ");
        String word = sc.nextLine();
        String encryptedWord = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                ch = (char) (ch + 5);
                if (ch > 'z') {
                    ch = (char) (ch - 26);
                }
            } else if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 5);
                if (ch > 'Z') {
                    ch = (char) (ch - 26);
                }
            }
            encryptedWord += ch;
        }
        
        System.out.println("Encrypted word is: " + encryptedWord);
    }
}
