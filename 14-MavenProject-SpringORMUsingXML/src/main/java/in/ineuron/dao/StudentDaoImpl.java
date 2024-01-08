package in.ineuron.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import in.ineuron.BO.StudentBO;

@Repository
@Transactional
public class StudentDaoImpl implements IStudentDao {

	@Autowired
	private HibernateTemplate template;

	@Override
	public int insert(StudentBO bo) {
		int rowAffectedGkey = (int) template.save(bo);
		return rowAffectedGkey;
	}

	@Override
	public void delete(int id) {
		StudentBO bo = template.get(StudentBO.class, id);
		if (bo != null) {
			template.delete(bo);
			System.out.println("Record deleted successfully");
		} else {
			System.out.println("Record deletion failed..");
		}
	}

	@Override
	public void delete(StudentBO s) {

	}

	@Override
	public void update(StudentBO bo) {
		StudentBO stdBo=getStudent(bo.getSid());
		stdBo.setSname("Priya");
        template.update(stdBo);
	}

	@Override
	public StudentBO getStudent(int id) {
		StudentBO bo = template.get(StudentBO.class, id);
		return bo;
	}

	@Override
	public List<StudentBO> getAllStudents() {
		return template.loadAll(StudentBO.class);
	}

	@Override
	public String toString() {
		return "StudentDaoImpl [template=" + template + "]";
	}

}
