import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        String str1 = "LISTEN";
        String str2 = "SILENT";
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println(str1 + " and " + str2 + " String Is Anagram");
        }
        else {
            System.out.println(str1 + " and " + str2 + " Not a Anagram");
        }
    }
}
