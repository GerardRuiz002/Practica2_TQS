Feature: cart

Scenario: afegir un producte a la cistella
Given user in the index page to add a product to cart
When user clicks products section
And user clicks add to cart
And wait seconds
And user go to cart
Then the product added is in the list

Scenario: afegir un producte a la cistella i eliminar-lo
Given user in the index page to add a product to cart
When user clicks products section
And user clicks add to cart
And wait seconds
And user go to cart
And user delete product
And wait seconds
Then void cart

Scenario: afegir dos productes a la cistella 
Given user in the index page to add a product to cart
When user clicks view product to add cart
And user add quantity
And user add to cart product with quantity
And wait seconds
And user go to cart
And wait seconds
Then the product with quantity added in the list
