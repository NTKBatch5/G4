package team.g4;

public class DemoG4 {

	private String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		System.out.println("Test");
//		System.out.println("Now this is my first test...");

		System.out.println(myName("Fiodor")); // you misses a closed parentheses

//		Can someone in the team fix this problem?

		System.out.println("Bashira......Test");//		Can someone in the team fix this problem?

		System.out.println("Bashira......Test");

	}

	public static String myName(String str) {

		// test pull & push
		String name = "Sonya";
		System.out.println(name);

		return str;

		// Test cloning -- Fernando
		
				// test pull & push
		String name = "Sonya";
		System.out.println(name);

		return str;

		// Test cloning -- Fernando
	}
	// Test (B)

	public static void lastName(String st) {
		System.out.println("Poya");

	}
	public static void firstName(String fname) {
		System.out.println("Luis Miguel..");
	}
}
