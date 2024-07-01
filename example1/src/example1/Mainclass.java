package example1;
public class Mainclass{
	
	public Mainclass(Cpu obj, String memory, String harddrive) {
		System.out.println(obj.getCpu());
		System.out.println(memory);
		System.out.println(harddrive);
	}
	public static void main(String[] args) {
		Mainclass obj1 = new Mainclass(new Intel(), "16GB", "256GB");
		System.out.println("--------------------------------------");
		Mainclass obj2 = new Mainclass(new Ryzen(), "8GB", "128GB");
	}
}
