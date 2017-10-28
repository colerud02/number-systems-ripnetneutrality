import java.io.FileWriter;
import java.io.IOException;

import java.io.*;

public class Driver {
	public static void main(String[] args) {
		//Converts decToBin and decToHex
		Decimal dec = new Decimal();
		//Converts binToDec and binToHex
		Binary bin = new Binary();
		//Converts hexToDec and hexToBin
		Hexadecimal hex = new Hexadecimal();
		Menu menu = new Menu(bin, hex, dec);
		menu.display();
	}
}