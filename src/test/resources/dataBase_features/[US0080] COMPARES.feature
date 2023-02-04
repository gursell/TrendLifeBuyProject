@dtb
  Feature: US0080 Compares (As an administrator, I should be able to list a customer's compares from the compares table through the Database.)

    Scenario Outline: All compares of the customer with the specified Id number should be saved in a list and verified.

      Given Levent connects to the database with JDBC and gets the datas from the table "<query>"
      Then Admin verifies "customer_id" "product_sku_id" "<expected>" from data base
  Examples:
    | query | expected |
    | select customer_id, product_sku_id from u480337000_tlb_training.compares where customer_id=26; | 4 |
    | select customer_id, product_sku_id from u480337000_tlb_training.compares where customer_id=26; | 2 |
    | select customer_id, product_sku_id from u480337000_tlb_training.compares where customer_id=26; | 145 |
    | select customer_id, product_sku_id from u480337000_tlb_training.compares where customer_id=26; | 151 |
