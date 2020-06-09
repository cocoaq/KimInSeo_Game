package com.model.vo;

public class BoxKey extends Box{

	public BoxKey(int hp, boolean key, String bName) {
		super(hp, key, bName);
		
	}
	@Override
	public void null0() {
		System.out.println("유난하게 거대한 상자가 나타났습니다!");
	
	}

	public void hitBox() {
		System.out.println("hp -50");
		super.setHp(super.getHp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("상자가 움직임을 멈춥니다.");
		}
	}
	public boolean item() {
		System.out.println("열쇠를 발견했습니다!");
		return true;
	}

//	public boolean keyBox(){
//		System.out.println("수상하게 거대한 상자가 당신을 덮쳐옵니다!");
//		
//		return true;
//	}


}
