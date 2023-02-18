import java.io.*;
import java.util.Scanner;

public class ReadFile{
    public static String[] readFile(String filename) throws FileNotFoundException{
        File file=new File(filename);
        Scanner scan=new Scanner(file);
        String[] lines=new String[1000];
        int lineCounter=0;
        while(scan.hasNextLine()){
            String line=scan.nextLine();
            lines[lineCounter]=line;
            lineCounter++;
        }
        return lines;
    }
    public static void main(String[] args){

        try {
            String[] contents = readFile("input.txt");
            for(String line:contents){
                if(line==null) break;
                System.out.println(line);}
        }catch(FileNotFoundException e){
            System.out.println("The file does not exist");
        }

    }
}
