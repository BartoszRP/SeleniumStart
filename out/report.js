$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("google-text-search.feature");
formatter.feature({
  "line": 1,
  "name": "Google search",
  "description": "",
  "id": "google-search",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user can search any keyword",
  "description": "",
  "id": "google-search;user-can-search-any-keyword",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "an open browser with google.com",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a keyword Selenium is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "a keyword Lewandowski is entered in input field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "the first one should contain selenium",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "the first one should contain Lewandowski",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "GoogleSteps.anOpenBrowserWithGoogleCom()"
});
formatter.result({
  "duration": 2152941549,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Selenium",
      "offset": 10
    }
  ],
  "location": "GoogleSteps.aKeywordSeleniumIsEnteredInInputField(String)"
});
formatter.result({
  "duration": 1002596046,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lewandowski",
      "offset": 10
    }
  ],
  "location": "GoogleSteps.aKeywordSeleniumIsEnteredInInputField(String)"
});
formatter.result({
  "duration": 996788929,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "selenium",
      "offset": 29
    }
  ],
  "location": "GoogleSteps.theFirstOneShouldContainSelenium(String)"
});
formatter.result({
  "duration": 110538,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Lewandowski",
      "offset": 29
    }
  ],
  "location": "GoogleSteps.theFirstOneShouldContainSelenium(String)"
});
formatter.result({
  "duration": 156961,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.closeBrowser()"
});
formatter.result({
  "duration": 66657444,
  "status": "passed"
});
});