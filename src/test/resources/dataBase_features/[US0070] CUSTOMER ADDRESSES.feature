@dtb
Feature: US0070 Addresses (As an administrator, I should be able to update the address information of the desired Customer in the customer_addresses table via the DataBase and verify that the updated address is in the customer_addresses table)

  Scenario: The address information of the desired Customer in the customer_addresses table should be updated.

    Given Levent updates the address information of the desired Customer in the table "leventdata1"



  Scenario:  Addresses in the customer_addresses table should be taken to a list and it should be verified whether the desired address is in this list.

    Given Levent gets the data in the table "leventdata2" by connecting to the database
    Then  Levent verifies that the updated "address" in the list is "Uppsala"
