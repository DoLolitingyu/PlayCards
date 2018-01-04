package com.dologzs.cards;

public class CompareCards {
	
	// 比较手牌，谁的最大
	public void compareCards(Player p1, Player p2) {
		String winner = "";
		int win = 0;
		for(int i:p1.havecards.keySet()) {
			for(int j:p2.havecards.keySet()) {
				if(i>j&&i>win) win = i;
				if(j>i&&j>win) win = j;
			}
		}
		if(p1.havecards.get(win)!=null) winner = p1.name+" win";
		else winner = p2.name+" win";
		System.out.println(winner);	
		
	}
}
