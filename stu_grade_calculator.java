import java.util.Scanner;
public class stu_grade_calculator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of Number of Subject: ");
        int n = scanner.nextInt();

        int[] Number = new int[n];

        for(int i = 0; i < n; i++) {
            System.out.print("Enter the Number of First Subject: " + (i + 1) + ": ");
            Number[i] = scanner.nextInt();

        }
        scanner.close();
        int total = 0;
        for(int i = 0; i < n; i++) {
            total += Number[i];
        }
      System.out.println("Totoal Marks Of Student is  :"+total);
        double average = (double) total / n;

        System.out.println("Average Percantage of Student  is: " + average);
        double grade= average/9.5;
        System.out.println("Grade of the Student is :"+grade);

    }
}



