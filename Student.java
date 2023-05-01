//7�� �ǽ����� 5��(1)
//���������к� 2020204097 ������
package Yungayoung;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Student {

	public static void main(String[] args) {

		ArrayList<StudentInfo> st = new ArrayList<StudentInfo>(); // �л��� ������ �Է¹��� �迭 �����
		StudentInfo[] student = new StudentInfo[4];
		System.out.println("�л� �̸�,�а�,�й�,��������� �Է��ϼ���.");

		Scanner scan = new Scanner(System.in);

		for (int i = 0; i < 4; i++) {

			System.out.print(">> ");
			String text = scan.nextLine(); // �Է¹��� ������ ��� ����
			StringTokenizer s = new StringTokenizer(text, ","); // ��ū�� ������
			String name = s.nextToken().trim(); // ���ڿ��� �����Ҷ� trim���� Ȥ���� ���� ������ ����
			String major = s.nextToken().trim();
			String studentnum = s.nextToken().trim();
			String score = s.nextToken().trim();
			student[i] = new StudentInfo(name, major, studentnum, score);
			st.add(student[i]);

		}
		for (int i = 0; i < 4; i++) {		//4���� ������ �� á���� ��� ����ϱ� 
			System.out.println("-----------------------------");
			System.out.println("�̸�: " + student[i].get_name());
			System.out.println("�а�: " + student[i].get_major());
			System.out.println("�й�: " + student[i].get_num());
			System.out.println("�������: " + student[i].get_score());
			System.out.println("-----------------------------");
		}

		for (;;) {	//'�׸�'�� �Է¹��� ������ ���� ����
			System.out.print("�л� �̸� >> ");
			String name = scan.next();

			if (name.equals("�׸�")) { break; }

			for (int i = 0; i < 4; i++) {
				StudentInfo a = st.get(i);
				a.find_student(name); // StudentInfo Ŭ������ �Ѿ �л��� ������ ���
			}
		}
		scan.close();
	}
}
