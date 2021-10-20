$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/contactsPage.feature");
formatter.feature({
  "name": "Contacs page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify Create Calender Event",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@contact"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.project.step_definition.LoginStepDef.the_user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in as \"store manager\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.project.step_definition.LoginStepDef.theUserLoggedInAs(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"Activities\" \"Calendar Events\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.project.step_definition.ContactStepDef.theUserNavigatesTo(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the title contains \"Calendars\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.project.step_definition.ContactStepDef.theTitleContains(java.lang.String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:87)\r\n\tat org.junit.Assert.assertTrue(Assert.java:42)\r\n\tat org.junit.Assert.assertTrue(Assert.java:53)\r\n\tat com.project.step_definition.ContactStepDef.theTitleContains(ContactStepDef.java:32)\r\n\tat ✽.the title contains \"Calendars\"(file:///C:/Users/sedur/IdeaProjects/CucumberSelfProject/src/test/resources/features/contactsPage.feature:8)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png", "screenshot");
formatter.after({
  "status": "passed"
});
});