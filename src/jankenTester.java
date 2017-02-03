

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 * テスタークラス
 * @author c16315
 */
public class jankenTester {
    public static void main(String args[]){
        Scanner stdIn=new Scanner(System.in);
        int retry;                              //確認用
        String[] hands={"gu","tyoki","pa"};     //出す役の配列
        
        Player one,two,player;                  //プレイヤーの変数
        player = new Human();
        one = new Cpu();
        two = new Cpu();
        
        do{                                     //じゃんけん開始
            /*出すものを決める*/
            int comp_1 = one.hand();            
            int comp_2 = two.hand();
            int you = player.hand();

            /*表示する*/
            System.out.println("you:"+hands[you]);
            System.out.println("one:"+hands[comp_1]);
            System.out.println("two:"+hands[comp_2]);

            /*勝敗を決めるための変数*/
            int judge_1 = (you - comp_1+3)%3;
            int judge_2 = (you - comp_2+3)%3;
            int judge = 0;
            
            /*勝敗の判定*/
            if(judge_1 == judge_2)
                judge = judge_1;
            else
                judge = (judge_1 + judge_2+3)%3;
            
            switch(judge){
                case 0: System.out.println("draw");   break;
                case 1: System.out.println("lose"); break;
                case 2: System.out.println("win");    break;
            }

            /*もう一度やるかやらないかの読み込み*/
            do{
                System.out.print("retry? 0:no 1:yes >");
                retry = stdIn.nextInt();
            }while(retry != 0 && retry!=1);
        }while(retry ==1);
    }
}
