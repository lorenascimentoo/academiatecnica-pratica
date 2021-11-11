begin transaction;
	create table pais(
		id int primary key generated always as identity
		, nome varchar(50) not null
		, sigla varchar(3) not null
	);
	create table estado(
		id int primary key generated always as identity
		, nome varchar(50) not null
		, sigla varchar(2) not null
		, pais_id int not null
		, constraint fk_pais foreign key (pais_id) references pais(id)
	);
	create table cidade(
		id int primary key generated always as identity
		, nome varchar(50) not null
		, estado_id int not null
		, constraint fk_estado foreign key (estado_id) references estado(id)
	);
	insert into pais(nome,sigla)values('BRASIL','BRA');
	insert into estado(nome,sigla,pais_id)values('PARÁ','PA',1);
	insert into cidade(nome,estado_id)values('BELÉM',1);
commit;
end;