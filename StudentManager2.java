//7장 실습문제 5번(2)
//정보융합학부 2020204097 윤가영
package Yungayoung;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager2 {

	public static void main(String[] args) {
		HashMap<String, StudentInfo> stu = new HashMap<String, StudentInfo>();
		StudentInfo[] student = new StudentInfo[4]; // 학생의 정보를 입력받을 배열 만들기
		System.out.println("학생 이름,학과,학번,학점평균을 입력하세요.");
		
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer s = new StringTokenizer(text, ",");
			String name = s.nextToken().trim(); // 문자열을 저장할때 trim으로 혹여나 있을 공백을 제거
			String major = s.nextToken().trim();
			String num = s.nextToken().trim();
			String score = s.nextToken().trim();
			student[i] = new StudentInfo(name, major, num, score);
			stu.put(name, student[i]); // stu 해시맵에 학생 정보 저장하기

		}

		for (int i = 0; i < 4; i++) {		// 4명의 정보가 다 찼으면 모두 출력하기 
			System.out.println("-------------------");
			System.out.println("이름: " + student[i].get_name());
			System.out.println("학과: " + student[i].get_major());
			System.out.println("학번: " + student[i].get_num());
			System.out.println("학점평균: " + student[i].get_score());
			System.out.println("-------------------");
		}

		for (;;) {		//'그만'을 입력받을 때까지 무한 실행
			System.out.print("학생 이름 >> ");
			String name = scan.next();
			
			if (name.equals("그만")) { break; }
			StudentInfo b = stu.get(name);
			b.find_student(name);	// StudentInfo 해시맵으로 넘어가 학생의 정보를 출력
		}
		scan.close();
	}
}