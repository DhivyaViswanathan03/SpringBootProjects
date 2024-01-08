package in.ineuron.dao;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Repository;

import in.ineuron.BO.ProductBO;

@Repository
public class ProductDaoImpl implements IProductDao {
	
	@Autowired
	private DataSource source;

	@Override
	public List<ProductBO> getProductsByName(String name1, String name2) {
		SimpleJdbcCall jdbcCall=new SimpleJdbcCall(source);
		jdbcCall.setProcedureName("GET_PRODUCT_BY_NAME");
		jdbcCall.returningResultSet("products",new BeanPropertyRowMapper<>(ProductBO.class));
		Map<String, Object> map = jdbcCall.execute(Map.of("name1",name1,"name2",name2));
		Object result = map.get("products");
		return (List<ProductBO>) result;
	}

	@Override
	public void getProductsById(int id) {
		SimpleJdbcCall jdbcCall=new SimpleJdbcCall(source);
		jdbcCall.setProcedureName("GET_PRODUCTS_DETAILS_BY_ID");
		Map<String, Object> result = jdbcCall.execute(Map.of("pid",id));
		System.out.println("Product name is:"+result.get("name"));
		System.out.println("Product cost is:"+result.get("cost"));
		System.out.println("Product quantity is:"+result.get("quantity"));
		
	}

}
