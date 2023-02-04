@SystemTest
Feature: US 0003 Home Page All Categories Menu Test

  Scenario: TC 0301 Verify that the categories Computer & Accessories, Electronics Devices,
  Watches & Accessories, Fashions, Toys-Kids&Babies, Bag&Shoes, Lifestyle&Home,
  TV & Home Appliances, Auto Mobiles & bikes are visible

    Given  Open browser go to "userUrl"
    And    Click to all categories menu at the "userUrl"
    Then   Check if computer & accessories, electronics devices,watches & accessories, fashions, toys-kids&babies, bag&shoes, lifestyle&home,tv & home appliances, auto mobiles & bikes are visible at the "myUrl"
    And    The user closes "userUrl"

  Scenario: TC 0302 Verify that the categories Computer & Accessories, Electronics Devices,
  Watches & Accessories, Fashions, Toys,Kids&Babies, Bag&Shoes, Lifestyle&Home,
  TV & Home Appliances, Auto Mobiles & bikes are active

    Given  Open browser go to "userUrl"
    And    Click to all categories menu at the "userUrl"
    Then   Check if computer & accessories, electronics devices,watches & accessories, fashions, toys-kids&babies, bag&shoes, lifestyle&home,tv & home appliances, auto mobiles & bikes are active at the "myUrl"
    And    The user closes "userUrl"