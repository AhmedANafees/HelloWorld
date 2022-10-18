import java.util.Scanner;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nafea8846
 */
public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //creating a scanner for user input
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter your name: ");
        //getting the name form the user
        String name = input.nextLine();
        
        //saying hello to the user
        //System.out.println("HelloWorld");
        System.out.println("hello,"+ name + "!");
    
        System.out.println("What year were you born?");
        int BirthYear = input.nextInt();
        System.out .println("What year is it now?");
        int CurrentYear = input.nextInt();
        int age = CurrentYear-BirthYear;
        if(age == 1)
        {
            System.out.println("you are " + age + " year old");
        }    
        else 
        {
            System.out.println("you are " + age + " years old");
        } // TODO code application logic here
    }
    
}
