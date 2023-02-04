@dtb
Feature: As an administrator, I should be able to verify the ID of the desired Personnel in the Staff table via the DataBase.

  Scenario Outline:The IDs in the staff table should be taken to a list and it should be verified whether the desired ID is in this list.

    Given AdminG gets the data in the table "gurseldata" by connecting to the database
    Then  AdminG verifies that "id" in the list "<expected>"
    Examples:
      | expected |
      | 1 |
      | 2 |
      | 3 |
      | 4 |
      | 5 |
      | 100 |
