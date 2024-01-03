public class Weekdaysprinter {
    public static void main(String[] args) throws Exception {

        String[] daysOfweek = { "Sunday", "Monday", "Tuesday", "Wednsday", "Thursday", "Friday", "Saturday" };

        for (String day : daysOfweek) {
            if (day == "Friday" || day == "Saturday") {
                break;

            } else {
                System.out.println(day);
            }

        }

    }

}
