CREATE TABLE IF NOT EXISTS Zeit (
	Zeit1 Text DEFAULT (DATETIME('now', 'localtime')),
	Zeit2 Text,
	Zeit3 REAL
);

-- INSERT INTO Zeit(Zeit2, Zeit3) VALUES(DATE('now', 'localtime'), JULIANDAY('now', 'localtime'));
-- INSERT INTO Zeit(Zeit2, Zeit3) VALUES(TIME('now', 'localtime'), JULIANDAY('now', 'localtime'));

-- SELECT Zeit1 FROM Zeit;

SELECT DATETIME(Zeit3) From Zeit;
