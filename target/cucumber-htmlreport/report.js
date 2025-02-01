$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("EbaySearch.feature");
formatter.feature({
  "line": 2,
  "name": "Ebay Search Functionality",
  "description": "",
  "id": "ebay-search-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@smoke"
    },
    {
      "line": 1,
      "name": "@SKYW-15"
    },
    {
      "line": 1,
      "name": "@E2E"
    }
  ]
});
formatter.before({
  "duration": 3926907600,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 7,
  "name": "Search for Shoes",
  "description": "",
  "id": "ebay-search-functionality;search-for-shoes",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "Open Ebay Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "Search for shoes",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "Item list should have only shoes related products",
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
formatter.after({
  "duration": 774516800,
  "status": "passed"
});
});