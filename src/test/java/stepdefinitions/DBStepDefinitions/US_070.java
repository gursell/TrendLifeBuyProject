package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_070 {
    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    int resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir

    ResultSet resultSetiki;


    @Given("Levent updates the address information of the desired Customer in the table {string}")
    public void leventUpdatesTheAddressInformationOfTheDesiredCustomerInTheTable(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(arg0);
        resultSet = statement.executeUpdate(query);
    }

    @Given("Levent gets the data in the table {string} by connecting to the database")
    public void leventGetsTheDataInTheTableByConnectingToTheDatabase(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = ConfigReader.getProperty(arg0);
        resultSetiki=statement.executeQuery(query);
    }

    @Then("Levent verifies that the updated {string} in the list is {string}")
    public void leventVerifiesThatTheUpdatedInTheListIs(String address, String expected) throws SQLException {
        resultSetiki.first();

        Assert.assertEquals(expected,(resultSetiki.getNString(address)));
    }



/*
    @Then("Levent verifies LIST that {string} in the list {string}")
    public void leventVerifiesLISTThatInTheList(String address, String expected) throws SQLException {
        resultSet.absolute(0);
        List<String> adressList = new ArrayList<String>();
        while(resultSet.next()) {
            adressList.add(resultSet.getNString(address));

        }
        Assert.assertTrue(adressList.contains(expected));
    }*/
}
