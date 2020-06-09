package com.run;

import java.util.Scanner;

import com.controller.GameManager;
import com.model.vo.Player;

public class Run {
	
	static boolean openDoor = false;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		GameManager gm = new GameManager();
		Player p = new Player();
		
		System.out.println("���� �ӿ���...");
		System.out.println("");
		
		System.out.print("����� �̸���? : ");
		String name = sc.nextLine();
		
		gm.gameStart(name);
		
		System.out.println("");
		
		do {
		
		System.out.print("10���� ���� �� ��� ���� ���ڽ��ϱ�? (0 : ���� �����. / 1~10 �Է� : �� ��ȣ�� ����): ");
		int num = sc.nextInt();
		
		if((num > 10)|| (num < 0)) {
			System.out.println("�ٽ� �Է��ϼ���.");
		}else if(p.isKey() == true){
				break;
		}else {
			gm.boxSelect(num, openDoor);
		}
		
		}while(true);
	}

}
