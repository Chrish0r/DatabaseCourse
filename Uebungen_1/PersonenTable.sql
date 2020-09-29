CREATE TABLE IF NOT EXISTS Personen(
	Person_ID INTEGER PRIMARY KEY,
	Vorname TEXT NOT NULL,
	Nachname Text UNIQUE NOT NULL,
	Adresse TEXT,
	Stadt Text,
	Land Text
);


--___________________________add objects_________________________________________________________________
-- INSERT INTO Personen VALUES(NULL, 'Frank', 'Müller', 'Müllergasse 4', 'Berlin', 'Deutschland');
-- INSERT INTO Personen VALUES(NULL, 'Sabine', 'Zimmermann', 'Zimmermannstraße 4', 'Hamburg', 'Deutschland');

--_____________________________select/read________________________________________________________________
SELECT * FROM Personen;

--___________________________update/edit i.e. modify objects______________________________________________
/*
UPDATE Personen
	SET Adresse = 'Sandgasse 40', Stadt = 'Leipzig'
	WHERE Person_ID = 2;
*/

--_________________________delete an object/row/data set___________________________________________________
/*
DELETE FROM Personen
	WHERE Person_ID = 1;
*/

--___________________________delete/drop complete table_____________________________________________________
-- DROP TABLE Personen;