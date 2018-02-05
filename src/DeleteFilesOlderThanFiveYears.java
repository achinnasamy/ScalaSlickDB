import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * Created by dharshekthvel on 8/1/18.
 */
public class DeleteFilesOlderThanFiveYears {


    public static void main(String args[]) {

        try {
            Process output = Runtime.getRuntime().exec("/home/dharshekthvel/ac/bin/hadoop3/bin/hadoop fs -ls /");

            InputStream in = output.getInputStream();

            BufferedReader stdInput = new BufferedReader(new InputStreamReader(in));

            String eachLine = "";

            while ((eachLine = stdInput.readLine()) != null) {
                String[] dataColumns = eachLine.split("  ");

                System.out.println(dataColumns[0]);
            }


        }
        catch (IOException exception) {

        }
    }
}
