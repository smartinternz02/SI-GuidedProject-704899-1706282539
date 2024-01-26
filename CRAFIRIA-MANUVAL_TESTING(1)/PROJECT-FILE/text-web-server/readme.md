*** Settings ***
Resource      ../pageObjects/Page_object_craferia_web.robot

Test Setup          Setup Browser
Test Teardown       Close Browser

*** Variables ***
# User Details for test suite
&{craferia_user_info}        username=automationpractic@gmail.com     password=Test123@


*** Test Cases ***

CRAFERIA-111: Login to Craferia applicaiton
    [Tags]      Smoke   Login

     Login as    ${craferia_user_info['username']}  ${craferia_user_info['password']}
     Verify the Craferia Dashboard page is visible
     Log out

*** Keywords ***
Teardown Suite Test
     Close All Browsers
