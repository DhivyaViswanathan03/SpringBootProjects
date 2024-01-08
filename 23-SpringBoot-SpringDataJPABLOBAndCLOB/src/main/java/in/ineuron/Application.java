package in.ineuron;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.io.Writer;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.ineuron.BO.MarriageSeeker;
import in.ineuron.service.IMarriageSeekerService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		
		IMarriageSeekerService service = context.getBean(IMarriageSeekerService.class);
		Scanner input=new Scanner(System.in);
//		System.out.println("Enter the name");
//		String name=input.next();
//		System.out.println("Enter the address");
//		String address=input.next();
//		System.out.println("Enter the photo path");
//		String photoPath=input.next();
//		System.out.println("Enter the bio data path");
//		String bioDataPath=input.next();
//		
//		byte[] photoData=null;
//		char[] bioData=null;
//		
//		try {
//			InputStream inputStream=new FileInputStream(photoPath);
//			photoData=new byte[inputStream.available()];
//			inputStream.read(photoData);
//			
//			File f=new File(bioDataPath);
//			Reader rs=new FileReader(f);
//			bioData=new char[(int) f.length()];
//			rs.read(bioData);
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		MarriageSeeker seeker=new MarriageSeeker(name, address, photoData, bioData, LocalDateTime.of(1993, 06, 30, 10, 12));
//		System.out.println(service.registerMarriageSeeker(seeker));
		
		System.out.println("Enter the ID to search");
		int id=input.nextInt();
		
		Optional<MarriageSeeker> result = service.searchSeekerById(id);
		if(result.isPresent()) {
			MarriageSeeker seeker = result.get();
			System.out.println(seeker.getPid()+" "+seeker.getPname()+" "+seeker.getPaddress()+" "+seeker.getDob());
			try {
				FileOutputStream os=new FileOutputStream("divsImage.JPG");
				os.write(seeker.getPhoto());
				os.flush();
				
				Writer fw=new FileWriter("divsData.txt");
				fw.write(seeker.getBiodata());
				fw.flush();
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else {
			System.out.println("Record not found for given id: "+id);
		}
		context.close();
	}

}
