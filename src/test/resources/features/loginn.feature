@TC-1
Feature: As a user, I should be able to login to the Library app

  Background: User already on login page

  @students
  Scenario Outline: Verify Students login

    Given the user login as a "<username>" and "<password>"
    Then the "<expectedUrl>"

    Examples:
      |username         |password  | expectedUrl  |
      |student70@library| FPEDLRY3 | books         |
      |student91@library| c4vlSAqZ | books         |
      |student92@library| 7kPVRH29 | books         |


  @librarian
  Scenario Outline: Verify Librarian login

    Given the user login as a "<username>" and "<password>"
    Then the "<expectedUrl>"

    Examples:
      |username            |password | expectedUrl  |
      |librarian18@library |rKG2sP88 | dashboard     |