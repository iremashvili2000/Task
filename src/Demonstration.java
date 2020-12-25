import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;


public class Demonstration {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ob1=new Scanner(System.in);
		String word=ob1.nextLine();
		try{
		func_Word(word);
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

	private static void func_Word(String word){
		// TODO Auto-generated method stub
		word=word.toLowerCase();
		
		String[] ArrWords=word.split(" ",Integer.MAX_VALUE);
		Vector<String>Word_new=new Vector<String>();
		Word_new.add(ArrWords[0]);
		for(int i=0;i<ArrWords.length;i++) {
			if(!Word_new.contains(ArrWords[i]) && !ArrWords[i].isEmpty()) {
				Word_new.add(ArrWords[i]);
			}
		
		}
	              //	System.out.print(Word_new);
		Collections.sort(Word_new);
		//System.out.print(Word_new);
		char d=Word_new.elementAt(0).charAt(0);
		String text="";
		text+="{[";
		   //System.out.print("{"+d+"=[");
		for(int i=0;i<Word_new.size();i++) {
			if(d!=Word_new.elementAt(i).charAt(0)) {
				text+="], "+Word_new.elementAt(i).charAt(0)+"=[";
				    //System.out.print("],"+Word_new.elementAt(i).charAt(0)+"= [");
				d=Word_new.elementAt(i).charAt(0);
			}
			text+=Word_new.elementAt(i);//+",";
			if(i+1<Word_new.size()&&d==Word_new.elementAt(i+1).charAt(0)) {
			text+=",";
			}
			     //System.out.print(Word_new.elementAt(i)+",");
			
		}
		text+="]"+"}";
		//System.out.print("]"+"}");
		//System.out.println();
		System.out.println(text);
		
		
		
		
	

	}
}
