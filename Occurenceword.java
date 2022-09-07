import java.util.Scanner;
public class Occurenceword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please give a String: ");
        String givenstring = sc.nextLine();
        Scanner sc1= new Scanner(System.in);
        System.out.print("Please give a char to count occurence: ");
        char ch= sc1.next().charAt(0);
        System.out.print("Total Number of occurence of '"+ch+"' is: ");
        System.out.println(countOccurence(givenstring, ch));
    }
    private static int countOccurence (String givenstring, char ch){
        int count = 0;
        for (int i = 0; i < givenstring.length() ; i++) {
            if (givenstring.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
