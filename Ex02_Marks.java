package Session2_Homeworks;

import java.util.Scanner;

public class Ex02_Marks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap diem HTML");
        float htmlMark = Float.parseFloat(scanner.nextLine());
        System.out.println("Hay nhap diem CSS");
        float cssMark = Float.parseFloat(scanner.nextLine());
        System.out.println("Hay nhap diem JavaScript");
        float jsMark = Float.parseFloat(scanner.nextLine());
        float avgMark = (htmlMark + cssMark + jsMark) / 3;
        System.out.printf("Điểm trung bình là: %f\n", avgMark);
        if (avgMark < 5) {
            System.out.println("Xếp loại yếu");
        } else if (avgMark <7) {
            System.out.println("Xếp loại trung bình");
        } else if (avgMark < 8) {
            System.out.println("Xếp loại khá");
        } else if (avgMark < 9 ) {
            System.out.println("Xếp loại giỏi");

        } else {
            System.out.println("Xếp loại xuất sắc");
        }


    }
}
