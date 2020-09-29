/*
CREATE TABLE kunden (
	id INTEGER PRIMARY KEY,
	name TEXT NOT NULL,
	email TEXT UNIQUE NOT NULL,
	nickname TEXT DEFAULT 'user123'
);
*/

-- INSERT INTO kunden(id, name, email) VALUES(NULL, 'Chris', 'chris@test.de');
-- INSERT INTO kunden VALUES(NULL,'Bernd', 'bernd@test.de', 'berne');







-- deleting whole table.
-- DROP TABLE kunden;



/*CREATE TABLE kunden (
	id INTEGER,
	name TEXT,
	email TEXT
);

*/


-- Insert/Einfügen  

-- INSERT INTO kunden (id, name, email) VALUES (1, 'Bernd W.', 'berne@test.de');



-- no need to reference to generic column names.

-- INSERT INTO kunden VALUES (2, 'Chris G.', 'chris@mail.de');



-- INSERT INTO kunden VALUES(3, 'Aba', 'aba3@test.de', '0152-12348754');

-- INSERT INTO kunden VALUES(5, 'Martinos', 'martin@test.de', '0174/74923571');


-- select/read

 -- SELECT * FROM kunden;



-- SELECT name FROM kunden;



-- SELECT * from kunden WHERE name = 'Chris G.';

-- Update/edit 

/*
UPDATE kunden
	SET name = 'Christof G.', email = 'christof@mail.de'
	WHERE name = 'Chris G.';


UPDATE kunden
	SET email = 'bernd@test.de'
	WHERE email = 'berne@test.de';
	
UPDATE kunden
	SET telefonnummer = '0175/45924582'
	WHERE id = 2;
	
	UPDATE kunden
	SET telefonnummer = '0174/74923571'
	WHERE name = 'Martinos';
	
	UPDATE kunden	
	SET telefonnummer = '0175/34926482'
	WHERE id = 1;
*/

-- deleting data sets i.e. complete rows.

/*
DELETE FROM kunden
	WHERE id = 4;
*/

-- read i.e. print out whole table.
-- SELECT * FROM kunden;
	
-- adding a column/attribute
/*
ALTER TABLE kunden
	ADD COLUMN telefonnummer TEXT;
*/




