import java.util.ArrayList;
import java.util.Scanner;

public class Cau2_3 {

    public static void main(String[] args) {
        int m = inputNumber("Nhập số hàng: ");
        int n = inputNumber("Nhập số cột: ");
        int[][] matrix = enterMatrix(m, n);
        displayMatrix(matrix, m, n);
        multipleFirstLine(matrix);
        maxOneDimensionalArray(matrix, m, n);
    }

    private static int inputNumber(String question) {
        Scanner sc = new Scanner(System.in);
        System.out.println(question);
        int n = sc.nextInt();
        return n;
    }

    private static int[][] enterMatrix(int m, int n) {
        int[][] matrix = new int[m][n];
        System.out.println("Nhập vào giá trị cho ma trận: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = inputNumber("Matrix[" + i + "][" + j + "]=");
            }
        }
        return matrix;
    }

    private static void displayMatrix(int[][] matrix, int m, int n) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    private static int multipleFirstLine(int[][] matrix) {
        int tich = 1;
        for (int i = 0; i < matrix[0].length; i++) {
            if (matrix[0][i] % 3 == 0) {
                tich = tich * matrix[0][i];
            }
        }
        System.out.println("Tích: " + tich);
        return tich;
    }

    private static ArrayList<Integer> maxOneDimensionalArray(int[][] matrix, int m, int n) {
        ArrayList<Integer> max = new ArrayList<Integer>();
        for (int i = 0; i < m; i++) {
            int soLon = matrix[i][0]; //gắn giá trị lớn nhất của mảng ở đầu dòng
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] > soLon) {
                    soLon = matrix[i][j];
                }
            }
            max.add(soLon);
        }
        System.out.println("Mảng một chiều X với các giá trị lớn nhất có trong mảng: " + max);
        return max;
    }
}

