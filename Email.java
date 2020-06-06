package Email_Application;

import java.util.*;

public class Email {
    private String firstName;
    private String secondName;
    private String password;
    private String department;
    private int passLength = 8;
    private String email;
    private int mailBoxCapacity = 500;
    private String alternateEmail;

    Scanner in = new Scanner(System.in);

    // constructor to get the first and last name.
    public Email(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
        // System.out.println("Email Created : " + this.firstName + " " +
        // this.secondName);
        // calling the method to determine the department.
        this.department = setDepartment();
        // System.out.println(this.department);
        email = firstName.toLowerCase() + "." + secondName.toLowerCase() + "@" + department + ".company.com";
        // calling the method to genrate a random password.
        this.password = setPassword(passLength);
        System.out.println("EMAIL : " + email);
        System.out.println("INITIAL PASSWORD : " + this.password);
    }

    // Ask for the department
    private String setDepartment() {
        System.out.print("Enter the department\n1 for D1\n2 for D2\n3 for D3\n0 for none\n");

        int x = in.nextInt();
        String deptName = "";

        switch (x) {
            case 0:
                deptName = "NONE";
                break;

            case 1:
                deptName = "D1";
                break;

            case 2:
                deptName = "D2";
                break;

            case 3:
                deptName = "D3";
                break;

        }

        in.close();
        return deptName;

    }

    // Genrate a random password
    private String setPassword(int length) {
        String setPassword = "1qaz2wsx3edc4@rf#v5$tgb&6yhn7ujm8!ik9ol0p";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * setPassword.length());
            password[i] = setPassword.charAt(rand);
        }
        return new String(password);
    }

    // set mailbox capacity
    public void setMailboxCapacity() {
        System.out.println("Enter the capacity :");
        int capacity = in.nextInt();
        this.mailBoxCapacity = capacity;
    }

    // change the password
    public void changePassword() {
        System.out.println("Enter the new password :");
        String password = in.nextLine();
        this.password = password;
    }

    // set an alternate email
    public void setAlternateEmail() {
        System.out.println("Enter the email :");
        String email = in.nextLine();
        this.alternateEmail = email;
    }

    // To show all the details
    public void showInfo() {
        System.out.print("Name : " + firstName + " " + secondName + "\nEmail : " + email + "\nDepartment Name: "
                + department + "\nMail Box Capacity : " + mailBoxCapacity);
    }
}