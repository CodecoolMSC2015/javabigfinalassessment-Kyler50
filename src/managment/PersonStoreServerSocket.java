package managment;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class PersonStoreServerSocket {
	static FileOutputStream fos;
	static ObjectOutputStream oos;

	public void ObjectServer() {
		Object mode = null;
		System.out.printf("Startig server.\nDefault server mode: " + mode.toString() + "\n");
		try {
			System.out.println("Server started");
			ServerSocket serversocket = new ServerSocket(7720);
			System.out.println("Waiting...");
			Socket server = serversocket.accept();
			System.out.println("Client cnx accepted");
			ObjectOutputStream streamToClient = new ObjectOutputStream(server.getOutputStream());
			while (true) {

			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
