ALTER TABLE USER ADD gender VARCHAR(10) after age;
UPDATE USER SET gender = 'MAN';
ALTER TABLE USER modify gender VARCHAR(10) NOT NULL;