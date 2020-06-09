package com.controller;


import com.model.vo.Box;
import com.model.vo.BoxKey;
import com.model.vo.BoxM;
import com.model.vo.BoxN;
import com.model.vo.Door;
import com.model.vo.Player;
import com.model.vo.Script;

public class GameManager {

	Script s = new Script();
	Door d = new Door();
	Box bx = new Box(0, false, "빈 상자");
	BoxM bm = new BoxM(100, false, "성난 상자");
	BoxN bn = new BoxN(30, false, "겁쟁이 상자");
	BoxKey bk = new BoxKey(500, true, "열쇠를 가진 상자");
	Player p = new Player();


	public void gameStart(String name) {
		s.StartScript(name);
	}



	public void boxSelect(int num, boolean openDoor) {
		
		switch(num) {
		case 0 : d.open(p.isKey()); break;
		
		case 1 : bx.null0(); break;

		case 2 : bm.null0();
		System.out.println(bm.getbName() + " : " + bm.getHp() + "hp");
		for(int i = bm.getHp(); i > 0; i -= 10) {
			if(bm instanceof BoxM) {
				((BoxM)bm).hitBox();;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;bm.item(); break;
		
		case 3 : bx.null0(); break;
		
		case 4 : bn.null0();
		System.out.println(bn.getbName() + " : " + bn.getHp() + "hp");
		for(int i = bn.getHp(); i > 0; i -= 10) {
			if(bn instanceof BoxN) {
				((BoxN)bn).hitBox();;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;bn.item(); break;
		case 5 : bx.null0(); break;
		case 6 : bm.null0();
		System.out.println(bm.getbName() + " : " + bm.getHp() + "hp");
		for(int i = bm.getHp(); i > 0; i -= 10) {
			if(bm instanceof BoxM) {
				((BoxM)bm).hitBox();;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;bm.item(); break;
		case 7 : bx.null0(); break;
		case 8 : bn.null0();
		System.out.println(bn.getbName() + " : " + bn.getHp() + "hp");
		for(int i = bn.getHp(); i > 0; i -= 10) {
			if(bn instanceof BoxN) {
				((BoxN)bn).hitBox();;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;bn.item(); break;
		
		case 9 : bx.null0(); break;
		
		case 10 : bk.null0();
		
		for(int i = bk.getHp(); i > 0; i -= 50) {
			if(bk instanceof BoxKey) {
				((BoxKey)bk).hitBox();;

				try {
					Thread.sleep(500);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		;bk.item(); p.setKey(true);  break;
		}

	}
}
