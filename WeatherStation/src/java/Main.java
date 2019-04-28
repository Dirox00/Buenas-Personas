package main;

import java.util.ArrayList;

public class Main {
  
	private static FileManager fileManager;
	private static URLManager urlManager;
	private static Server server;

	public static void main(String[] args) {	
		System.out.println("Main:");
		startServer();
	}

	private static void startServer () {
		server = new Server(9090);
		server.start();
	}

	private static void stopServer () {
		if (server.isRunning()) {
			server.stop();
		} else {
			System.out.println("Server is not running:");
		}
	}

}
