package com.model.vo;

public class BoxN extends Box{

	public BoxN(int hp, boolean key, String bName) {
		super(hp, key, bName);
	}
	@Override
	public void null0() {
		System.out.println("��� ��������  ���ڰ� �޷���ϴ�!");
	
	}

	public void hitBox() {
		System.out.println("hp -10");
		super.setHp(super.getHp() - 10);
		
		if(super.getHp() <= 0) {
			System.out.println("���ڰ� �������� ����ϴ�.");
		}
	}
	public boolean item() {
		System.out.println("����� �����ϴ�...");
		return false;
	}

}
