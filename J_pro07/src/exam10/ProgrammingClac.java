package exam10;

public class ProgrammingClac extends Calculator implements Programmer {

	@Override
	public String bianary(int n1) {
		String b = "";
		while (n1 > 1) {
			b = n1 % 2 + b;
			n1 /= 2;
		}
		return n1 + b;
	}

	@Override
	public String octal(int n1) {
		String o = "";
		while (n1 > 1) {
			o = n1 % 8 + o;
			n1 /= 8;
		}
		return n1 + o;
	}

	@Override
	public String Hexa(int n1) {
		String h = "";
		while (n1 > 1) {
			int x = n1 % 16;
			if (x >= 10) {
				h = ((char)x + 55) + h;
			} else {
				h = x + h;
			}
			n1 /= 16;
		}
		return (n1 > 10 ? hexCode(n1) : n1) +h;
	}
	
	private char hexCode(int n1) {
		return (char)(n1 + 55);
	}

}
