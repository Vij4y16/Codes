// 1.TRAINING LAB: A training lab has a rectangular size l x w meters, without columns on the inside. The
// hall is divided into two parts- left and right, with a hallway approximately in the middle. In both parts,
// there are rows with desks. In the back of the hall, there is a big entrance door. In the front, there is
// a podium for the lecturer. A single working place takes up 70 x 120 cm (a table with size 70 x 40 cm +
// space for a chair with size 70 x 80 cm). The hallway width is at least 100 cm. It is calculated that due
// to the entrance door (which has 160 cm opening), exactly one working space is lost, and due to
// the podium (which has size of 160 x 120 cm), exactly two working spaces are lost. Write a program
// that reads the size of the training lab as input parameters and calculates the number of working places
// in it (look at the figure).
// Input Data
// Two numbers are read from the console, one per line: l (length in meters) and w (width in meters).
// Constraints: 3 ≤ w ≤ l ≤ 100.
// Output Data
// Print an integer: the number of working places in the training lab.
// Sample input:
// l = 15, w = 8.9
// Output:
// 129

// --------------------------------------- Code Here -------------------------------------------------

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
