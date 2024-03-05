Feature: Search and place the order for vegetable products

Scenario: Search experience for products in both home and deal page

Given User is on the GreenCart landing page
When User searches with shortname called "Tom" in the searchbox of the home page
Then User searches with the shortname called "Tom" in the deals page to check if the product exist




