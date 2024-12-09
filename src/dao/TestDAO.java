package dao;

import dao.UserDAO;
import model.User;

public class TestDAO {
    public static void main(String[] args) {
        UserDAO userDAO = new UserDAO();
        try {
            // Ajouter un utilisateur
            User user = new User(0, "admin", "password123", "ADMIN");
            userDAO.addUser(user);

            // Afficher les utilisateurs
            userDAO.getAllUsers().forEach(u -> 
                System.out.println(u.getUsername() + " - " + u.getRole())
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
