import java.io.*;
class prac {
    public static void main(String args[]) {
        try{
            // creating file no1, where we will read the data from 
            PrintWriter writer = new PrintWriter("file_1.txt", "UTF-8");
            writer.println("The first line");
            writer.println("The second line");
            writer.close();
         
            //  creating file no 2, where we will write the data
            FileOutputStream out = new FileOutputStream("file_2.txt");
        }catch(Exception e){
            System.out.println(e) ; 
        }

        FileReader fr = null;
        FileWriter fw = null;
        try {
            fr = new FileReader("file_1.txt");
            fw = new FileWriter("file_2.txt");
            int c = fr.read();
            while(c!=-1) {
                fw.write(c);
                c = fr.read();
            }
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            close(fr);
            close(fw);
        }
    }
    public static void close(Closeable stream) {
        try {
            if (stream != null) {
                stream.close();
            }
        } catch(IOException e) {
            // 
        }
    }
}