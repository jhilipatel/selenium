package Popup;

import java.util.ArrayList;

public class ArrayListDemoChildpopup {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();
		al.add("Somlata");
		al.add("Kavita");
		al.add(null);
		al.add("Mukta");
		al.add("Somlata");
		al.add(null);
		System.out.println(al);
		
		ArrayList<String> al1=new ArrayList<>(al);
		//al1.addAll(al);
		al1.add("Alok");
		al1.add("Akash");
		al1.add("Anil");
		System.out.println(al1);
		

	}

}
