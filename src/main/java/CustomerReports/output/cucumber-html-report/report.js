$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("classpath:github/git.feature");
formatter.feature({
  "name": "Test Calaulator",
  "description": " This file describes calculator functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Add two numbers",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I enter 50 in calculator",
  "keyword": "Given "
});
formatter.match({
  "location": "calc.I_enter_50_in_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press add",
  "keyword": "And "
});
formatter.match({
  "location": "calc.I_press_add()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have entered 50 in the calculator",
  "keyword": "And "
});
formatter.match({
  "location": "calc.I_have_entered_50_in_the_calculator()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I press equal symbol",
  "keyword": "When "
});
formatter.match({
  "location": "calc.I_press_equal_symbol()"
});
formatter.result({
  "status": "passed"
});
});