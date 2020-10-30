package packnew;

import com.sun.net.httpserver.*;

import java.io.*;
import java.net.InetSocketAddress;
import java.util.ArrayList;


public class Newclass {
    public static void main(String[] args) throws Exception {


        HttpServer server = HttpServer.create();
        server.bind(new InetSocketAddress(4446), 0);
        server.createContext("/", new Newclass.EchoHandler());
        server.createContext("/ggg", new Newclass.EchoHandler2());
        server.setExecutor(null);
        server.start();

    }


    static class EchoHandler implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            InputStream strim;
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> headers.add(o.toString()));

            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header =" + o));

            String status = "I am oll right";

            /*
            Проверяем заголовки зщапроса, если в заголовках есть. что это апликатион джейсон
             */
            for (String a : headers) {
                if (a.contains("BeBest")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "I doooooooooooooooo!!!!!!!!!!";

                }
            }


            builder.append(status);

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();

            os.write(bytes);
            os.close();
            exchange.close();

        }
    }



    static class EchoHandler2 implements HttpHandler {

        @Override
        public void handle(HttpExchange exchange) throws IOException {

            StringBuilder builder = new StringBuilder();
            InputStream strim;
            ArrayList<String> headers = new ArrayList<>();
            exchange.getRequestHeaders().values().forEach(o -> headers.add(o.toString()));

            exchange.getRequestHeaders().values().forEach(o -> System.out.println("header =" + o));

            String status = "fghjkl";

            /*
            Проверяем заголовки зщапроса, если в заголовках есть. что это апликатион джейсон
             */
            for (String a : headers) {
                if (a.contains("BeBest")) {

                    strim = exchange.getRequestBody();
                    BufferedReader in = new BufferedReader(new InputStreamReader(strim, "UTF-8"));
                    String line = in.readLine();
                    System.out.println("line=" + line);
                    status = "I doooooooooooooooo!!!!!!!!!!";

                }
            }


            builder.append(status);

            byte[] bytes = builder.toString().getBytes();
            exchange.sendResponseHeaders(200, bytes.length);

            OutputStream os = exchange.getResponseBody();

            os.write(bytes);
            os.close();
            exchange.close();

        }
    }
}
