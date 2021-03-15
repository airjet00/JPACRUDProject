# JPACRUDProject

### Description
A full-stack Spring MVC web application that retrieves, searches, adds, deletes, and edits film data. Allows the user to choose actions and submit query data, based on film information in database.

###Structure
Full web-based C.R.U.D. functionality, using Spring MVC and DAO pattern. The DAO implementation uses JDBC to persist, retrieve and manipulate data.

###Technology Used
Spring MVC
JDBC
JSTL
Mysql
DAO functionality
HTLM
Gradle

###How to run
Open web-page via AWS EC2 or from server. From the home page select from menu: "Search for film by ID", "Search for film by keyword", "Add a film to the database".

Search for film by ID: will direct you to a new menu to input the film ID or return home. After inputing film ID the film information will be displayed, with new options to edit film, delete film, or return home.

Search form film by keyword: Will direct you to a new menu to input a keyword search that will search title/Description for that keyword and display the resulting films with the information about the film. Options to edit film, delete film or return home are displayed.

Add a film to the database: will direct you to a new web-page to input the basic information for a film. After you it will display the newly added film information. The options to edit this film, delete, or return home are displayed.

Edit film: Will display current film information with text box to enter new updated film information. Submit will display updated film information with option to return home

Delete film: Will prompt for current film ID and will delete all film information related to the film ID. Option to return home.

###Lessons learned
 
