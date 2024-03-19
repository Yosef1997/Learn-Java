import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void findAreaRectangle(int length, int width) {
        System.out.println("Area Rectangle: " + (length * width));
    }

    public static void findAreaCircle(int radius) {
        int diameter = radius * 2;
        double areaCircle = Math.PI * Math.pow(radius, 2);
        double circumferenceCircle = Math.PI * (2 * radius);
        System.out.println("Diameter Circle: " + diameter);
        System.out.println("Circumference Circle: " + circumferenceCircle);
        System.out.println("Area Circle: " + areaCircle);
    }

    public static void findAnglesOfTriangle(int a, int b) {
        int anglesTriangle = 180 - a - b;
        System.out.println("Angles Triangles: " + anglesTriangle);
    }

    public static boolean isValidDate(String dateStr, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        dateFormat.setLenient(false); // Disable lenient parsing

        try {
            // Parse the input date string
            Date date = dateFormat.parse(dateStr);
            // If parsing successful, the date is valid
            return true;
        } catch (ParseException e) {
            // Parsing failed, so the date is invalid
            return false;
        }
    }

    public static void findDifferenceBetweenDatesInDays(String date1, String date2){
        String dateFormat = "yyyy-MM-dd";
        if (!isValidDate(date1, dateFormat))  {
            System.out.println("Input date is invalid. Please input format date = 'yyyy-MM-dd'");
            return;
        }

        if (!isValidDate(date2, dateFormat))  {
            System.out.println("Input date is invalid. Please input format date = 'yyyy-MM-dd'");
            return;
        }

        if ( date1.length() < 10 ){
            System.out.println("Input date is invalid. Please input format date = 'yyyy-MM-dd'");
            return;
        }

        if ( date2.length() < 10 ){
            System.out.println("Input date is invalid. Please input format date = 'yyyy-MM-dd'");
            return;
        }


        String cleanFirstDate = date1.replace("-","");
        String cleanSecondDate = date2.replace("-","");

        int intFirstDate =  Integer.parseInt(cleanFirstDate);
        int intSecondDate = Integer.parseInt(cleanSecondDate);

        System.out.println("Difference between in dates: " + (intSecondDate - intFirstDate));
    }

    public static void printNameInitial(String name){
        String[] array = name.split(" ");
        StringBuilder initialNameString = new StringBuilder();
        for (String s : array) {
            String[] sArray = s.split("");
            initialNameString.append(sArray[0]);
        }
        System.out.println("Initial Name: " + initialNameString.toString().toUpperCase());
    }

    public static void main(String[] args) {
      findAreaRectangle(5,3);
      findAreaCircle(5);
      findAnglesOfTriangle(80, 65);
      findDifferenceBetweenDatesInDays("2025-03-20", "2024-03-21");
      printNameInitial("moli moskow");
    }
}