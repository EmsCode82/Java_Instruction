public class UserIOTestApp {

    public static void main(String[] args) {
        // create the IO object
        UserIO c = IOFactory.getUserIO("console");
        //UserIO c = IOFactory.getUserIO("option");

        // display a welcome message
        c.println("Welcome to the Console Tester application");
        c.println();

        // int
        c.println("Int Test");
        int i = c.getInt("Enter an integer between -100 and 100: ", -101, 101);
        c.println();

        // double
        c.println("Double Test");
        double d = c.getDouble("Enter any number between -100 and 100: ", -101, 101);
        c.println();

        // required string
        c.println("Required String Test");
        String s1 = c.getString("Enter your email address: ");
        c.println();

        // string choice
        c.println("String Choice Test");
        String s2 = c.getString("Select one (x/y): ", "x", "y");
        c.println();
    }
    
}
