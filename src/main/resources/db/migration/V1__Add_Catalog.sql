CREATE TABLE IF NOT EXISTS catalog (
  id VARCHAR(5) NOT NULL PRIMARY KEY,
  title VARCHAR(50) NOT NULL,
  price DECIMAL(10,2) NOT NULL
);
