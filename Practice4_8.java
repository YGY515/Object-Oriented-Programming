//자바 4장 연습문제 8번 
//정보융합학부 2020204097 윤가영

package Yungayoung;
import java.util.Scanner;
	

class Phone {
		
	private String name;
	private String tel;
	
	Phone(String name, String tel) {
		this.name = name;
		this.tel = tel;
	}
	
	public String Name() { return name; }		//생성자
	public String Tel() { return tel; }
}


public class Practice4_8 {
	public static void main(String[] args) {
		
		      Scanner scan = new Scanner(System.in);
		      Phone phone[];	//phone 객체 배열 생성
		      int n = 0;		//반복문에서 사용할 횟수
		      
		      System.out.print("인원수>>");
		      int num = scan.nextInt();		//인원수 입력받기
		      phone = new Phone[num];		//입력받은 인원수대로 phone 객체 크기 만들기
		      
		      for(n = 0; n < phone.length; n++) {
		         System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
		         String name = scan.next();
		         String tel = scan.next();
		         phone[n] = new Phone(name, tel);	//한 사람의 정보를 Phone 객체에 저장
		      }
		      
		      
		      System.out.println("저장되었습니다...");
		      
		      
		      
		      for(;;) {			//'그만' 나오기까지 계속 검색해야 하므로 무한루프
		         System.out.print("검색할 이름 >>");
		         String name = scan.next();
		        
		         for(n = 0; n < num; n++) {
		           
		        	 if (name.equals(phone[n].Name())) {		            
		            	System.out.println(name + "의 번호는 " + phone[n].Tel() + " 입니다.");	//이름이 맞다면 전번 출력	            	
		            	break;
		            }
		         }
		         
		         if (name.equals("그만")) { break; }		//'그만' 입력받을 경우 프로그램 종료
		         if (n == num) {		//횟수가 phone 객체의 순서 끝까지 갔는데도 없다면
		        	 System.out.println(name + "이 없습니다.");	
		         }

		 }
		      scan.close();
	}
		      
}