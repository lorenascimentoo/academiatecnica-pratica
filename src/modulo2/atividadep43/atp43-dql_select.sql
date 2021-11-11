select * from categoria;

select * from produto;

select * from categoria where descricao is not null;

select id, nome, preco from produto where nome like 'c%';


select p.id, p.nome, p.preco, c.id as id_categoria, c.nome, c.descricao from produto as p 
inner join categoria as c on p.categoria_id = c.id
where p.preco >0;

select * from produto where categoria_id > 2;

select p.nome, p.categoria_id, c.nome, c.descricao from produto as p 
inner join categoria as c on p.categoria_id = c.id;