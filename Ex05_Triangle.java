package Session2_Homeworks;

import java.util.Scanner;

public class Ex05_Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hay nhap do dai canh dau tien");
        float firstLine = scanner.nextFloat();
        System.out.println("Hay nhap do dai canh thu hai");
        float secondLine = scanner.nextFloat();
        System.out.println("Hay nhap do dai canh thu ba");
        float thirdLine = scanner.nextFloat();
        if((firstLine + secondLine > thirdLine) && (secondLine + thirdLine > firstLine) && (firstLine + thirdLine > secondLine)) {
            if(firstLine == secondLine  && secondLine == thirdLine) {
                System.out.println("Day la mot tam giac deu");
            } else if ((firstLine*firstLine +secondLine*secondLine == thirdLine*thirdLine) || (secondLine*secondLine + thirdLine*thirdLine == firstLine*firstLine) || (thirdLine*thirdLine + firstLine*firstLine == secondLine*secondLine) ) {
                System.out.println("Day la mot tam giac vuong");
            } else if (((firstLine*firstLine +secondLine*secondLine == thirdLine*thirdLine) || (secondLine*secondLine + thirdLine*thirdLine == firstLine*firstLine) || (thirdLine*thirdLine + firstLine*firstLine == secondLine*secondLine) ) && (firstLine == secondLine || secondLine == thirdLine || firstLine == thirdLine)) {
                System.out.println("Day la tam giac vuong can");
            } else if ((firstLine == secondLine) || (secondLine == thirdLine) || (thirdLine == firstLine)) {
                System.out.println("Day la tam giac can");
            } else {
                System.out.println("Day la tam giac thuong");

            }

            }else {
            System.out.println("Day khong phai cac canh cua mot tam giac");
        }
    }
}
