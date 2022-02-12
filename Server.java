import java.rmi.*;

public class Server {
	public static void main(String [] args) throws Exception {
		// To implement the class we need the objects 
		AddC obj = new AddC();
		// We register the object 'obj' using rebind fucntion
		Naming.rebind("ADD", obj); // rebind("<caption>", <classObject>)
		System.out.println("Server initiated...");
	}
}

