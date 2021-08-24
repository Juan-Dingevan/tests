public class MiMain {
	public static void main(String[] args) {
		MiClase mc = new MiClase();
		System.out.println(mc.getX());
		System.out.println(mc.getY());
		
		System.out.println("");
		
		MiClase mch = new MiClaseHija();
		System.out.println(mch.getX());
		System.out.println(mch.getY());
	}
	
}
