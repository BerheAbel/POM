$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/TechfiosLogin.feature");
formatter.feature({
  "line": 2,
  "name": "Techfios login fuctionality",
  "description": "",
  "id": "techfios-login-fuctionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Loginpage"
    }
  ]
});
formatter.before({
  "duration": 3030841100,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "User should be able to login to techfios page",
  "description": "",
  "id": "techfios-login-fuctionality;user-should-be-able-to-login-to-techfios-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@Scenario1"
    },
    {
      "line": 4,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User is on the techfios login page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User put username as \"demo@techfios.com\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User put password as \"abc123\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "User click of signin button",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be on dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDefinition.user_is_on_the_techfios_login_page()"
});
formatter.result({
  "duration": 1416052100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "demo@techfios.com",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.user_put_username_as(String)"
});
formatter.result({
  "duration": 140787400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "abc123",
      "offset": 22
    }
  ],
  "location": "LoginStepDefinition.user_put_password_as(String)"
});
formatter.result({
  "duration": 98688800,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_click_of_signin_button()"
});
formatter.result({
  "duration": 1885495000,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDefinition.user_should_be_on_dashboard_page()"
});
formatter.result({
  "duration": 593252100,
  "status": "passed"
});
formatter.after({
  "duration": 736682300,
  "status": "passed"
});
});