package com.model.vo;



public class Script {

	Player p = new Player();
	
	public void StartScript(String name) {
		System.out.println(name + " : �� �̸���..." + name + ". �и� �׷� �̸� �̾���.");
		System.out.println("����� ��� �� �� ���� ������ ������ϴ�.");
		System.out.println("��� ����� ������ �߰��Ͽ����ϴ�. ");
		System.out.println("'�� ���� Ż���Ϸ��� ���ڸ� ���� ���踦 ã�ƶ�.'");
		System.out.println(name + " : �̰� ���� ������...");
		System.out.println("����� ���� ���� ������ ���ư��ϴ�...");
	}
	
	public void EndScript() {
		System.out.println("���� ������ ����� ����� ��� ������ �ܰ����� �˾ҽ��ϴ�.");
		System.out.println("");
		System.out.println("����� �տ��� ������ ������ �ֽ��ϴ�.");
		System.out.println("'�� ģ������.");
		System.out.println("�ű⼭ �������� ��� �� ����?");
		System.out.println("�׷��ϱ� �� �� ���� ����!");
		System.out.println("�ʸ� ����ϴ� ��̰�'");
		System.out.println("");
		System.out.println("����� ��Ż�� ������ �󱼿� �״�� �巯�� ä ������ ���մϴ�.");
		
		p.setKey(true);
	}


}
