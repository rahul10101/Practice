import java.util.ArrayList;
//import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Stack;

public class Arraydemo {

	public static void main(String[] args) {
		//HashSet<Integer> al=new HashSet<Integer>();
		
		Stack<Integer> al = new Stack<Integer>();
		//ArrayList<Object> al = new ArrayList<>();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(43);
		
		for(int i=0; i<al.size(); i++)
		{
			System.out.println(al.get(i));
		}
		
		//Iterator<Integer> itr=al.iterator();
	//	while(itr.hasNext());{
	//		System.out.println(itr.next());
		}
		
	}
