Feature: SearchBar

Scenario: Producte Existent
Given the user is in the index page
And wait one second on search
When the user clicks the products option
And wait one second on search
And checkExternAd if visible on search
And wait one second on search
And the user enters in the search bar putting jeans
And wait one second on search
And the user clicks the search button
And wait one second on search
And checkExternAd if visible on search
And wait one second on search
Then the product list with jeans appears

Scenario: Producte No Exsistent
Given the user is in the index page
When the user clicks the products option
And checkExternAd if visible on search
And the user enters in the search bar putting cucumber
And the user clicks the search button
And checkExternAd if visible on search
Then the product list appears

Scenario: Buscar Producte Incomplet
Given the user is in the index page
When the user clicks the products option
And checkExternAd if visible on search
And the user enters in the search bar putting je
And the user clicks the search button
And checkExternAd if visible on search
Then the product list with jeans appears

Scenario: Buscar A La Barra Sense Posar Producte
Given the user is in the index page
When the user clicks the products option
And checkExternAd if visible on search
And the user clicks the search button
And checkExternAd if visible on search
Then the product list appears



