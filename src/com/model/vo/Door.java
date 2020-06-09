package com.model.vo;




public class Door {
	Script s = new Script();
	
	
	public void open(boolean openDoor) {
		if(openDoor == false) {
			System.out.println("문이 꼼짝도 하지 않습니다.");
			return;
		}else if(openDoor == true ){
			System.out.println("문이... 열렸다...!");
			s.EndScript();
			return;
		}
	}

}
