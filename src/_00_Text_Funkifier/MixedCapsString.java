package _00_Text_Funkifier;

public class MixedCapsString extends SpecialString{

	public MixedCapsString(String s) {
		super(s);
	}

	@Override
	public String funkifyText(String s) {
		String n = new String();
		for(int i = 0; i < s.length(); i++) {
			if(i % 2 == 0) {
				char lower = Character.toLowerCase(s.charAt(i));
				n = n + lower;
			} else {
				char upper = Character.toUpperCase(s.charAt(i));
				n = n + upper;
			}
		}
		return n;
	}

}
