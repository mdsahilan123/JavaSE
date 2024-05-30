package functionalInterface;

import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateFunctionalInterfaceDemo {
         public static void main(String[] args) {
			Predicate<String>  loginPredicte=username->{
				return username!=null && "Mahesh".equalsIgnoreCase(username);
			};
			
			//executing the login predicate
			System.out.println(loginPredicte.test("Mahesh Kumar"));
			System.out.println(loginPredicte.test("Mahesh"));
			System.out.println(loginPredicte.test("Suresh"));
			
			Predicate<String> lengthPredicate=name->{return name.length() >5;};
			Stream.of("Mahesh").filter(lengthPredicate).forEach(System.out::println);
		}
}
