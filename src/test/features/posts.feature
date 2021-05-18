Feature: Send posts


#  @test
#  Scenario: Make posts to server and check response code
#    Given I have an end point posts
#    When I post with title "new book" and body "my name"
#    Then the status code is 200


  @test
  Scenario: Make posts to server and check response code
    Given I have an end point posts
    When I request list of Posts
    Then the status code is 200

  @test
  Scenario: Make posts to server and check response contains title and body
    Given I have an end point posts
    When I request list of Posts
    Then response includes the following
      |aut amet sed|libero voluptate eveniet aperiam sed|

  @Test
  Scenario Outline: verify few posts
    Given I have an end point posts
    When I request list of Posts
    Then response includes below <id> and <title> and <body> in the posts
    Examples:
      | id | title | body |
      |5|nesciunt quas odio|repudiandae veniam quaerat|
      |51|soluta aliquam aperiam consequatur illo quis voluptas|sunt dolores aut doloribus|
      |100|at nam consequatur ea labore ea harum|cupiditate quo est a modi|