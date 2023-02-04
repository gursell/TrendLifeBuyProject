package stepdefinitions.DBStepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.US022_023_024_053_Page;
import pages.US037_038_039_040_044_Page;
import utilities.ConfigReader;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class US_079 {

    String url = "jdbc:mysql://45.84.205.255:3306/u480337000_tlb_training";
    String username = "u480337000_tbl_training_u";
    String password = "pO9#4bmxU";

    Connection connection; // database'e baglantimizi saglayacak
    Statement statement; // database'de istedigimiz query'leri calistirmamizi saglar
    ResultSet resultSet; // statement ile yapilan sorgu sonucunu store etmek icin kullanilir


    @Given("AdminF gets the data in the table {string} by connecting to the database")
    public void fatihJDBCIleDatabaseEbaglanirTablosundakiVerileriAlir(String arg0) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
        statement = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
        String query = arg0;
        resultSet = statement.executeQuery(query);
    }


    @And("AdminF verifies {string} {string} {string} from data base")
    public void userVerifiesFromDataBase(String id, String order, String expected) throws SQLException {
        resultSet.absolute(0);
        List<String> resultOrder = new ArrayList<String>();
        while (resultSet.next()) {
            resultOrder.add(resultSet.getNString(order));
        }
        System.out.println(resultOrder);
        Assert.assertTrue(resultOrder.contains(expected));
        resultSet.close();

    }
}
