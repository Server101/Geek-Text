
/*SQL tables for the embedded database*/
/*Testing Deployment*/

DROP TABLE IF EXISTS TBL_EMPLOYEES;
  
CREATE TABLE TBL_EMPLOYEES (
  id INT  PRIMARY KEY,
  first_name VARCHAR(250) NOT NULL,
  last_name VARCHAR(250) NOT NULL,
  email VARCHAR(250) DEFAULT NULL
);