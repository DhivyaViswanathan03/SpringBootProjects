package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.StudentBO;
import in.ineuron.DTO.StudentDTO;
import in.ineuron.dao.IStudentDao;

@Service
@Transactional
public class StudentServiceImpl implements IStudentService {

	@Autowired
	private IStudentDao dao;

	@Override
	public int insert(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);

		return dao.insert(bo);
	}

	@Override
	public void delete(int id) {
		dao.delete(id);
	}

	@Override
	public void delete(StudentDTO s) {

	}

	@Override
	public void update(StudentDTO dto) {
		StudentBO bo = new StudentBO();
		BeanUtils.copyProperties(dto, bo);
		dao.update(bo);
	}

	@Override
	public StudentDTO getStudent(int id) {
		StudentBO bo = dao.getStudent(id);
		StudentDTO dto = null;
		if (bo != null) {
			dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
		}

		return dto;
	}

	@Override
	public List<StudentDTO> getAllStudents() {
		List<StudentBO> boList = dao.getAllStudents();
		List<StudentDTO> dtoList = new ArrayList();
		boList.forEach(bo -> {
			StudentDTO dto = new StudentDTO();
			BeanUtils.copyProperties(bo, dto);
			dtoList.add(dto);
		});
		return dtoList;
	}

	@Override
	public String toString() {
		return "StudentServiceImpl [dao=" + dao + "]";
	}

}
