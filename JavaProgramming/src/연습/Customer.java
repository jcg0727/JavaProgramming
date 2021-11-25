package 연습;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;





public class Customer {
	private Customer(){}
	private Customer instance = new Customer();
	public Customer getInstance() {
			return instance;
	}
	
	
	public int menu() throws Exception{
	Map<String, Integer> caffe = new HashMap<String, Integer>();
	caffe.put("에스프레소", 3500);
	caffe.put("아메리카노", 4100);
	caffe.put("카페라떼", 4600);
	caffe.put("카페모카", 4600);
	caffe.put("바닐라라떼", 4600);
	caffe.put("자몽에이드", 5000);
	caffe.put("청포도에이드", 5000);
	caffe.put("블루베리에이드", 5000);
	caffe.put("아이스티", 3000);
	caffe.put("얼그레이", 4000);
	caffe.put("페퍼민트", 4000);
	caffe.put("유자차", 4000);
	caffe.put("자몽차", 4000);
	caffe.put("딸기스무디", 5000);
	caffe.put("플레인스무디", 5000);
	caffe.put("청포도스무디", 5000);
	caffe.put("마카롱", 2500);
	caffe.put("브레드", 4000);
	caffe.put("베이글", 3000);
	caffe.put("조각케이크", 5000);
	caffe.put("쿠키", 2000);
	caffe.put("휘핑크림", 500);
	caffe.put("샷", 500);
	caffe.put("시럽", 500);


	

		ArrayList<Object> list = new ArrayList<>();
		Scanner scanner = new Scanner(System.in);
		System.out.println("주문하실 메뉴를 골라주세요. ");
 		String menuChoice = scanner.next();
 		System.out.println("수량을 선택해주세요.");
 		int choice = scanner.nextInt();
		list.add(menuChoice);
		list.add(choice);
		
		for (Object object : list) {
			System.out.println(object);
			System.out.println(menuChoice + '\t' + choice + "개" + '\t' + (caffe.get(menuChoice) * choice) + "원");
			
		}
		return choice;

	}

}
