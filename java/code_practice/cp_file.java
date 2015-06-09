import java.io.*;

class cp_file{
	public static void main(String[] args) throws Exception{
		try{
			// writing into the old file
			BufferedWriter out1 = new BufferedWriter(new FileWriter("old_text.txt")) ;
			out1.write("Writing to the old file\n") ; 
			out1.close(); 


			FileInputStream in = new FileInputStream("old_text.txt");
			FileOutputStream out = new FileOutputStream("new_text.txt");

			// reading from the old file and copying the contents into the new file
			int rr = in.read() ; 
			while(rr != -1){
				// reading till the end of the file 
				char x = (char)rr;
				out.write(x) ; 
				rr = in.read() ;
			}
			in.close() ; 
			out.close() ; 
			System.out.println("Wrting into the new file is done! \n Displating the contents of the file ::::\n") ; 


			// reading what has been written into the new file_read
			BufferedReader in1 = new BufferedReader(new FileReader("new_text.txt")) ; 
			String str ; 
			while((str = in1.readLine()) != null)
				System.out.println(str) ; 
			in1.close() ; 

		}catch(IOException e){}
	}
}