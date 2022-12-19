package shape2d;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class User {

    public User() {
        try {
            URLConnection connect
                    = new URL("https://jsonplaceholder.typicode.com/users").openConnection();
            System.out.println(connect.getContentType());

            InputStream is = connect.getInputStream();
            InputStreamReader inputsr = new InputStreamReader(is);

            BufferedReader in = new BufferedReader(inputsr);
            String data;
            StringBuffer response = new StringBuffer();

            while ((data = in.readLine()) != null) {
                response.append(data);
            }
            System.out.println(response.toString());
            in.close();

        } catch (IOException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
