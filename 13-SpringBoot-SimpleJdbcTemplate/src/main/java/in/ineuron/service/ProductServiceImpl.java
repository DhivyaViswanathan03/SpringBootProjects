package in.ineuron.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.ProductBO;
import in.ineuron.DTO.ProductDTO;
import in.ineuron.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private IProductDao dao;

	@Override
	public List<ProductDTO> getProductsByName(String name1, String name2) {
		List<ProductBO> boList=dao.getProductsByName(name1, name2);
		List<ProductDTO> dtoList=new ArrayList();
		boList.forEach(bo->{
			ProductDTO dto=new ProductDTO();
			BeanUtils.copyProperties(bo, dto);
			dtoList.add(dto);
		});
		
		return dtoList;
	}

	@Override
	public void getProductsById(int id) {
		dao.getProductsById(id);
	}

}
