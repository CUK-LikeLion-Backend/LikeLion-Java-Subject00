package ex05;
import java.util.Scanner;

public class hw_3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("점수를 입력하세요. ");
        int score = scanner.nextInt();

        if (score >= 90){
            System.out.print("A");
        }
        else if (score >= 80) {
            System.out.print("B");
        }
        else if (score >= 70){
            System.out.print("C");
        }
        else{
            System.out.print("D");
        }

    }
}