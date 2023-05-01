//�ڹ� 7�� Open Challenge ���� �ܾ� �׽�Ʈ ���α׷� �����
//���������к� 2020204097 ������
package Yungayoung;

import java.util.InputMismatchException; //������ �Է��ؾ� �ϴµ� ���ڸ� �Է��ϸ� ������ ���Ƿ� ����ó��
import java.util.Scanner;
import java.util.Vector;

class Word { // ����ܾ� Ŭ����
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
	private String name;		//�ܾ� ���� �̸� "��ǰ����"�� �����ؾ��� ���ڿ� �����
	private Vector<Word> word;

	public OpenChallenge7(String name) {
		this.name = name; // �ܾ� ������ ������ �����ڷ� ����

		word = new Vector<Word>(); // ���� �ܾ� ���� �����ϰ� 17���� �ܾ� ���
		word.add(new Word("picture", "����"));
		word.add(new Word("love", "���"));
		word.add(new Word("animal", "����"));
		word.add(new Word("emotion", "����"));
		word.add(new Word("human", "�ΰ�"));
		word.add(new Word("school", "�б�"));
		word.add(new Word("class", "����"));
		word.add(new Word("painting", "�׸�"));
		word.add(new Word("bear", "��"));
		word.add(new Word("eye", "��"));
		word.add(new Word("society", "��ȸ"));
		word.add(new Word("doll", "����"));
		word.add(new Word("trade", "�ŷ�"));
		word.add(new Word("error", "����"));
		word.add(new Word("baby", "�Ʊ�"));
		word.add(new Word("example", "����"));
		word.add(new Word("statue", "������"));
	}

	private int Example(int ex[], int answernum) { // ���� ��ȣ�� ���� ��ȣ
		int n[] = { -1, -1, -1, -1 };
		int index;

		for (int i = 0; i < n.length; i++) {
			do {
				index = (int) (Math.random() * word.size()); // �������� ���⿡ �� �ܾ� ���庤�Ϳ��� ��������
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
		System.out.println("\"" + name + "\"" + "�� �ܾ� �׽�Ʈ�� �����մϴ�. -1�� �Է��ϸ� �����մϴ�.");
		System.out.println("���� " + word.size() + "���� �ܾ ��� �ֽ��ϴ�");

		for (;;) { // ���� ���ѹݺ� ����
			int answernum = (int) (Math.random() * word.size());
			String eng = word.get(answernum).getEnglish();

			int example[] = new int[4]; // ���� 4��
			int answer = Example(example, answernum);
			example[answer] = answernum;

			System.out.println(eng + "?"); // ������ ����ܾ�
			for (int i = 0; i < example.length; i++) {
				System.out.print("(" + (i + 1) + ")" + word.get(example[i]).getKorean() + " ");
			}
			System.out.print(":>"); // ���� �� ������Ʈ

			try {
				int num = scan.nextInt(); // ���ڸ� �Է¹޾� �����ϱ�
				if (num == -1) {
					break;
				} // ���� -1�� �Է¹����� �����ϱ�

				num = num - 1;
				if (num == answer) { // �Է��� ���ڿ� ���� �´ٸ�
					System.out.println("Excellent !!");
				} else {
					System.out.println("No. !!");
				}

			} catch (InputMismatchException e) { // ���ڰ� �ƴ� ���ڸ� �Է����� ��
				scan.next();
				System.out.println("���ڸ� �Է��ϼ��� !!");
			}
		}
		System.out.println("\"" + name + "\"�� �����մϴ�...");
		scan.close();
	}

	public static void main(String[] args) {
		OpenChallenge7 test = new OpenChallenge7("��ǰ����");
		test.run(); // �ܾ� ���߱� ���α׷��� �����ϴ� �޼ҵ� ����
	}
}