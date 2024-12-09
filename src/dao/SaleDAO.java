package dao;

import model.Sale;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SaleDAO extends AbstractDAO {

    public void addSale(Sale sale) throws SQLException {
        String sql = "INSERT INTO sales (product_id, quantity, total_price) VALUES (?, ?, ?)";
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, sale.getProductId());
            stmt.setInt(2, sale.getQuantity());
            stmt.setDouble(3, sale.getTotalPrice());
            stmt.executeUpdate();
        }
    }

    public List<Sale> getAllSales() throws SQLException {
        String sql = "SELECT * FROM sales";
        List<Sale> sales = new ArrayList<>();
        try (Connection conn = getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                sales.add(new Sale(
                        rs.getInt("id"),
                        rs.getInt("product_id"),
                        rs.getInt("quantity"),
                        rs.getDouble("total_price"),
                        rs.getTimestamp("sale_date")
                ));
            }
        }
        return sales;
    }
}
