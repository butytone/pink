CREATE TABLE IF NOT EXISTS USERS (
    EMAIL VARCHAR(128) NOT NULL PRIMARY KEY,
    NAME  VARCHAR(128) NOT NULL UNIQUE
);

CREATE TABLE IF NOT EXISTS GROUPS (
    NAME  VARCHAR(128) NOT NULL PRIMARY KEY,
    OWNER VARCHAR(128) NOT NULL
);

CREATE TABLE IF NOT EXISTS NS (
    ID   INT UNSIGNED                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                AUTO_INCREMENT PRIMARY KEY,
    TYPE TINYINT(1)   NOT NULL                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         DEFAULT 0
    COMMENT '0 for user, 1 for group',
    NAME VARCHAR(128) NOT NULL UNIQUE,
    INDEX (NAME)
);

CREATE TABLE IF NOT EXISTS CATEGORIES (
    ID    INT UNSIGNED         AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(64)   NOT NULL DEFAULT 'default',
    OWNER INT UNSIGNED NOT NULL,
    INDEX (OWNER),
    INDEX (NAME, OWNER),
    UNIQUE (NAME, OWNER)
);

CREATE TABLE IF NOT EXISTS TODOS (
    ID             BIGINT UNSIGNED        AUTO_INCREMENT PRIMARY KEY,
    TITLE VARCHAR(1024)        NOT NULL DEFAULT '',
    OWNER INT UNSIGNED  NOT NULL,
    CREATOR VARCHAR(128) NOT NULL,
    PRIORITY TINYINT(1)  NOT NULL   DEFAULT 1
    COMMENT '0 for low, 1 for medium, 2 for high',
    CATEGORY INT UNSIGNED NOT NULL,
    CREATE_AT DATETIME    NOT NULL   DEFAULT '1986-01-01 00:00:00',
    TO_COMPLETE_AT DATETIME,
    COMPLETE_AT    DATETIME,
    STATUS         VARCHAR(12) NOT NULL   DEFAULT 'CREATED'
    COMMENT 'CREATED, COMPLETED, DELAYED',
    TEXT           TEXT,
    INDEX (TITLE),
    INDEX (CATEGORY),
    INDEX (STATUS),
    INDEX (CREATE_AT),
    INDEX (TO_COMPLETE_AT),
    INDEX (COMPLETE_AT)
);




