import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class NumberOfMonth {
        public static void main(String[] args) throws IOException {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String monthName = reader.readLine();

            List<String> months = new ArrayList<>();
            months.add(0,"nothing");
            months.add(1,"January");
            months.add(2,"February");
            months.add(3,"March");
            months.add(4,"April");
            months.add(5,"May");
            months.add(6,"June");
            months.add(7,"July");
            months.add(8,"January");
            months.add(9,"January");
            months.add(10,"January");
            months.add(11,"January");
            months.add(12,"January");

            if(months.contains(monthName)){
                System.out.println(monthName + " is the " +months.indexOf(monthName) + " month");
            } else {
                System.out.println(monthName + "- it is not a month-");
            }
        }
}
