import java.io.IOException;
import java.net.URI;

class Handler implements URLHandler {
    // Add on strings as the user inputs the string
    int num = 0;
    String newString;

    public String handleRequest(URI url) {
        if (url.getPath().equals("/")) {
            return String.format("%d. %s", num, newString);
        } 
        else {
            if (url.getPath().contains("/add-message")) {
                String[] parameters = url.getQuery().split("=");
                if (parameters[0].equals("s")) {
                    num += 1;
                    return String.format("%d. %s", num, newString);
                }
            }
            return "404 Not Found!";
        }
    }
}

/add-message?s=<string>
