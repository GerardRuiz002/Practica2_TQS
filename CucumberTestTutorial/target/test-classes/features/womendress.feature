Feature: WomenDress

Scenario: Show Women Dress

Given the user is in the index page
When the user clicks the product options
And the user enters <article> in the search bar
And the user clicks the search button
Then the <article> list appears

Examples:
|article|
|dress|
|jeans|


