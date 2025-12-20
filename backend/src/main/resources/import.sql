-- 1. INSERIR CATEGORIAS (Gêneros)
INSERT INTO tb_category (name, created_at) VALUES ('Ação', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Anime', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Aventura', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Comédia', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Crime', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Documentário', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Drama', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Fantasia', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Ficção Científica', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Romance', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Suspense', NOW());
INSERT INTO tb_category (name, created_at) VALUES ('Terror', NOW());

-- 2. INSERIR CONTEÚDO (Séries - Top 10 de 2025)
-- Nota: Para séries, o campo 'price' será usado como 'audiencia_media' em milhões
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Squid Game', 27.1, TIMESTAMP WITH TIME ZONE '2025-01-15T10:00:00Z', 'Centenas de competidores com problemas financeiros aceitam um convite para competir em jogos infantis por um prêmio tentador. Porém, o preço do fracasso é mortal.', 'https://example.com/img/squid-game.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Adolescence', 19.0, TIMESTAMP WITH TIME ZONE '2025-02-10T10:00:00Z', 'Uma história que explora os desafios e dramas da juventude moderna.', 'https://example.com/img/adolescence.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Tracker', 17.4, TIMESTAMP WITH TIME ZONE '2025-03-05T10:00:00Z', 'Um especialista em encontrar pessoas e objetos usa suas habilidades únicas para resolver casos enquanto lida com seu próprio passado.', 'https://example.com/img/tracker.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Reacher', 17.3, TIMESTAMP WITH TIME ZONE '2025-01-20T10:00:00Z', 'Jack Reacher, um ex-investigador da Polícia Militar, usa seu intelecto afiado e força brutal para enfrentar criminosos em uma pequena cidade.', 'https://example.com/img/reacher.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('High Potential', 16.1, TIMESTAMP WITH TIME ZONE '2025-02-15T10:00:00Z', 'Uma mulher com uma mente brilhante, mas sem diploma, consegue um trabalho com a polícia e surpreende a todos com suas habilidades únicas de resolução de crimes.', 'https://example.com/img/high-potential.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Avatar: The Last Airbender', 15.8, TIMESTAMP WITH TIME ZONE '2025-02-22T10:00:00Z', 'Um jovem Avatar, o mestre dos quatro elementos, deve salvar um mundo em guerra enquanto luta para dominar seus poderes e cumprir seu destino.', 'https://example.com/img/avatar-last-airbender.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Griselda', 13.4, TIMESTAMP WITH TIME ZONE '2025-01-25T10:00:00Z', 'A história real de Griselda Blanco, uma ambiciosa empresária e mãe que criou um dos cartéis de drogas mais lucrativos da história.', 'https://example.com/img/griselda.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('True Detective', 12.7, TIMESTAMP WITH TIME ZONE '2025-01-10T10:00:00Z', 'Detetives são forçados a confrontar horrores do passado quando um crime sinistro os leva a investigar um mistério de décadas.', 'https://example.com/img/true-detective.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Tourist', 11.5, TIMESTAMP WITH TIME ZONE '2025-03-01T10:00:00Z', 'Um homem acorda no deserto australiano sem memória e deve descobrir sua identidade antes que seu passado obscuro o alcance.', 'https://example.com/img/the-tourist.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Constellation', 10.4, TIMESTAMP WITH TIME ZONE '2025-02-05T10:00:00Z', 'Uma astronauta retorna à Terra após um desastre no espaço e descobre que partes de sua vida parecem estar faltando.', 'https://example.com/img/constellation.jpg');

