Feature: ビジネスロジックのテスト


  Background:
    * def CalcTestsRunner = Java.type('feature.calc.CalcFeatureTestsRunner')
    * table example
      | 入力値1 | 入力値2 | 期待結果 |
      | 10     | 20     | 30     |
      | 50     | 100    | 150    |
      | -10    | 10     | 0      |

  Scenario: シンプルなシナリオ
    * def x = 10
    * def result = CalcTestsRunner.testAdd(x,20)
    * assert result == 30

  Scenario Outline: データ駆動シナリオ データ例 <入力値1> + <入力値2> の結果は<期待結果>になる
    * def result = CalcTestsRunner.testAdd(<入力値1>,<入力値2>)
    * assert result == <期待結果>
    Examples:
      | example |
 