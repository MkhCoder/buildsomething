DROP TABLE IF EXISTS TBL_ALBUM;

create table TBL_ALBUM
(
    ID INT auto_increment,
    NAME VARCHAR(50) not null,
    CONTENT varchar(50),
    constraint TBL_ALBUM_PK
        primary key (ID)
);