-- 3. INSERIR CONTEÚDO (Filmes - Top 20 da Netflix até Junho/2025)
-- Nota: Para filmes, o campo 'price' será usado como 'horas_vistas' em milhões
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Killer', 111.2, TIMESTAMP WITH TIME ZONE '2025-06-01T10:00:00Z', 'Após um erro quase fatal, um assassino enfrenta uma crise de consciência enquanto é caçado por seus antigos empregadores.', 'https://example.com/img/the-killer.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Fight Club', 106.6, TIMESTAMP WITH TIME ZONE '2025-06-02T10:00:00Z', 'Um homem insone e um vendedor de sabão formam um clube de luta underground que evolui para algo muito maior.', 'https://example.com/img/fight-club.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Amar Singh Chamkila', 93.7, TIMESTAMP WITH TIME ZONE '2025-06-03T10:00:00Z', 'A vida e carreira de Amar Singh Chamkila, um dos maiores cantos de Punjab, assassinado aos 27 anos.', 'https://example.com/img/chamkila.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Madame Web', 88.7, TIMESTAMP WITH TIME ZONE '2025-06-04T10:00:00Z', 'Uma paramédica desenvolve poderes psíquicos e deve proteger três jovens de um assassino misterioso.', 'https://example.com/img/madame-web.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Irish Wish', 86.8, TIMESTAMP WITH TIME ZONE '2025-06-05T10:00:00Z', 'Uma mulher descobre que o homem por quem está secretamente apaixonada vai se casar com sua melhor amiga.', 'https://example.com/img/irish-wish.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Society of the Snow', 84.9, TIMESTAMP WITH TIME ZONE '2025-06-06T10:00:00Z', 'A história dos sobreviventes uruguaios de um acidente de avião nos Andes em 1972.', 'https://example.com/img/society-snow.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Super Mario Bros. Movie', 84.3, TIMESTAMP WITH TIME ZONE '2025-06-07T10:00:00Z', 'Mario embarca em uma aventura para resgatar a Princesa Peach do temido Bowser.', 'https://example.com/img/mario-movie.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Baby Driver', 80.7, TIMESTAMP WITH TIME ZONE '2025-06-08T10:00:00Z', 'Um jovem motorista de fuga ouve música para se concentrar enquanto trabalha para um chefe do crime.', 'https://example.com/img/baby-driver.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Anyone But You', 78.9, TIMESTAMP WITH TIME ZONE '2025-06-09T10:00:00Z', 'Dois inimigos fingem ser um casal em um casamento na Austrália.', 'https://example.com/img/anyone-but-you.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Damsel', 76.4, TIMESTAMP WITH TIME ZONE '2025-06-10T10:00:00Z', 'Uma jovem noiva descobre que o casamento real é uma armadilha para sacrificá-la a um dragão.', 'https://example.com/img/damsel.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Accountant', 75.1, TIMESTAMP WITH TIME ZONE '2025-06-11T10:00:00Z', 'Um contador com síndrome de Asperger trabalha para organizações criminosas perigosas.', 'https://example.com/img/the-accountant.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Unfrosted', 73.5, TIMESTAMP WITH TIME ZONE '2025-06-12T10:00:00Z', 'A rivalidade entre a Kellogg''s e a Post na corrida para criar um café da manhã que mudaria a história: a tortinha Pop-Tart.', 'https://example.com/img/unfrosted.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Glass', 71.2, TIMESTAMP WITH TIME ZONE '2025-06-13T10:00:00Z', 'David Dunn enfrenta o Homem de Vidro enquanto um psiquiatra tenta provar que os três não possuem habilidades sobre-humanas.', 'https://example.com/img/glass.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Nutty Professor', 69.8, TIMESTAMP WITH TIME ZONE '2025-06-14T10:00:00Z', 'Um cientista obeso inventa uma poção que o transforma em um homem magro e charmoso, mas com uma personalidade terrível.', 'https://example.com/img/nutty-professor.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Batman', 68.4, TIMESTAMP WITH TIME ZONE '2025-06-15T10:00:00Z', 'Batman investiga a corrupção em Gotham City enquanto enfrenta o Charada, um assassino em série que mira a elite da cidade.', 'https://example.com/img/the-batman.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Everything Everywhere All at Once', 67.1, TIMESTAMP WITH TIME ZONE '2025-06-16T10:00:00Z', 'Uma imigrante chinesa embarca em uma aventura para salvar o multiverso.', 'https://example.com/img/everything-everywhere.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Split', 65.9, TIMESTAMP WITH TIME ZONE '2025-06-17T10:00:00Z', 'Três adolescentes são sequestradas por um homem com 23 personalidades distintas.', 'https://example.com/img/split.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('Argylle', 64.3, TIMESTAMP WITH TIME ZONE '2025-06-18T10:00:00Z', 'Uma escritora de livros de espionagem é arrastada para o mundo real de espionagem quando as tramas de seus livros começam a espelhar as atividades de uma organização criminosa.', 'https://example.com/img/argylle.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Mother', 62.7, TIMESTAMP WITH TIME ZONE '2025-06-19T10:00:00Z', 'Uma assassina sai do esconderijo para proteger a filha que abandonou anos antes.', 'https://example.com/img/the-mother.jpg');
INSERT INTO tb_product (name, price, date, description, img_url) VALUES ('The Holiday', 61.5, TIMESTAMP WITH TIME ZONE '2025-06-20T10:00:00Z', 'Duas mulheres trocam de casas durante o Natal e encontram o amor inesperadamente.', 'https://example.com/img/the-holiday.jpg');

