package org.practiceDSA.Collection.map;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

public class MapToDatabase {

        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("Apple", 1);
            map.put("Banana", 2);
            map.put("Cherry", 3);

            String url = "jdbc:mysql://localhost:3306/test_db";
            String user = "root";
            String password = "root";

            try (Connection connection = DriverManager.getConnection(url, user, password)) {
                String sql = "INSERT INTO KeyValueStore (map_key, map_value) VALUES (?, ?)";
                try (PreparedStatement statement = connection.prepareStatement(sql)) {
                    for (Map.Entry<String, Integer> entry : map.entrySet()) {
                        statement.setString(1, entry.getKey());
                        statement.setInt(2, entry.getValue());
                        statement.executeUpdate();
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
