begin transaction;
	insert into pais(nome,sigla)values('CANADÁ','CA');

	insert into estado(nome,sigla,pais_id)values('ONTÁRIO','ON',2);
	insert into estado(nome,sigla,pais_id)values('SÃO PAULO','SP',1);
	insert into estado(nome,sigla,pais_id)values('RIO DE JANEIRO','RJ',1);

	insert into cidade(nome,estado_id)values('TORONTO',2);
	insert into cidade(nome,estado_id)values('SANTARÉM',1);
	insert into cidade(nome,estado_id)values('CACHOEIRA PAULISTA',3);
	insert into cidade(nome,estado_id)values('LORENA',3);
	insert into cidade(nome,estado_id)values('ARRAIAL DO CABO',4);
	insert into cidade(nome,estado_id)values('ILHA DO GOVERNADOR',4);

	select c.id as cidade_id, c.nome as cidade_nome,
		   e.id as estado_id, e.nome as estado_nome , e.sigla as estado_sigla,
		   p.id as pais_id, p.sigla as pais_sigla
	from cidade as c
	inner join estado as e on c.estado_id = e.id
	inner join pais as p on e.pais_id = p.id;
commit;
end;