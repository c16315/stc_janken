

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author c16315
 */
public class Human extends Player{

    public String toString(){
        return "Human";
    }
    
    /*出すものを決めるための数を入力する関数*/
    public int hand(){
        Scanner stdIn =new Scanner(System.in);
        int u;
        
        System.out.println("0:ぐー　1:チョキ　2:パー");
        do{
            System.out.print("you");
            System.out.print(":");
            u =stdIn.nextInt();
        }while(u<0||u>2);
        
        return u;
        
    }
}
