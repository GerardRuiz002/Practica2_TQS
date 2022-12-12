Feature: SearchBar

Scenario: Producte Existent

Given the user is in the index page
When the user clicks the products option
And the user enters in the search bar putting jeans
And the user clicks the search button
Then the product list appears

Scenario: Producte No Exsistent

Given the user is in the index page
When the user clicks the products option
And the user enters in the search bar putting cucumber
And the user clicks the search button
Then the product list appears