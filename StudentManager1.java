//7장 실습문제 5번(1)
//정보융합학부 2020204097 윤가영
package Yungayoung;

class StudentInfo {
	public String name, major, num, score;

	public StudentInfo(String name, String major, String num, String score) {
		this.name = name;
		this.major = major;
		this.num = num;
		this.score = score;
	}

	public String get_name() { return name; }

	public String get_major() { return major; }

	public String get_num() { return num; }

	public String get_score() { return score; }
	
	public void find_student(String name) {

		if (name.equals(this.name)) // 학생의 이름을 입력받았을때 정보를 출력
			System.out.println(name + ", " + major + ", " + num + ", " + score);

	}
}

public class StudentManager1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
