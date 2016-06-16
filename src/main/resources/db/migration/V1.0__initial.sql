CREATE TABLE USER (
  id        BIGINT auto_increment,
  name      VARCHAR(100) NOT NULL,
  password  VARCHAR(200) NOT NULL,
  email     VARCHAR(100),
  age       INT,
  gender    VARCHAR(10),
  PRIMARY KEY (id)
);

INSERT INTO USER (name, password, email, age, gender) VALUES ('ichiro', 'a45ff616169c7ff6337d928da2570c5005c54e4dea1165ec6f8940810aeaffb28d086f141d157fa9', 'shiken@ichiro.co.jp', '44', 'MAN');
INSERT INTO USER (name, password, email, age, gender) VALUES ('jiro', 'a45ff616169c7ff6337d928da2570c5005c54e4dea1165ec6f8940810aeaffb28d086f141d157fa9', 'shiken@jiro.co.jp', '26', 'MAN');
INSERT INTO USER (name, password, email, age, gender) VALUES ('saburo', 'a45ff616169c7ff6337d928da2570c5005c54e4dea1165ec6f8940810aeaffb28d086f141d157fa9', 'shiken@saburo.co.jp', '12', 'MAN');
INSERT INTO USER (name, password, email, age, gender) VALUES ('hanako', 'a45ff616169c7ff6337d928da2570c5005c54e4dea1165ec6f8940810aeaffb28d086f141d157fa9', 'shiken@hanako.co.jp', '33', 'WOMAN');
INSERT INTO USER (name, password, email, age, gender) VALUES ('uchitate', 'a45ff616169c7ff6337d928da2570c5005c54e4dea1165ec6f8940810aeaffb28d086f141d157fa9', 'uchitate@tagbangers.co.jp', '26', 'MAN');
