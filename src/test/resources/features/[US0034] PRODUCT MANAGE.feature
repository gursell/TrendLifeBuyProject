

Feature: US_034 As an administrator, I want the Product List page to be able to access the product lists on the site.

  Background: Admin first goes to Trendlifebuy Admin Dashboard homepage.
    Given Go to "myUrl" page.
    Then Enter a valid "Email" address and "Password" in the relevant fields on the page that opens, then click the SIGN IN button.
    Then Then a message about successful login should appear in a green box in the upper right corner of the screen.
    Then The Products Title should be clickable under the PRODUCT MANAGE title on the left side of the screen on the Dashboard page.
    Then Click on the link button titled Product Lists from the options listed under the Products Title.


  Scenario: TC_3401 Verify that the Product List page is accessible from the Products menu.
    Then Then, it is checked that the Products page is opened and the Product List window visible on the screen.



  Scenario: TC_3402 Product List, Alert List, Out Of Stock List, Disabled Product List, Product By SKU List links appear on the Product List page and it is verified that they go to the relevant page.
    Then On the page that opens, it is verified that the Links of the Product List, Alert List, Out of Stock List, Disabled Products List, Product List by SKU are visible on the Product List page.
    Then Clicking on these visible titles Product List, Alert List, Out of Stock List, Disabled Products List, Product List by SKU on the screen confirms that the relevant windows are opened.



  Scenario: TC_3403 Verifies that the products are listed under the headings SL, Name,
  Product Type, Brand, Image, Stock, Status, Action in the Product List
    Then In the Product List, it is verified that the products are listed under the headings SL, Name, Product Type, Brand, Image, Stock, Status, Action.



  Scenario: TC_3404 Verify that it is possible to search in the Product List with the Quick Search TextBox
    Then Search is made by typing "Nike" in the Quick Search search box on the Product List page. It is checked how many products are listed before and after the search.


  Scenario: TC_3405 It should be verified that the product status can be changed from the Status column in the Product List.
    Then To update the status of any of the products from the Status column in the Product List, the status icon is clicked.
    Then After clicking the status icon, it is checked that the message Updated Successfully appears in the upper right corner of the screen.
    Then Then check if the status checkbox is selected.



  Scenario: TC_3406 It should be verified that the View link is visible and displays the product when the select tab is clicked in the Action column in the Product List.
    Then Click on any Select button opposite the products under the Action heading column.
    Then It is checked that the View button link in the opened mini pop-up tab is visible.
    Then Click on the View button link and check that the window with the explanations about the product appears in the window that opens.
    Then Close the product descriptions window.



  Scenario: TC_3407 It should be verified that the Edit link is visible on the select tab in the Action column in the Product List and it redirects to the Edit Product page when clicked.
    Then Click on any Select button opposite the products under the Action heading column.
    Then In the opened mini pop-up tab, it is checked whether the Edit button link is visible.
    Then Click on the Edit link button and check that the Edit Product page is opened.
    Then Check whether the page where information about the product is arranged is displayed.
    Then Go back to the previous page from the Edit Product page.



  Scenario: TC_3408 It should be verified that the current information of the product is available on the Edit Product page.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click on the Edit link button.
    Then In the GENERAL INFORMATION tab window on the Edit Product page; Product Information, Product Image Info, Pdf Specifications, Product Video Info, Others Info, Price Info And Stock, Weight Height Info, Description, Specifications, SEO Info It is checked that product editing titles such as.



  Scenario: TC_3409 It should be verified that the current information of the product is available on the Edit Product page.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click on the Edit link button.
    Then Click on the tab titled RELATED PRODUCT on the Edit Product page and check that the title Related Product appears in the window that opens.
    Then Click on the tab titled UP SALE on the Edit Product page and check that the title Up Sale appears in the window that opens.
    Then Click on the tab titled CROSS SALE on the Edit Product page and check that the title Cross sale appears in the window that opens.



  Scenario: TC_3410 Verify that the Type option cannot be changed in the Product Information section and that the related message is visible.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click on the Edit link button.
    Then Check that the Single checkbox under the Type option is selected.
    Then Verify that the CHANGE NOT POSSIBLE FOR USE message appears under the Product Information heading that the Type option cannot be changed.
    Then Click the Variant checkbox under the Type option and Check that the Variant checkbox is can not selected.



  Scenario: TC_3411 After editing the information on the General Information, Related Product, Up Sale, Cross Sale pages, verify that the edited information is saved by clicking the Update button.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click on the Edit link button.
    Then Click on the Related Product tab button, type "bag" in the Quick Search box in the window that opens, Click and tick the checkboxes of the products found in the search result.
    Then Click the Up Sale tab button, type "bag" in the Quick Search box in the window that opens, Click and tick the checkboxes of the products found in the search result.
    Then Click on the Cross Sale tab button, type "bag" in the Quick Search box in the window that opens.
    Then Click and tick the checkboxes of the products found in the search result and click the Update button at the bottom of the window.
    Then Check that the message that the edited information has been successfully saved appears on the screen.



  Scenario: TC_3412 It should be verified that the Clone link is visible on the select tab in the Action column in the Product List and when it is clicked, it redirects to the Clone Product page.
    Then Click on any Select button opposite the products under the Action heading column.
    Then It is checked that the Clone button link in the opened mini pop-up tab is visible.
    Then Click on the Clone button link and check that the page that opens is the Clone Product page.



  Scenario: TC_3413 Verify that Product Information, Price Info And Stock, Weight Height Info, Product Image Info, Pdf Specifications, Product Video Info, Others Info information is changeable on Clone Product page
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click the Clone Link button.
    Then Click the Variant checkbox under the Product Information heading, then click the Single checkbox again to select it.
    Then Type "Exclusive Leather Bag" in the NAME text box and "ex-bag-2" in the PRODUCT SKU text box.
    Then Type "Woman Bag" in the SUBTITLE1 text box and "bg-001" in the MODEL NUMBER text box.
    Then Click on the CATEGORY text box, click on the Bags option in the mini pop-up box that appears.
    Then Click on the box under the BRAND title and select the OzVittoria brand from the options.
    Then Click on the box under the UNIT heading and click on the LOT option from the options that appear.
    Then Click on the box under the BARCODE TYPE title and click on any of the options that appear.
    Then Type "1" in the text box under the MINIMUM ORDER QTY title and "12" in the MAX ORDER QTY text box.
    Then Type "woman bags" in the text box under Tags (Comma Separated).
    Then Click the Browse button under Product Image Info and click the Upload New button from the pop-up window.
    Then Upload an image file from your computer by clicking the Browse files link and click the Done button.
    Then Then click on the 'Sort by newest' option from the sorting options in the window that opens and select an image.
    Then Click the Select Only checkbox and click the Add Files button and save the file.
    Then Upload a PDF file from your computer by clicking the Browse button in the Upload PDF section under PDF SPECIFICATIONS.
    Then Select Youtube from the VIDEO PROVIDER box under the heading Product Video Information and print a "Youtube link" in the VIDEO LINK text box.
    Then Check that the STATUS and MAKE DISPLAY IN DETAILS PAGE selected information under Others Info can be changed.
    Then Check that the selected and written information under the Weight Height Info heading can be changed.
    Then Write a description about the product in the text boxes under the headings Description and Specifications.
    Then Type a title and description in the META TITLE and META DESCRIPTION text boxes under SEO info.
    And Then click the Save button at the bottom of the page and check that the information has been successfully saved.



  Scenario: TC_3414 On the Save button, it should be verified that the message reminding that the information on the Related Product, Up Sale, Cross Sale pages must be filled before registration is visible.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click the Clone Link button.
    Then With the GENERAL INFORMATION window tab selected, verify that the message reminding that the information must be filled before recording is displayed at the end of the page.
    Then Click on the RELATED PRODUCT tab, verify that the Related Product window appears at the end of the page reminding you to fill in the information before recording.
    Then Click on the UP SALE tab, verify that the Up Sale window appears at the end of the page, reminding that the information must be filled before registration.
    Then Click on the CROSS SALE tab, verify that the Cross sale window appears at the end of the page, reminding that the information must be filled before registration.



  Scenario: TC_3415 After updating the information on the General Information, Related Product, Up Sale, Cross Sale pages, verify that the updated information is saved with the Save button.
    Then Click on any Select button opposite the products under the Action heading column.
    Then Click on the Edit link button.
    Then GENERAL INFORMATION, RELATED PRODUCT While any of the , UP SALE or CROSS SALE window tabs are selected click the Save button at the end of the page.
    Then Verify that the about saved the product has been successfully message appears on the screen.


  Scenario: TC_3416 It should be verified that the Delete link is visible on the select tab in the Action column in the Product List and that the Delete operation can be performed when clicked.
    Then Click on any Select button opposite the products under the Action heading column for Delete.
    Then In the mini pop-up tab that opens it is checked whether the Delete button link is visible.
    Then Click the Delete and then click the Delete button in the mini alert window that will appear.
    Then Check that a green pop-up message appears in the upper right corner of the screen stating that the product has been Deleted Successfully.



  Scenario: TC_3417 In the Product By SKU List, verify that the products are listed under the headings SL, Name, Brand, SKU, Selling Price, Image, Action.

    Then Click the Product By SKU tab button that appears on the screen.
    Then Verify that the products are listed and appearing under the headings SL, Name, Brand, SKU, Selling Price, Image, Action in the tab that appears.



  Scenario: TC_3418 It should be verified that filtering can be done on the List through Product By SKU titles.
    Then Click the Product By SKU tab button that appears on the screen.
    Then Click on the NAME filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the SL filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the BRAND filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the SKU filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the SELLING PRICE filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the IMAGE filtering header in the tab that opens and verify that the ordering has changed.
    Then Click on the ACTION filtering header in the tab that opens and verify that the ordering has changed.


