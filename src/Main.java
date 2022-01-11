import java.util.Scanner;

public class Main {
    public static double findMin(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] array;
        int size;
        do {
            System.out.println("Nhap so luong phan tu cua mang:");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("Nhap so luong phan tu nho hon 20");
            }
        } while (size > 20);
        array = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap phan tu thu " + (i + 1));
            array[i] = sc.nextDouble();
        }

        for (int i = 0; i < size; i++) {
            System.out.println("Phan tu thu " + (i + 1) + " la:" + array[i]);
        }

        double min = findMin(array);
        System.out.println("Gia tri nho nhat cua mang:" + min);
    }
}