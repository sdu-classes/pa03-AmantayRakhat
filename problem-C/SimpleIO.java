import java.util.*;
import java.io.*;
public class SimplelO{
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("f1.txt");
        PrintWriter p=new PrintWriter("f2.txt");
        Scanner scan=new Scanner(file);
        Scanner s = null;
        int q=0;
        while(scan.hasNextLine()){
            String g=scan.nextLine();
            p.println(g);
           s= new Scanner(g);
            while(s.hasNext()){
                String t=s.next().toLowerCase();
            if(t.equals("the"))
                    q++;
            }
            System.out.println(g+"["+q+"]");
            q=0;
        }
        p.close();

    }
}
