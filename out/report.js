$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Create an Account.feature");
formatter.feature({
  "line": 1,
  "name": "Create an Account",
  "description": "",
  "id": "create-an-account",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "user creates an account",
  "description": "",
  "id": "create-an-account;user-creates-an-account",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "an open browser with qloapps.coderslab.pl",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User gives marek@wp.pl and click Create an account button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User fills up the form",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "CreateAnAccountSteps.anOpenBrowserWithQloappsCoderslabPl()"
});
formatter.result({
  "duration": 1801811547,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "marek@wp.pl",
      "offset": 11
    }
  ],
  "location": "CreateAnAccountSteps.userGivesEmailAndClickCreateAnAccountButton(String)"
});
formatter.result({
  "duration": 103628084,
  "status": "passed"
});
formatter.match({
  "location": "CreateAnAccountSteps.userFillsUpTheForm()"
});
formatter.result({
  "duration": 16367609,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//*[@id\u003d\"customer_firstname\"]\"}\n  (Session info: chrome\u003d84.0.4147.105)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027bartoszrp-HP-ProBook-440-G6\u0027, ip: \u0027127.0.1.1\u0027, os.name: \u0027Linux\u0027, os.arch: \u0027amd64\u0027, os.version: \u00275.4.0-42-generic\u0027, java.version: \u002714.0.2\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 84.0.4147.105, chrome: {chromedriverVersion: 84.0.4147.30 (48b3e868b4cc0..., userDataDir: /tmp/.com.google.Chrome.vJEUhp}, goog:chromeOptions: {debuggerAddress: localhost:34623}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: LINUX, platformName: LINUX, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 2b08584adc8b62d26349325293c05e66\n*** Element info: {Using\u003dxpath, value\u003d//*[@id\u003d\"customer_firstname\"]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat stepdefinitions.CreateAnAccountSteps.userFillsUpTheForm(CreateAnAccountSteps.java:48)\n\tat ✽.Then User fills up the form(Create an Account.feature:6)\n",
  "status": "failed"
});
formatter.match({
  "location": "CreateAnAccountSteps.closeTheBrowser()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("UserAddressChange.feature");
formatter.feature({
  "line": 1,
  "name": "Change user address after login",
  "description": "",
  "id": "change-user-address-after-login",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Change user address",
  "description": "",
  "id": "change-user-address-after-login;change-user-address",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab_shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to user address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"\u003calias\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters 1 \"\u003ccompany\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters 2 \"\u003cAddress\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters 3 \"\u003cCity\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters 4 \"\u003cZip\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters 5 Country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters 6 \"\u003cPhone Number\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User saves Address information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 15,
  "name": "",
  "description": "",
  "id": "change-user-address-after-login;change-user-address;",
  "rows": [
    {
      "cells": [
        "alias",
        "",
        "company",
        "",
        "Address",
        "",
        "City",
        "",
        "Zip",
        "",
        "Phone Number"
      ],
      "line": 16,
      "id": "change-user-address-after-login;change-user-address;;1"
    },
    {
      "cells": [
        "Koko",
        "",
        "Burma",
        "",
        "Szkolna 7",
        "",
        "Krakow",
        "",
        "88-888",
        "",
        "600-000-000"
      ],
      "line": 17,
      "id": "change-user-address-after-login;change-user-address;;2"
    },
    {
      "cells": [
        "Loko",
        "",
        "Karma",
        "",
        "Jasna 12",
        "",
        "Radom",
        "",
        "01-123",
        "",
        "500-000-000"
      ],
      "line": 18,
      "id": "change-user-address-after-login;change-user-address;;3"
    },
    {
      "cells": [
        "Spoko",
        "",
        "Rex",
        "",
        "Ciemna 12",
        "",
        "Leszno",
        "",
        "99-444",
        "",
        "100-000-000"
      ],
      "line": 19,
      "id": "change-user-address-after-login;change-user-address;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 17,
  "name": "Change user address",
  "description": "",
  "id": "change-user-address-after-login;change-user-address;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab_shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to user address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Koko\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters 1 \"Burma\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters 2 \"Szkolna 7\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters 3 \"Krakow\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters 4 \"88-888\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters 5 Country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters 6 \"600-000-000\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User saves Address information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressStepDefinitions.userIsLoggedInToCodersLab_shop()"
});
formatter.result({
  "duration": 2753514657,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userGoesToUserAddressPage()"
});
formatter.result({
  "duration": 426959448,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Koko",
      "offset": 13
    }
  ],
  "location": "AddressStepDefinitions.userEntersAlias(String)"
});
formatter.result({
  "duration": 105271753,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Burma",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCompany(String)"
});
formatter.result({
  "duration": 114751546,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Szkolna 7",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersAddress(String)"
});
formatter.result({
  "duration": 111946129,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Krakow",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCity(String)"
});
formatter.result({
  "duration": 109724783,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "88-888",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersZip(String)"
});
formatter.result({
  "duration": 159149705,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "AddressStepDefinitions.userEntersCountry(int)"
});
formatter.result({
  "duration": 865777,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "600-000-000",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersPhone(String)"
});
formatter.result({
  "duration": 132914907,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userSavesAddressInformation()"
});
formatter.result({
  "duration": 610496284,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 16
    }
  ],
  "location": "AddressStepDefinitions.userSeesInfo(String)"
});
formatter.result({
  "duration": 26378078,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Change user address",
  "description": "",
  "id": "change-user-address-after-login;change-user-address;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab_shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to user address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Loko\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters 1 \"Karma\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters 2 \"Jasna 12\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters 3 \"Radom\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters 4 \"01-123\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters 5 Country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters 6 \"500-000-000\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User saves Address information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressStepDefinitions.userIsLoggedInToCodersLab_shop()"
});
formatter.result({
  "duration": 2771345498,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userGoesToUserAddressPage()"
});
formatter.result({
  "duration": 402908348,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Loko",
      "offset": 13
    }
  ],
  "location": "AddressStepDefinitions.userEntersAlias(String)"
});
formatter.result({
  "duration": 110917299,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Karma",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCompany(String)"
});
formatter.result({
  "duration": 104395626,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jasna 12",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersAddress(String)"
});
formatter.result({
  "duration": 105025656,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Radom",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCity(String)"
});
formatter.result({
  "duration": 104871320,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01-123",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersZip(String)"
});
formatter.result({
  "duration": 104384003,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "AddressStepDefinitions.userEntersCountry(int)"
});
formatter.result({
  "duration": 70574,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "500-000-000",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersPhone(String)"
});
formatter.result({
  "duration": 115761578,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userSavesAddressInformation()"
});
formatter.result({
  "duration": 584913254,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 16
    }
  ],
  "location": "AddressStepDefinitions.userSeesInfo(String)"
});
formatter.result({
  "duration": 24662725,
  "status": "passed"
});
formatter.scenario({
  "line": 19,
  "name": "Change user address",
  "description": "",
  "id": "change-user-address-after-login;change-user-address;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "User is logged in to CodersLab_shop",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User goes to user address page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "User enters \"Spoko\"",
  "matchedColumns": [
    0
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User enters 1 \"Rex\"",
  "matchedColumns": [
    2
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User enters 2 \"Ciemna 12\"",
  "matchedColumns": [
    4
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters 3 \"Leszno\"",
  "matchedColumns": [
    6
  ],
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User enters 4 \"99-444\"",
  "matchedColumns": [
    8
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User enters 5 Country",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "User enters 6 \"100-000-000\"",
  "matchedColumns": [
    10
  ],
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "User saves Address information",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "User sees info \"Address successfully added!\"",
  "keyword": "Then "
});
formatter.match({
  "location": "AddressStepDefinitions.userIsLoggedInToCodersLab_shop()"
});
formatter.result({
  "duration": 2760753800,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userGoesToUserAddressPage()"
});
formatter.result({
  "duration": 409804924,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Spoko",
      "offset": 13
    }
  ],
  "location": "AddressStepDefinitions.userEntersAlias(String)"
});
formatter.result({
  "duration": 110106173,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rex",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCompany(String)"
});
formatter.result({
  "duration": 103702579,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Ciemna 12",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersAddress(String)"
});
formatter.result({
  "duration": 117783522,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Leszno",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersCity(String)"
});
formatter.result({
  "duration": 114532235,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "99-444",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersZip(String)"
});
formatter.result({
  "duration": 106185809,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 12
    }
  ],
  "location": "AddressStepDefinitions.userEntersCountry(int)"
});
formatter.result({
  "duration": 87008,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100-000-000",
      "offset": 15
    }
  ],
  "location": "AddressStepDefinitions.userEntersPhone(String)"
});
formatter.result({
  "duration": 100707362,
  "status": "passed"
});
formatter.match({
  "location": "AddressStepDefinitions.userSavesAddressInformation()"
});
formatter.result({
  "duration": 576439504,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Address successfully added!",
      "offset": 16
    }
  ],
  "location": "AddressStepDefinitions.userSeesInfo(String)"
});
formatter.result({
  "duration": 24840064,
  "status": "passed"
});
formatter.uri("UserDataChange.feature");
formatter.feature({
  "line": 1,
  "name": "Change user information after login",
  "description": "",
  "id": "change-user-information-after-login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Change user birthday date, gender and sign up for a newsletter",
  "description": "",
  "id": "change-user-information-after-login;change-user-birthday-date,-gender-and-sign-up-for-a-newsletter",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is logged in to CodersLab shop",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User goes to user information page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User signs up for our newsletter",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User changes his gender",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Sets birthday date to \"10/06/1990\"",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User saves information",
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "User sees \"Information successfully updated.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UserInfoSteps.userIsLoggedInToCodersLabShop()"
});
formatter.result({
  "duration": 3620514780,
  "status": "passed"
});
formatter.match({
  "location": "UserInfoSteps.userGoesToUserInformationPage()"
});
formatter.result({
  "duration": 553175427,
  "status": "passed"
});
formatter.match({
  "location": "UserInfoSteps.userSignsUpForOurNewsletter()"
});
formatter.result({
  "duration": 20911723,
  "status": "passed"
});
formatter.match({
  "location": "UserInfoSteps.userChangesHisGender()"
});
formatter.result({
  "duration": 19430681,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10/06/1990",
      "offset": 23
    }
  ],
  "location": "UserInfoSteps.userChangesHisBirthdayTo(String)"
});
formatter.result({
  "duration": 124048993,
  "status": "passed"
});
formatter.match({
  "location": "UserInfoSteps.userSavesInformation()"
});
formatter.result({
  "duration": 728011246,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Information successfully updated.",
      "offset": 11
    }
  ],
  "location": "UserInfoSteps.userSees(String)"
});
formatter.result({
  "duration": 23535966,
  "status": "passed"
});
formatter.uri("google-text-search.feature");
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
  "duration": 1409543046,
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
  "duration": 884756008,
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
  "duration": 1109799288,
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
  "duration": 77576,
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
  "duration": 66397,
  "status": "passed"
});
formatter.match({
  "location": "GoogleSteps.closeBrowser()"
});
formatter.result({
  "duration": 65903557,
  "status": "passed"
});
});