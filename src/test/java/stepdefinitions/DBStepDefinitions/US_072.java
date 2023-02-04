package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_072 {
    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir

    @Given("Nese gets the data in the table {string} by connecting to the database")
    public void nese_gets_the_data_in_the_table_by_connecting_to_the_database(String nese) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(nese);
        resultSet = statement.executeQuery(query);
    }
    @Then("Nese verifies LIST that {string} in the list {string}")
    public void nese_verifies_list_that_in_the_list(String email, String expectedEmail) throws SQLException {

        resultSet.absolute(0);
        List<String> resultsEmail = new ArrayList<String>();
        while(resultSet.next()) {
            resultsEmail.add(String.valueOf(resultSet.getNString(email)));

        }

        Assert.assertTrue(resultsEmail.contains(expectedEmail));
    }

}
