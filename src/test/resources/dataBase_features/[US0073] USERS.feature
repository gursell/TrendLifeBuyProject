
Feature: USERS

  Scenario Outline:The phone numbers in the Users table should be saved into a list and it should be verified whether the desired phone number is in this list.

    Given  Bora gets the data in the table "boradata" by connecting to the database
    Then   Bora verifies LIST that "phone" in the list "<expectedphone>"
    Examples:
      | expectedphone |
      | [null, null, null, null, , null, null, 01729975293, null, null, +1 (922) 361-3194, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null]|

