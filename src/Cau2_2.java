import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.Scanner;

public class Cau2_2 {

    public static void main(String[] args) throws ParseException {
        Date date1 = inputDay("Nhập ngày thứ nhất: ");
        Date date2 = inputDay("Nhập ngày thứ hai: ");
        long ngayLech = calculateDifferenceDay(date1, date2);
        System.out.println("Số ngày lệch: " + ngayLech);
    }

    private static Date inputDay(String question) {
        Scanner sc = new Scanner(System.in);
        Date date = null;
        boolean isCorrected = false;

        while (!isCorrected) {
            try {
                System.out.println(question);
                String dayStr = sc.nextLine();
                date = convertDateFormat(dayStr);
                System.out.println(date);
                isCorrected = true;
            } catch (ParseException e) {
                isCorrected = false;
            }
        }
        return date;
    }

    private static Date convertDateFormat(String date) throws ParseException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Date convertedDate = format.parse(date);
        return convertedDate;
    }

    private static long calculateDifferenceDay(Date date1, Date date2) {
        long chenhLech = Math.abs(date2.getTime() - date1.getTime());
        long ngayLech = chenhLech / (24 * 60 * 60 * 1000);
        return ngayLech;
    }
}
