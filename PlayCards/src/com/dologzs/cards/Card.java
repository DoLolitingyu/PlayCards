package com.dologzs.cards;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Card {
	List<String> kind;
	List<String> size;
	Map<Integer,String> cards;
	
	public Card () {
		this.kind = new ArrayList();
		this.size = new ArrayList();
		this.cards = new HashMap<Integer,String>();
	}
	
	public void sizeAdd() {
		size.add("2");
		size.add("3");
		size.add("4");
		size.add("5");
		size.add("6");
		size.add("7");
		size.add("8");
		size.add("9");
		size.add("10");
		size.add("J");
		size.add("Q");
		size.add("K");
		size.add("A");		
	}
	
	public void kindAdd() {
		kind.add("方块");
		kind.add("梅花");
		kind.add("红桃");
		kind.add("黑桃");
	}
	
	public void cardAdd () {
		int cardsize = 0;
		for(int i = 0; i < 13; i++) {
			for(int j = 0; j <4; j++) {
				cards.put(cardsize, kind.get(j)+size.get(i));
			cardsize +=1;
			}
		}
		cards.put(52, "小 王");
		cards.put(53, "大 王");
	}

	public void cardShow() {
		for(int i :cards.keySet()) {
			System.out.print(cards.get(i)+",");
		}
	}
	
}
