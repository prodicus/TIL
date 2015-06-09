import java.io.*;

class console_ip{
	public static void main(String[] args) {
		try{
			char c;
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

			FileOutputStream out = new FileOutputStream("new_text.txt");
			System.out.println("Enter (. to quit)"); 
			do{
				c = (char)in.read();
				out.write(c) ; 
			}while(c != '.');
			in.close();
			out.close();

			System.out.println("Reading the contents of the file now : ");

			BufferedReader in1 = new BufferedReader(new FileReader("new_text.txt"));
			String str ; 
			while((str = in1.readLine()) != null)
				System.out.print(str) ; 

			in1.close();

			System.out.println();
		}catch(IOException e){}
	}
}