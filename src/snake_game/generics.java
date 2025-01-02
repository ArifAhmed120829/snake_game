package snake_game;

class Box<T> {
	private T item;
	
	public void setItem(T item) {
		this.item = item;
	}
	public T getItem() {
		return item;
	}
	
}
public class generics{
	public static void main(String[] args) {
		Box<Integer> intBox = new Box<>();
		intBox.setItem(123);
		System.out.println("Integer Box contains "+ intBox.getItem());
		
		//creating a box for string
		Box<String> strBox = new Box<>();
		strBox.setItem("apple,juice");
		System.out.println("String Box contains "+ strBox.getItem());
	
	
	
	
	}
}