package Email_Application;

import java.util.*;

public class EmailApp {

    public static void main(final String[] args) {
        final Scanner in = new Scanner(System.in);
        String fname;
        String lname;
        System.out.print("Enter you first name : ");
        fname = in.nextLine();
        System.out.print("Enter your last name : ");
        lname = in.nextLine();
        Email em1 = new Email(fname, lname);
        em1.showInfo();
        in.close();
    }
}