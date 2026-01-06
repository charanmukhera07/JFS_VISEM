import java.util.*;
public class IteratorDemo{
    public static void main(String args[]){
	List<String> list=Arrays.asList("A","B","C","D");
	System.out.println("fetch data using iterator");
	Iterator<String> itr=list.iterator();
	while(itr.hasNext()){
	    System.out.println(itr.next());
	}
	System.out.println("fetch data using foreach");
	for(String s:list){
	    System.out.println(s);
	}
	System.out.println("fetch data using for loop");
	for(int i=0;i<list.size();i++){
	    System.out.println(list.get(i));
	}
    }
}