public class App {
    public static void main(String[] args) 
    {
        // Declare variables as specified
        int width;
        int height;
        int area;
        double radius = 10.0;
        double pi = 3.14;
        boolean result = true;

        // Define arrays
        int[] daysInMonths = new int[12];
        String[] monthNames = { "January", "February", "March", "April", "May", "June",
                               "July", "August", "September", "October", "November", "December" };

        // Variable assignments
        width = 8;
        height = 12;
        area = 96;

        // Assign days in each month to the array
        daysInMonths[0] = 31;   // January
        daysInMonths[1] = 28;   // February
        daysInMonths[2] = 31;   // March
        daysInMonths[3] = 30;   // April
        daysInMonths[4] = 31;   // May
        daysInMonths[5] = 30;   // June
        daysInMonths[6] = 31;   // July
        daysInMonths[7] = 31;   // August
        daysInMonths[8] = 30;   // September
        daysInMonths[9] = 31;   // October
        daysInMonths[10] = 30;  // November
        daysInMonths[11] = 31;  // December

        // Print variable values
        System.out.println("The value of width is " + width);
        System.out.println("The value of height is " + height);
        System.out.println("The value of area is " + area);
        System.out.println("The value of radius is " + radius);
        System.out.println("The value of pi is " + pi);
        System.out.println("The value of result is " + result);

        // Print month names and days
        System.out.println(monthNames[0] + " has " + daysInMonths[0] + " days");
        System.out.println(monthNames[1] + " has " + daysInMonths[1] + " days");
        System.out.println(monthNames[2] + " has " + daysInMonths[2] + " days");
        System.out.println(monthNames[3] + " has " + daysInMonths[3] + " days");
        System.out.println(monthNames[4] + " has " + daysInMonths[4] + " days");
        System.out.println(monthNames[5] + " has " + daysInMonths[5] + " days");
        System.out.println(monthNames[6] + " has " + daysInMonths[6] + " days");
        System.out.println(monthNames[7] + " has " + daysInMonths[7] + " days");
        System.out.println(monthNames[8] + " has " + daysInMonths[8] + " days");
        System.out.println(monthNames[9] + " has " + daysInMonths[9] + " days");
        System.out.println(monthNames[10] + " has " + daysInMonths[10] + " days");
        System.out.println(monthNames[11] + " has " + daysInMonths[11] + " days");
    }
}
