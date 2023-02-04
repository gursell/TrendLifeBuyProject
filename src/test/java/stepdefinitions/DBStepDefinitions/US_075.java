package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_075 {
    String url="jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username="u480337000_tbl_training_u";
    String password="pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir
    @Given("Talha connects to database with JDBC {string} retrieves data from table")
    public void talha_jdbc_ile_database_ebaglanir_tablosundaki_verileri_alir(String string) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(string);
        resultSet = statement.executeQuery(query);

    }
    @Then("Then  Taha verifies LIST that {string} in the list {string}")
    public void then_taha_verifies_list_that_in_the_list(String brands, String expected) throws SQLException {
        resultSet.absolute(0);
        List<String> resultsBrands = new ArrayList<String>();
        while(resultSet.next()) {
            resultsBrands.add(String.valueOf(resultSet.getNString(brands)));

        }

        Assert.assertTrue(resultsBrands.contains(expected));
    }
    }

