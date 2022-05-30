
public class number2 {
	public static void main(String[] args) {
		Benz benz = new Benz(5000);
		Bmw bmw = new Bmw(4500);
		
		benz.printInfo();
		bmw.printInfo();
		benz.printSignature();
		bmw.printSignature();
	}
}
