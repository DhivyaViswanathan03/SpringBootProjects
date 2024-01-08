package in.ineuron.repo;

import org.springframework.data.repository.CrudRepository;

import in.ineuron.BO.Employee;

public interface IEmployeeDao extends CrudRepository<Employee, Integer> {

}
