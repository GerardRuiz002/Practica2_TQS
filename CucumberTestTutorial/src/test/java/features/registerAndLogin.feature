Feature: registerAndLogin


Scenario: registreCorrecte
	
	Given the user is in the principal page
	When the user clicks the Signup_login button
	And the user enters <nom> in the name of New user signup 
	And the user enters <mail> in the Email address of New user signup 
	And the user clicks the signup button 
	And the user clicks the gender1 button
	And the user enters <password> in the password field
	
	And the user clicks on the day of Date_of_Birth
	And the user clicks on the month of Date_of_Birth
	And the user clicks on the year of Date_of_Birth
	
	And the user enters <FirstName> on the first_name field
	And the user enters <LastName> on the last_name field
	And the user enters <Address> on the address field
	
	And the user clicks on the Country field
	
	And the user enters <State> on the state field
	And the user enters <City> on the city field
	And the user enters <Zipcode> on the zipcode field
	And the user enters <MobileNumber> on the mobileNumber field
	
	And the user clicks on CreateAccount button
	Then the account is created
	
	And delete addCruz if visible
	And delete addCerrar if visible
	
	And the user clicks continueButton
	
	And delete addCruz if visible
	And delete addCerrar if visible
	
	And the user clicks delateAccountButton
	Then the account is delated
	
	And delete addCruz if visible
	And delete addCerrar if visible
	
	And the user clicks continue2Button
	
	
	Examples:
	|nom |             mail              |  password  | FirstName  |  LastName  |  Address                 |  State    |  City     |  Zipcode  |  MobileNumber  | 
	|Juan| tqstestingpractica2@gmail.com |    hola		| Juan       |  Garcia    |  carrer urgell 230 2do 1a| Barcelona | Barcelona | 08036     | 622940310      |
	


Scenario: registrePasswordIncorrecte
	
	Given the user is in the principal page
	When the user clicks the Signup_login button
	And the user enters empty <nom> in the name of New user signup 
	And the user enters <mail> in the Email address of New user signup 
	And the user clicks the signup button 
	And the user clicks the gender1 button
	And the user enters <password> in the password field
	
	And the user clicks on the day of Date_of_Birth
	And the user clicks on the month of Date_of_Birth
	And the user clicks on the year of Date_of_Birth
	
	And the user enters <FirstName> on the first_name field
	And the user enters <LastName> on the last_name field
	And the user enters <Address> on the address field
	
	And the user clicks on the Country field
	
	And the user enters <State> on the state field
	And the user enters <City> on the city field
	And the user enters <Zipcode> on the zipcode field
	And the user enters <MobileNumber> on the mobileNumber field
	
	And the user clicks on CreateAccount button
	Then the account cant be created because of empty password
	
	Examples:
	|nom |             mail              |  password  | FirstName  |  LastName  |  Address                 |  State    |  City     |  Zipcode  |  MobileNumber  | 
	|Juan| emptyNameTest@gmail.com       |        		| Juan       |  Garcia    |  carrer urgell 230 2do 1a| Barcelona | Barcelona | 08036     | 622940310      |
	 



Scenario: LoginIncorrecteCorreuIContrasenya
	Given the user is in the principal page
	When the user clicks the Signup_login button
	
	And the user enters <mail> in the Email address of Login to your account
	And the user enters <password> in the login password field
	
	And the user clicks the Login button 
	Then the user cant Login
	
	Examples:
	|password|						mail							|
	|Adios	 |correoFalso@gmail.com 				|
	
	
Scenario: LoginCorreoExistenteContrasenyaIncorrecta

	Given the user is in the principal page
	When the user clicks the Signup_login button
	
	And the user enters <mail> in the Email address of Login to your account
	And the user enters <password> in the login password field
	
	And the user clicks the Login button 
	Then the user cant Login
	
	Examples:
	|password            |						mail						      	|
	|incorrectPaswword	 |correologintesttqs@gmail.com 				|
	
	
Scenario: LoginCorreoInexistenteContrasenyaCorrecta

  Given the user is in the principal page
	When the user clicks the Signup_login button
	
	And the user enters <mail> in the Email address of Login to your account
	And the user enters <password> in the login password field
	
	And the user clicks the Login button 
	Then the user cant Login
	
	Examples:
	|password            |						mail						      	|
	|hola						   	 |correoFalso@gmail.com       				|
	
	
Scenario: LoginCorrecto
	Given the user is in the principal page
	When the user clicks the Signup_login button
	
	And the user enters <mail> in the Email address of Login to your account
	And the user enters <password> in the login password field
	
	And the user clicks the Login button 
	Then the user can Login
	And the user logs out
	
	Examples:
	|password            |						mail						      	|
	|hola						   	 |correologintesttqs@gmail.com 				|





