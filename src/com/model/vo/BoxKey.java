package com.model.vo;

public class BoxKey extends Box{

	public BoxKey(int hp, boolean key, String bName) {
		super(hp, key, bName);
		
	}
	@Override
	public void null0() {
		System.out.println("�����ϰ� �Ŵ��� ���ڰ� ��Ÿ�����ϴ�!");
	
	}

	public void hitBox() {
		System.out.println("hp -50");
		super.setHp(super.getHp() - 50);
		
		if(super.getHp() <= 0) {
			System.out.println("���ڰ� �������� ����ϴ�.");
		}
	}
	public boolean item() {
		System.out.println("���踦 �߰��߽��ϴ�!");
		return true;
	}

//	public boolean keyBox(){
//		System.out.println("�����ϰ� �Ŵ��� ���ڰ� ����� ���Ŀɴϴ�!");
//		
//		return true;
//	}


}
