Feature: Rest APIのシナリオ

  Background:
    * url 'http://localhost:8080/'

  Scenario: 「Hello World」を返すAPI
    Given path ''
    When method post
    Then status 200
    And match response contains "xxx"
 