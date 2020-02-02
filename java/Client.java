import java.io.*;
import java.net.*;
import java.util.*;

public class Client {
  public static void main(String[] args) throws IOException {
    Socket comm = null;
    InputStream is = null;

    try {
      comm = new Socket("localhost", 10080);

      Scanner sc = new Scanner(System.in);
      System.out.println("Réponse :");
      String str = sc.nextLine();

      comm.getOutputStream().write((str + "\n\n").getBytes());
      is = comm.getInputStream();
      int c;
      while ((c = is.read()) != -1)
        System.out.write(c);
    } catch (Exception e) {
      System.err.println("Exception " + e.toString());
    } finally {
      if (is != null)
        is.close();
      if (comm != null)
        comm.close();
    }
  }
}