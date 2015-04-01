import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;


public class Philosopher implements Runnable {
	
	private static Random rand = new Random();
	private static final int maxWaitMillis = 100;
	
	private enum PhilosopherState {
		HUNGRY, EATING, THINKING
	}
	
	private String nombre;
	private Chopstick leftChopstick;
	private Chopstick rightChopstick;
	private PhilosopherState state;
	private int timesEaten;	
	private AtomicBoolean end = new AtomicBoolean(false);
	
	public Philosopher(final String nombre, final Chopstick left, final Chopstick right){
		this.nombre = nombre;
		this.leftChopstick = left;
		this.rightChopstick = right;
		this.state = PhilosopherState.HUNGRY;
		this.timesEaten = 0;
	}
	
	@Override
	public void run() {	
		end.set(false);
		while(!end.get())
			if(state == PhilosopherState.HUNGRY)
				if(state == PhilosopherState.HUNGRY){
					try{
						pickUpChopsticks();
						state = PhilosopherState.EATING;
						++timesEaten;
						sleep();
						state = PhilosopherState.THINKING;
						sleep();
						state = PhilosopherState.HUNGRY;
					} catch(IllegalStateException ex){
						putDownChopsticks();
						sleep();
					}
				}
	}
	
	private void pickUpChopsticks() throws IllegalStateException {
		leftChopstick.pickUp(this);
		rightChopstick.pickUp(this);
	}
	
	private void putDownChopsticks(){
		leftChopstick.putDown(this);
		rightChopstick.putDown(this);
	}
	
	private void sleep(){
		try{
			Thread.sleep(rand.nextInt(maxWaitMillis));
		} catch(InterruptedException ex){
			
		}
	}
	
	public String getNombre(){
		return nombre;
	}

	public String getCurrentState() {
		return nombre + " is " + state;
	}
	
	public void endRun(){
		end.set(true);		
	}
	
	public String toString(){
		return nombre + " ate "+ timesEaten +" times.";
	}
	
	@Override
	public boolean equals(Object o){
		if(o instanceof Philosopher){
			Philosopher philosopher = (Philosopher) o;
			return philosopher.getNombre().equals(nombre);
		}
		return false;
	}
	
	@Override
	public int hashCode(){
		StringBuilder builder = new StringBuilder();
	    builder.append(nombre);
	    builder.append(leftChopstick);
	    builder.append(rightChopstick);	    
	    return builder.toString().hashCode();
	}
	
}
