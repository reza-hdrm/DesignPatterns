package com.rezahdrm.creational.singleton;

import org.junit.Assert;
import org.junit.Test;

import java.sql.*;

import static org.junit.Assert.*;

public class DBConnectionTest {

    @Test
    public void hashCodeTest() {
        DBConnection dbConnection1 = DBConnection.getDBConnection();
        DBConnection dbConnection2 = DBConnection.getDBConnection();
        Assert.assertEquals(dbConnection1, dbConnection2);
    }

    @Test
    public void performanceTest() {
        long time = System.currentTimeMillis();
        DBConnection.getDBConnection();
        long creationTime = System.currentTimeMillis() - time;
        System.out.println(creationTime);
        Assert.assertTrue(creationTime > 0);

        DBConnection.getDBConnection();
        time = System.currentTimeMillis();
        creationTime = System.currentTimeMillis() - time;
        Assert.assertTrue(creationTime == 0);
        System.out.println(creationTime);
    }

    @Test
    public void DBH2Test() {
        DBConnection h2DBConnection = DBConnection.getDBConnection();
        Connection connection = h2DBConnection.getConnection();
        try (Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE PERSON(fullName VARCHAR(31))");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String insetQuery = "INSERT INTO PERSON (fullname) VALUES(?)";
        try (final PreparedStatement preparedStatement = connection.prepareStatement(insetQuery)) {
            preparedStatement.setString(1, "Reza Heydari Mehr");
            preparedStatement.executeUpdate();
            preparedStatement.setString(1, "Erfan Kargosha");
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        String selectQuery = "SELECT count(*) from PERSON";
        try (Statement statement = connection.createStatement()) {
            try (final ResultSet resultSet = statement.executeQuery(selectQuery)) {
                if (resultSet.next()) {
                    System.out.println("The count is: " + resultSet.getInt(1));
                    Assert.assertEquals(resultSet.getInt(1), 2);
                }
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}