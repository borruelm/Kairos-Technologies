# Kairos Technologies
## Martin Borruel Cortez From Bhuvi

 This project represents our solution for the given request based on the PDF you provided
 
 ## Features
 - Rest Application
    - check if a city has a connection to another one based on a PDF
- connected End Point
    - checks from a file with a city connection list
- unit testing
    - includes unit testing for services and controllers
- Bonus
    - In case we do not provide a param, we are returning a 400 (request error) and letting the user to know that given param should be provided, both are required therefor we included such a validation


### Sample URL's
- http://localhost:8080/connected?origin=Boston&destination=New%20York 
    - response YES
- http://localhost:8080/connected?origin=Bost&destination=New%20York 
    - response no
- http://localhost:8080/connected?origin=India&destination=Pakistan
    - response no
- http://localhost:8080/connected?
    - Error 400 indicating which field is missing
    

Thanks for your time 