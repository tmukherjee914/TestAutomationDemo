$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("/Users/test/Desktop/WPOS_Automation/Demo_amazon/src/test/resources/Features/Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search item",
  "description": "",
  "id": "search-item",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Search an item",
  "description": "",
  "id": "search-item;search-an-item",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@search"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "user is on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "user enter \"one plus 7\"",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user select on third option from the list",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user should navigates to item detail page",
  "keyword": "Then "
});
formatter.match({
  "location": "ItemSearchDefinition.user_is_on_Home_page()"
});
formatter.result({
  "duration": 3936847748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "one plus 7",
      "offset": 12
    }
  ],
  "location": "ItemSearchDefinition.user_enter(String)"
});
formatter.result({
  "duration": 13533554608,
  "status": "passed"
});
formatter.match({
  "location": "ItemSearchDefinition.user_select_on_third_option_from_the_list()"
});
formatter.result({
  "duration": 2006669450,
  "status": "passed"
});
formatter.match({
  "location": "ItemSearchDefinition.user_should_navigates_to_item_detail_page()"
});
formatter.result({
  "duration": 17285,
  "status": "passed"
});
});