package collections.StremsWork;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsSamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<String> stream = Stream.of("rishi kesh", "rahul","srija rao","sruthi");
		Predicate<String> p1=p->p.length()>5;
		Predicate<String> p2=p->p.equals("sruthi");
		Predicate<String> p3=p->p.equals("rahul");
//		Predicate<String> p4=Predicate.isEqual("srija rao");
//		stream
//		.filter(p2.or(p3).or(p4))
//		.forEach(s->System.out.println(s));
		//intermediate operations
		List<String> list=new ArrayList<>();
		stream
		.peek(System.out::println)
		.filter(p2.or(p3))
		.forEach(list::add);//two intermediatory functions not allowed
	    // .peek(list::add);
		System.out.println("done!");
		System.out.println(list.size());
		
		
		

	}

}
