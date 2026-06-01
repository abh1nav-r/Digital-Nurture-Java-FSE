import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP_Chat {

    public static void main(String[] args) {

        // Run Server Thread
        new Thread(() -> {

            try {

                ServerSocket server =
                new ServerSocket(5000);

                System.out.println(
                    "Server Waiting..."
                );

                Socket socket =
                server.accept();

                BufferedReader input =
                new BufferedReader(

                    new InputStreamReader(
                        socket.getInputStream()
                    )
                );

                PrintWriter output =
                new PrintWriter(
                    socket.getOutputStream(),
                    true
                );

                String message =
                input.readLine();

                System.out.println(
                    "Client: " + message
                );

                output.println(
                    "Hello from Server"
                );

                socket.close();

                server.close();

            } catch (Exception e) {

                System.out.println(e);
            }

        }).start();

        // Run Client Thread
        new Thread(() -> {

            try {

                Thread.sleep(1000);

                Socket socket =
                new Socket(
                    "localhost",
                    5000
                );

                PrintWriter output =
                new PrintWriter(
                    socket.getOutputStream(),
                    true
                );

                BufferedReader input =
                new BufferedReader(

                    new InputStreamReader(
                        socket.getInputStream()
                    )
                );

                output.println(
                    "Hello from Client"
                );

                String reply =
                input.readLine();

                System.out.println(
                    "Server: " + reply
                );

                socket.close();

            } catch (Exception e) {

                System.out.println(e);
            }

        }).start();
    }
}