//자바 7장 Open Challenge 영어 단어 테스트 프로그램 만들기
//정보융합학부 2020204097 윤가영
package Yungayoung;

import java.util.InputMismatchException; //정수를 입력해야 하는데 문자를 입력하면 오류가 나므로 예외처리
import java.util.Scanner;
import java.util.Vector;

class Word { // 영어단어 클래스
	private String Korean;
	private String English;

	public Word(String English, String Korean) {
		this.Korean = Korean;
		this.English = English;
	}

	public String getEnglish() {
		return English;
	}

	public String getKorean() {
		return Korean;
	}

}

public class OpenChallenge7 {
	private String name;		//단어 퀴즈 이름 "명품영어"를 저장해야할 문자열 만들기
	private Vector<Word> word;

	public OpenChallenge7(String name) {
		this.name = name; // 단어 퀴즈의 제목을 생성자로 참고

		word = new Vector<Word>(); // 영어 단어 벡터 생성하고 17개의 단어 등록
		word.add(new Word("picture", "사진"));
		word.add(new Word("love", "사랑"));
		word.add(new Word("animal", "동물"));
		word.add(new Word("emotion", "감정"));
		word.add(new Word("human", "인간"));
		word.add(new Word("school", "학교"));
		word.add(new Word("class", "수업"));
		word.add(new Word("painting", "그림"));
		word.add(new Word("bear", "곰"));
		word.add(new Word("eye", "눈"));
		word.add(new Word("society", "사회"));
		word.add(new Word("doll", "인형"));
		word.add(new Word("trade", "거래"));
		word.add(new Word("error", "오류"));
		word.add(new Word("baby", "아기"));
		word.add(new Word("example", "보기"));
		word.add(new Word("statue", "조각상"));
	}

	private int Example(int ex[], int answernum) { // 문제 번호와 답한 번호
		int n[] = { -1, -1, -1, -1 };
		int index;

		for (int i = 0; i < n.length; i++) {
			do {
				index = (int) (Math.random() * word.size()); // 무작위로 보기에 쓸 단어 워드벡터에서 가져오기
			} while (index == answernum || exists(n, index));
			n[i] = index;
		}
		for (int i = 0; i < n.length; i++) {
			ex[i] = n[i];
		}
		return (int) (Math.random() * n.length);
	}

	private boolean exists(int n[], int index) {
		for (int i = 0; i < n.length; i++) {
			if (n[i] == index)
				return true;
		}
		return false;
	}

	public void run() {
		Scanner scan = new Scanner(System.in);
		System.out.println("\"" + name + "\"" + "의 단어 테스트를 시작합니다. -1을 입력하면 종료합니다.");
		System.out.println("현재 " + word.size() + "개의 단어가 들어 있습니다");

		for (;;) { // 문제 무한반복 실행
			int answernum = (int) (Math.random() * word.size());
			String eng = word.get(answernum).getEnglish();

			int example[] = new int[4]; // 보기 4개
			int answer = Example(example, answernum);
			example[answer] = answernum;

			System.out.println(eng + "?"); // 출제할 영어단어
			for (int i = 0; i < example.length; i++) {
				System.out.print("(" + (i + 1) + ")" + word.get(example[i]).getKorean() + " ");
			}
			System.out.print(":>"); // 답을 쓸 프롬포트

			try {
				int num = scan.nextInt(); // 숫자를 입력받아 저장하기
				if (num == -1) {
					break;
				} // 만약 -1을 입력받으면 종료하기

				num = num - 1;
				if (num == answer) { // 입력한 숫자와 답이 맞다면
					System.out.println("Excellent !!");
				} else {
					System.out.println("No. !!");
				}

			} catch (InputMismatchException e) { // 숫자가 아닌 문자를 입력했을 때
				scan.next();
				System.out.println("숫자를 입력하세요 !!");
			}
		}
		System.out.println("\"" + name + "\"를 종료합니다...");
		scan.close();
	}

	public static void main(String[] args) {
		OpenChallenge7 test = new OpenChallenge7("명품영어");
		test.run(); // 단어 맞추기 프로그램을 실행하는 메소드 실행
	}
}