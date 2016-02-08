import java.io.*;

class file_write{
	public static void main(String[] args) {
		BufferedWriter out ;
		try{
			out = new BufferedWriter(new FileWriter("old_text.txt"));
			out.write("\nWanna know more ! \n");
			out.close();
		}catch(IOException e){}
	}
}
