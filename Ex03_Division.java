package Session2_Homeworks;

import java.util.Scanner;

public class Ex03_Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap vao 1 so nguyen:");
        int integerNumber = scanner.nextInt();
        if (integerNumber % 3 == 0 && integerNumber % 5 == 0) {
            System.out.println("So da nhap chia het cho 3 va 5");
        } else {
            System.out.println("So da nhap khong chia het cho ca 3 va 5");
        }

    }
}
