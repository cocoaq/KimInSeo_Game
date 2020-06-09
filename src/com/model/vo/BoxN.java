package com.model.vo;

public class BoxN extends Box{

	public BoxN(int hp, boolean key, String bName) {
		super(hp, key, bName);
	}
	@Override
	public void null0() {
		System.out.println("어설픈 움직임의  상자가 달려듭니다!");
	
	}

	public void hitBox() {
		System.out.println("hp -10");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("상자가 움직임을 멈춥니다.");
		}
	}
	public boolean item() {
		System.out.println("열쇠는 없습니다...");
		return false;
	}

}
