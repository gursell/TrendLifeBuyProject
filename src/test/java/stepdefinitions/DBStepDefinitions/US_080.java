package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_080 {

    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir
    @Given("Levent connects to the database with JDBC and gets the datas from the table {string}")
    public void levent_connects_to_the_database_with_jdbc_and_gets_the_datas_from_the_table(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = arg0;
        resultSet = statement.executeQuery(query);
    }
    @Then("Admin verifies {string} {string} {string} from data base")
    public void admin_verifies_from_data_base(String id, String compare, String expected) throws SQLException {
        resultSet.absolute(0);
        List<Integer> resultCompare = new ArrayList<Integer>();
        while (resultSet.next()) {
            resultCompare.add(resultSet.getInt(compare));
        }
        System.out.println(resultCompare);
        Assert.assertTrue(String.valueOf(resultCompare).contains(expected));
        resultSet.close();
    }




}
