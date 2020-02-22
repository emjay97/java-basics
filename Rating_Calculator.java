import java.util.Scanner;
public class Rating_Calculator {
    public static void main(String[] args) {
        float part, ven, top, speak, prog, ave;
        Scanner input = new Scanner (System.in);
        String tmp = null;
        
        System.out.println("RATING CALCULATOR\nEnter rate for the following: ");
        System.out.print("Participants: ");
        part = input.nextFloat();
        System.out.print("Venue: ");
        ven = input.nextFloat();
        System.out.print("Topic: ");
        top = input.nextFloat();
        System.out.print("Speakers: ");
        speak = input.nextFloat();
        System.out.print("Program Proper: ");
        prog = input.nextFloat();
        
        ave = (part + ven + top + speak + prog)/5;
        System.out.println("Overall Rating: " + ave);
        
        if (ave >= 70 && ave <=75){
            tmp = ("Needs Improvement");
        } else if (ave >= 75 && ave <=80){
            tmp = ("Good Performance");
        } else if (ave >= 80 && ave <=90){
            tmp = ("Very Good Performance");
        } else if (ave >= 90 && ave <=100){
            tmp = ("Excellent Performance");
        } else if (ave > 100 || ave < 70){
            tmp = ("Out of Range");
        } else {
            tmp = ("Invalid Input");
        }
        System.out.print("\nRemarks: " + tmp + "\n");
    }
}
