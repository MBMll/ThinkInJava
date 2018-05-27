DROP DATABASE IF EXISTS `debug`;
CREATE DATABASE IF NOT EXISTS `debug`;
USE `debug`;
####################

#
DROP TABLE IF EXISTS `Region`;
CREATE TABLE IF NOT EXISTS `Region` (
  id   INT AUTO_INCREMENT PRIMARY KEY,
  name VARCHAR(10) NOT NULL
);
INSERT INTO `Region` (name) VALUES ('中国'), ('美国');
#
DROP TABLE IF EXISTS `Organization`;
CREATE TABLE IF NOT EXISTS `Organization` (
  id        INT AUTO_INCREMENT PRIMARY KEY,
  name      VARCHAR(50) NOT NULL,
  region_id INT         NOT NULL
);
#
INSERT INTO `Organization` (name, region_id)
VALUES ('百度', (SELECT id
               FROM Region
               WHERE Region.name = '中国')),
  ('谷歌', (SELECT id
          FROM Region
          WHERE
            Region.name = '美国'));
#
DROP TABLE IF EXISTS `Organization_M`;
CREATE TABLE IF NOT EXISTS `Organization_M` (
  id              INT AUTO_INCREMENT PRIMARY KEY,
  name            VARCHAR(50) NOT NULL,
  language        VARCHAR(10) NOT NULL,
  organization_id INT         NOT NULL
);
INSERT INTO `Organization_M` (name, language, organization_id)
VALUES ('百度', 'Chinese', (SELECT id
                          FROM Organization
                          WHERE Organization.name = '百度')),
  ('Baidu', 'English', (SELECT id
                        FROM Organization
                        WHERE Organization.name = '百度')),
  ('谷歌', 'Chinese', (SELECT id
                     FROM Organization
                     WHERE Organization.name = '谷歌')),
  ('Google', 'English', (SELECT id
                         FROM Organization
                         WHERE Organization.name = '谷歌'));

SELECT *
FROM Organization_M;

EXPLAIN SELECT company
        FROM (SELECT
                om.name AS company,
                r.name  AS country,
                language
              FROM Organization_M AS om
                LEFT JOIN Organization AS o ON o.id = organization_id
                LEFT JOIN Region AS r ON r.id = region_id) AS i
        WHERE language = 'Chinese' AND country = '中国';

EXPLAIN SELECT om.name
        FROM Organization_M AS om
          LEFT JOIN Organization AS o ON o.id = organization_id
          LEFT JOIN Region AS r ON r.id = region_id
        WHERE language = 'Chinese' AND r.name = '中国';