
import java.io.*;

public class BufferDemo {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String name;
		System.out.println("Enter the name: ");
		name = br.readLine();
		int age;
		System.out.println("Enter the age: ");
		age = Integer.parseInt(br.readLine());
		float avg;
		System.out.println("Enter the average: ");
		avg = Float.parseFloat(br.readLine());
		System.out.println("Name:"+name+" age:"+age+"Sabthaguru avg:"+avg);
	}

}
