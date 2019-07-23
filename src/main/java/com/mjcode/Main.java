package com.mjcode;


import com.mjcode.animals.Elephant;
import com.mjcode.animals.Lion;
import com.mjcode.animals.Snake;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
       do{
           try{



               Lion lion = new Lion("Lion Ondrej", new Date(1990, 10, 26, 0, 0), 4,90.0, null);
               Elephant elephant = new Elephant("Elephant Zdeno", new Date(2020, 11, 26, 0, 0), 4,90.0, null);
               Snake snake = new Snake("Snake Igor", new Date(1990, 10, 26, 0, 0), 4,90.0, null);


               System.out.println("Lion: " + lion.getName()  + " | " + lion.getIsAlive() + " | " + lion.getSound() + " | " + lion.run());
               System.out.println("Elephant: " + elephant.getName() + " | " + elephant.getIsAlive() + " | " + elephant.getSound() + " | "  + elephant.run());
               System.out.println("Snake: " + snake.getName() + " | " +  snake.getIsAlive() + " | " + snake.getSound() + " | " + snake.run());

           } catch (IllegalArgumentException e){System.out.println("Mistakes were made: " + e); return; }
       } while (true);
    }
}
