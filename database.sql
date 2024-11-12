create database universitymanagementsystem;
show databases;
use universitymanagementsystem;

create table login(username varchar(25), password varchar(25));
insert into login values('admin','12345');
select * from login;

create table student(name varchar(40), fname varchar(40), rollno varchar(20), dob varchar(20), address varchar(150), phone varchar (20), email varchar (40), class_x varchar (20), class_xii varchar (20), aadhar varchar (20), course varchar (40), branch varchar (40));
select * from student;

create table teacher(name varchar(40), fname varchar(40), empid varchar(20), dob varchar(20), address varchar(150), phone varchar (20), email varchar (40), class_x varchar (20), class_xii varchar (20), aadhar varchar (20), education varchar (40), department varchar (40));
select * from teacher;

create table studentleave(rollno varchar(20), date varchar(20), duration varchar(30));
select * from studentleave;

create table teacherleave(empid varchar(20), date varchar(20), duration varchar(30));
select * from teacherleave;

create table subject(rollno varchar(20), semester varchar(20), subject1 varchar(50), subject2 varchar(50), subject3 varchar(50), subject4 varchar(50), subject5 varchar(50));
select * from subject;

create table marks(rollno varchar(20), semester varchar(20), marks1 varchar(50), marks2 varchar(50), marks3 varchar(50), marks4 varchar(50), marks5 varchar(50));
select * from marks;

create table fee(course varchar(20), semester1 varchar(20), semester2 varchar(20), semester3 varchar(20), semester4 varchar(20), semester5 varchar(20), semester6 varchar(20), semester7 varchar(20), semester8 varchar(20));
select * from fee;
insert into fee value("BE","174560","170042","170269","170567","177890","170002","170032","173200");
insert into fee value("Diploma", "52000", "51000", "50000", "49000", "48000", "47000", "0", "0");
insert into fee value("ITI", "18000", "17500", "17000", "16500", "16000", "15500", "0", "0");
insert into fee value("Vocational", "30000", "29000", "28500", "28000", "27000", "26500", "0", "0");
insert into fee value("B.Voc", "40000", "39000", "38500", "38000", "37500", "37000", "0", "0");
insert into fee value("BCA", "85000", "83000", "82000", "81000", "80000", "79000", "0", "0");
insert into fee value("MCA", "110000", "108000", "107000", "106000", "105000", "104000", "0", "0");
insert into fee value("ME", "140000", "138000", "137000", "136000", "0", "0", "0", "0");

create table collegefee(rollno varchar(20), course varchar(20),branch varchar(20), semester varchar(20), total varchar(20));