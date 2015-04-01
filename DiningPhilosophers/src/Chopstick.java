
public class Chopstick {
	
	private enum ChopstickState {
		ON_TABLE, PICKED_UP
	}
	
	private int id;
	private ChopstickState state;
	private Philosopher holder;
	
	public Chopstick(final int id){
		this.id = id;
		this.state = ChopstickState.ON_TABLE;
	}
	
	public int getId(){
		return id;
	}
	
	public void pickUp(final Philosopher philosopher) throws IllegalStateException {
		if(state == ChopstickState.ON_TABLE){
			state = ChopstickState.PICKED_UP;
			holder = philosopher;
		}
		else
			throw new IllegalStateException();
	}
	
	public void putDown(final Philosopher philosopher){
		if(state == ChopstickState.PICKED_UP && holder.equals(philosopher)){
			state = ChopstickState.ON_TABLE;
			holder = null;
		}
		
	}

}

