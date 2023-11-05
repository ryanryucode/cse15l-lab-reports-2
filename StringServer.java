import java.util.*;
import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    int num = 0;
    ArrayList<String> number = new ArrayList<String> ();
    string output = "";

    public String handleRequest(URI url) {
        if (url.getPath().equals("/add-messages")) {
            String [] parameters = url.getQuery().split("=");
            if (parameters[0].equals("s")){
                number.add(parameters[1]);
                num++;
                output+=String.format(String.valueOf(index) + "." + number.get(num-1) + "\n");
                return output;
        } 
        }
            return "404 not found!";
        
        }
    }
class StringServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
