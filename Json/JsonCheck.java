
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;


public class JsonCheck {

    public static void main(String[] args) throws IOException {
URL u=new URL ("https://www.w3schools.com/java/java_intro.asp");//("https://jsonplaceholder.typicode.com/users");
        HttpURLConnection hr=( HttpURLConnection) u.openConnection();
        if(hr.getResponseCode()==200){
            InputStream im=hr.getInputStream();
            StringBuffer sb=new StringBuffer();
            InputStreamReader isr=new InputStreamReader(im);
            BufferedReader br=new BufferedReader(isr);

            String l=br.readLine();

            while(l!=null){
                System.out.println(l);
                l=br.readLine();
            }
        }
    }


}