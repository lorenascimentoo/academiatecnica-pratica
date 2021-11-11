begin transaction;
	insert into categoria(nome,descricao)values('casa','utilidades para casa');
	insert into produto(nome,descricao,preco,categoria_id)values('toalha','infantil',29.90,5);
commit;
end;