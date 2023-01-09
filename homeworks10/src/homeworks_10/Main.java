package homeworks_10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		
		System.out.println("lutfen bir plaka giriniz :");
		
		String girilenplaka =scan.nextLine();
		//String girilenplaka1 =scan.nextLine();
		//String girilenplaka2 =scan.nextLine();
		//String girilenplaka3 =scan.nextLine();
		//String girilenplaka4 =scan.nextLine();
		List<String> list1=new ArrayList<String>();
		
		list1.add(girilenplaka);
		//list1.add(girilenplaka1);
		//list1.add(girilenplaka2);
		//list1.add(girilenplaka3);
		//list1.add(girilenplaka4);
		
		
		
		
		PlakaTanima test = new PlakaTanima();
		
		test.setArac1plaka("26KV860"); 
		test.setArac2plaka("31TT058");
		test.setArac3plaka("26VS058");
		test.setArac4plaka("26AU765");
		test.setArac5plaka("26HL532");
		
		List<String> list=new ArrayList<String>();
		
		list.add(test.getArac1plaka());
		list.add(test.getArac2plaka());
		list.add(test.getArac3plaka());
		list.add(test.getArac4plaka());
		list.add(test.getArac5plaka());
		
	
		//System.out.println(list);
		//boolean areequal =true;
		int sayac=0;
		
		for(int i=0;i<list.size();i++) {
			
			if(list1.get(0).equals(list.get(i))) {
			
				System.out.println(" girdiginiz arac calintidir " );
			
		sayac++;
			
		}		
			else if ( !list1.get(0).equals(list.get(i))) {
				
				
			System.out.println("arac devam edebilir.");
			break;
			}
			
		
		}	
		
		
			
			
		
		
		
		
		
		
			
		
		
		
		
		
		
		
		
		
		 
		
		
		
		
		
	}

	}
