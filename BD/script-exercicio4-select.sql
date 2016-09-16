create table Fornecedor
(codF numeric(5) primary Key, nomeF varchar(50) not null, cidade
varchar(40));
create table Peca
(codP numeric(5) primary Key, nomeP varchar(50) not null, peso
numeric(10,3), cor varchar(15));
create table PedidoFor
(codP numeric(5), codF numeric(5), qtde numeric(10));
alter table PedidoFor add constraint FK_ped_codf foreign key
(codF) references Fornecedor;
alter table PedidoFor add constraint FK_ped_codp foreign key
(codP) references Peca;
insert into Fornecedor values (1,'Parafusos S.A.', 'Sao Paulo');
insert into Fornecedor values (2,'Madeiras', 'Itu');
insert into Fornecedor values (3,'Ferramentas e Cia', 'Sorocaba');
insert into Peca values (1,'prego', 100, 'preto');
insert into Peca values (2,'ferro', 10200, 'branco');
insert into Peca values (3,'madeira', 5, 'azul');
insert into PedidoFor values (1, 1, 100);
insert into PedidoFor values (2, 3, 200);
insert into PedidoFor values (3, 2, 1255);
insert into PedidoFor values (1, 3, 200);
insert into PedidoFor values (3, 3, 200);
insert into Fornecedor values (4,'Faster Tester', 'Sorocaba');

SELECT * FROM FORNECEDOR WHERE CIDADE = 'Sao Paulo';

SELECT * FROM PECA WHERE PESO > 10 AND COR <> 'Azul';

SELECT NOMEP FROM PECA WHERE COR <> 'branco';