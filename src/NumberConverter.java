
public class NumberConverter {
	public static void main(String[] args) {
		//Converts decToBin and decToHex
		Decimal dec = new Decimal();
		dec.decToBin(29462);
		dec.decToHex(29462);
		//Converts binToDec and binToHex
		Binary bin = new Binary();
		
		//Converts hexToDec and hexToBin
		Hexadecimal hex = new Hexadecimal();
		
		//Create and displays menu
		Menu menu = new Menu(bin, hex, dec);
		menu.display();
	}
}