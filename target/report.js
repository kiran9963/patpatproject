$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Features/file1.feature");
formatter.feature({
  "name": "PatPatProject",
  "description": "  I want to use this template for my feature file",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "product addtocart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@tag1"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I want to enter the product name",
  "keyword": "When "
});
formatter.match({
  "location": "Execution.i_want_to_enter_the_product_name()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click the img",
  "keyword": "When "
});
formatter.match({
  "location": "Execution.i_want_to_click_the_img()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click the Addtocart",
  "keyword": "When "
});
formatter.match({
  "location": "Execution.i_want_to_click_the_Addtocart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click the Viewcart",
  "keyword": "When "
});
formatter.match({
  "location": "Execution.i_want_to_click_the_Viewcart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want to click the ProceedToCart",
  "keyword": "When "
});
formatter.match({
  "location": "Execution.i_want_to_click_the_ProceedToCart()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I want provide the details",
  "keyword": "Then "
});
formatter.match({
  "location": "Execution.i_want_provide_the_details()"
});
formatter.result({
  "status": "passed"
});
});