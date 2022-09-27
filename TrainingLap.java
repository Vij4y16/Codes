import java.util.Scanner;
public class TrainingLap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Length in meter: ");
        double l= sc.nextDouble() * 100;
        System.out.print("Enter the Width in meter: ");
        double w=sc.nextDouble() * 100;


        int length = (int)l ;
        int width = (int)w ;

            int row = length/120;
            int cols = (width-100)/70;

        System.out.println(row * cols -3);
    }
}
