package ClientSide;


public class Tracker {
	private boolean value;
	
	/**
	 * Initializes flag to value
	 * @param value
	 */
	public Tracker(boolean value) {
		this.value = value;
	}
	
	/**
	 * Setter
	 * @param value
	 */
	public synchronized void setValue(boolean value){
		this.value = value;
	}
	
	/**
	 * Getter
	 * @return
	 */
	public synchronized boolean getValue() {
		return value;
	}
}
