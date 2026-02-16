-- 1. Insertar los proyectos (Sin ID, dejamos que H2 asigne 1 y 2)
INSERT INTO projects (title, description, url, image_url) VALUES ('Portfolio Web Sergio Carrero', 'Página actual, la cual actua como un porfolio de mis proyectos', 'inicio', 'https://images.unsplash.com/photo-1517694712202-14dd9538aa97?w=500');
INSERT INTO projects (title, description, url, image_url) VALUES ('E-commerce API', 'Backend para tienda online', 'projecto2', 'https://images.unsplash.com/photo-1557821552-17105176677c?w=500');

INSERT INTO project_technologies (project_id, technology) VALUES (1, 'Java & Spring Boot');
INSERT INTO project_technologies (project_id, technology) VALUES (1, 'Thymeleaf');
INSERT INTO project_technologies (project_id, technology) VALUES (1, 'Bootstrap 5');
INSERT INTO project_technologies (project_id, technology) VALUES (1, 'H2 Database');
INSERT INTO project_technologies (project_id, technology) VALUES (2, 'Docker');