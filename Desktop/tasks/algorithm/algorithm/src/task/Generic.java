package task;

public class Generic <T>{
	private T[] arr;
	int count = 0;
	
	public Generic(int size) {
		arr = (T[]) new Object[size];
	}

	public T get(int index) {
		return arr[index];
	}

	public void put(T value) {
		arr[count++] = value;
	}
	
	
}