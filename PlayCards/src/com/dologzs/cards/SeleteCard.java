package com.dologzs.cards;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SeleteCard {
	
	List<Integer> hasSeleteCards = new ArrayList<Integer>();
	
	// һ���Ʋ���ȡ����
	public void seleteCards(Card c,Player p) {
		Random r = new Random();
		int i = r.nextInt(54);
		if(!hasSeleteCards.contains(i)) {
		p.havecards.put(i,c.cards.get(i));
		hasSeleteCards.add(i);
		}
		else seleteCards(c,p);		
	}
	
	public static void main(String[] args) {
		Player p1 = new Player();
		Player p2 = new Player();
		SeleteCard s = new SeleteCard();
		Card c = new Card();
		c.kindAdd();
		c.sizeAdd();
		c.cardAdd();
		
//		 һ��ѡ��26����
//		for(int i = 0; i < 27; i++) {
//			s.seleteCards(c, p1);
//			s.seleteCards(c, p2);
//		}
		
		// һ��ѡ��2����
		s.seleteCards(c,p1);
		s.seleteCards(c,p2);
		s.seleteCards(c,p1);
		s.seleteCards(c,p2);
		
		p1.showCards();
		p2.showCards();
		CompareCards cc = new CompareCards();
		cc.compareCards(p1, p2);
	}
}
