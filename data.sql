DROP TABLE IF EXISTS EMPLOYEE;

CREATE TABLE EMPLOYEE (
	id INT AUTO_INCREMENT PRIMARY KEY,
	name VARCHAR(250) NOT NULL,
	position VARCHAR(250) NOT NULL,
	office VARCHAR(250) NOT NULL,
	age INT NOT NULL,
	START_DATE DATE NOT NULL,
	SALARY NUMBER(9,2) DEFAULT NULL
);

INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Airi Satou', 'Accountant', 'Tokyo', 33, '2008-11-28', 162700);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Angelica Ramos', 'Chief Executive Officer (CEO)', 'London', 47, '2008-11-29', 1200000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Ashton Cox', 'Junior Technical Author', 'San Francisco', 66, '2008-11-30', 86000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Bradley Greer', 'Software Engineer', 'London', 41, '2008-12-01', 132000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Brenden Wagner', 'Software Engineer', 'San Francisco', 28, '2008-12-02', 206850);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Brielle Williamson', 'Integration Specialist', 'New York', 61, '2008-12-03', 372000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Bruno Nash', 'Software Engineer', 'London', 38, '2008-12-04', 163500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Caesar Vance', 'Pre-Sales Support', 'New York', 21, '2008-12-05', 106450);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Cara Stevens', 'Sales Assistant', 'New York', 46, '2008-12-06', 145600);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Cedric Kelly', 'Senior Javascript Developer', 'Edinburgh', 22, '2008-12-07', 433060);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Charde Marshall', 'Regional Director', 'San Francisco', 36, '2008-12-08', 470600);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Colleen Hurst', 'Javascript Developer', 'San Francisco', 39, '2008-12-09', 205500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Dai Rios', 'Personnel Lead', 'Edinburgh', 35, '2008-12-10', 217500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Donna Snider', 'Customer Support', 'New York', 27, '2008-12-11', 112000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Doris Wilder', 'Sales Assistant', 'Sidney', 23, '2008-12-12', 85600);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Finn Camacho', 'Support Engineer', 'San Francisco', 47, '2008-12-13', 87500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Fiona Green', 'Chief Operating Officer (COO)', 'San Francisco', 48, '2008-12-14', 850000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Garrett Winters', 'Accountant', 'Tokyo', 63, '2008-12-15', 170750);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Gavin Cortez', 'Team Leader', 'San Francisco', 22, '2008-12-16', 235500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Gavin Joyce', 'Developer', 'Edinburgh', 42, '2008-12-17', 92575);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Gloria Little', 'Systems Administrator', 'New York', 59, '2008-12-18', 237500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Haley Kennedy', 'Senior Marketing Designer', 'London', 43, '2008-12-19', 313500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Hermione Butler', 'Regional Director', 'London', 47, '2008-12-20', 356250);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Herrod Chandler', 'Sales Assistant', 'San Francisco', 59, '2008-12-21', 137500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Hope Fuentes', 'Secretary', 'San Francisco', 41, '2008-12-22', 109850);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Howard Hatfield', 'Office Manager', 'San Francisco', 51, '2008-12-23', 164500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jackson Bradshaw', 'Director', 'New York', 65, '2008-12-24', 645750);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jena Gaines', 'Office Manager', 'London', 30, '2008-12-25', 90560);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jenette Caldwell', 'Development Lead', 'New York', 30, '2008-12-26', 345000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jennifer Acosta', 'Junior Javascript Developer', 'Edinburgh', 43, '2008-12-27', 75650);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jennifer Chang', 'Regional Director', 'Singapore', 28, '2008-12-28', 357650);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Jonas Alexander', 'Developer', 'San Francisco', 30, '2008-12-29', 86500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Lael Greer', 'Systems Administrator', 'London', 21, '2008-12-30', 103500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Martena Mccray', 'Post-Sales support', 'Edinburgh', 46, '2008-12-31', 324050);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Michael Bruce', 'Javascript Developer', 'Singapore', 29, '2009-01-01', 183000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Michael Silva', 'Marketing Designer', 'London', 66, '2009-01-02', 198500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Michelle House', 'Integration Specialist', 'Sidney', 37, '2009-01-03', 95400);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Olivia Liang', 'Support Engineer', 'Singapore', 64, '2009-01-04', 234500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Paul Byrd', 'Chief Financial Officer (CFO)', 'New York', 64, '2009-01-05', 725000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Prescott Bartlett', 'Technical Author', 'London', 27, '2009-01-06', 145000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Quinn Flynn', 'Support Lead', 'Edinburgh', 22, '2009-01-07', 342000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Rhona Davidson', 'Integration Specialist', 'Tokyo', 55, '2009-01-08', 327900);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Sakura Yamamoto', 'Support Engineer', 'Tokyo', 37, '2009-01-09', 139575);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Serge Baldwin', 'Data Coordinator', 'Singapore', 64, '2009-01-10', 138575);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Shad Decker', 'Regional Director', 'Edinburgh', 51, '2009-01-11', 183000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Shou Itou', 'Regional Marketing', 'Tokyo', 20, '2009-01-12', 163000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Sonya Frost', 'Software Engineer', 'Edinburgh', 23, '2009-01-13', 103600);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Suki Burks', 'Developer', 'London', 53, '2009-01-14', 114500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Tatyana Fitzpatrick', 'Regional Director', 'London', 19, '2009-01-15', 385750);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Thor Walton', 'Developer', 'New York', 61, '2009-01-16', 98540);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Tiger Nixon', 'System Architect', 'Edinburgh', 61, '2009-01-17', 320800);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Timothy Mooney', 'Office Manager', 'London', 37, '2009-01-18', 136200);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Unity Butler', 'Marketing Designer', 'San Francisco', 47, '2009-01-19', 85675);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Vivian Harrell', 'Financial Controller', 'San Francisco', 62, '2009-01-20', 452500);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Yuri Berry', 'Chief Marketing Officer (CMO)', 'New York', 40, '2009-01-21', 675000);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Zenaida Frank', 'Software Engineer', 'New York', 63, '2009-01-22', 125250);
INSERT INTO EMPLOYEE (name, position, office, age, START_DATE, SALARY) VALUES ('Zorita Serrano', 'Software Engineer', 'San Francisco', 56, '2009-01-23', 115000);




