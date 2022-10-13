INSERT INTO restaurante (id, cep, complemento, nome) VALUES
(1L, '5423010', 'Próximo a escola bom jesus', ' Restaurante Sabor Divino'),
(2L, '6203454', 'Ao lado da panificadora Rainha', 'Restaurante e churrascaria Boi na Braza');

INSERT INTO cliente (id, cep, complemento, nome) VALUES
(1L, '3408120', 'Ed.Juarez, ao lado do mercado da madalena', 'Amanda Lima da Silva'),
(2L, '5400201', 'Em frente à academia seculo XXI', 'Carlos Andrade');

INSERT INTO produto (id, disponivel, nome, valor_unitario, restaurante_id) VALUES
(1L, true, 'Prato Executivo - Frango assado ', 12.0, 1L),
(2L, true, 'Feijoada', 15.0, 1L),
(3L, true, ' Prato Executivo - Costela no bafo', 18.0, 2L);

INSERT INTO sacola (id, forma_pagamento, fechada, valor_total,cliente_id) VALUES
(1L, 0, false, 0.0, 1L)
