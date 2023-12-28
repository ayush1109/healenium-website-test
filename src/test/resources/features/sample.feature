Feature: Hello


  Background:
    Given Set up browser

  @test123
  Scenario Outline: Create a meme
    Given User is logged into Website
    Given User clicks on the meme
    And User enters the topText as <Text>
    And User enters the bottomText as <Text>
    And User select the font as <font>
    And User sets font size as <fontSize>
    And User clicks on submit

    Examples:
      | font   | fontSize | Text |
      | impact | 15       | test |