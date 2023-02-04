package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;

public class US_076 {
    String url="jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username="u480337000_tbl_training_u";
    String password="pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    int resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir

    ResultSet resultSetiki;



    @Given("Zeynep connects to the database with JDBC and add to the {string} to the carts")
public void zeynep_jdbc_ile_database_ebaglanir_tablosundaki_verileri_alir(String string) throws SQLException {

        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(string);
        resultSet = statement.executeUpdate(query);
}


    @Given("Zeynep gets the data in the table {string} by connecting to the database")
    public void zeynepJDBCIleDatabaseEbaglanirTablosundakiVerileriAlir(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(arg0);
        resultSetiki=statement.executeQuery(query);
    }
    @Then("Zeynep verifies LIST that {string} in the list {string}")
    public void zeynep_taha_verifies_list_that_in_the_list(String id, String expected) throws SQLException {
       resultSetiki.first();
        System.out.println(resultSetiki.getInt(id));
        Assert.assertEquals(expected,(String.valueOf(resultSetiki.getInt(id))));

    }
}
