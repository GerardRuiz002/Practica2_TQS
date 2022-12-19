Feature: SearchBar

Scenario: Producte Existent
Given the user is in the index page
When the user clicks the products option
And the user enters in the search bar putting jeans
And the user clicks the search button
Then the product list with jeans appears

Scenario: Producte No Exsistent
Given the user is in the index page
When the user clicks the products option
And the user enters in the search bar putting cucumber
And the user clicks the search button
Then the product list with nothing appears

Scenario: Buscar Producte Incomplet
Given the user is in the index page
When the user clicks the products option
And the user enters in the search bar putting je
And the user clicks the search button
Then the product list with jeans appears

Scenario: Buscar A La Barra Sense Posar Producte
Given the user is in the index page
When the user clicks the products option
And the user clicks the search button
Then the product list appears with all products