package dao;

import model.Sale;
import model.Product;

import java.sql.*;

public class SaleDAO implements ISaleDAO {

    private Connection connection;

    public SaleDAO(Connection connection) {
        this.connection = connection;
    }

    @Override
    public void saveSale(Sale sale) throws SQLException {
        String query = "INSERT INTO sales (product_id, quantity, total_price) VALUES (?, ?, ?)";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, sale.getProduct().getId());
            statement.setInt(2, sale.getQuantity());
            statement.setDouble(3, sale.getTotalPrice());
            statement.executeUpdate();
        }
    }

    @Override
    public Sale getSaleById(int id) throws SQLException {
        String query = "SELECT * FROM sales WHERE id = ?";
        try (PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                return mapSale(resultSet);
            }
        }
        return null;
    }

    private Sale mapSale(ResultSet resultSet) throws SQLException {
        int id = resultSet.getInt("id");
        int productId = resultSet.getInt("product_id");
        int quantity = resultSet.getInt("quantity");
        double totalPrice = resultSet.getDouble("total_price");

        Product product = new ProductDAO(connection).getProductById(productId);

        return new Sale(id, product, quantity);
    }
}
