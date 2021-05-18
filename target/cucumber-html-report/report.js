$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("comments.feature");
formatter.feature({
  "line": 1,
  "name": "Make comments on a post",
  "description": "As a user\r\nwhen I make a comment on a post\r\nI want to see the comment added to post",
  "id": "make-comments-on-a-post",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Make comments on post and check status code",
  "description": "",
  "id": "make-comments-on-a-post;make-comments-on-post-and-check-status-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have an end point comments",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I post a comment \"my comment\" on post with title \"aut quo modi neque nostrum ducimus\"",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the status code is 201",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Make comments on post and check response shows added comment",
  "description": "",
  "id": "make-comments-on-a-post;make-comments-on-post-and-check-response-shows-added-comment",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I have an end point comments",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I post a comment \"my comment\" on post with title \"aut quo modi neque nostrum ducimus\"",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "response includes my comment \"my comment\"",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("posts.feature");
formatter.feature({
  "line": 1,
  "name": "Send posts",
  "description": "",
  "id": "send-posts",
  "keyword": "Feature"
});
formatter.scenario({
  "comments": [
    {
      "line": 4,
      "value": "#  @test"
    },
    {
      "line": 5,
      "value": "#  Scenario: Make posts to server and check response code"
    },
    {
      "line": 6,
      "value": "#    Given I have an end point posts"
    },
    {
      "line": 7,
      "value": "#    When I post with title \"new book\" and body \"my name\""
    },
    {
      "line": 8,
      "value": "#    Then the status code is 200"
    }
  ],
  "line": 12,
  "name": "Make posts to server and check response code",
  "description": "",
  "id": "send-posts;make-posts-to-server-and-check-response-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 11,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 13,
  "name": "I have an end point posts",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I request list of Posts",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Make posts to server and check response contains title and body",
  "description": "",
  "id": "send-posts;make-posts-to-server-and-check-response-contains-title-and-body",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "I have an end point posts",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "I request list of Posts",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "response includes the following",
  "rows": [
    {
      "cells": [
        "aut amet sed",
        "libero voluptate eveniet aperiam sed"
      ],
      "line": 22
    }
  ],
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("users.feature");
formatter.feature({
  "line": 1,
  "name": "Get list of of users",
  "description": "As a user\r\nwhen I request list of users\r\nI must see list of users",
  "id": "get-list-of-of-users",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 7,
  "name": "Call users end point and check response code",
  "description": "",
  "id": "get-list-of-of-users;call-users-end-point-and-check-response-code",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "I have a service to request list of users",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I request list of users",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "the status code is 200",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 13,
  "name": "Call users end point and check first user",
  "description": "",
  "id": "get-list-of-of-users;call-users-end-point-and-check-first-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@test"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "I have a service to request list of users",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "I request list of users",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "response includes username \"Bret\" and name \"Leanne Graham\" fields",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});