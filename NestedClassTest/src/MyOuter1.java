
public class MyOuter1 {
	
	private int x = 1;
	private static int y = 2;
	
	public void f(){
		MyNested1 b = new MyNested1();
		System.out.println("b.x=" + b.x + ",  + b.y = " + b.y);
		b.f();
	}
	
	public void g(){}
	
	public static void h(){}
	
	public static class MyNested1{
		private int x = 10;
		private static int y = 20;
		
		public void f(){
			System.out.println("x=" +x);
			System.out.println("y=" + y);
			System.out.println("MyOuter1.y = " + MyOuter1.y);
			h();
			
		}
		
		
	}
	
	public static void main(String[] args){
		MyOuter1 a1 = new MyOuter1();
		a1.f();
		MyOuter1.MyNested1 b1 = new MyOuter1.MyNested1();
	}
}
