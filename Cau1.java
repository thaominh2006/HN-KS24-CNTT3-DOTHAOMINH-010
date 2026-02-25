import java.util.Scanner;
public class Cau1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi ky tu hon hop bat ky: ");
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");
        int count = 0;
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            boolean hopLe = true;

            for (int j = 0; j < word.length(); j++) {
                char c = word.charAt(j);
                if (!Character.isLetter(c)) {
                    hopLe = false;
                    break;
                }
            }

            if (hopLe && word.length() > 0) {
                count++;
                String formatted = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
                result += formatted + " ";
            }
        }

        // Phần 1
        System.out.println("So tu hop le: " + count);

        // Phần 2
        System.out.println("Chuoi chuan hoa: " + result.trim());
    }
}
