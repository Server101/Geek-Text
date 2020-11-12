# Geek-Text
Web Application Book Store

1-Ivan alberti 2-Martin 3 Luis Alvarez 4-Walter 5-Randy 6-Ricardo

Here is the repository for the UI https://github.com/Server101/textbookstore-ui


Dependencies:
In this branch the SQlite configuration was created in the application.properites folders and pomxl.
The new dependencies is Spring data Jpa, rest repository web, (Sql lite Do not forget the version number, and sqlite-dialect)

Database:
The database is embedded in a file called bike.db in the top folder structure. It uses sqlite 3.0 and cannot be renamed or edited in IDE.
Use SQLite Studio separate software to access the database. Once installed simply select the file path for bike.db location in your machine. 
Upon successful connection datbase tables should appear. Download here https://sqlitestudio.pl/

Creating API:
The api creation involves 4 features:
1. The .java table entity (always save in models folder)
2. The Repository.java (Saved in folder repositories)
3. The rest controller .java (Saved under controller)
4. The actual database table which is stored in bike.db. The table must follow the same entities described  in the .java file created in models folder.

see examples of user.java, userRepository.java, userController.Java, user table in database. 


