import java.util.Random;

public class MyRandom extends Random{

	private Random r;
	private int i;
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int makeRandomInt() {
		r = new Random();
		i = (int) r.nextInt(6);
		return i+1;
	}

	private String getToStringRandomNumber(int number) {
		String rndm = Integer.toString(number);
		return rndm;
	}
	
	public String giveMeRandomNumberWhoIsString() {
		return getToStringRandomNumber(makeRandomInt());
	}

}
