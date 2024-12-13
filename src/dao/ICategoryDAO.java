package dao;

import java.sql.SQLException;

import model.Category;

public interface ICategoryDAO {
	Category getCategoryByID(int id) throws SQLException;
}
