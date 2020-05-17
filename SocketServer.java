import java.util.Timer;

/**
 *
 * @author Umapada M.
 */

//Main class
public class SchedulerMain {
	public static void main(String args[]) throws InterruptedException {

       try {
		Timer time = new Timer(); // Instantiate Timer Object
		SocketServer server = new SocketServer(8899); // Instantiate SheduledTask class
		time.schedule(server, 0, 120000); // Create Repetitively task for every 1 secs
		//time.schedule(server, 0, 43200000); // Create Repetitively task for every 12 hrs

/*
		//for demo only.
		for (int i = 0; i <= 5; i++) {
			System.out.println("Execution in Main Thread...." + i);
			Thread.sleep(120000);
			if (i == 5) {
				System.out.println("Application Terminates");
				System.exit(0);
			}
		} */

	} catch ( Exception e)
	{
	}

	}
}