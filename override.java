/*Monty Oliver
05.11.22
*/
//Constructor
class A{
	int i, j;
	A(int a, int b){
		i = a;
		j = b;
	}
	void show(){}
}
class B extends A{
	int k;
	B(int a, int b, int c){
		super(a, b);
		k = c;
	}
	void show(){
		System.out.println("Value a: "+super.i);
		System.out.println("Value b: "+super.j);
		System.out.println("Value k: "+k);
	}
}

public class override
{
	public static void main(String args[]) {
		System.out.println("Override");
		B SubOb = new B(1, 2, 3);
		SubOb.show();
	}
}