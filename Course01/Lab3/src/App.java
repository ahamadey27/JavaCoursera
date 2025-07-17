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
            if (i >= 50 && i <= 60)
            {
                continue;
            }
            System.out.println(i);
        }
        
    }
}
