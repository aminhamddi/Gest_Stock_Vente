package dao;

import java.sql.SQLException;

import model.Sale;

public interface ISaleDAO {
	void saveSale(Sale sale) throws SQLException;
	Sale getSaleById(int id) throws SQLException;
}
