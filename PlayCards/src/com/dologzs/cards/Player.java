package com.dologzs.cards;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class Player {
	String name;
	Map<Integer,String> havecards;
	
	public Player() {
		this.name = name;
		this.havecards = new HashMap<Integer,String> ();
		
		// ����������ҵ�����
		System.out.println("�������û������ƣ�");
		Scanner s = new Scanner(System.in);
		this.name=s.next();
	}
	
	public void showCards() {
		System.out.print(this.name+"�����Ƶģ�");
		for(int i:havecards.keySet()) {
			System.out.print(havecards.get(i)+" ");
//			System.out.println(havecards.get(i).hashCode());
//			System.out.println();
		}
		
		
		System.out.println();
	}

}

