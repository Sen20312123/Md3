use quanlidonhang;

	create table PHIEUXUAT(
	SoPX varchar(20) not null primary key,
	NgayXuat Date);

	create table VATTU(
	MaVT varchar(20) not null primary key,
	tenVT varchar(50) );

	create table PHIEUNHAP(
	SoPN varchar(20) not null primary key,
	NgayNhap date);

	create table DONDH(
	soDDH varchar(20) not null primary key, 
	NgayDH Date);

	create table NHACC(
	MaNCC varchar(20) not null primary key,
	TenNCC varchar(50),
	DiaChi varchar(50),
	SDT varchar(10));