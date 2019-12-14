package _00_Text_Funkifier;

public class BackwardsString extends SpecialString {

	public BackwardsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String n = new String();
		for(int i = s.length()-1; i > -1; i--) {
			n = n + s.charAt(i);
		}
		return n;
	}

}
