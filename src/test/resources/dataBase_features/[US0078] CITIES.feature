@dtb
  Feature: CITIES

    Scenario Outline:Among the cities in the cities table, the cities starting with the desired letter should be saved to a list and verified.

      Given Yakup gets the data in the table "yakupdata" by connecting to the database
      Then  Then  The user verifies that "name" in the list "<expected>"
      Examples:
         |expected|
        | Czarna Bialostocka |
        | Czersk|
        | Czluchow |
        | Czechowice-Dziedzice|
        | Czeladz |
        | Czerwionka-Leszczyny |
        | Czestochowa |
        | Czarnkow |