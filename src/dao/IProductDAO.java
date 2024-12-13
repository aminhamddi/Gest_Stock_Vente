package dao;

import java.sql.SQLException;
import java.util.List;

import model.Product;

public interface IProductDAO {
	void saveProduct(Product product) throws SQLException;
	Product getProductById(int id) throws SQLException;
	List<Product> getAllProducts() throws SQLException;
	void updateProduct(Product product) throws SQLException;
	void deleteProduct(int id) throws SQLException;
}
