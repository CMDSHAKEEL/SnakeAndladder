package com.bridgelabz;

public class SnakeAndLadderUC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("WELCOME TO SNAKE AND LADDER");
		System.out.println("--------**********----------");
		int die1;   //   first die.
        int die2;   //   second die.
        int roll;   // The total roll  .
        
        die1 = (int)(Math.random()*6) + 1;
        die2 = (int)(Math.random()*6) + 1;
        roll = die1 + die2;
        
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + roll);

	}

}
