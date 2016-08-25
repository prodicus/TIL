
PRAGMA foreign_keys=OFF;
BEGIN TRANSACTION;
CREATE TABLE person(
 id INTEGER PRIMARY KEY, 
 first_name TEXT,
 last_name TEXT, 
 age INTEGER
);
INSERT INTO "person" VALUES(0,'tasdik','rahman',20);
INSERT INTO "person" VALUES(1,'farhad','rahman',25);
CREATE TABLE pet(
 id INTEGER PRIMARY KEY, 
 name TEXT, 
 breed TEXT, 
 age INTEGER, 
 dead INTEGER
);
INSERT INTO "pet" VALUES(0,'fluffy','Unicorn',5,0);
INSERT INTO "pet" VALUES(1,'quora','social network',10,0);
INSERT INTO "pet" VALUES(2,'Goldie','German Shepherd',6,0);
INSERT INTO "pet" VALUES(3,'boxer','golden retriever',3,0);
INSERT INTO "pet" VALUES(4,'naman','kutta',10,1);
INSERT INTO "pet" VALUES(5,'hari','ohk',7,0);
CREATE TABLE person_pet(
 person_id INTEGER, 
 pet_id INTEGER
);
INSERT INTO "person_pet" VALUES(2,2);
INSERT INTO "person_pet" VALUES(2,3);
INSERT INTO "person_pet" VALUES(2,4);
INSERT INTO "person_pet" VALUES(2,5);
INSERT INTO "person_pet" VALUES(3,1);
INSERT INTO "person_pet" VALUES(3,4);
CREATE TABLE cars(
 id INTEGER PRIMARY KEY,
 car_name TEXT
);
COMMIT;
