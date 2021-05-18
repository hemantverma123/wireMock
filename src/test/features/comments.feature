Feature: Make comments on a post
  As a user
  when I make a comment on a post
  I want to see the comment added to post

  @test
  Scenario: Make comments on post and check status code
    Given I have an end point comments
    When I post a comment "my comment" on post with title "aut quo modi neque nostrum ducimus"
    Then the status code is 201

  @test
  Scenario: Make comments on post and check response shows added comment
    Given I have an end point comments
    When I post a comment "my comment" on post with title "aut quo modi neque nostrum ducimus"
    And response includes my comment "my comment"

  @test
  Scenario: counting total comments
    Given I have an end point comments
    When I get all comments
    Then I should have total comments as 500


 #I shall cover below scnearios too in real time
  #how many comments are posted by an individual user
  #check the counts between posts and comments by a user
  #how many users are missing from post
  #how many users are not there in the comments response
  #how many users who posted but not left any comment etc.