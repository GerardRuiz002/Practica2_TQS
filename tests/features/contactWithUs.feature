Feature: ContactWithUs

Scenario: Completar Questionari Complet
Given user in the index page
When user clicks the contact us option
And user fills in the name field putting name
And user fills in the email field putting email
And user fills in the subject field putting subject
And user fills in the message fiels putting message
And user click in submit button
And user wait seconds to click ok
And user click ok in alert
And user wait seconds to click ok
Then successful contact with us

Scenario: Completar Questionari Sense Nom
Given user in the index page
When user clicks the contact us option
And user fills in the email field putting email
And user fills in the subject field putting subject
And user fills in the message fiels putting message
And user click in submit button
And user wait seconds to click ok
And user click ok in alert
And user wait seconds to click ok
Then successful contact with us

Scenario: Completar Questionari Sense Email
Given user in the index page
When user clicks the contact us option
And user fills in the name field putting name
And user fills in the subject field putting subject
And user fills in the message fiels putting message
And user click in submit button

Scenario: Completar Questionari Sense Subject
Given user in the index page
When user clicks the contact us option
And user fills in the name field putting name
And user fills in the email field putting email
And user fills in the message fiels putting message
And user click in submit button
And user wait seconds to click ok
And user click ok in alert
And user wait seconds to click ok
Then successful contact with us


Scenario: Completar Questionari Sense Message
Given user in the index page
When user clicks the contact us option
And user fills in the name field putting name
And user fills in the email field putting email
And user fills in the subject field putting subject
And user click in submit button
And user wait seconds to click ok
And user click ok in alert
And user wait seconds to click ok
Then successful contact with us

