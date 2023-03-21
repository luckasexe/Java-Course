package util;

public class CurrencyConverter {
	public static double dollarPrice;
	public static double bought;
	public static double dollarToReal() {
		return bought * 1.06 * dollarPrice;
	}

}
