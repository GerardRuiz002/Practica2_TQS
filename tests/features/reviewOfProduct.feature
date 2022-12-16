Feature: ReviewOfProduct

Scenario: Escriure Review Completa 
Given user in the index page to do review
When user clicks view product of one product
And in the review user fills in the name field putting name
And in the review user fills in the email field putting email
And in the review user fills in the review fiels putting review
And in the review user click in submit button
And wait one second
Then message thank for you review

Scenario: Escriure Review Amb Camp Correu Buit
Given user in the index page to do review
When user clicks view product of one product
And in the review user fills in the name field putting name
And in the review user fills in the review fiels putting review
And in the review user click in submit button
And wait one second
Then message completa este campo in email

Scenario: Escriure Review Amb Camp Nom Buit
Given user in the index page to do review
When user clicks view product of one product
And in the review user fills in the email field putting email
And in the review user fills in the review fiels putting review
And in the review user click in submit button
And wait one second
Then message completa este campo in name

Scenario: Escriure Review Amb Camp Review Buit
Given user in the index page to do review
When user clicks view product of one product
And in the review user fills in the name field putting name
And in the review user fills in the email field putting email
And in the review user click in submit button
And wait one second
Then message completa este campo in review


