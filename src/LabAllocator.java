import java.util.Scanner;

public class LabAllocator {

    public static String labFinder(int capacityOfLab1, int capacityOfLab2, int capacityOfLab3,int Students)
    {
        
        int differenceLab1=Math.abs(capacityOfLab1-Students);
        int differenceLab2=Math.abs(capacityOfLab2-Students);
        int differenceLab3=Math.abs(capacityOfLab3-Students);
        if((differenceLab1 < differenceLab2) && (differenceLab1 < differenceLab3))
        {
            return "L1";
        }
        else if((differenceLab2 < differenceLab1) && (differenceLab2 < differenceLab3))
        {
            return "L2";
        }

        else
        {
            return "L3";
        }

    }

    public static void main(String[] args)
    {
        int capacityOfLab1,capacityOfLab2,capacityOfLab3,noOfStudents;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the no of students that can be accommodated in LAB1");
        capacityOfLab1 = scan.nextInt();
        System.out.println("Enter the no of students that can be accommodated in LAB2");
        capacityOfLab2 = scan.nextInt();
        System.out.println("Enter the no of students that can be accommodated in LAB3");
        capacityOfLab3=scan.nextInt();
        System.out.println("Enter the total no of students ");
        noOfStudents= scan.nextInt();
        System.out.println("The lab required is "+ labFinder(capacityOfLab1,capacityOfLab2,capacityOfLab3,noOfStudents));

    }
}