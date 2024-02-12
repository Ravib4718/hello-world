import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
        // to read input from user
        Scanner sc=new Scanner(System.in);
        //to store user name
        String username;
        
        //now we will use funtions to display user hello world to user
        show();
        sc.close();



    }
    public static void show(){
        System.out.println("Hello World");
    }
}
