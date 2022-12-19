Feature: brands

Scenario: POLO

	Given the user is in the principal page ready to use the brand section	
	When the user clicks the POLO button	
	
	And delete addCruz if visible on brand
	And delete addCerrar if visible on brand
	And checkExternAd if visible on brand
	Then the title BRAND - POLO PRODUCTS appears
	And checkExternAd if visible on brand
	
	
Scenario: H&M

	Given the user is in the principal page ready to use the brand section
	When the user clicks the H&M button	
	
	And delete addCruz if visible on brand
	And delete addCerrar if visible on brand
	And checkExternAd if visible on brand
	Then the title BRAND - H&M PRODUCTS appears
	And checkExternAd if visible on brand
	
	