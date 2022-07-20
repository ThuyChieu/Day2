import java.util.*;

public class Cau1 {
    private static ArrayList<Integer> num = new ArrayList<>();

    public static void main(String[] args) {
        nhapArr();
        xuat(num);
        lonNhi(num);
    }

    private static int nhapSoBatKy(String question) {
        int k;
        System.out.println(question);
        Scanner sc = new Scanner(System.in);
        k = sc.nextInt();
        return k;
    }

    private static ArrayList<Integer> nhapArr() {
        int n = nhapSoBatKy("Nhập số phần tử của mảng:");
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            // nhập từng phần tử vào Array
            int item = nhapSoBatKy("Nhập phần tử thứ Arr[" + i + "]=");
            result.add(item);
        }
        return result;
    }

    private static void xuat(ArrayList<Integer> num) {
        System.out.println("Các phần tử của mảng gồm" + num);
    }

    private static int demSoLe(ArrayList<Integer> num) {
        int result = 0;
        for (Integer item : num) {
            if (item % 2 == 1)
                ++result;
        }
        System.out.println("Số lượng các phần tử lẻ: " + result);
        return result;
    }

    private static int tong(ArrayList<Integer> num) {
        int result = 0;
        for (Integer item : num) {
            if ((item % 2 == 1) && (item > 0))
                result += item;
        }
        System.out.println("Tổng số dương lẻ: " + result);
        return result;
    }

    private static void timViTriK(ArrayList<Integer> num) {
        int k = nhapSoBatKy("Nhập vào phần tử k=");
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < num.size(); i++) {
            if (num.get(i) == k)
                result.add(i);
        }

        if (result.size() == 0)
            System.out.println("Không có");
        else
            System.out.println("Các vị trí của số " + k + " trong ArrayList là: " + result);
    }

    private static ArrayList<Integer> tangDan(ArrayList<Integer> num) {
        ArrayList<Integer> num1 = (ArrayList<Integer>) num.clone(); //biến cục bộ ko ảnh hưởng nên có thể đặt cùng tên ở những method khác
        Collections.sort(num1);
        System.out.println("Mảng đã được sắp xếp theo thứ tự tăng dần: " + num1);
        return num1;
    }

    private static ArrayList<Integer> daoThuTu(ArrayList<Integer> num) {
        ArrayList<Integer> num2 = (ArrayList<Integer>) num.clone();
        Collections.reverse(num2);
        System.out.println("Phần tử đảo của A:" + num2);
        return num2;
    }

    private static ArrayList<Integer> xoaPhanTu(ArrayList<Integer> num) {
        int k = nhapSoBatKy("Nhập vào phần tử cần xóa:");
        ArrayList<Integer> num1 = (ArrayList<Integer>) num.clone();
        num1.removeIf(item -> item == k);
        System.out.println("Dãy số sau khi xóa phần tử k" + num1);
        return num1;
    }

    private static ArrayList<Integer> chenPhanTu(ArrayList<Integer> num) {
        ArrayList<Integer> num1 = (ArrayList<Integer>) num.clone();
        int viTriK = nhapSoBatKy("Nhập vào vị trí cần chèn phần tử:");
        int phanTuChen =nhapSoBatKy("Nhập vào phần tử muốn chèn:");

        while (!(viTriK < num1.size() - 1 && viTriK >= 0)) {
            viTriK = nhapSoBatKy("Nhập lại k:");
        }

        num1.add(viTriK, phanTuChen);
        num1.remove(num1.size() - 1);

        System.out.println("Dãy số sau khi chèn phần tử vào vị trí " + num);
        return num1;
    }

    private static ArrayList<Integer> lonNhat(ArrayList<Integer> num) {
        ArrayList<Integer> maxNum = (ArrayList<Integer>) num.clone();
        Collections.max(maxNum);
        System.out.println("Giá trị lớn nhất " + (maxNum));
        return maxNum;
    }

    public static ArrayList<Integer> nhoNhat(ArrayList<Integer> num){
        ArrayList<Integer> minNum = (ArrayList<Integer>) num.clone();
        Collections.min(minNum);
        System.out.println("Giá trị nhỏ nhất " + (minNum));
        return minNum;
    }

    private static void lonNhi(ArrayList<Integer> num) {
        ArrayList<Integer> num1 = (ArrayList<Integer>) num.clone();
        Collections.sort(num1);
        HashSet<Integer> set = new HashSet<Integer>(num1);
        ArrayList<Integer> sortedArr = new ArrayList<Integer>();
        if (sortedArr.size()<2)
        {
            System.out.println("Không tồn tại phần tử lớn nhì");
            return;
        }
        sortedArr.addAll(set);
        System.out.println("Giá trị lớn nhì" + sortedArr.get(1)); //thêm trường hợp là mảng chỉ có 1 phần tử
    }
}