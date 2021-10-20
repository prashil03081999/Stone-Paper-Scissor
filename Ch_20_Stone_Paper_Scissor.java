package com.company;
import java.util.Random;
import java.util.Scanner;

public class Ch_20_Stone_Paper_Scissor {
    public static void main(String[] args) {
        String s1="Stone";
        String s2="Paper";
        String s3="Scissor";
        System.out.println("Stone Paper Sccissor:");
        Scanner sc =new Scanner(System.in);
        String your_turn=sc.next();
        System.out.print("Your Chance  :");
        if(your_turn==s1){
            System.out.println("Stone");
        }
        else if(your_turn==s2){
            System.out.println("Paper");
        }
        else{
            System.out.println("Scissor");
        }
        Random rand = new Random();
        System.out.print("Computer's chance  :");
        int rand1=rand.nextInt(3);
        if (rand1==0){
            System.out.println("Paper");
        }
        else if(rand1==1){
            System.out.println("Scissor");
        }
        else{
            System.out.println("Stone");
        }
        System.out.println(rand1);




    }

}
