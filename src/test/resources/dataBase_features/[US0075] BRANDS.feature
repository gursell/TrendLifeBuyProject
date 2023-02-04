
Feature:  US0075 As an administrator, I should be able to list the brands on the site through the DataBase and verify whether the desired brand is in the Brands table.

  Scenario Outline: The brands in the Brands table should be saved in a list and it should be verified whether the desired brand is in the list.

    Given Talha connects to database with JDBC "talhadata" retrieves data from table
    Then  Then  Taha verifies LIST that "name" in the list "<expected>"
    Examples:
      | expected |
      | Casio |
      | Nike |
      | Apple |
      |  LG |