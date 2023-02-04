@dtb
Feature:  As an administrator,I should be able to add products to the cart via DataBase, and verify that the added product is in the Carts list.

  Scenario:   I should be able to add products to the Carts table
    Given  Zeynep connects to the database with JDBC and add to the "zeynepdata" to the carts



  Scenario: It should be checked that the product added to the Carts table is in the table.
    Given Zeynep gets the data in the table "zeynepdata2" by connecting to the database
    Then Zeynep verifies LIST that "id" in the list "104"


