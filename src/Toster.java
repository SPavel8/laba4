import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Toster {
        public static void main(String[] args) {

            int count1 = 0;

            Pattern pattern1 = Pattern.compile("\\w+");

            String fileName = "C:\\Users\\User\\Videos\\untitled\\lal.txt";
            BufferedReader in;
            try
            {
                in = new BufferedReader(new FileReader(fileName));
                String s;
                while ((s = in.readLine()) != null) {

                    Matcher matcher1 = pattern1.matcher(s);
                    while (matcher1.find())
                        count1++;

                }
            } catch (IOException e)
            {
                e.printStackTrace();
            }

            System.out.println("Words<4 count: " + count1);
        }
}
