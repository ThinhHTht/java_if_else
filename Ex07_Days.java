package Session2_Homeworks;

import java.util.Scanner;

public class Ex07_Days {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Hay nhap nam");
        int year = scanner.nextInt();
        System.out.println("Hay nhap thang");
        int month = scanner.nextInt();
        if(month == 1){
            System.out.println("Thang 1 có 31 ngày ");
        } else if (month == 2 && year % 4 == 0 ) {
            System.out.printf("Thang 2 nam %d có 29 ngày", year);
        } else if (month == 2 && year % 4 != 0) {
            System.out.println("Thang 2 có 28 ngày");
        } else if (month == 3) {
            System.out.println("Thang 3 co 31 ngày ");
        }
        else if (month == 4) {
            System.out.println("Thang 4 co 30 ngày ");
        }else if (month == 5) {
            System.out.println("Thang 5 co 31 ngày ");
        }else if (month == 6) {
            System.out.println("Thang 6 co 30 ngày ");
        }else if (month == 7) {
            System.out.println("Thang 7 co 31 ngày ");
        }else if (month == 8) {
            System.out.println("Thang 8 co 31 ngày ");
        }else if (month == 9) {
            System.out.println("Thang 9 co 30 ngày ");
        }else if (month == 10) {
            System.out.println("Thang 10 co 31 ngày ");
        }else if (month == 11) {
            System.out.println("Thang 11 co 30 ngày ");
        }
        else if (month == 12) {
            System.out.println("Thang 12 co 31 ngày ");
        }
    }
}
