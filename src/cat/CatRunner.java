package cat;

public class CatRunner {
	public static void main(String[] args) {
		Cat Kitty = new Cat("Billy");
		Kitty.meow();
		Kitty.printName();
		for (int i = 0; i < 9; i++) {
			Kitty.kill();
		}
	}
}