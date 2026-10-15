import java.io.*;
import java.net.Socket;

public class ByteSocketProgramming {
    public static void main(String[] args) {

        try {
            Socket urlInfo=new Socket("localhost",8080);
            OutputStream os=urlInfo.getOutputStream();
            String Message="I am sent from a java Program";
            byte[] dataMessage=Message.getBytes();

            String path = "/hello";
            String httpRequest =
                    "GET " + path + " HTTP/1.1\r\n" +
                            "Host: localhost:8080\r\n" +
                            "Connection: close\r\n" +
                            "\r\n";


            os.write(dataMessage);
            showResponse(urlInfo);
            os.flush();

            System.out.println("--------------------------------------------------------");
            urlInfo=new Socket("localhost",8080);
            os=urlInfo.getOutputStream();
            os.write(httpRequest.getBytes());
            showResponse(urlInfo);
            System.out.println("--------------------------------------------------------");




        } catch (IOException e) {
            System.out.println("Some error Happened "+e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public static void  showResponse(Socket os) throws IOException {
        InputStream is = null;
        try {
            is = os.getInputStream();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