-- 4. INSERIR RELACIONAMENTOS (Conteúdo-Categoria)
-- Séries (IDs 1 a 10)
INSERT INTO tb_product_category (product_id, category_id) VALUES (1, 11); -- Squid Game -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 7);  -- Adolescence -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (2, 11); -- Adolescence -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (3, 7);  -- Tracker -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 1);  -- Reacher -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (4, 11); -- Reacher -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (5, 7);  -- High Potential -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 3);  -- Avatar -> Aventura
INSERT INTO tb_product_category (product_id, category_id) VALUES (6, 8);  -- Avatar -> Fantasia
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 5);  -- Griselda -> Crime
INSERT INTO tb_product_category (product_id, category_id) VALUES (7, 7);  -- Griselda -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 5);  -- True Detective -> Crime
INSERT INTO tb_product_category (product_id, category_id) VALUES (8, 7);  -- True Detective -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 1);  -- The Tourist -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (9, 11); -- The Tourist -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 9); -- Constellation -> Ficção Científica
INSERT INTO tb_product_category (product_id, category_id) VALUES (10, 11);-- Constellation -> Suspense

-- Filmes (IDs 11 a 30) - Principais categorias para cada um
INSERT INTO tb_product_category (product_id, category_id) VALUES (11, 1);  -- The Killer -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 1);  -- Fight Club -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (12, 7);  -- Fight Club -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (13, 7);  -- Amar Singh Chamkila -> Drama
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 1);  -- Madame Web -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (14, 9);  -- Madame Web -> Ficção Científica
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 4);  -- Irish Wish -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (15, 10); -- Irish Wish -> Romance
INSERT INTO tb_product_category (product_id, category_id) VALUES (16, 6);  -- Society of the Snow -> Documentário
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 3);  -- Super Mario Bros -> Aventura
INSERT INTO tb_product_category (product_id, category_id) VALUES (17, 4);  -- Super Mario Bros -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (18, 1);  -- Baby Driver -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (19, 4);  -- Anyone But You -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (19, 10); -- Anyone But You -> Romance
INSERT INTO tb_product_category (product_id, category_id) VALUES (20, 3);  -- Damsel -> Aventura
INSERT INTO tb_product_category (product_id, category_id) VALUES (20, 8);  -- Damsel -> Fantasia
INSERT INTO tb_product_category (product_id, category_id) VALUES (21, 1);  -- The Accountant -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (21, 5);  -- The Accountant -> Crime
INSERT INTO tb_product_category (product_id, category_id) VALUES (22, 4);  -- Unfrosted -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (23, 1);  -- Glass -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (23, 11); -- Glass -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (24, 4);  -- The Nutty Professor -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (25, 1);  -- The Batman -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (25, 5);  -- The Batman -> Crime
INSERT INTO tb_product_category (product_id, category_id) VALUES (26, 1);  -- Everything Everywhere -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (26, 9);  -- Everything Everywhere -> Ficção Científica
INSERT INTO tb_product_category (product_id, category_id) VALUES (27, 11); -- Split -> Suspense
INSERT INTO tb_product_category (product_id, category_id) VALUES (27, 12); -- Split -> Terror
INSERT INTO tb_product_category (product_id, category_id) VALUES (28, 1);  -- Argylle -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (28, 4);  -- Argylle -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (29, 1);  -- The Mother -> Ação
INSERT INTO tb_product_category (product_id, category_id) VALUES (30, 4);  -- The Holiday -> Comédia
INSERT INTO tb_product_category (product_id, category_id) VALUES (30, 10); -- The Holiday -> Romance

-- Departments
INSERT INTO tb_department(name) VALUES ('Sales');
INSERT INTO tb_department(name) VALUES ('Management');
INSERT INTO tb_department(name) VALUES ('Training');

-- Users
INSERT INTO tb_employee(name, email, department_id) VALUES ('Maria', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Ana', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Bob', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Marco', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Alex', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Claudia', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rodrigo', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Elisa', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Lucas', 'maria@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Rafael', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Tiago', 'maria@gmail.com', 1);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Andressa', 'maria@gmail.com', 2);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Meire', 'maria@gmail.com', 3);
INSERT INTO tb_employee(name, email, department_id) VALUES ('Carol', 'maria@gmail.com', 1);