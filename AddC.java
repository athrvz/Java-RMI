// For creation of stub and skeleton we use UnicastRemoteObject
import java.rmi.server.*;

public class AddC extends UnicastRemoteObject implements AddI {
	public AddC() throws Exception {
		super();
	}
	public int add(int a, int b) {
		return (a + b);
	}
}