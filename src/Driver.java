import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class Driver {
	
public static void main(String[] args) {
	
	LinkedList<Integer> l = new LinkedList<>();
	l.add(2);
	l.add(2);
	l.add(2);
	l.add(2);
	l.add(2);
	
	System.out.println(l);
	
	Set<Integer> s = new HashSet<>(l);
	System.out.println(s);
	
}

}
