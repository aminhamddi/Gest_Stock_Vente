package dao;

import java.sql.SQLException;

import model.Category;

public interface ICategoryDAO {
	Category getCategoryById(int id) throws SQLException;
}
