package com.model.vo;




public class Door {
	Script s = new Script();
	
	
	public void open(boolean openDoor) {
		if(openDoor == false) {
			System.out.println("���� ��¦�� ���� �ʽ��ϴ�.");
			return;
		}else if(openDoor == true ){
			System.out.println("����... ���ȴ�...!");
			s.EndScript();
			return;
		}
	}

}
