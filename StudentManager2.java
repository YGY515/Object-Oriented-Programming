//7�� �ǽ����� 5��(2)
//���������к� 2020204097 ������
package Yungayoung;

import java.util.HashMap;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentManager2 {

	public static void main(String[] args) {
		HashMap<String, StudentInfo> stu = new HashMap<String, StudentInfo>();
		StudentInfo[] student = new StudentInfo[4]; // �л��� ������ �Է¹��� �迭 �����
		System.out.println("�л� �̸�,�а�,�й�,��������� �Է��ϼ���.");
		
		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {
			System.out.print(">> ");
			String text = scan.nextLine();
			StringTokenizer s = new StringTokenizer(text, ",");
			String name = s.nextToken().trim(); // ���ڿ��� �����Ҷ� trim���� Ȥ���� ���� ������ ����
			String major = s.nextToken().trim();
			String num = s.nextToken().trim();
			String score = s.nextToken().trim();
			student[i] = new StudentInfo(name, major, num, score);
			stu.put(name, student[i]); // stu �ؽøʿ� �л� ���� �����ϱ�

		}

		for (int i = 0; i < 4; i++) {		// 4���� ������ �� á���� ��� ����ϱ� 
			System.out.println("-------------------");
			System.out.println("�̸�: " + student[i].get_name());
			System.out.println("�а�: " + student[i].get_major());
			System.out.println("�й�: " + student[i].get_num());
			System.out.println("�������: " + student[i].get_score());
			System.out.println("-------------------");
		}

		for (;;) {		//'�׸�'�� �Է¹��� ������ ���� ����
			System.out.print("�л� �̸� >> ");
			String name = scan.next();
			
			if (name.equals("�׸�")) { break; }
			StudentInfo b = stu.get(name);
			b.find_student(name);	// StudentInfo �ؽø����� �Ѿ �л��� ������ ���
		}
		scan.close();
	}
}