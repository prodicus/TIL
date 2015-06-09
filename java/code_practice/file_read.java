import java.io.*;

class file_read{
	public static void main(String[] args) {
		BufferedReader in ; 
		try{
			in = new BufferedReader(new FileReader("old_text.txt"));
			String str ;

			while((str = in.readLine()) != null){
				System.out.println(str) ; 
			}
		}catch(IOException e){}
	}
}