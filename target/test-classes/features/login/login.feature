@LOGIN
Feature: Login to Application

  @SAMPLE1
  Scenario Outline: Successful Login
    Given Navigate to <website>


    Examples:
      | website                             | title                         |
      | https://www.facebook.com/        | Vehicle Insurance Application |

  @SAMPLE
  Scenario Outline: Successful Login
    Given Navigate to <website>


    Examples:
      | website                             | title                         |
      | https://www.saucedemo.com/          | Vehicle Insurance Application |
