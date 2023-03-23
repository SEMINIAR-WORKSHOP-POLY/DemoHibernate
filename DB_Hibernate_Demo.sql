CREATE DATABASE hibernate_demo;
GO
USE hibernate_demo;

CREATE TABLE lop_hoc (
	id BIGINT IDENTITY NOT NULL,
	ma_lop varchar(100) NULL,
	ten_lop nvarchar(100) NULL,
	so_luong_sv INTEGER DEFAULT 0 NULL,
	toa nvarchar(100) NULL,
	CONSTRAINT lop_hoc_PK PRIMARY KEY (id)
)

INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M01', 'IT17312', 40, 'L');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M02', 'IT17319', 39, 'L');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M03', 'IT17316', 40, 'L');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M04', 'IT17320', 39, 'L');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M05', 'IT17307', 40, 'P');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M06', 'IT17203', 31, 'D');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES( 'M07', 'IT17317', 40, 'P');
INSERT INTO lop_hoc
( ma_lop, ten_lop, so_luong_sv, toa)
VALUES('M08', 'IT17322', 40, 'F');
SELECT * FROM lop_hoc
