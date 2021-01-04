package principal;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Operations {

    private int mindigits;
    protected int numsquantity;
    private int maxdigits;

    public Operations(int mindigits, int numsquantity, int maxdigits) {
        this.mindigits = mindigits;
        this.numsquantity = numsquantity;
        this.maxdigits = maxdigits;
    }

    public int getMindigits() {
        return mindigits;
    }

    public void setMindigits(int mindigits) {
        this.mindigits = mindigits;
    }

    public int getNumsquantity() {
        return numsquantity;
    }

    public void setNumsquantity(int numsquantity) {
        this.numsquantity = numsquantity;
    }

    public int getMaxdigits() {
        return maxdigits;
    }

    public void setMaxdigits(int maxdigits) {
        this.maxdigits = maxdigits;
    }

    public int[] CreateNumbersInt() { //Crea un arreglo de numeros + o - y enteros
        int nums[] = new int[numsquantity];
        int min = (int) (Math.pow(10, mindigits - 2));
        int max = (int) (Math.pow(10, maxdigits - 1));
        Random rand = new Random();
        for (int i = 0; i < numsquantity; i++) {
            int sign = (int) (rand.nextInt(2));
            nums[i] = 1 + (int) ((Math.random() * (max - min + 1) + min) * Math.pow(-1, sign));
        }
        return nums;
    }

    public double[] CreateNumbersDouble(int decimals) { //Crea un arreglo de numeros + o - y dobles
        double nums[] = new double[numsquantity];
        int min = (int) (Math.pow(10, mindigits - 2));
        int max = (int) (Math.pow(10, maxdigits - 1));
        Random rand = new Random();
        double dec = Math.pow(10, decimals);
        double unknownNumber;
        for (int i = 0; i < numsquantity; i++) {
            int sign = rand.nextInt(2);
            unknownNumber = (Math.random() * (max - min + 1) + min) + 1;
            nums[i] = Math.round(unknownNumber * dec) / dec;
        }
        return nums;
    }

    public int SumOfNumbers(int[] arrnumbers) { // Suma todos los numeros del arreglo
        return IntStream.of(arrnumbers).sum();
    }

    public int ProductOfNumbers(int[] numarr) { // Producto de todos los numeros del arreglo
        int product = 1;
        for (int n : numarr) {
            product *= n;
        }
        return product;
    }

    public void PrintNumbers(int[] numarr) {//Imprime los numeros en un arreglo para Int
        System.out.println(Arrays.toString(numarr));
    }

    public void PrintNumbers(double[] numarr) {//Imprime los numeros en un arreglo para Int
        System.out.println(Arrays.toString(numarr));
    }
}
