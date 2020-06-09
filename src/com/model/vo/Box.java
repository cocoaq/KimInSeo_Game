package com.model.vo;

public class Box {
	private int hp;
	private boolean key = false;
	private String bName;
	

	public Box(int hp, boolean key, String bName) {
		super();
		this.hp = hp;
		this.key = key;
		this.bName = bName;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public boolean isKey() {
		return key;
	}

	public void setKey(boolean key) {
		this.key = key;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	
	public void null0() {
		System.out.println("텅 비어 먼지만 가득 합니다.");
	}
	

}
