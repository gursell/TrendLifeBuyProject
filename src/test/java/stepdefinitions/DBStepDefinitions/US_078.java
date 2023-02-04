package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_078 {
    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir


    @Given("Yakup gets the data in the table {string} by connecting to the database")
    public void yakup_gets_the_data_in_the_table_by_connecting_to_the_database(String string) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(string);
        resultSet = statement.executeQuery(query);
    }
    @Then("Then  The user verifies that {string} in the list {string}")
    public void then_the_user_verifies_that_in_the_list(String name, String expected) throws SQLException {
        resultSet.absolute(0);
        List<String> resultsId = new ArrayList<String>();
        while(resultSet.next()) {
            resultsId.add(resultSet.getNString(name));

        }
        Assert.assertTrue(resultsId.contains(expected));
    }

}
