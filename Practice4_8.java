//�ڹ� 4�� �������� 8�� 
//���������к� 2020204097 ������

package Yungayoung;
import java.util.Scanner;
	

class Phone {
		
	private String name;
	private String tel;
	
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String Name() { return name; }		//������
	public String Tel() { return tel; }
}


public class Practice4_8 {
	public static void main(String[] args) {
		
		      Scanner scan = new Scanner(System.in);
		      Phone phone[];	//phone ��ü �迭 ����
		      int n = 0;		//�ݺ������� ����� Ƚ��
		      
		      System.out.print("�ο���>>");
		      int num = scan.nextInt();		//�ο��� �Է¹ޱ�
		      phone = new Phone[num];		//�Է¹��� �ο������ phone ��ü ũ�� �����
		      
		      for(n = 0; n < phone.length; n++) {
		         System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
		         String name = scan.next();
		         String tel = scan.next();
		         phone[n] = new Phone(name, tel);	//�� ����� ������ Phone ��ü�� ����
		      }
		      
		      
		      System.out.println("����Ǿ����ϴ�...");
		      
		      
		      
		      for(;;) {			//'�׸�' ��������� ��� �˻��ؾ� �ϹǷ� ���ѷ���
		         System.out.print("�˻��� �̸� >>");
		         String name = scan.next();
		        
		         for(n = 0; n < num; n++) {
		           
		        	 if (name.equals(phone[n].Name())) {		            
		            	System.out.println(name + "�� ��ȣ�� " + phone[n].Tel() + " �Դϴ�.");	//�̸��� �´ٸ� ���� ���	            	
		            	break;
		            }
		         }
		         
		         if (name.equals("�׸�")) { break; }		//'�׸�' �Է¹��� ��� ���α׷� ����
		         if (n == num) {		//Ƚ���� phone ��ü�� ���� ������ ���µ��� ���ٸ�
		        	 System.out.println(name + "�� �����ϴ�.");	
		         }

		 }
		      scan.close();
	}
		      
}