

import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author c16315
 */
public class Cpu extends Player {
    public String toString(){
        return "cpu";
    }
    public int hand(){
     Random rand = new Random();
     int c = rand.nextInt(3);
     return c;
        
    }
}
