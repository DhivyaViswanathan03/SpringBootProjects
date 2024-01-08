package in.ineuron.service;

import java.util.List;

import in.ineuron.DTO.ProductDTO;

public interface IProductService {
	
	public List<ProductDTO> getProductsByName(String name1,String name2);
	public void getProductsById(int i);

}
