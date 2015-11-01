
PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE person(
 id INTEGER PRIMARY KEY, 
 first_name TEXT,
 last_name TEXT, 
 age INTEGER
, dead INTEGER, phone_number INTEGER, salary FLOAT, dob DATETIME);
INSERT INTO "person" VALUES(0,'tasdik','rahman',20,0,9929,123123.0,'2015-12-09');
INSERT INTO "person" VALUES(1,'farhad','rahman',25,0,12,123123.0,'2004-12-11');
INSERT INTO "person" VALUES(2,'nidhi','mahanta',19,0,12,123123.0,'2005-12-11');
INSERT INTO "person" VALUES(3,'rhyma','hussain',30,0,12,123123.0,'2002-12-11');
INSERT INTO "person" VALUES(4,'vidhi','mahanta',24,0,12,123123.0,'2001-12-11');
CREATE TABLE pet(
 id INTEGER PRIMARY KEY, 
 name TEXT, 
 breed TEXT, 
 age INTEGER, 
 dead INTEGER
, dob DATETIME, parent_id INTEGER);
INSERT INTO "pet" VALUES(0,'fluffy','Unicorn',5,0,NULL,NULL);
INSERT INTO "pet" VALUES(1,'quora','social network',10,0,NULL,NULL);
INSERT INTO "pet" VALUES(2,'Goldie','German Shepherd',6,0,NULL,NULL);
INSERT INTO "pet" VALUES(3,'boxer','golden retriever',3,0,NULL,NULL);
INSERT INTO "pet" VALUES(4,'naman','kutta',10,1,NULL,NULL);
INSERT INTO "pet" VALUES(5,'hari','ohk',7,0,NULL,NULL);
CREATE TABLE person_pet(
 person_id INTEGER, 
 pet_id INTEGER
, purchased_on DATETIME);
INSERT INTO "person_pet" VALUES(2,2,'2002-03-30');
INSERT INTO "person_pet" VALUES(2,3,'2001-04-30');
INSERT INTO "person_pet" VALUES(2,4,'2005-04-30');
INSERT INTO "person_pet" VALUES(2,5,'2003-04-30');
INSERT INTO "person_pet" VALUES(3,1,'2006-04-30');
INSERT INTO "person_pet" VALUES(3,4,'2005-04-30');
CREATE TABLE cars(
 id INTEGER PRIMARY KEY,
 car_name TEXT
);
COMMIT;
