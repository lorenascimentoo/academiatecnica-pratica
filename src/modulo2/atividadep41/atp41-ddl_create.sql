create table produto(
	id int generated always as identity
	, nome varchar not null
	, descricao varchar not null
	, codigo int not null
	, preco decimal not null
);

create table categoria(
	id int generated always as identity
	, nome varchar not null
	, descricao varchar null
);

create table carro(
	id int generated always as identity
	, modelo varchar not null
	, marca varchar not null
);