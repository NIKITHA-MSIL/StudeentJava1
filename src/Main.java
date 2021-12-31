import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	

	 public static void main(String[] args){
		 boolean test = false;
		 ArrayList<Encapsulate>list = new ArrayList<Encapsulate>();
		 list.add(new Encapsulate("1","anu","female","20"));
		 list.add(new Encapsulate("2","Rohan","male","21"));
		 list.add(new Encapsulate("3","Anju","female","20"));
		 list.add(new Encapsulate("4","Rahul","male","21"));
		 list.add(new Encapsulate("5","Kiran","male","24"));
		 

		 System.out.println("enter the student Id");
		 Scanner sc=new Scanner(System.in);
		 int id = sc.nextInt();
		 for(int i=0;i<list.size(); i++) {
			 if(Integer.parseInt(list.get(i).Id) == id){
				 System.out.println(list.get(i).name);
				 System.out.println(list.get(i).gender);
				 System.out.println(list.get(i).age);

				 test = true;
			 }
		 }
		 if(!test){
			 System.out.println("nothing found");
		 }


		 sc.close();
	 }
}
