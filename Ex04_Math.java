package Session2_Homeworks;

import java.util.Scanner;

public class Ex04_Math {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap so dau tien");
        int firstNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap so thu hai");
        int secondNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Hay nhap vao phep tính");
//        char action = scanner.nextLine().charAt(0);
        String action = scanner.nextLine();
//        float result;
        switch (action){
            case "+" :
                System.out.printf("Ket qua la: %d", firstNumber + secondNumber);
                break;
            case "-":
                System.out.printf("Ket qua la: %d", firstNumber - secondNumber);
                break;
            case "*":
                System.out.printf("Ket qua la: %d", firstNumber * secondNumber);

                break;
            case "/":
                System.out.printf("Ket qua la: %f", (float)firstNumber / secondNumber);
                break;
            default:
                System.out.println("Nhập phép tính sai");
        }
    }
}
