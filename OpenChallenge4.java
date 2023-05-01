//자바 4장 Open Challenge 끝말잇기 게임 만들기
//정보융합학부 2020204097 윤가영

package Yungayoung;
import java.util.Scanner;


class Player {
	String name;		//플레이어 이름
	String word;		//플레이어가 쓴 단어
	
	public Player (String name) { this.name = name; }	//생성자
	
	public void getWordFromUser() {
		Scanner scan2 = new Scanner(System.in);
		System.out.printf(this.name + ">>");			
		this.word = scan2.nextLine(); 				// 플레이어가 쓴 단어 입력하여 저장
	}
	
	public boolean checkSuccess (String first_word) {	// 끝말잇기에 성공했는지 판별하기
		if (this.word.charAt(0) == first_word.charAt(first_word.length() - 1)) {
			// 입력한 첫번째 문자가 그 전의 마지막 문자와 같다면 통과, 틀린 경우 false 
			return true;	}
		
		else{
			return false;	}
	}
}


public class OpenChallenge4 {
	
	static void run() {		// 게임 전체적으로 진행하는 메소드
		
		String first_word = "아버지";			// 첫번째 단어는 아버지
		Scanner scan = new Scanner(System.in);
		System.out.print("게임에 참가하는 인원은 몇명입니까>>");
		
		int num = scan.nextInt();			// 게임에 참여하는 인원수
		scan.nextLine();
		Player arr[] = new Player[num];		// 선수 숫자만큼 플레이어 배열 생성
		
		for (int i = 0; i < arr.length; i++) {	
			System.out.print("참가자의 이름을 입력하세요>>");
			String name = scan.nextLine();
			arr[i] = new Player(name);		// 이름 입력받아 배열에 집어넣기
		}
		
		System.out.println("시작하는 단어는 아버지입니다");
		
		for (int i = 0; ;i++) {				// 조건없이 무한반복
			arr[i].getWordFromUser();
			
			if (!arr[i].checkSuccess(first_word)) {	// 배열의 i번째 플레이어가 틀리게 입력했다면
				System.out.println(arr[i].name + "이 졌습니다.");
				scan.close();
				break;
			}
			
			first_word = arr[i].word;			// 첫번째 단어에 플레이어가 입력한 단어 저장
			
			if (i == num - 1) {					// 모두 말했으면 처음 플레이어로 돌아가서 말하기
				i = -1; }						// i=0일경우 for문에서 1부터 시작하므로 i=-1이 되어야함

		}
}
	public static void main(String[] args) {
		System.out.println("끝말잇기 게임을 시작합니다...");		
		OpenChallenge4.run();			// 게임을 전체적으로 진행하는 run 메소드 실행
		
	}
}