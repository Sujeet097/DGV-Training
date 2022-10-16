/**
 * 
 */
package First;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author Sujeet Kumar Singh
 *
 */
class SortSubjects implements Comparator<Subject>{
	
	public int compare(Subject s1,Subject s2) {
		return s2.getLevel()-s1.getLevel();
	}
}


/*class numberAbove extends Exception{
	public numberAbove(String msg) {
		super(msg);
	}
}*/


interface Demo1{
	public void doSomething();
}



public class CoreJava {

	/**
	 * @param args
	 */
	public static void main(String[] args)  /*throws numberAbove*/ {
		// TODO Auto-generated method stub
//		Child c = new Child();
//		c.printName();
//		Demo d = new Demo();
//		d.add(new int[] {23,45,35});
		
//	Address ad= new Address();
//		ad.setCity("Mumbai");
//		ad.setState("Maharashtra");
//		ad.setPincode(410320);
		
//		Person p = new Person();
//		p.setName("Sujeet");
//		p.setAge(23);
//		p.setAddress(ad);
		
//		System.out.println(p);
//		System.out.println(ad);
//		Subject subject = new Subject("physics","3M","LEVEL 5");
//		Student student = new Student("Sujeet","Engineering",18,subject);
//		
//		
//		student.display();
		
//		Scanner sc= new Scanner(System.in);
//		 Subject [] s = new Subject[4];
//		   for(int i=0;i<4;i++) {
//			   System.out.println("Enter Subject, Duration ,level respectively");
//			   String name = sc.nextLine();
//			   String duration = sc.nextLine();
//			   String level = sc.nextLine();
//			   s[i]=new Subject(name,duration,level);
//			   
//		   }
//		   
//		   for(int i=0;i<4;i++) {
//			  System.out.println(s[i]);
//		   }
       
//		Shape s = new Square();
//		s.getSide();
//		System.out.println(s.area());
		
		
		/*Subject [] arr = {
				new Subject("CPP","2M",2),
				new Subject("PHP","2M",6),
				new Subject("JAVA","2M",9),
				new Subject("JS","2M",7),
				new Subject("PYTHON","2M",5),
				
		};
		
		Arrays.sort(arr,new SortSubjects());
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i].getSubjectName());
		}*/
		
		
		/*Exception Handling
		int arr[]= {12,23,45,56,78};
		try {
		for(int i=0;i<arr.length+1;i++) {
			System.out.println(arr[i]);
		}
		}
		catch(Exception e) {
			System.out.println("You have reached the array limit");
		}*/
		
		//creating exception and handing the exception
		/*Scanner sc= new Scanner(System.in);
		System.out.println("Enter the numbers");
		int arr[]=new int[5];
		try {
		for(int i=0;i<5;i++) {
			arr [i]=sc.nextInt();
			if(arr[i]>100) {
				throw new numberAbove("Number is too high");
			}
			else {
			    
				System.out.println("you are all good");
			
			}
		}
			
		}catch(numberAbove ca) {
			System.out.println(ca.getMessage());
		}*/
		
		 /*for(int i=1;i<=5;i++) {
			 Multithreading multithreading = new Multithreading();
			 
			 try
			 {
				 multithreading.start();
			 }
			 catch(Exception e)
			 {
				 System.out.println(e);
			 }
		 }*/
		/*Demo1 demo = () ->{
			System.out.println("implementing do something");
		};
		
		
		demo.doSomething();*/
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		al.add(23);
		al.add(37);
		al.add(69);
		al.add(100);
		
		List <Integer> b =al.stream().filter((n)->{
			return n>50;
		}).collect(Collectors.toList());
		
		b.forEach((n)->{
			System.out.println(n);
		});
				
		
	}

}
