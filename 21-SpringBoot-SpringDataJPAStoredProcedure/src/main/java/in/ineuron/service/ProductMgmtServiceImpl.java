package in.ineuron.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.ineuron.BO.Product;

@Service
public class ProductMgmtServiceImpl implements IproductMgmtService {
	
	@Autowired
	private EntityManager manager;

	@Override
	public List<Product> getProductdsByname(String prod1, String prod2) {
		System.out.println("EntityManager class is: "+manager.getClass().getName());
		StoredProcedureQuery storedProcedure = manager.createStoredProcedureQuery("GET_PRODUCT_BY_NAME", Product.class);
		storedProcedure.registerStoredProcedureParameter(1, String.class, ParameterMode.IN);
		storedProcedure.registerStoredProcedureParameter(2, String.class, ParameterMode.IN);
		storedProcedure.setParameter(1, prod1);
		storedProcedure.setParameter(2, prod2);
		List<Product> results = storedProcedure.getResultList();
		return results;
	}

}
