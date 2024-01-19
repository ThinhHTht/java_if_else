package Session2_Homeworks;

import java.util.Scanner;

public class Ex10_Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap luong co ban:");
        float salary = scanner.nextFloat();
        System.out.println("Nhap so ngay cong thuc te");
        float workingDay = scanner.nextFloat();
        float monthlySalary ;
        monthlySalary = salary*26 + (workingDay - 26)*1.5F*salary;
        System.out.println("Lương của nhân viên trong tháng la:" + monthlySalary);
    }
}
