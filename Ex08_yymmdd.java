package Session2_Homeworks;

import java.util.Scanner;

public class Ex08_yymmdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap ngay");
        int day = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap thang");
        int month = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap nam");
        int year = Integer.parseInt(scanner.nextLine());
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12){
            if (day == 31) {
                System.out.println("Ngay thang nam da nhap la hop le");
            } else {
                System.out.println("Ngay thang nam da nhap khong hop le");
            }

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day == 30) {
                System.out.println("Ngay thang nam da nhap la hop le");
            } else {
                System.out.println("Ngay thang nam da nhap la khong hop le");
            }
        } else if (month == 2){
            if ((year % 4 == 0 && day == 29) || (year % 4 != 0 && day == 28 )){
                System.out.println("Ngay thang nam da nhap la hop le");
            } else {
                System.out.println("Ngay thang nam da nhap la khong hop le");
            }
        }
    }
}
