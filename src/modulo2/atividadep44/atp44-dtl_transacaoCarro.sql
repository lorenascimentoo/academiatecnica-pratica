begin transaction;
	create table carro(
		id int primary key generated always as identity
		, marca varchar(50) not null
		, modelo varchar(50) not null
	);
	insert into carro(marca,modelo)values('FIAT','MOBI');
	insert into carro(marca,modelo)values('RENAULT','SANDERO');
commit;
end;