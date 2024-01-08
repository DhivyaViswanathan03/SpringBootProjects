package in.ineuron;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.ineuron.service.EmployeeServiceImpl;

/**
 * Hello world!
 *
 */
public class JdbcTemplateApp 
{
	static {
		System.out.println("JdbcTemplateApp is loading..");
	}
	
	
    public static void main( String[] args )
    {
    	
    	ApplicationContext context = new ClassPathXmlApplicationContext("in/ineuron/cfg/ApplicationContext.xml");
    	EmployeeServiceImpl bean = context.getBean(EmployeeServiceImpl.class);
    	System.out.println(bean);
    	
    	try {
			int recordCount=bean.fetchEmployeeCount();
			System.out.println(recordCount);
			
			String name=bean.getEmployeeByno(3);
			System.out.println(name);
			
			System.out.println(bean.getEmployeeDetailsByNo(5));
			System.out.println(bean.getEmployeeBYDesg("clerk", "manager"));
			
			System.out.println("No of rows inserted is::"+bean.insertEmployee("sumathi", 40, 102, 16, "clerk"));
			System.out.println("No of rows updated is::"+bean.updateEmployee("clerk", 5));
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
