/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CipherSchemes_Abellana;

/**
 *
 * @author avigracx
 */

import java.util.Scanner;

public class Programming_Practice2_CipherSchemes_Abellana {
    // Caesar Cipher Encryption
    public static void caesarCipherEncryption() {
        Scanner in = new Scanner(System.in);

        System.out.println("CAESAR CIPHER ENCRYPTION:");
        System.out.print("Input Message: ");
        String input = in.nextLine().toUpperCase();

        System.out.print("Enter Key: ");
        int key = in.nextInt();
        in.nextLine(); // Consume the newline character

        String encryptedMessage = encryptCaesarCipher(input, key);

        System.out.println("Encrypted Message: " + encryptedMessage);
    }

    // Caesar Cipher Decryption
    public static void caesarCipherDecryption() {
        Scanner in = new Scanner(System.in);

        System.out.println("CAESAR CIPHER DECRYPTION:");
        System.out.print("Enter the Encrypted Message: ");
        String encryptedMessage = in.nextLine().toUpperCase();

        System.out.print("Enter the Key: ");
        int key = in.nextInt();
        in.nextLine(); // Consume the newline character

        String decryptedMessage = decryptCaesarCipher(encryptedMessage, key);

        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    // Vigenere Cipher Encryption
    public static void vigenereCipherEncryption() {
        Scanner in = new Scanner(System.in);

        System.out.println("VIGENERE CIPHER ENCRYPTION:");
        System.out.print("Input Message: ");
        String input = in.nextLine().toUpperCase();

        System.out.print("Input Keyword: ");
        String keyword = in.nextLine().toUpperCase();

        String encryptedMessage = encryptVigenereCipher(input, keyword);

        System.out.println("Encrypted Message: " + encryptedMessage);
    }

    // Vigenere Cipher Decryption
    public static void vigenereCipherDecryption() {
        Scanner in = new Scanner(System.in);

        System.out.println("VIGENERE CIPHER DECRYPTION:");
        System.out.print("Enter the Encrypted Message: ");
        String encryptedMessage = in.nextLine().toUpperCase();

        System.out.print("Enter the Keyword: ");
        String keyword = in.nextLine().toUpperCase();

        String decryptedMessage = decryptVigenereCipher(encryptedMessage, keyword);

        System.out.println("Decrypted Message: " + decryptedMessage);
    }

    // Caesar Cipher Encryption
    public static String encryptCaesarCipher(String input, int key) {
        StringBuilder sb = new StringBuilder();

        for (char a : input.toCharArray()) {
            if (Character.isLetter(a)) {
                char base = Character.isLowerCase(a) ? 'a' : 'A';
                char encryptedChar = (char) (((a - base + key) % 26) + base);
                sb.append(encryptedChar);
            } else {
                sb.append(a);
            }
        }

        return sb.toString();
    }

    // Caesar Cipher Decryption
    public static String decryptCaesarCipher(String input, int key) {
        StringBuilder sb = new StringBuilder();

        for (char a : input.toCharArray()) {
            if (Character.isLetter(a)) {
                char base = Character.isLowerCase(a) ? 'a' : 'A';
                int decryptedChar = (((a - base - key + 26) % 26) + base);
                sb.append((char) decryptedChar);
            } else {
                sb.append(a);
            }
        }

        return sb.toString();
    }

    // Vigenere Cipher Encryption
    public static String encryptVigenereCipher(String input, String keyword) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            char keywordChar = keyword.charAt(i % keyword.length());

            if (Character.isLetter(a)) {
                char base = Character.isLowerCase(a) ? 'a' : 'A';
                int shift = keywordChar - base;
                char encryptedChar = (char) (((a - base + shift) % 25) + base);
                sb.append(encryptedChar);
            } else {
                sb.append(a);
            }
        }

        return sb.toString();
    }

    // Vigenere Cipher Decryption
    public static String decryptVigenereCipher(String input, String keyword) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);
            char keywordChar = keyword.charAt(i % keyword.length());

            if (Character.isLetter(a)) {
                char base = Character.isLowerCase(a) ? 'a' : 'A';
                int shift = keywordChar - base;
                char decryptedChar = (char) (((a - base - shift + 25) % 25) + base);
                sb.append(decryptedChar);
            } else {
                sb.append(a);
            }
        }

        return sb.toString();
    }
    
       public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        char repeat;
//        
//        do{
//        System.out.println("Choose an action:");
//        System.out.println("1. Encrypt a message (Caesar Cipher)");
//        System.out.println("2. Decrypt a message (Caesar Cipher)");
//        System.out.println("3. Encrypt a message (Vigenere Cipher)");
//        System.out.println("4. Decrypt a message (Vigenere Cipher)");
//        System.out.print("Enter your choice (1, 2, 3, or 4): ");
//        int choice = in.nextInt();
//        System.out.println();
//
//        switch (choice) {
//            case 1:
//                caesarCipherEncryption();
//                break;
//            case 2:
//                caesarCipherDecryption();
//                break;
//            case 3:
//                vigenereCipherEncryption();
//                break;
//            case 4:
//                vigenereCipherDecryption();
//                break;
//            default:
//                System.out.println("Invalid choice. Please enter 1, 2, 3, or 4.");
//        }
//        
//        System.out.println("Do you want to encrypt or decrypt a message again? [Y/N]");
//        repeat = in.next().charAt(0);
//        System.out.println();
//        
//    }while(repeat == 'y' || repeat =='Y');
//        
   }       
}
       

    
  