Feature: This is a feature for searching item

@tag
Scenario: Verify user can add item in cart page
Given open <"URL"> go
Then type laptop in search field 
Then click search button
Then click on item
Then click add to cart
Then Verify user can add item in cart page