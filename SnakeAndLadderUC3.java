package com.bridgelabz;

public class SnakeAndLadderUC3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int PlayerPosition=1;
		int WinningPosition=100;
		System.out.println("Welcome to Snake And Ladder");
		System.out.println("--------**********----------");
		while(WinningPosition>PlayerPosition)
		{
			PlayerPosition=PlayerPosition+8;
		int die = (int) (Math.floor( Math.random() * 10) % 6+1);
		System.out.println("Die rolled is :" +die);
		int option =(int) (Math.floor(Math.random() * 10)%3);
		switch(option)
		{
		case 0:
		System.out.println("No play" +0);
		PlayerPosition += 0;
		break;
		case 1:
		System.out.println("Ladder" +die);
		PlayerPosition += die;
		break;
		default:
		System.out.println("Snake"+die);
		PlayerPosition -= die;
		if(PlayerPosition<0)
		PlayerPosition=-0;
		}
		}
		System.out.println("Player position is : "+PlayerPosition);
	}

}
