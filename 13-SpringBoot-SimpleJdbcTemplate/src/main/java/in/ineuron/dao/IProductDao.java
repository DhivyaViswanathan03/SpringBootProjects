package in.ineuron.dao;

import java.util.List;

import in.ineuron.BO.ProductBO;

public interface IProductDao {
	public List<ProductBO> getProductsByName(String name1,String name2);
	public void getProductsById(int id);
}
