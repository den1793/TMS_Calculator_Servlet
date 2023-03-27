package storage;

import entity.Operation;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Denis Smirnov
 */
public class JDBCOperationStorage implements OperationStorage {
    private static final String DATABASE_USER = "postgres";
    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/postgres";
    private static final String DATABASE_PASSWORD = "admin";
    private static final String INSERT_OPERATION = "insert into operation(num1, num2, type, result) values (?, ?, ?, ?)";
    private static final String SELECT_ALL_OPERATION = "select * from operation";

    private final Connection connection;

    public JDBCOperationStorage() {
        try {
            this.connection = DriverManager.getConnection(DATABASE_URL, DATABASE_USER, DATABASE_PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void save(Operation operation) throws IOException {
        PreparedStatement preparedStatement = null;
        try {
            preparedStatement = connection.prepareStatement(INSERT_OPERATION);
            preparedStatement.setDouble(1, operation.getNum1());
            preparedStatement.setDouble(2, operation.getNum2());
            preparedStatement.setString(3, String.valueOf(operation.getType()));
            preparedStatement.setDouble(4, operation.getResult());
            preparedStatement.execute();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Operation> findAll() throws IOException {
        Statement statement = null;
        try {
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(SELECT_ALL_OPERATION);
            List<Operation> operationList = new ArrayList<>();
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                double num1 = resultSet.getDouble(2);
                double num2 = resultSet.getDouble(3);
                String type = resultSet.getString(4);
                double result = resultSet.getDouble(5);
                Operation operation = new Operation(id, num1, num2, type, result);
                operationList.add(operation);
            }
            return operationList;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}
