// This is the interface for adding two nums.
// But we don't have to create a normal interface 
// it is a remote interface that resides in the local memory of remote 
// machine but has to be invocated through another remote machine

import java.rmi.Remote;

public interface AddI extends Remote { // Inherit Remote class properties
	public int add(int a, int b) throws Exception;
}