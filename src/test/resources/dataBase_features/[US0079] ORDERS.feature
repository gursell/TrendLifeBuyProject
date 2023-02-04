@dtb
Feature: Admin should be able to list a customer's orders from the orders table through the Database

  Scenario Outline: To be verified that all orders of the customer with specified Id should be saved in a list and verified

    Given AdminF gets the data in the table "<query>" by connecting to the database
    And AdminF verifies "customer_id" "order_number" "<expected>" from data base
    Examples:
      | expected |        query       |
      |Order-35-211116030414| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=26; |
      |Order-97-211125111553| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=34; |
      |Order-58-211125112609| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=35; |
      |Order-44-211125113038| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=36; |
      |81220728011236       | select customer_id,order_number from u480337000_tlb_training.orders where customer_id=38; |
      |Order-45-211122114237| select customer_id,order_number from u480337000_tlb_training.orders where customer_id=4;  |
      |58221216120019       | select customer_id,order_number from u480337000_tlb_training.orders where customer_id=40; |
      |79221215040919       | select customer_id,order_number from u480337000_tlb_training.orders where customer_id=41; |


