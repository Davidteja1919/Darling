package genericUtilities;

import java.util.Random;

public class JavaUtility {
	public int getrandomNum() {
		Random r=new Random();
		return r.nextInt(100);
	}
}
