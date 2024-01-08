package in.ineuron.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.dao.DataAccessException;

import in.ineuron.DTO.StudentDTO;
import in.ineuron.service.IStudentService;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		IStudentService service = context.getBean(IStudentService.class);
		System.out.println(service);

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
		while (true) {
			System.out.println("1.Create");
			System.out.println("2.Read by Id");
			System.out.println("3.Read All Records");
			System.out.println("4.Update");
			System.out.println("5.Delete by Id");
			System.out.println("6.Delete by Bean");
			System.out.println("7.Exit");
			System.out.println("enter your choice:1/2/3/4/5/6/7:");
			String option=null;
			StudentDTO dto=null;
			String id=null;
			String name=null,age=null,address=null;
			
				option = br.readLine();

				switch (option) {
					case "1":
						System.out.println("Enter name:");
						name=br.readLine();
						System.out.println("Enter age:");
						age=br.readLine();
						System.out.println("Enter address:");
						address=br.readLine();
						dto = new StudentDTO();
						dto.setSname(name);
						dto.setSage(Integer.parseInt(age));
						dto.setSaddress(address);
						int rowAffectedGkey = service.insert(dto);
						System.out.println("Gkey of affected row is::" + rowAffectedGkey);
						break;
					case "2":
						System.out.println("Enter Id:");
						id=br.readLine();
						dto=service.getStudent(Integer.parseInt(id));
						if(dto!=null) {
							System.out.println("Record info for given id:"+dto);
						}else {
							System.out.println("Record not available for id :"+id);
						}
						break;
					case "3":
						List<StudentDTO> dtoList=service.getAllStudents();
						dtoList.forEach(System.out::println);
						break;
					case "4":
						System.out.println("Enter Id:");
						id=br.readLine();
						System.out.println("Enter name:");
						name=br.readLine();
						System.out.println("Enter age:");
						age=br.readLine();
						System.out.println("Enter address:");
						address=br.readLine();
						dto = new StudentDTO();
						dto.setSid(Integer.parseInt(id));
						dto.setSname(name);
						dto.setSage(Integer.parseInt(age));
						dto.setSaddress(address);
						service.update(dto);
						break;
					case "5":
						System.out.println("Enter Id:");
						id=br.readLine();
						service.delete(Integer.parseInt(id));
						break;
					case "6":
						break;
					case "7":
						System.out.println("Thanks fo using this app...");
						System.exit(1);
						break;

					default:
						System.out.println("Invalid option plz try again with valid input");
						break;

				}

			} 

		}catch (DataAccessException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			((ConfigurableApplicationContext) context).close();
		}

	}
}
