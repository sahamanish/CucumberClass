@tag
Feature: Testing OrangeHRM
  I want to use this template for my feature file

  @tag1
  Scenario: Login Functionality
    Given User Navigate to OrangeHrm site
    When user put unsername "Admin"
    And password "admin123"
    And click on login btn
    Then user should be in home page

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
