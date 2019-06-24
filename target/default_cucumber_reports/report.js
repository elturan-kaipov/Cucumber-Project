$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/wiki.feature");
formatter.feature({
  "name": "Wikipedia search feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Wikipedia search test",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@wiki"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is on the wikipedia homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "Wiki_steps.user_is_on_the_wikipedia_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters steve jobs to search bar and clicks enter",
  "keyword": "When "
});
formatter.match({
  "location": "Wiki_steps.user_enters_steve_jobs_to_search_bar_and_clicks_enter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see the first header is displaying steve jobs",
  "keyword": "Then "
});
formatter.match({
  "location": "Wiki_steps.user_should_see_the_first_header_is_displaying_steve_jobs()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});