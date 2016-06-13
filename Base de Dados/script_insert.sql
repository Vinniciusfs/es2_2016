select * from atividades;

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES('Aproximação da escola com a universidade: conhecendo um "cientista".', 'MARYSTELA FERREIRA', 'DFQM - Departamento de Física, Química e Matemática', 
'NÃO INFORMADO', '01/04/2016', '30/12/2017', '30');

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES('Administração e uso do Cluster Maritaca', 'FABIO LUCIANO VERDI', 'DComp Departamento de Computação',
'23112.002314/201499', '23/06/2014', '15/08/2014', '30');

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES('Promus Promovendo Mudanças 2013', 'FABIO LUCIANO VERDI', 'DComp Departamento de Computação',
'23112.000177/201377', '12/01/2013', '22/01/2013', 10);

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES('I curso de bionformática aplicada à genômica: princípios de NGS e processamento inicial de sequências genômicas', 'KARINA MARTINS', 'DBio - Departamento de Biologia',
'NÃO INFORMADO', '11/07/2016', '15/07/2016', 20);

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

INSERT INTO ATIVIDADES(nome_atividade, id_coordenador, id_setor, num_processo, data_inicio, data_fim, carga_horaria)
VALUES();

SELECT * FROM SERVIDORES;
SELECT * FROM SERVIDORES WHERE id_atividade=1;

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(1, 'MARYSTELA FERREIRA');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(1, 'CANDIDA NUNES DA SILVA');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(2, 'FABIO LUCIANO VERDI');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(2, 'JOAO GUILHERME JUNIOR');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(2, 'CARLOS EDUARDO BUENO');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(3, 'FABIO LUCIANO VERDI');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(4, 'KARINA MARTINS');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(4, 'MARIA APARECIDA ALEIXO DE CASTILHO');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(4, 'GUSTAVO MACIEL DIAS VIEIRA');

INSERT INTO SERVIDORES(id_atividade, nome_servidor)
VALUES(, '');

INSERT INTO ALUNOS(id_atividade, nome_aluno)
VALUES(4, 'Vinícius Angiolucci Reis');

INSERT INTO ALUNOS(id_atividade, nome_aluno)
VALUES(, '');

SELECT * FROM ALUNOS WHERE id_atividade=4;
SELECT UPPER(NOME_TAG) FROM TAGS;

INSERT INTO TAGS(nome_tag)
VALUES('Aproximação da escola com a universidade: conhecendo um "cientista".');

INSERT INTO TAGS(nome_tag)
VALUES('MARISTELA');

INSERT INTO TAGS(nome_tag)
VALUES('FERREIRA');

INSERT INTO TAGS(nome_tag)
VALUES('DFQM');

INSERT INTO TAGS(nome_tag)
VALUES('CANDIDA');

INSERT INTO TAGS(nome_tag)
VALUES('NUNES');

INSERT INTO TAGS(nome_tag)
VALUES('SILVA');

INSERT INTO TAGS(nome_tag)
VALUES('FABIO');

INSERT INTO TAGS(nome_tag)
VALUES('LUCIANO');

INSERT INTO TAGS(nome_tag)
VALUES('VERDI');

INSERT INTO TAGS(nome_tag)
VALUES('JOAO');

INSERT INTO TAGS(nome_tag)
VALUES('GUILHERME');

INSERT INTO TAGS(nome_tag)
VALUES('JUNIOR');

INSERT INTO TAGS(nome_tag)
VALUES('CARLOS');

INSERT INTO TAGS(nome_tag)
VALUES('EDUARDO');

INSERT INTO TAGS(nome_tag)
VALUES('BUENO');

INSERT INTO TAGS(nome_tag)
VALUES('Administração e uso do Cluster Maritaca');

INSERT INTO TAGS(nome_tag)
VALUES('DComp');

INSERT INTO TAGS(nome_tag)
VALUES('Promus Promovendo Mudanças 2013');

INSERT INTO TAGS(nome_tag)
VALUES('I curso de bionformática aplicada à genômica: princípios de NGS e processamento inicial de sequências genômicas');

INSERT INTO TAGS(nome_tag)
VALUES('DBio');

INSERT INTO TAGS(nome_tag)
VALUES('KARINA');

INSERT INTO TAGS(nome_tag)
VALUES('MARTINS');

INSERT INTO TAGS(nome_tag)
VALUES('MARIA');

INSERT INTO TAGS(nome_tag)
VALUES('APARECIDA');

INSERT INTO TAGS(nome_tag)
VALUES('ALEIXO');

INSERT INTO TAGS(nome_tag)
VALUES('CASTILHO');

INSERT INTO TAGS(nome_tag)
VALUES('GUSTAVO');

INSERT INTO TAGS(nome_tag)
VALUES('MACIEL');

INSERT INTO TAGS(nome_tag)
VALUES('DIAS');

INSERT INTO TAGS(nome_tag)
VALUES('VIEIRA');

INSERT INTO TAGS(nome_tag)
VALUES('Vinícius');

INSERT INTO TAGS(nome_tag)
VALUES('Angiolucci');

INSERT INTO TAGS(nome_tag)
VALUES('Reis');

INSERT INTO TAGS(nome_tag)
VALUES('');

SELECT * FROM TAGS;
SELECT * FROM TAGS_ATIVIDADE;

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 1);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 2);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 3);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 4);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 5);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 6);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(1, 7);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 8);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 9);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 10);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 11);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 12);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 13);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 14);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 15);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 16);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 17);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(2, 18);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(3, 19);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(3, 18);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(3, 8);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(3, 9);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(3, 10);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 20);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 21);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 22);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 23);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 24);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 25);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 26);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 27);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 28);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 29);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 30);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 31);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 32);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 33);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(4, 34);

INSERT INTO TAGS_ATIVIDADE(id_atividade, id_tag)
VALUES(, );

SELECT * FROM TAGS_ATIVIDADE WHERE id_atividade=1;