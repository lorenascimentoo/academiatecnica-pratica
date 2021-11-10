alter table carro 
add chassi varchar
,add ano varchar;

alter table produto
drop codigo;

alter table categoria
drop id
, add id int primary key generated always as identity;

alter table produto
add categoria_id int not null
,add constraint fk_categoria foreign key(categoria_id) references categoria(id);