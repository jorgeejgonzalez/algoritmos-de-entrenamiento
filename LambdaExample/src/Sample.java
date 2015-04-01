import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;


public class Sample {
	
	public static void main(String[] args){
		List<Integer> values = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		//values.forEach(value -> System.out.println(value));		
		//values.forEach(System.out::println);
		
		new Sample().use();
		System.out.println(totalValues(values, e -> true));
		System.out.println(totalValues(values, e -> e % 2 == 0));
		System.out.println(totalValues(values, e -> e % 2 != 0));
		
		System.out.println(values.stream()
								 .filter(e -> e > 3)
								 .filter(e -> e % 2 == 0)
								 .map(e -> e * 2)
								 .findFirst()
								 .orElse(0));
	}
	
	public void use(){
		SeaPlane seaPlane = new SeaPlane();
		seaPlane.takeOff();
		seaPlane.turn();
		seaPlane.cruise();
		seaPlane.land();
	}
	
	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector){
		return numbers.stream()
					  .filter(selector)
					  .reduce(0, (c,e) -> c+e);
	}

}

interface Fly {	
	default public void takeOff(){System.out.println("Fly::takeOff");}
	default public void turn(){System.out.println("Fly::turn");}
	default public void cruise(){System.out.println("Fly::cruise");}
	default public void land(){System.out.println("Fly::land");}
}

interface FastFly extends Fly {
	default public void takeOff(){System.out.println("FastFly::takeoff");}
}

interface Sail{
	default public void cruise(){System.out.println("Sail::cruise");}
}

class Vehicle{
	public void land(){System.out.println("Vehicle::land");}
}

class SeaPlane extends Vehicle implements FastFly, Sail {
	@Override
	public void cruise(){
		System.out.println("SeaPlane::cruise");
		FastFly.super.cruise();
	}
}