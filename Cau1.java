import java.util.*;
public class Cau1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap mot chuoi ky tu hon hop bat ky: ");
        String input = sc.nextLine();

        String[] words = input.trim().split("\\s+");
        List<String> valiWord = new ArrayList<>();
        for(String word : words){
            if(word.matches("[a-zA-Z]+")){
                valiWord.add(word);
            }
        }
        // Phan 1
        System.out.println("So tu hop le la: " + valiWord.size());
        // Phan 2
        StringBuilder normalize = new StringBuilder();
        for(String word : valiWord){
            String formatted = word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase();
            normalize.append(formatted).append(" ");
        }
        System.out.println("Van ban da duoc chuan hoa: " + normalize.toString().trim());
    }
}
