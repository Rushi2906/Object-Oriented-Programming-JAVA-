CREATE TABLE DEPOSITE
(
	ACTNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2),
	ADATE DATETIME
)

CREATE TABLE BRANCH
(
	BNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE CUSTOMERS
(
	CNAME VARCHAR(50),
	CITY VARCHAR(50)
)

CREATE TABLE BORROW
(
	LOANNO INT,
	CNAME VARCHAR(50),
	BNAME VARCHAR(50),
	AMOUNT DECIMAL(8,2)
)


Insert into DEPOSIT values(101,'ANIL','VRCE',1000,'1995-03-01')
Insert into DEPOSIT values(102,'SUNIL','AJNI',5000,'1996-04-01')
Insert into DEPOSIT values(103,'MEHUL','KAROLBAGH',3500,'1995-11-17')
Insert into DEPOSIT values(104,'MADHURI','CHANDI',1200,'1995-12-17')
Insert into DEPOSIT values(105,'PRAMOD','M.G.ROAD',3000,'1996-03-27')
Insert into DEPOSIT values(106,'SANDIP','ANDHERI',2000,'1996-03-31')
Insert into DEPOSIT values(107,'SHIVANI','VIRAR',1000,'1995-09-05')
Insert into DEPOSIT values(108,'KRANTI','NEHRU PLACE',5000,'1995-07-02')
Insert into DEPOSIT values(109,'MINU','POWAI',7000,'1995-08-10')





INSERT INTO BRANCH VALUES('AJNI','NAGPUR')
INSERT INTO BRANCH VALUES('KAROLBAGH','DELHI')
INSERT INTO BRANCH VALUES('CHANDI','DELHI')
INSERT INTO BRANCH VALUES('DHARAMPETH','NAGPUR')
INSERT INTO BRANCH VALUES('M.G.ROAD','BANGLORE')
INSERT INTO BRANCH VALUES('ANDHERI','BOMBAY')
INSERT INTO BRANCH VALUES('VIRAR','BOMBAY')
INSERT INTO BRANCH VALUES('NEHRU PLACE','DELHI')
INSERT INTO BRANCH VALUES('POWAI','BOMBAY')


INSERT INTO CUSTOMERS VALUES('ANIL','CALCUTTA')
INSERT INTO CUSTOMERS VALUES('SUNIL','DELHI')
INSERT INTO CUSTOMERS VALUES('MEHUL','BARODA')
INSERT INTO CUSTOMERS VALUES('MANDAR','PATNA')
INSERT INTO CUSTOMERS VALUES('MADHURI','NAGPUR')
INSERT INTO CUSTOMERS VALUES('PRAMOD','NAGPUR')
INSERT INTO CUSTOMERS VALUES('SANDIP','SURAT')
INSERT INTO CUSTOMERS VALUES('SHIVANI','BOMBAY')
INSERT INTO CUSTOMERS VALUES('KRANTI','BOMBAY')
INSERT INTO CUSTOMERS VALUES('NAREN','BOMBAY')

INSERT INTO BORROW VALUES(201,'ANIL','VRCE',1000)
INSERT INTO BORROW VALUES(206,'MEHUL','AJNI',5000)
INSERT INTO BORROW VALUES(311,'SUNIL','DHARAMPETH',3000)
INSERT INTO BORROW VALUES(321,'MADHURI','ANDHERI',2000)
INSERT INTO BORROW VALUES(375,'PRAMOD','VIRAR',8000)
INSERT INTO BORROW VALUES(481,'KRANTI','NEHRU PLACE',3000)

/*2.1*/

/*1*/
SELECT * FROM DEPOSIT
/*2*/
SELECT * FROM BORROW
/*3*/
SELECT * FROM CUSTOMERS
/*4*/
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT
/*5*/
SELECT LOANNO,AMOUNT FROM BORROW
/*6*/
SELECT * FROM BORROW WHERE BNAME='ANDHERI' 
/*7*/
SELECT ACTNO,AMOUNT FROM DEPOSIT WHERE ACTNO=106 
/*8*/
SELECT CNAME FROM BORROW WHERE AMOUNT>5000
/*9*/
SELECT CNAME FROM DEPOSIT WHERE ADATE>'1996-12-01' 
/*10*/
SELECT CNAME FROM DEPOSIT WHERE ACTNO<105
/*11*/
SELECT CNAME FROM CUSTOMERS WHERE CITY='NAGPUR' OR CITY='DELHI'
/*12*/
SELECT CNAME,BNAME FROM DEPOSIT WHERE AMOUNT>4000 AND ACTNO<105
/*13*/
SELECT CNAME FROM BORROW WHERE AMOUNT>=3000 AND AMOUNT<=8000 

SELECT CNAME FROM BORROW WHERE AMOUNT BETWEEN 3000 AND 8000
/*14*/
SELECT CNAME FROM DEPOSIT WHERE BNAME!='ANDHERI'

SELECT CNAME FROM DEPOSIT WHERE BNAME<>'ANDHERI'
/*15*/
SELECT CNAME FROM BORROW WHERE AMOUNT IS NULL
/*16*/
SELECT ACTNO,CNAME,AMOUNT FROM DEPOSIT WHERE BNAME IN('AJNI','KAROLBAGH','M.G.ROAD') AND ACTNO<104
/*17*/
SELECT TOP 5 * FROM DEPOSIT   
/*18*/
SELECT TOP 3 CNAME,BNAME FROM DEPOSIT WHERE AMOUNT>1000
/*19*/
SELECT TOP 5 LOANNO,CNAME FROM BORROW WHERE BNAME<>'ANDHERI'
/*20*/
SELECT DISTINCT CITY FROM CUSTOMERS
/*21*/
SELECT DISTINCT BNAME FROM BRANCH
/*22*/
SELECT * FROM CUSTOMERS ORDER BY CITY ASC

SELECT * FROM CUSTOMERS ORDER BY CITY 
/*23*/
SELECT * FROM DEPOSIT ORDER BY AMOUNT DESC
/*24*/
SELECT * FROM CUSTOMERS ORDER BY CITY DESC
/*25*/
SELECT DISTINCT CNAME AS UNI_BORROWER FROM BORROW 

/*2.2*/

/*1*/
UPDATE DEPOSIT SET AMOUNT=5000 WHERE AMOUNT=3000

SELECT * FROM DEPOSIT

/*2*/
UPDATE BORROW SET BNAME='C.G.ROAD' WHERE CNAME='VRCE'

SELECT * FROM BORROW

/*3*/
UPDATE DEPOSIT SET ACTNO=111,AMOUNT=5000 WHERE CNAME='SANDIP' 

SELECT * FROM DEPOSIT

/*4*/
UPDATE DEPOSIT SET AMOUNT=AMOUNT+(AMOUNT*0.1)

SELECT * FROM DEPOSIT

/*5*/
UPDATE DEPOSIT SET AMOUNT=5000 WHERE ACTNO BETWEEN 103 AND 107

SELECT *FROM DEPOSIT

/*6*/
UPDATE BORROW SET AMOUNT=NULL WHERE LOANNO=321

SELECT * FROM BORROW

/*7*/
UPDATE BORROW SET LOANNO=401,BNAME='AJNI' WHERE LOANNO=201 AND BNAME='VRCE'

SELECT * FROM BORROW

/*8*/
UPDATE CUSTOMERS SET CNAME='ANIL JAIN' WHERE CNAME='ANIL'

/*9*/
UPDATE DEPOSIT SET CNAME='RAMESH',BNAME='VRCE',AMOUNT=5500 WHERE ACTNO=102

/*10*/
UPDATE BORROW SET BNAME=NULL,AMOUNT=NULL WHERE LOANNO=481 AND CNAME='KRANTI'  


/*LAB 2.3*/

/*1*/
DELETE FROM CUSTOMERS WHERE CITY='BOMBAY'

/*2*/
DELETE FROM BORROW WHERE AMOUNT<=1000

/*3*/
DELETE FROM BORROW WHERE BNAME='AJNI'

/*4*/
DELETE FROM BORROW WHERE LOANNO>201 AND LOANNO<210
SELECT * FROM BORROW

/*5*/
DELETE FROM DEPOSIT WHERE ADATE>'1996-12-01'
SELECT * FROM DEPOSIT

/*6*/
TRUNCATE TABLE CUSTOMERS

/*7*/
DELETE FROM DEPOSIT WHERE ACTNO=201 AND CNAME='AJNI'

/*8*/
DELETE FROM DEPOSIT WHERE BNAME!='ANDHERI'
SELECT* FROM DEPOSIT

/*9*/
DELETE FROM BORROW WHERE LOANNO<2000 AND BNAME<>'VRCE'

/*10*/
DROP TABLE BRANCH

/*LAB 3*/

CREATE TABLE STUDENT
(
	ENROLLMENT_NO VARCHAR(20),
	NAME VARCHAR(25),
	CPI DECIMAL(5,2),
	BIRTHDATE DATETIME
)

SELECT * FROM STUDENT

/*1*/
ALTER TABLE STUDENT
ADD CITY VARCHAR(20) NULL,
BACKLOG INT NOT NULL
 
SELECT * FROM STUDENT

/*2*/
ALTER TABLE STUDENT
ALTER COLUMN NAME VARCHAR(35)

/*3*/
ALTER TABLE STUDENT
ALTER COLUMN CPI INT

/*4*/
SP_RENAME 'STUDENT.ENROLLMENT_NO','ENO','COLUMN'
SELECT * FROM STUDENT

/*5*/
ALTER TABLE STUDENT
DROP COLUMN CITY  

/*6*/
SP_RENAME 'STUDENT','STUDENT_MASTER'
SELECT * FROM STUDENT_MASTER 

/*7*/
ALTER TABLE STUDENT_MASTER
DROP COLUMN BACKLOG

/*8*/
ALTER TABLE STUDENT_MASTER
ALTER COLUMN NAME VARCHAR(25) NOT NULL

/*9*/
SP_RENAME 'STUDENT_MASTER.BIRTHDATE','BDATE','COLUMN'
SELECT * FROM STUDENT_MASTER

/*10*/
ALTER TABLE STUDENT_MASTER
ALTER COLUMN ENO VARCHAR(12)


/*LAB 5*/

CREATE TABLE STUDENTS
(
	STUID INT,
	FIRSTNAME VARCHAR(25),
	LASTNAME VARCHAR(25),
	WEBSITE VARCHAR(50),
	CITY VARCHAR(25),
	DIVISION VARCHAR(20)
)

INSERT INTO STUDENTS VALUES(1011,'KEYUR','PATEL','technothenet.com','RAJKOT','II-BCX')
INSERT INTO STUDENTS VALUES(1022,'HARDIK','SHAH','digminecraft.com','AHMEDABAD','I-BCY')
INSERT INTO STUDENTS VALUES(1033,'KAJAL','TRIVEDI','bigactivities.com','BARODA','IV-DCX')
INSERT INTO STUDENTS VALUES(1044,'BHOOMI','GAJERA','checkyourmath.com','AHMEDABAD','III-DCW')
INSERT INTO STUDENTS VALUES(1055,'HARMIT','MITEL',NULL,'RAJKOT','II-BCY')
INSERT INTO STUDENTS VALUES(1066,'ASHOK','JANI',NULL,'BARODA','II-BCZ')

/*1*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE 'K%'

/*2*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE '_____'

/*3*/
SELECT * FROM STUDENTS WHERE CITY LIKE '_____A'

/*4*/
SELECT * FROM STUDENTS WHERE LASTNAME LIKE '%TEL'  

/*5*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE 'HA%T' 

/*6*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE 'K_Y%' 
SELECT * FROM STUDENTS

/*7*/
SELECT * FROM STUDENTS WHERE WEBSITE IS NULL AND FIRSTNAME LIKE '_____' 

/*8*/
SELECT * FROM STUDENTS WHERE LASTNAME LIKE '%JER%' 

/*9*/
SELECT * FROM STUDENTS WHERE CITY LIKE '[R,B]%' 

/*10*/
SELECT * FROM STUDENTS WHERE WEBSITE IS NOT NULL 

/*11*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE '[A-H]%' 

/*12*/
SELECT * FROM STUDENTS WHERE FIRSTNAME LIKE '_[A,E,I,O,U]%' 

/*13*/
SELECT * FROM STUDENTS WHERE CITY LIKE '%ROD%'

/*14*/
SELECT FIRSTNAME,LASTNAME FROM STUDENTS WHERE WEBSITE LIKE 'BI%' 

/*15*/
SELECT * FROM STUDENTS WHERE LASTNAME LIKE '_____' 

/*16*/
SELECT * FROM STUDENTS WHERE CITY LIKE '______' AND CITY NOT LIKE 'BA%'

/*17*/
SELECT * FROM STUDENTS WHERE DIVISION LIKE 'II%'

/*18*/
SELECT * FROM STUDENTS WHERE DIVISION LIKE '%BC%'

/*19*/
SELECT * FROM STUDENTS WHERE DIVISION LIKE '______' AND WEBSITE IS NOT NULL

/*20*/
SELECT * FROM STUDENTS WHERE FIRSTNAME NOT LIKE '__[A,E,I,O,U]%'

















/*Lab-6*/

/*1*/
SELECT 5*30

/*2*/
SELECT ABS(-25),ABS(25),ABS(-50),ABS(50)

/*3*/
SELECT CEILING(25.2),CEILING(25.7),CEILING(-25.2)

/*4*/
SELECT FLOOR(25.2),FLOOR(25.7),FLOOR(-25.2)

/*5*/
SELECT 5%2,5%3 

/*6*/
SELECT POWER(3,2),POWER(4,3)

/*7*/
SELECT SQRT(25),SQRT(30),SQRT(50)

/*8*/
SELECT SQUARE(5),SQUARE(15),SQUARE(25)

/*9*/
SELECT PI()

/*10*/
SELECT ROUND(157.732,2),ROUND(157.732,0),ROUND(157.732,-2)

/*11*/
SELECT EXP(2),EXP(3)

/*12*/
SELECT LOG10(5),LOG10(100)

/*13*/
SELECT SIN(3.1415),COS(3.1415),TAN(3.1415)

/*14*/
SELECT SIGN(-25),SIGN(0),SIGN(25)

/*15*/
SELECT RAND()

/*1*/
SELECT LEN(NULL),LEN('HELLO'),LEN('')

/*2*/
SELECT LOWER('RUSHI'),UPPER('RUSHI')

/*3*/
SELECT SUBSTRING('DARSHAN UNIVERSITY',1,3)

/*4*/
SELECT SUBSTRING('DARSHAN UNIVERSITY',3,8)

/*5*/
SELECT REPLACE('ABC123EFG',123,'XYZ'),REPLACE('ABCABCABC','C',5)

/*6*/
SELECT ASCII('a'),ASCII('A'),ASCII('z'),ASCII('Z'),ASCII(0),ASCII(9)

/*7*/
SELECT CHAR(97),CHAR(65),CHAR(122),CHAR(90),CHAR(48),CHAR(57)

/*8,9*/
SELECT LTRIM('   HELLO WORLD    '),RTRIM('     HELLO WORLD   ')

/*10*/
SELECT LEFT('SQL SERVER',4),RIGHT('SQL SERVER',5)

/*11*/
SELECT CAST('1234.56' AS FLOAT) 

/*12*/
SELECT CONVERT(INT,10.58)

/*13*/
SELECT SPACE(10)+'DARSHAN UNIVERSITY'

/*14*/
SELECT ('DARSHAN'+' '+'UNIVERSITY')

SELECT CONCAT('DARSHAN','UNIVERSITY')

/*15*/
SELECT REVERSE('DARSHAN')

/*16*/
SELECT REPLICATE('DARSHAN UNIVERSITY',3)

/*17*/
SELECT STUFF('SQL SERVER',1,3,'HTML')

/*18*/
SELECT COALESCE(NULL,'DARSHAN',NULL,'UNIVERSITY')

/*19*/
SELECT ISNUMERIC(34)
SELECT ISNUMERIC('DARSHAN')

/*20*/
SELECT CHARINDEX('T','CUSTOMER')
























	



















