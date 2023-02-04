@dtb
Feature:[US0072] As an administrator, I should be able to list user email addresses from the DataBase

  Scenario Outline: Listing the mails from the user table and verification of the requested mails are on the list

    Given Nese gets the data in the table "nesedata" by connecting to the database
    Then  Nese verifies LIST that "email" in the list "<expectedmail>"
    Examples:
      | expectedmail            |
      | customer@gmail.com      |
      | denemeAdmin@gmail.com   |
      | riki11@gmail.com        |
      | staff@gmail.com         |
      | info@trendlifebuy.com   |
      | touhidkhan@gmail.com    |
      | johndoe@gmail.com       |
      | arif.hossain@gmail.com  |
      | jato@mailinator.com     |
