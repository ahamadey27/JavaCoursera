public class App {
    public static void main(String[] args) throws Exception 
    {
        String[] daysOfWeek = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

        //Print days in order
        for (String dayOfWeek : daysOfWeek) 
        {
            System.out.println(dayOfWeek.toString());
        }

        System.out.println();

        //Print days in reverse 
        for (int i = 0; i < daysOfWeek.length; i++)
        {
            System.out.println(daysOfWeek[i]);
        }

        System.out.println();

        // Use the continue statement and an if statement to skip printing the odd numbers (i.e. increment the counter by 1 each time through the loop).
        int numberEven = 1;
        while (numberEven <= 20) 
        {
            if (numberEven % 2 != 0) {
                numberEven++;
                continue;
            }
            System.out.println(numberEven);
            numberEven++;
        }
        
        System.out.println();

        // Create a for loop that will print out all numbers between 1 and 100 except 50 and 60
        for (int i = 1; i <= 100; i++)
        {
            if (i >= 50 && i <= 60) {
                continue;
            }
            System.out.println(i);
        }
        
        System.out.println();
        System.out.println();
        
        //Switch statement exercise
        int counter = 1;
        while (counter <= 12)
        {
            switch(counter)
            {
                case 1:
                    System.out.println("January has 31 days");
                    break;
                case 2:
                    System.out.println("February has 28 days");
                    break;
                case 3:
                    System.out.println("March has 31 days");
                    break;
                case 4:
                    System.out.println("April has 30 days");
                    break;
                case 5:
                    System.out.println("May has 31 days");
                    break;
                case 6:
                    System.out.println("June has 30 days");
                    break;
                case 7:
                    System.out.println("July has 31 days");
                    break;
                case 8:
                    System.out.println("August has 31 days");
                    break;
                case 9:
                    System.out.println("September has 30 days");
                    break;
                case 10:
                    System.out.println("October has 31 days");
                    break;
                case 11:
                    System.out.println("November has 30 days");
                    break;
                case 12:
                    System.out.println("December has 31 days");
                    break;
                default:
                    System.out.println("Invalid month");
                    break;
            }
            counter++;
        }
        
    }
}
