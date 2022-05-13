package test;
import java.util.Scanner;
public class Test1 {

    String userName = "";


    Scanner st = new Scanner(System.in);

    public void enterUser(){
        System.out.println("Enter the name :");
        userName = st.next();
        System.out.println("User name is : " +userName);
    }

    public void enterMobile(){
        System.out.println("Enter Mobile no :");
       //int n = st.nextInt();
        long n = st.nextLong();
        System.out.println("User mobile no is : " +n);
    }

}
