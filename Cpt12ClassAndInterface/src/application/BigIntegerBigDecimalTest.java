package application;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerBigDecimalTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BigInteger a = new BigInteger("9223372036854775807");
		BigInteger b = new BigInteger("2");
		BigInteger c = a.multiply(b);//a*b
		
		System.out.println(c);
		
		BigDecimal x = new BigDecimal(1.0);
		BigDecimal y = new BigDecimal(3);
		//取小數點後20位,並無條件進位
		BigDecimal z = x.divide(y,20,BigDecimal.ROUND_UP);
		
		System.out.println(z);

	}

}
