
package application;

public class WrappedClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("max:"+Integer.MAX_VALUE+",");
		System.out.print("min:"+Integer.MIN_VALUE+",");
		
		System.out.println();
		System.out.print(new Integer(10).compareTo(new Integer(11))+",");
		System.out.print(new Integer(10).compareTo(new Integer(10))+",");
		System.out.print(new Integer(10).compareTo(new Integer(9))+",");
		System.out.println();
		//二進位所代表的數是多少
		System.out.print(Integer.parseInt("11111",2)+",");
		//八進位
		System.out.print(Integer.parseInt("11",8)+",");
		//十進位
		System.out.print(Integer.parseInt("13",10)+",");
		//十六進位
		System.out.print(Integer.parseInt("1A",16)+",");
	}

}
