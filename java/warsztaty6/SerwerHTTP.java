import java.io.*;
import java.net.*;
import java.lang.String;

public class SerwerHTTP {
   public static void main(String[] args) throws IOException {
      ServerSocket serv = new ServerSocket(80);
      // tworzenie buforu

      while (true) {
         // przyjecie polaczenia
         System.out.println("Oczekiwanie na polaczenie...");
         Socket sock = serv.accept();

         // strumienie danych
         InputStream is = sock.getInputStream();
         OutputStream os = sock.getOutputStream();
         BufferedReader inp = new BufferedReader(new InputStreamReader(is));
         DataOutputStream outp = new DataOutputStream(os);

         // przyjecie zadania (request)
         String request = inp.readLine();
         // System.out.println(request);
         String[] s = request.split(" ");
         String nazwa = s[1].substring(1);
         System.out.println(nazwa);
         FileInputStream fis = new FileInputStream(nazwa);

         try {
            FileInputStream fi = new FileInputStream(nazwa);
         } catch (FileNotFoundException e) {
            outp.writeBytes("HTTP/1.0 404 Not Found\r\n");
         }
         // byte[] bufor;
         // bufor = new byte[1024];
         // int n = 0;

         // while ((n = fis.read(bufor)) != -1) {
         // outp.write(bufor, 0, n);
         // }

         // wyslanie odpowiedzi (response)
         if (request.startsWith("GET")) {
            // response header
            outp.writeBytes("HTTP/1.0 200 OK\r\n");
            outp.writeBytes("Content-Type: text/html\r\n");
            outp.writeBytes("Content-Length: \r\n");
            outp.writeBytes("\r\n");

            // response body
            outp.writeBytes("<html>\r\n");
            outp.writeBytes("<H1>Strona testowa</H1>\r\n");
            outp.writeBytes("</html>\r\n");
         } else {
            outp.writeBytes("HTTP/1.1 501 Not supported.\r\n");
         }

         // zamykanie strumieni
         fis.close();
         inp.close();
         outp.close();
         sock.close();
      }
   }
}