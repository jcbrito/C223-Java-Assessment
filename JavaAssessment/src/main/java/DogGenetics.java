/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*;
/**
 *
 * @author Juan B
 */
public class DogGenetics {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your dogs name: ");
        
        String dogName = in.nextLine();
        
        System.out.println("Well then, I have this highly reliable report on "
                 + dogName + "\'s prestigious background right here.");
        
        System.out.println(dogName+" is: ");
    
        
        String[] breeds = {"St. Bernard.", "Chihuahua.",
            "Dramatic RedNose Asian Pug.", "Common Cur", "King Doberman"};
        
        int high = 100;
        int low =1;
        Random rand = new Random();
        for(int i = 0; i < 4; i++){
            
            int percentage = rand.nextInt(high) + 1;
            System.out.println(percentage+ "% " + breeds[i]);
            high = high - percentage;
            if(high == 0) break;
        }
            
        if(high != 0)
            System.out.println(high+"% " + breeds[breeds.length-1]);
            
        System.out.println("Wow thats quite the Dog!");
    }
    
}
