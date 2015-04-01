import java.util.ArrayList;
import java.util.List;

public class MainClass {
	
	public static void main(String[] args){
		
		int runSeconds = 15;
				
		List<Chopstick> chopsticks = new ArrayList<Chopstick>();
		for(int i = 0; i<5; ++i){
			chopsticks.add(new Chopstick(i));
		}
		
		List<Philosopher> philosophers = new ArrayList<Philosopher>();
		philosophers.add(new Philosopher("Confucius", chopsticks.get(0), chopsticks.get(4)));
		philosophers.add(new Philosopher("Plato", chopsticks.get(1), chopsticks.get(0)));
		philosophers.add(new Philosopher("Arquimedes", chopsticks.get(2), chopsticks.get(1)));
		philosophers.add(new Philosopher("Montesquieu", chopsticks.get(3), chopsticks.get(2)));
		philosophers.add(new Philosopher("Nietzche", chopsticks.get(4), chopsticks.get(3)));
		
		philosophers.forEach(philosopher -> new Thread(philosopher).start());
		
		System.out.println("dinning...");
		
		long endTime = System.currentTimeMillis() + (runSeconds * 1000);
		while (System.currentTimeMillis() < endTime)
			philosophers.forEach(philosopher -> System.out.println(philosopher.getCurrentState()));
		
		System.out.println("");
		
		philosophers.forEach(philosopher -> philosopher.endRun());
		
		philosophers.forEach(philosopher -> System.out.println(philosopher.toString()));
		
	}

}
