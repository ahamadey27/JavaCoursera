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
        

        
        

    }
}
