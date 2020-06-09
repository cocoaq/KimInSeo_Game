package com.model.vo;



public class Script {

	Player p = new Player();
	
	public void StartScript(String name) {
		System.out.println(name + " : 내 이름은..." + name + ". 분명 그런 이름 이었다.");
		System.out.println("당신은 방금 알 수 없는 곳에서 깨어났습니다.");
		System.out.println("깨어난 당신은 쪽지를 발견하였습니다. ");
		System.out.println("'이 곳을 탈출하려면 상자를 열어 열쇠를 찾아라.'");
		System.out.println(name + " : 이게 무슨 일인지...");
		System.out.println("당신은 눈을 비비며 앞으로 나아갑니다...");
	}
	
	public void EndScript() {
		System.out.println("문이 열리자 여기는 당신이 사는 마을의 외곽임을 알았습니다.");
		System.out.println("");
		System.out.println("당신의 앞에는 쪽지가 놓여져 있습니다.");
		System.out.println("'내 친구에게.");
		System.out.println("거기서 나오느라 고생 좀 했지?");
		System.out.println("그러니까 술 좀 작작 마셔!");
		System.out.println("너를 사랑하는 토미가'");
		System.out.println("");
		System.out.println("당신은 허탈한 마음을 얼굴에 그대로 드러낸 채 집으로 향합니다.");
		
		p.setKey(true);
	}


}
