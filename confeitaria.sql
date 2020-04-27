-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.4.8-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win64
-- HeidiSQL Versão:              10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para confeitaria
CREATE DATABASE IF NOT EXISTS `confeitaria` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;
USE `confeitaria`;

-- Copiando estrutura para tabela confeitaria.categoria
CREATE TABLE IF NOT EXISTS `categoria` (
  `categoria_id` int(11) NOT NULL,
  `categoria_nome` varchar(40) DEFAULT NULL,
  `descricao` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`categoria_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.categoria: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `categoria` DISABLE KEYS */;
INSERT INTO `categoria` (`categoria_id`, `categoria_nome`, `descricao`) VALUES
	(1, 'Naked Cake', 'Bolos sem cobertura'),
	(2, 'Drip Cake', 'Bolos pingados'),
	(3, 'Bolos Cobertos', NULL),
	(4, 'Bolos Vulcões', NULL),
	(5, 'Brigadeiro', NULL);
/*!40000 ALTER TABLE `categoria` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `cliente_id` int(11) NOT NULL AUTO_INCREMENT,
  `email` varchar(50) NOT NULL,
  `senha` char(6) NOT NULL,
  `cpf` char(14) DEFAULT NULL,
  `cnpj` char(14) DEFAULT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `sobrenome` varchar(30) DEFAULT NULL,
  `nome_fantasia` varchar(30) DEFAULT NULL,
  `razao_social` varchar(30) DEFAULT NULL,
  `cep` char(8) DEFAULT NULL,
  `cidade` varchar(40) DEFAULT NULL,
  `rua` varchar(65) DEFAULT NULL,
  `bairro` varchar(40) DEFAULT NULL,
  `estado` char(2) DEFAULT NULL,
  `numero` int(5) DEFAULT NULL,
  `complemento` int(5) DEFAULT NULL,
  PRIMARY KEY (`cliente_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.cliente: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` (`cliente_id`, `email`, `senha`, `cpf`, `cnpj`, `nome`, `sobrenome`, `nome_fantasia`, `razao_social`, `cep`, `cidade`, `rua`, `bairro`, `estado`, `numero`, `complemento`) VALUES
	(1, 'diegobarbosavl@gmail.com', '010203', '01430422467', NULL, 'Diego', 'Barbosa Vanderlei de Lima', NULL, NULL, '53050273', 'Olinda', '3º Travessa São João Batista', 'Jardim Atlântico', 'PE', 41, 204),
	(2, 'marinacrespo@hotmail.com', 'abc123', '02435422261', NULL, 'Marina', 'Araújo Crespo', NULL, NULL, '50012225', 'São Lourenço', 'Rua da trombeta', 'Centro', 'PE', 1, 123),
	(3, 'ednasilva@hotmail.com', 'a23111', '02589632175', NULL, 'Mariana', 'Araújo Crespo', NULL, NULL, '50012225', 'São Lourenço', 'Rua da trombeta', 'Centro', 'PE', 1, 123),
	(4, 'georgefragoso@gmail.com', '777896', '02369874125', NULL, 'George', 'Fragoso Cavalcanti', NULL, NULL, '50761310', 'Recife', 'Rua Comendador Franco Ferreira', 'San Martin', 'PE', 1, 123),
	(5, 'vidinha@hotmail.com', '777777', '02277777789', NULL, 'Maria', 'Alines', NULL, NULL, '50012225', 'São Lourenço', 'Rua da trombeta', 'Centro', 'PE', 1, 123);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.detalhes_pedido
CREATE TABLE IF NOT EXISTS `detalhes_pedido` (
  `detalhes_pedido_id` int(11) NOT NULL,
  `pedido_id` int(11) NOT NULL,
  `produto_id` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  `desconto` float DEFAULT NULL,
  `valor_total` float DEFAULT NULL,
  PRIMARY KEY (`detalhes_pedido_id`,`pedido_id`,`produto_id`),
  KEY `FK_PRODUTO_ID_ITEM_PRODUTO` (`produto_id`),
  KEY `FK_PEDIDO_ID_ITEM_CLIENTE` (`pedido_id`),
  CONSTRAINT `FK_PEDIDO_ID_ITEM_CLIENTE` FOREIGN KEY (`pedido_id`) REFERENCES `pedido` (`pedido_id`),
  CONSTRAINT `FK_PRODUTO_ID_ITEM_PRODUTO` FOREIGN KEY (`produto_id`) REFERENCES `produto` (`produto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.detalhes_pedido: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `detalhes_pedido` DISABLE KEYS */;
INSERT INTO `detalhes_pedido` (`detalhes_pedido_id`, `pedido_id`, `produto_id`, `quantidade`, `preco`, `desconto`, `valor_total`) VALUES
	(1, 1, 1, 3, 15, 0, 75),
	(1, 1, 2, 1, 30, 0, 75),
	(2, 2, 5, 2, 55, 0, 110),
	(3, 3, 3, 3, 60, 0, 180),
	(4, 4, 3, 4, 60, 0, 230),
	(5, 5, 1, 3, 15, 0, 75);
/*!40000 ALTER TABLE `detalhes_pedido` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.entrega
CREATE TABLE IF NOT EXISTS `entrega` (
  `entrega_id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_entrega` varchar(40) NOT NULL,
  PRIMARY KEY (`entrega_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.entrega: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `entrega` DISABLE KEYS */;
INSERT INTO `entrega` (`entrega_id`, `tipo_entrega`) VALUES
	(1, 'Retirada'),
	(2, 'A combinar');
/*!40000 ALTER TABLE `entrega` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.pagamento
CREATE TABLE IF NOT EXISTS `pagamento` (
  `pagamento_id` int(11) NOT NULL AUTO_INCREMENT,
  `tipo_pagamento` varchar(40) NOT NULL,
  PRIMARY KEY (`pagamento_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.pagamento: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `pagamento` DISABLE KEYS */;
INSERT INTO `pagamento` (`pagamento_id`, `tipo_pagamento`) VALUES
	(1, 'Dinheiro'),
	(2, 'Cartão');
/*!40000 ALTER TABLE `pagamento` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.pedido
CREATE TABLE IF NOT EXISTS `pedido` (
  `pedido_id` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_id` int(11) NOT NULL,
  `pagamento_id` int(11) NOT NULL,
  `entrega_id` int(11) NOT NULL,
  `status_pedido` varchar(40) DEFAULT NULL,
  `data_entrega` date DEFAULT NULL,
  `data_pedido` date DEFAULT NULL,
  PRIMARY KEY (`pedido_id`),
  KEY `FK_CLIENTE_ID_PEDIDO` (`cliente_id`),
  KEY `FK_ENTREGA_ID_PEDIDO` (`entrega_id`),
  KEY `FK_PAGAMENTO_ID_PEDIDO` (`pagamento_id`),
  CONSTRAINT `FK_CLIENTE_ID_PEDIDO` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`),
  CONSTRAINT `FK_ENTREGA_ID_PEDIDO` FOREIGN KEY (`entrega_id`) REFERENCES `entrega` (`entrega_id`),
  CONSTRAINT `FK_PAGAMENTO_ID_PEDIDO` FOREIGN KEY (`pagamento_id`) REFERENCES `pagamento` (`pagamento_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.pedido: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `pedido` DISABLE KEYS */;
INSERT INTO `pedido` (`pedido_id`, `cliente_id`, `pagamento_id`, `entrega_id`, `status_pedido`, `data_entrega`, `data_pedido`) VALUES
	(1, 1, 1, 1, 'Em preparação', '2020-06-22', '2020-04-14'),
	(2, 1, 1, 1, 'Em preparação', '2020-06-20', '2020-04-14'),
	(3, 2, 1, 1, 'Em preparação', '2020-05-12', '2020-04-14'),
	(4, 2, 1, 1, 'Em preparação', '2020-06-29', '2020-04-14'),
	(5, 5, 1, 1, 'Em preparação', '2020-05-28', '2020-04-14');
/*!40000 ALTER TABLE `pedido` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.produto
CREATE TABLE IF NOT EXISTS `produto` (
  `produto_id` int(11) NOT NULL AUTO_INCREMENT,
  `categoria_id` int(11) NOT NULL,
  `produto_nome` varchar(40) DEFAULT NULL,
  `produto_descricao` varchar(1500) DEFAULT NULL,
  `preco_unitario` float DEFAULT NULL,
  `tamanho` varchar(30) DEFAULT NULL,
  `desconto` float DEFAULT NULL,
  `foto` blob DEFAULT NULL,
  PRIMARY KEY (`produto_id`),
  KEY `FK_CATEGORIA_ID` (`categoria_id`),
  CONSTRAINT `FK_CATEGORIA_ID` FOREIGN KEY (`categoria_id`) REFERENCES `categoria` (`categoria_id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.produto: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` (`produto_id`, `categoria_id`, `produto_nome`, `produto_descricao`, `preco_unitario`, `tamanho`, `desconto`, `foto`) VALUES
	(1, 3, 'Bolos de caixa', 'Caseirinhos', 15, 'Pequeno', 20, NULL),
	(2, 4, 'Bolo Vulcão', 'Chocolate', 30, 'Pequeno', 15, NULL),
	(3, 1, 'Chocolatra', 'No acetato e churros', 60, 'Pequeno', 0, NULL),
	(4, 2, 'Mini Naked', 'Chocolate', 7, 'Pequeno', 10, NULL),
	(5, 1, 'Brownie', 'Chocolate', 55, 'Pequeno', 20, NULL);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;

-- Copiando estrutura para tabela confeitaria.telefone_cliente
CREATE TABLE IF NOT EXISTS `telefone_cliente` (
  `cliente_id` int(11) NOT NULL,
  `telefone_cliente_id` bigint(11) NOT NULL,
  PRIMARY KEY (`cliente_id`,`telefone_cliente_id`),
  CONSTRAINT `FK_CLIENTE_ID_TELEFONE_CLIENTE` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`cliente_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- Copiando dados para a tabela confeitaria.telefone_cliente: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `telefone_cliente` DISABLE KEYS */;
INSERT INTO `telefone_cliente` (`cliente_id`, `telefone_cliente_id`) VALUES
	(1, 8134310403),
	(1, 81997219065),
	(2, 81995236584),
	(3, 81999999653),
	(4, 8132564456);
/*!40000 ALTER TABLE `telefone_cliente` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
