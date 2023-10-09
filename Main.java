import calculator.Brand;
import calculator.Calculator;
import calculator.Cpu;
import calculator.Gpu;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int[] array = new int[] {2, 3, 5};
//        array[1] = 4;
//        for(int i=0; i<array.length; i++){
//            System.out.print(array[i]+" ");
//        }
//        int[][] arraybi = new int[2][2];
//        arraybi[0][0] = 2;
//        arraybi[0][1] = 3;
//        arraybi[1][0] = 5;
//        arraybi [1][1] = 6;
//        Scanner s = new Scanner(System.in);
//        int[][] arrayEmpty = new int[2][2];
//        for(int i=0; i<arrayEmpty.length; i++){
//            for(int j = 0; j<arrayEmpty[i].length; j++){
//                arrayEmpty[i][j] = s.nextInt();
//            }
//        }
//        System.out.println(Arrays.deepToString(arrayEmpty));

        Cpu cpu = new Cpu(Brand.ASUS, "ASUS Procesor");
        Gpu gpu = new Gpu(Brand.ASUS, "LENOVO GPU");
        Calculator calculator = new Calculator(cpu, gpu);
        Gpu gpu1 = new Gpu(Brand.LENOVO, "LENOVO GPU");
        calculator.setGpu(gpu1);
        System.out.println(calculator.getGpu().getBrand());

    }
}