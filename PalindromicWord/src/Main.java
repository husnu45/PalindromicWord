import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kelime Giriniz : ");
        String word = scanner.nextLine();

        if (isPalindromic(word)) {
            System.out.println(word + " bir palindromik kelimedir.");
        } else {
            System.out.println(word + " bir palindromik kelime değildir.");
        }

        scanner.close();
    }

    public static boolean isPalindromic(String word) {
        // Girdiyi küçük harfe dönüştürüp  sadece harf ve rakamları alarak diğer karakterleri kaldırma
        word = word.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        int start = 0;
        int end = word.length() - 1;

        // Başlangıç ve son indisleri kullanarak karakterleri karşılaştırın
        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false; // Karakterler eşleşmezse kelime palindromik değildir
            }
            start++;
            end--;
        }
        return true; // Tüm karakterler eşleşiyorsa kelime palindromiktir
    }
}
