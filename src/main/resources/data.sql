-- Cargo
INSERT INTO cargo (id, nome) VALUES (1L, 'Estagiário');
INSERT INTO cargo (id, nome) VALUES (2L, 'Desenvolvedor de sistemas Jr');
INSERT INTO cargo (id, nome) VALUES (3L, 'Desenvolvedor de sistemas Sr');
INSERT INTO cargo (id, nome) VALUES (4L, 'Desenvolvedor de sistemas Pl');
INSERT INTO cargo (id, nome) VALUES (5L, 'Analista de requisitos Jr');
INSERT INTO cargo (id, nome) VALUES (6L, 'Analista de requisitos Sr');
INSERT INTO cargo (id, nome) VALUES (7L, 'Analista de requisitos Pl');
INSERT INTO cargo (id, nome) VALUES (8L, 'Analista de infra');
INSERT INTO cargo (id, nome) VALUES (9L, 'Secretária executica');
INSERT INTO cargo (id, nome) VALUES (10L, 'Especialista técnico');
INSERT INTO cargo (id, nome) VALUES (11L, 'Web Designer');
INSERT INTO cargo (id, nome) VALUES (12L, 'Programador full stack');
INSERT INTO cargo (id, nome) VALUES (13L, 'Coordenador de Relacionamento cliente');
INSERT INTO cargo (id, nome) VALUES (14L, 'Diretor');
INSERT INTO cargo (id, nome) VALUES (15L, 'Product Owner');
INSERT INTO cargo (id, nome) VALUES (16L, 'Auxiliar de serviços gerais');

-- Funcionario
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (1L, 'Maria Julia', 49, '1970-02-11', 'xxxxx', 1L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (2L, 'Douglas Reis', 35, '1985-08-10', 'xxxxx', 4L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (3L, 'Katia Moura', 32, '1988-06-13', 'xxxxx', 4L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (4L, 'José Reis', 49, '1970-08-11', 'xxxxx', 2L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (5L, 'Maria Aparecida', 32, '1988-02-11', 'xxxxx', 4L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (6L, 'Maria Cecília', 31, '1989-02-12', 'xxxxx', 3L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (7L, 'Katia Bezerra', 30, '1990-07-11', 'xxxxx', 3L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (8L, 'Franciso Silva', 35, '1985-02-11', 'xxxxx', 5L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (9L, 'José Pereira', 20, '2000-02-11', 'xxxxx', 1L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (10L, 'Jonatan Felipe', 49, '1970-08-11', 'xxxxx', 5L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (11L, 'Jacqueline Reis', 35, '1985-07-11', 'xxxxx', 4L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (12L, 'Alberto Roberto', 30, '1990-02-11', 'xxxxx', 10L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (13L, 'Maria Clara', 33, '1988-02-11', 'xxxxx', 10L);
INSERT INTO funcionario (id, nome, idade, aniversario, documento, id_cargo) VALUES (14L, 'Francisco Santos', 32, '1988-02-11', 'xxxxx', 14L);

-- Departamento
INSERT INTO departamento (id, nome, id_chefe) VALUES (1L, 'Recursos humanos', 1L);
INSERT INTO departamento (id, nome, id_chefe) VALUES (2L, 'Sustentação', 2L);
INSERT INTO departamento (id, nome, id_chefe) VALUES (3L, 'Pesquisa e desenvolvimento', 3L);
INSERT INTO departamento (id, nome, id_chefe) VALUES (4L, 'Atendimento', 4L);
INSERT INTO departamento (id, nome, id_chefe) VALUES (5L, 'Infraestrutura', 5L);

-- Funcionario x departamento
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (1L, 1L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (1L, 2L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (2L, 2L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (3L, 3L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (4L, 4L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (5L, 5L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (6L, 1L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (7L, 2L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (8L, 3L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (9L, 4L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (10L, 5L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (11L, 1L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (12L, 2L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (13L, 3L);
INSERT INTO funcionario_departamento (funcionario_id, departamento_id) VALUES (14L, 4L);