drop database PROJD;

create database PROJD;
use PROJD;

create table Dentista(

idDentista int primary key auto_increment,
cpf int  unique,
nome varchar(30) not null,
especialidade varchar(25) not null,
status int not null

);

desc Dentista;



create table Cliente(

idCliente int primary key auto_increment,
prontuario int unique,
nome varchar(30) not null,
dtCad date not null,
indicacao varchar(30) not null,
id_dentista int,
foreign key (id_dentista) references Dentista(idDentista)

);

desc Cliente;