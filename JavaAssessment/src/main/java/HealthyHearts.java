/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Juan B
 */
public class HealthyHearts {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Please enter your age: ");
        int age = in.nextInt();
        int max = 220 - age;
        int low = (int)(max * 0.5);
        int high = (int)(max * 0.85);
        
        System.out.println("Your max heart rate shoulld be " + max + " beats per minute.");
        System.out.println("Your target HR Zone is " + low + " - " + high + " beats per minute.");
        
        
    }
    
}
