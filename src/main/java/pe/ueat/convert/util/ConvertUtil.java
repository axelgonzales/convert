package pe.ueat.convert.util;

public  class ConvertUtil {

	
	public  Integer convertRomanToInteger(String roman) {
	    return (int) evaluateNextRomanNumeral(roman, roman.length() - 1, 0);
	}
  


	private  double evaluateNextRomanNumeral(String roman, int pos, double rightNumeral) {
	    if (pos < 0) return 0;
	    char ch = roman.charAt(pos);
	    double value = Math.floor(Math.pow(10, "IXCM".indexOf(ch))) + 5 * Math.floor(Math.pow(10, "VLD".indexOf(ch)));
	    return value * Math.signum(value + 0.5 - rightNumeral) + evaluateNextRomanNumeral(roman, pos - 1, value);
	}
}

