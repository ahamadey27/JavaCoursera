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

        //While loop that prints out numbers between 1 and 20
        int numberOne = 1;
        while (numberOne <= 20)
        {
            System.out.println(numberOne);
            numberOne++;
        }
        
        System.out.println();

        // While loop that prints out even numbers between 1 and 20
        int numberEven = 2;
        while (numberEven <= 20) 
        {
            System.out.println(numberEven);
            numberEven+= 2;
        }

        
        

    }
}
