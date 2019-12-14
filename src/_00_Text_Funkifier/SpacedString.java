package _00_Text_Funkifier;

public class SpacedString extends SpecialString {

	public SpacedString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s) {
		String n = new String();
		for(int i = 0; i < s.length(); i++) {
				n = n + s.charAt(i) + " ";
		}
		return n;
	}

}
