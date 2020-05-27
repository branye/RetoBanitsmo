Feature: Buy a product on plazavea web application, and verify its functionality

  @AddItemToShoppingCrtSuccess
  Scenario Outline: The user as a client of plazavea tries to buy an item on the web page
    Given User searchs the product he wants to buy on plazavea web page
      | <id> | <category> | <productName> | <quantity> | <price> | <expectedResponse> |
    When he selects an item to add in the shopping cart
    Then he verifies that the item selected was added to the shopping cart successful

    Examples: 
      | id | category   | productName                                        | quantity | price | expectedResponse                 |
      ##@externaldata@./src/test/resources/co/com/sophos/certification/challenge/externaldata/ShoppingDescription.xlsx@Sheet1
   |1   |Tecnología   |Smartphone XIAOMI Redmi 7 6.26" 32GB 12MP + 2MP Negro   |QUANT   |799.00   |El producto se agrego al carrito|
