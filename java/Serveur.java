import java.io.*;
import java.net.*;

public class Serveur {
  public static void main(String[] args) throws IOException {
    ServerSocket conn = null;
    Socket comm = null;
    InputStream is = null;

    try {
      conn = new ServerSocket(10080);
      comm = conn.accept();

      is = comm.getInputStream();
      int c;
      while ((c = is.read()) != -1) {
        char ch = (char) c;
        //char data[] = {'a', 'b', 'c'};
        System.out.println(ch.length);

        System.out.println(ch);;
      }
    } catch (Exception e) {
      System.err.println("Exception " + e.toString());
    } finally {
      if (is != null)
        is.close();
      if (comm != null)
        comm.close();
      if (conn != null)
        conn.close();
    }
  }
}