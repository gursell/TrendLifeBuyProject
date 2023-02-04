@dtb
Feature: DATABASE USERS

  Scenario Outline:Among the users in the Users table, I should be able to verify the ID, name, surname, email and role_id of the user whose Id is given.

    Given AdminN gets datas from in the table "<query>" by connecting to the database
    And   User verifies "<id>" "first_name" "last_name" "email" "role_id" "<nameAssert>" "<lastAssert>" "<emailAss>" "<roleidAss>"from data base
    Examples:
      |nameAssert|lastAssert|emailAss                       |roleidAss| query|
      | Super    |  admin   |  info@trendlifebuy.com        |     1    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=1;  |
      | New User |  Surname |  c@c.com                      |     4    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=46; |
      | Arif     |  Hossain |  arif.hossain@gmail.com       |     4    |select id,first_name,last_name,email,role_id from u480337000_tlb_training.users where id=21; |



