package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;

public class US_077 {
    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir
    @Given("Emine gets the data in the table {string} by connecting to the database")
    public void emine_gets_the_data_in_the_table_by_connecting_to_the_database(String emine) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query =emine;
        resultSet = statement.executeQuery(query);
    }

    @Then("Emine verifies LIST that {string} {string}  in the list {string} {string}")
    public void emineVerifiesLISTThatInTheList(String name, String phonecode, String expectedname, String expectedphone) throws SQLException {

        resultSet.first();
        Assert.assertEquals(expectedname,resultSet.getNString(name));
        resultSet.first();
       // Assert.assertEquals(expectedphone,(String.valueOf(resultSet.getInt(phonecode))));
        Assert.assertEquals(expectedphone,resultSet.getNString(phonecode));
        System.out.println(expectedname+expectedphone);
    }
}
