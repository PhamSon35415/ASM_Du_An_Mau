create database Du_An_Mau
go
use Du_An_Mau
go
create table NhanVien (
	MaNv nvarchar(50) primary key,
	MatKhau nvarchar(50) not null,
	HoTen nvarchar(50) not null,
	VaiTro bit not null,
	)
create table ChuyenDe(
	MaCd varchar(10) primary key,
	TenCd nvarchar(50) not null,
	HocPhi float not null,
	ThoiLuong int not null,
	Hinh nvarchar(50) not null,
	MoTa nvarchar(250) not null
)
create table KhoaHoc (
	MaKh int identity(1,1) primary key,
	MaCd varchar(10) not null,
	HocPhi float not null,
	ThoiLuong int not null,
	NgayKg date not null,
	GhiChu nvarchar(50),
	MaNv nvarchar(50) not null,
	NgayTao date not null,
	foreign key (MaCd) references ChuyenDe(MaCd) on delete no action on update cascade,
	foreign key (MaNv) references NhanVien(MaNv) on delete no action on update cascade
)
create table NguoiHoc(
	MaNh varchar(10) primary key,
	HoTen nvarchar(50) not null,
	NgaySinh date not null,
	GioiTinh bit not null,
	DienThoai nvarchar(50) not null,
	Email nvarchar(50) not null,
	GhiChu nvarchar(250) not null,
	MaNv nvarchar(50) not null,
	NgayDk date not null,
	foreign key (MaNv) references NhanVien(MaNv) on delete no action on update cascade
)
create table HocVien(
	MaHv int identity(1,1) primary key,
	MaKh int not null,
	MaNh varchar(10) not null,
	Diem float not null,
	foreign key (MaNh) references NguoiHoc(MaNh) on delete no action on update cascade
)
ALTER TABLE HocVien
ADD CONSTRAINT FK_HocVien_MaKh
FOREIGN KEY (MaKh)
REFERENCES KhoaHoc(MaKh)
ON DELETE NO ACTION
ON UPDATE NO ACTION;
go
--
INSERT INTO NhanVien (MaNv, MatKhau, HoTen, VaiTro)
VALUES
('NV001', 'MatKhau111', 'Pham Van Dung', 0),
('NV002', 'MatKhau222', 'Nguyen Thi Mai', 1),
('NV003', 'MatKhau333', 'Tran Van Tuan', 0),
('NV004', 'MatKhau444', 'Le Thi Huong', 1),
('NV005', 'MatKhau555', 'Hoang Van Hiep', 0),
('NV006', 'MatKhau666', 'Do Thi Hoai An', 1),
('NV007', 'MatKhau777', 'Nguyen Van Khanh', 0),
('NV008', 'MatKhau888', 'Tran Thi Quyen', 1),
('NV009', 'MatKhau999', 'Le Van Thang', 0),
('NV010', 'MatKhau000', 'Vo Thi Ha', 1);
INSERT INTO ChuyenDe (MaCd, TenCd, HocPhi, ThoiLuong, Hinh, MoTa)
VALUES
('CD001', 'Lập trình C#', 1300000, 25, 'csharp.jpg', 'Chuyên đề về lập trình C#'),
('CD002', 'Digital Marketing', 1100000, 15, 'marketing.jpg', 'Chuyên đề về Digital Marketing'),
('CD003', 'Quản trị dự án', 1600000, 30, 'quantri.jpg', 'Chuyên đề về quản trị dự án'),
('CD004', 'Ngôn ngữ Python', 1400000, 20, 'python.jpg', 'Chuyên đề về ngôn ngữ Python'),
('CD005', 'Thiết kế website', 1200000, 25, 'webdesign.jpg', 'Chuyên đề về thiết kế website'),
('CD006', 'An toàn thông tin', 1800000, 30, 'security.jpg', 'Chuyên đề về an toàn thông tin'),
('CD007', 'Tiếng Anh giao tiếp', 1000000, 20, 'english.jpg', 'Chuyên đề về tiếng Anh giao tiếp'),
('CD008', 'Kỹ năng mềm', 900000, 15, 'softskills.jpg', 'Chuyên đề về kỹ năng mềm'),
('CD009', 'Thiết kế đồ họa nâng cao', 1500000, 30, 'graphicdesign.jpg', 'Chuyên đề về thiết kế đồ họa nâng cao'),
('CD010', 'Quản trị nguồn nhân lực', 1700000, 35, 'hr.jpg', 'Chuyên đề về quản trị nguồn nhân lực');
INSERT INTO KhoaHoc (MaCd, HocPhi, ThoiLuong, NgayKg, GhiChu, MaNv, NgayTao)
VALUES
('CD001', 1300000, 25, '2024-01-01', 'Khoa hoc C# co ban', 'NV001', '2024-01-01'),
('CD002', 1100000, 15, '2024-02-01', 'Khoa hoc Digital Marketing co ban', 'NV002', '2024-02-01'),
('CD003', 1600000, 30, '2024-03-01', 'Khoa hoc Quan tri du an co ban', 'NV003', '2024-03-01'),
('CD004', 1400000, 20, '2024-04-01', 'Khoa hoc Python co ban', 'NV004', '2024-04-01'),
('CD005', 1200000, 25, '2024-05-01', 'Khoa hoc Thiet ke website co ban', 'NV005', '2024-05-01'),
('CD006', 1800000, 30, '2024-06-01', 'Khoa hoc An toan thong tin co ban', 'NV006', '2024-06-01'),
('CD007', 1000000, 20, '2024-07-01', 'Khoa hoc Tieng Anh giao tiep co ban', 'NV007', '2024-07-01'),
('CD008', 900000, 15, '2024-08-01', 'Khoa hoc Ky nang mem co ban', 'NV008', '2024-08-01'),
('CD009', 1500000, 30, '2024-09-01', 'Khoa hoc Thiet ke do hoa nang cao', 'NV009', '2024-09-01'),
('CD010', 1700000, 35, '2024-10-01', 'Khoa hoc Quan tri nguon nhan luc co ban', 'NV010', '2024-10-01');
INSERT INTO NguoiHoc (MaNh, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNv, NgayDk)
VALUES
('NH001', 'Tran Van An', '1999-02-18', 1, '123456789', 'an@gmail.com', 'Hoc vien nang dong', 'NV001', '2024-01-01'),
('NH002', 'Nguyen Thi Bich', '2000-05-22', 0, '987654321', 'bich@gmail.com', 'Hoc vien hien lanh', 'NV002', '2024-02-01'),
('NH003', 'Le Van Tung', '2001-08-30', 1, '555555555', 'tung@gmail.com', 'Hoc vien cham chi', 'NV003', '2024-03-01'),
('NH004', 'Pham Thi Hoa', '1998-11-12', 0, '666666666', 'hoa@gmail.com', 'Hoc vien ti mi', 'NV004', '2024-04-01'),
('NH005', 'Hoang Van Nam', '2002-03-05', 1, '333333333', 'nam@gmail.com', 'Hoc vien nhiet tinh', 'NV005', '2024-05-01'),
('NH006', 'Nguyen Thi My Linh', '1997-06-17', 0, '444444444', 'mylinh@gmail.com', 'Hoc vien tu tin', 'NV006', '2024-06-01'),
('NH007', 'Tran Van Minh', '2000-09-28', 1, '222222222', 'minh@gmail.com', 'Hoc vien tham vong', 'NV007', '2024-07-01'),
('NH008', 'Le Thi Lan', '2003-12-10', 0, '888888888', 'lan@gmail.com', 'Hoc vien nang no', 'NV008', '2024-08-01'),
('NH009', 'Vo Van Quang', '1999-01-25', 1, '999999999', 'quang@gmail.com', 'Hoc vien tich cuc', 'NV009', '2024-09-01'),
('NH010', 'Do Thi Thao', '2001-04-07', 0, '777777777', 'thao@gmail.com', 'Hoc vien vui ve', 'NV010', '2024-10-01');
INSERT INTO HocVien (MaKh, MaNh, Diem)
VALUES
(1, 'NH001', 8.5),
(2, 'NH002', 7.2),
(3, 'NH003', 9.0),
(4, 'NH004', 6.8),
(5, 'NH005', 8.0),
(6, 'NH006', 7.5),
(7, 'NH007', 9.2),
(8, 'NH008', 6.0),
(9, 'NH009', 8.7),
(10, 'NH010', 7.9);






