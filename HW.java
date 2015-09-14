public class HW{
	
	static final String name = "Program that says \"Hello\"";
	
	static void introduce(){
		System.out.println("I'm a " + HW.name);
	}
	
	static int gcd(int a, int b){
		if(a==0) return (b==0?1:b);
		while(b!=0){
			int z = a%b;
			a = b;
			b = z;
		}
		return a;
	}
	
	public static void main(String ... args){
		System.out.println("Hello World!");
		introduce();
		System.out.println("Also, i can canculate GCD");
		System.out.println("Like gcd(12,54) = " + gcd(12,54));
	}
}