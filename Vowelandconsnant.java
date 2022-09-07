public class Vowelandconsnant {
    public static void main(String[] args) {
        int vowels = 0, consonant = 0;
        String str = "vijay";
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i) == 'a' )||(str.charAt(i) == 'e')||(str.charAt(i) == 'i')||(str.charAt(i) == 'o')||(str.charAt(i) == 'u' )||(str.charAt(i) == 'A')||(str.charAt(i) == 'E' )||(str.charAt(i) =='I')||(str.charAt(i)== 'O')||(str.charAt(i) == 'U' )){
                vowels++;
            }
            else if ((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')) {
                consonant++;
            }
        }
        System.out.println("Vowel= "+vowels+", Consonant ="+consonant);
    }
}