go
create proc sp_Bang_Diem(@makh int)
as begin
	select 
		nh.MaNh,
		nh.HoTen,
		hv.Diem
	from HocVien hv join NguoiHoc nh on nh.MaNh=hv.MaNh
	where hv.MaKh=@makh
	order by hv.Diem desc
	end
go
alter proc sp_ThongKeDiem
as begin
	select
		TenCd [Chuyen De],
		count(MaHv) SoHV,
		min(Diem) CaoNhat,
		max(Diem) ThapNhat,
		avg(Diem) TrungBinh
	from KhoaHoc kh join HocVien hv on kh.MaKh=hv.MaKh
	join ChuyenDe cd on cd.MaCd=kh.MaCd
	group by TenCd
end
go
create proc sp_ThongKeDoanhThu(@year int)
as begin
	select 
		TenCd ChuyenDe,
		COUNT(distinct kh.MaKh) SoKH,
		count(hv.MaHv) SoHv,
		sum(kh.HocPhi) DoanhThu,
		min(kh.HocPhi) ThapNhat,
		max(kh.HocPhi) CaoNhat,
		avg(kh.HocPhi) TrungBinh
	from KhoaHoc kh join HocVien hv on hv.MaKh=kh.MaKh
	join ChuyenDe cd on cd.MaCd=kh.MaCd
	where year(NgayKg) =@year
	group by TenCd
end
go
create proc sp_ThongKeNguoiHoc
as begin
	select 
		year(NgayDk) Nam,
		count(*) SoLuong,
		Min(NgayDk) DauTien,
		max(NgayDk) CuoiCung
	from NguoiHoc
	group by year(NgayDk)
end
