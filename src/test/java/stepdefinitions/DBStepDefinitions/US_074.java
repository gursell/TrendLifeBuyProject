package stepdefinitions.DBStepDefinitions;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.US022_023_024_053_Page;
import utilities.ConfigReader;

import java.sql.*;
import java.util.*;

public class US_074 {

    String url="jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username="u480337000_tbl_training_u";
    String password="pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir


    @Given("AdminN gets datas from in the table {string} by connecting to the database")
    public void adminnGetsDatasFromInTheTableByConnectingToTheDatabase(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query =arg0;
        resultSet = statement.executeQuery(query);
    }



    @And("User verifies {string} {string} {string} {string} {string} {string} {string} {string} {string}from data base")
    public void userVerifiesFromDataBase(String id, String firstname, String lastname, String email, String role_id, String fnA, String lnA, String emA, String rlA) throws SQLException {

        resultSet.first();
        Assert.assertTrue(resultSet.getNString(firstname).contains(fnA));

        resultSet.first();
        Assert.assertTrue(resultSet.getNString(lastname).contains(lnA));

        resultSet.first();
        Assert.assertTrue(resultSet.getNString(email).contains(emA));

        resultSet.first();
        Assert.assertTrue(String.valueOf(resultSet.getInt(role_id)).contains(rlA));












    }
}
