Feature: Products Page Funtionality

Background: 
Given User is on Products screen

Scenario: Verify Cart count once product gets added
When User clicks on Add to Cart button
Then Cart icon should increase

Scenario: Verify whether User is able to Remove Item from Cart
When User clicks on Add to Cart button
And User clicks on Remove button
Then Product should show Add to cart button instead of Remove button
