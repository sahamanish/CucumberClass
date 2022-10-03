@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @tag2
  Scenario Outline: Title of your scenario outline
    Given User Navigate to OrangeHrm site
    When user put unsername "<username>"
    And password "<password>"
    And click on login btn
    Then user should be in home page

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | name2    |        7 |