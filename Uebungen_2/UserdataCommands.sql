/*
SELECT * FROM User

	WHERE Name ='Katja';
*/

/*
SELECT * FROM User
WHERE Name = 'Katja' OR Name = 'Chris';
*/

/*
SELECT Email, Tel_Number FROM User
WHERE Name = 'Katja' OR Name = 'Chris';
*/

/*
SELECT * FROM User
WHERE Country IN('Germany', 'Spain', 'China');
*/

/*
SELECT Email, Name FROM User
WHERE Name LIKE 'c%';
*/


-- SELECT Tel_Number, Name FROM User WHERE ID &gt;= 4 AND ID &lt;= 8;


/*
SELECT Tel_Number, Name FROM User
WHERE ID BETWEEN 4 AND 8;
*/

SELECT * FROM User
WHERE Email LIKE '%@mail.de';

