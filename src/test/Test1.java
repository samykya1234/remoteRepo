package test;
import java.util.Scanner;
public class Test1 {

    String userName = "";
    long phoneNo;

    Scanner st = new Scanner(System.in);

    public void enterUser(){
        System.out.println("Enter the name :");
        this.userName = st.next();

    }

    public void enterMobile(){
        System.out.println("Enter Mobile no :");
       //int n = st.nextInt();
        this.phoneNo = st.nextLong();
    }

    public void userOutput() {
        System.out.println("Hello my name is"+this.userName);
        System.out.println("Hello my phone Number"+this.phoneNo);
    }

}
