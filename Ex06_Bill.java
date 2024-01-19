package Session2_Homeworks;

import java.util.Scanner;

public class Ex06_Bill {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Hay nhap so dien dau thang");
        float firstIndex = scanner.nextFloat();
        System.out.println("Hay nhap so dien cuoi thang");
        float secondIndex = scanner.nextFloat();
        float consumeVolume = secondIndex - firstIndex;
        if(consumeVolume < 50) {
            System.out.printf("Tien dien là: %f", consumeVolume * 10000);
        } else if (consumeVolume <100) {
            System.out.printf("Tien dien la: %f", consumeVolume*15000);
        } else if (consumeVolume < 150) {
            System.out.printf("Tien dien la: %f", consumeVolume*20000);
        } else if (consumeVolume < 200) {
            System.out.printf("Tien dien la: %f", consumeVolume*25000);
        } else {
            System.out.printf("Tien dien la: %f", consumeVolume*30000);
        }
    }
}
