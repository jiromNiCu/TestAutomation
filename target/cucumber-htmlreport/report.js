$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("login/login.feature");
formatter.feature({
  "line": 2,
  "name": "Login to Application",
  "description": "",
  "id": "login-to-application",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@LOGIN"
    }
  ]
});
formatter.scenarioOutline({
  "line": 14,
  "name": "Successful Login",
  "description": "",
  "id": "login-to-application;successful-login",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 13,
      "name": "@SAMPLE"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Navigate to \u003cwebsite\u003e",
  "keyword": "Given "
});
formatter.examples({
  "line": 18,
  "name": "",
  "description": "",
  "id": "login-to-application;successful-login;",
  "rows": [
    {
      "cells": [
        "website",
        "title"
      ],
      "line": 19,
      "id": "login-to-application;successful-login;;1"
    },
    {
      "cells": [
        "https://www.saucedemo.com/",
        "Vehicle Insurance Application"
      ],
      "line": 20,
      "id": "login-to-application;successful-login;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 5041828800,
  "status": "passed"
});
formatter.scenario({
  "line": 20,
  "name": "Successful Login",
  "description": "",
  "id": "login-to-application;successful-login;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@LOGIN"
    },
    {
      "line": 13,
      "name": "@SAMPLE"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "Navigate to https://www.saucedemo.com/",
  "matchedColumns": [
    0
  ],
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.saucedemo.com/",
      "offset": 12
    }
  ],
  "location": "login.navigateToWebsite(String)"
});
formatter.result({
  "duration": 1734310500,
  "status": "passed"
});
formatter.after({
  "duration": 707489800,
  "status": "passed"
});
});