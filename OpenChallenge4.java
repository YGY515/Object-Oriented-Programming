//�ڹ� 4�� Open Challenge �����ձ� ���� �����
//���������к� 2020204097 ������

package Yungayoung;
import java.util.Scanner;


class Player {
	String name;		//�÷��̾� �̸�
	String word;		//�÷��̾ �� �ܾ�
	
	public Player (String name) { this.name = name; }	//������
	
	public void getWordFromUser() {
		Scanner scan2 = new Scanner(System.in);
		System.out.printf(this.name + ">>");			
		this.word = scan2.nextLine(); 				// �÷��̾ �� �ܾ� �Է��Ͽ� ����
	}
	
	public boolean checkSuccess (String first_word) {	// �����ձ⿡ �����ߴ��� �Ǻ��ϱ�
		if (this.word.charAt(0) == first_word.charAt(first_word.length() - 1)) {
			// �Է��� ù��° ���ڰ� �� ���� ������ ���ڿ� ���ٸ� ���, Ʋ�� ��� false 
			return true;	}
		
		else{
			return false;	}
	}
}


public class OpenChallenge4 {
	
	static void run() {		// ���� ��ü������ �����ϴ� �޼ҵ�
		
		String first_word = "�ƹ���";			// ù��° �ܾ�� �ƹ���
		Scanner scan = new Scanner(System.in);
		System.out.print("���ӿ� �����ϴ� �ο��� ����Դϱ�>>");
		
		int num = scan.nextInt();			// ���ӿ� �����ϴ� �ο���
		scan.nextLine();
		Player arr[] = new Player[num];		// ���� ���ڸ�ŭ �÷��̾� �迭 ����
		
		for (int i = 0; i < arr.length; i++) {	
			System.out.print("�������� �̸��� �Է��ϼ���>>");
			String name = scan.nextLine();
			arr[i] = new Player(name);		// �̸� �Է¹޾� �迭�� ����ֱ�
		}
		
		System.out.println("�����ϴ� �ܾ�� �ƹ����Դϴ�");
		
		for (int i = 0; ;i++) {				// ���Ǿ��� ���ѹݺ�
			arr[i].getWordFromUser();
			
			if (!arr[i].checkSuccess(first_word)) {	// �迭�� i��° �÷��̾ Ʋ���� �Է��ߴٸ�
				System.out.println(arr[i].name + "�� �����ϴ�.");
				scan.close();
				break;
			}
			
			first_word = arr[i].word;			// ù��° �ܾ �÷��̾ �Է��� �ܾ� ����
			
			if (i == num - 1) {					// ��� �������� ó�� �÷��̾�� ���ư��� ���ϱ�
				i = -1; }						// i=0�ϰ�� for������ 1���� �����ϹǷ� i=-1�� �Ǿ����

		}
}
	public static void main(String[] args) {
		System.out.println("�����ձ� ������ �����մϴ�...");		
		OpenChallenge4.run();			// ������ ��ü������ �����ϴ� run �޼ҵ� ����
		
	}
}