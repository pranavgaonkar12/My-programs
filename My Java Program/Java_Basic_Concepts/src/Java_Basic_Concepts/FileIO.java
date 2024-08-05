package Java_Basic_Concepts;
import java.io.*;

public class FileIO {

		public static void main(String[] args) {
			
			String[] name= {"John","Carly"};
			try {
			BufferedWriter writer=new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Writing to a file");
			
			for(String names:name) {
				writer.write("\n"+names);
			}
			writer.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			try {
				BufferedReader reader=new BufferedReader(new FileReader("input.txt"));
				String line;
				while((line=reader.readLine())!=null) {
					System.out.println(line);
				}
				System.out.println(reader.readLine());
				reader.close();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
}
