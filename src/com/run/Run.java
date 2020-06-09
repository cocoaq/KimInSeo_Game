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
		
		System.out.println("상자 속에서...");
		System.out.println("");
		
		System.out.print("당신의 이름은? : ");
		String name = sc.nextLine();
		
		gm.gameStart(name);
		
		System.out.println("");
		
		do {
		
		System.out.print("10개의 상자 중 어느 것을 열겠습니까? (0 : 문을 열어본다. / 1~10 입력 : 각 번호의 상자): ");
		int num = sc.nextInt();
		
		if((num > 10)|| (num < 0)) {
			System.out.println("다시 입력하세요.");
		}else if(p.isKey() == true){
				break;
		}else {
			gm.boxSelect(num, openDoor);
		}
		
		}while(true);
	}

}
