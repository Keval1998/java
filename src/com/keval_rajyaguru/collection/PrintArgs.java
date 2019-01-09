package collection;

import java.util.Arrays;
import java.util.List;
//import java.util.stream.*;

public class PrintArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList(args);
		l.stream().forEach(e -> System.out.println(e));
		
		System.out.println("-------------------------");
		
		for(String e : l)
		{
			System.out.println(e);
		}
	}

}
