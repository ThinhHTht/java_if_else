package Session2_Homeworks;

import java.util.Scanner;

public class Ex09_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Hay nhap so thu nhat");
        int firstNumber = scanner.nextInt();
        System.out.println("Hay nhap so thu hai");
        int secondNumber = scanner.nextInt();
        System.out.println("Hay nhap so thu ba");
        int thirdNumber = scanner.nextInt();
        System.out.println("Hay nhap so thu tu");
        int fourthNumber = scanner.nextInt();
        int temporary;
        if(firstNumber > secondNumber) {
            temporary = firstNumber;
            firstNumber = secondNumber;
            secondNumber = temporary;

        }
        if(firstNumber > thirdNumber) {
            temporary = firstNumber;
            firstNumber = thirdNumber;
            thirdNumber = temporary;
        }
        if (firstNumber > fourthNumber)
        {
            temporary = firstNumber;
            firstNumber = fourthNumber;
            fourthNumber = temporary;
        }
        if(secondNumber > thirdNumber) {
            temporary = secondNumber;
            secondNumber = thirdNumber;
            thirdNumber = temporary;

        }
        if (secondNumber > fourthNumber) {
            temporary = secondNumber;
            secondNumber = fourthNumber;
            fourthNumber = temporary;
        }
        if (thirdNumber > fourthNumber) {
            temporary = thirdNumber;
            thirdNumber = fourthNumber;
            fourthNumber = temporary;
        }
        System.out.printf("Thu tu tang dan: %d - %d - %d - %d" ,firstNumber,secondNumber, thirdNumber, fourthNumber);
    }
}

