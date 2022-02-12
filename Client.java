// This file resides on the client side,
// So we don't have the implementation
// What we do have is the RMI registry
import java.rmi.*;

public class Client {
	public static void main(String[] args) throws Exception {
		// return me the object with caption "ADD" from the registry
		AddI obj = (AddI)Naming.lookup("ADD");
		int sum = obj.add(4, 1);
		System.out.println("result: " + sum);
	}
}