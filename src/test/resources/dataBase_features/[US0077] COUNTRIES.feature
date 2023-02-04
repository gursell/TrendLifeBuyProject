@dtb
Feature: US0077 As an administrator, when I query the code number from the Countries table on the Database, it should be verified that the requested information is frozen.

  Scenario Outline: I should be able to verify the name and phonecode of the country whose Id is given among the users in the Countries table

    Given  Emine gets the data in the table "<eminedata>" by connecting to the database
    Then   Emine verifies LIST that "name" "phonecode"  in the list "<expectedname>" "<expectedphone>"
    Examples:
    |eminedata                                                                  |expectedname|expectedphone|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=5;|Andorra     |376|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=6;|Angola      |244|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=7;|Anguilla    |1264|
    |Select id,name,phonecode from u480337000_tlb_training.countries where id=8;|Antarctica  |0|
