# Back-End
No me costo tanto... pero las comunicaciones... lpm!

Va codigo de mySQL porque no se si se pueda subir de otro modo.

-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: btxwjo2hfynpb5uffs8n-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 30, 2023 at 08:01 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `btxwjo2hfynpb5uffs8n`
--
CREATE DATABASE IF NOT EXISTS `btxwjo2hfynpb5uffs8n` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `btxwjo2hfynpb5uffs8n`;

-- --------------------------------------------------------

--
-- Table structure for table `blandas`
--

CREATE TABLE `blandas` (
  `id_persona` int(11) NOT NULL,
  `id_blanda` int(11) NOT NULL,
  `nombre_blanda` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `color_blanda` varchar(255) NOT NULL,
  `url_img_blanda` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blandas`
--

INSERT INTO `blandas` (`id_persona`, `id_blanda`, `nombre_blanda`, `color_blanda`, `url_img_blanda`) VALUES
(1, 1, 'Paciencia', '#ab39f7', './assets/ico-paciencia.png'),
(1, 2, 'Perseverancia', '#ff0606', './assets/ico-desafios.png'),
(1, 3, 'Iniciativa', '#07a4e2', './assets/ico-inicia.png'),
(1, 4, 'Honestidad', '#f045cb', './assets/ico-honestidad.png'),
(1, 5, 'Puntialidad', '#ab39f7', './assets/ico-puntualidad.png');

-- --------------------------------------------------------

--
-- Table structure for table `blandas_seq`
--

CREATE TABLE `blandas_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `blandas_seq`
--

INSERT INTO `blandas_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `duras`
--

CREATE TABLE `duras` (
  `id_persona` int(11) NOT NULL,
  `id_dura` int(11) NOT NULL,
  `nombre_dura` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `porcentaje` int(11) NOT NULL,
  `num` double NOT NULL,
  `giro` double NOT NULL,
  `color_dura` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `duras`
--

INSERT INTO `duras` (`id_persona`, `id_dura`, `nombre_dura`, `porcentaje`, `num`, `giro`, `color_dura`) VALUES
(1, 1, 'HTML', 80, 88, 288, '#e20bd7'),
(1, 2, 'CSS', 80, 88, 288, '#e20bd7'),
(1, 3, 'JS', 50, 220, 180, '#08acf8'),
(1, 4, 'Angular', 30, 308, 108, '#4453dd'),
(1, 5, 'Java', 25, 330, 90, '#4d9623'),
(1, 6, 'An.Datos', 95, 44, 324, '#a510fc'),
(1, 7, 'C++', 55, 198, 198, '#ebfc05'),
(1, 8, 'BI', 85, 66, 306, '#ab39f7');

-- --------------------------------------------------------

--
-- Table structure for table `duras_seq`
--

CREATE TABLE `duras_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `duras_seq`
--

INSERT INTO `duras_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `estudio_formal`
--

CREATE TABLE `estudio_formal` (
  `id_persona` int(11) NOT NULL,
  `id_estudio` int(11) NOT NULL,
  `titulo_estudio` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `periodo_estudio` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nombre_instituto` varchar(255) NOT NULL,
  `url_instituto` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url_img_inst` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `estudio_formal`
--

INSERT INTO `estudio_formal` (`id_persona`, `id_estudio`, `titulo_estudio`, `periodo_estudio`, `nombre_instituto`, `url_instituto`, `url_img_inst`) VALUES
(1, 1, 'Licenciada en Criminalistica', '2004-2007', 'IUPFA', 'https://www.universidad-policial.edu.ar', './assets/logo-iupfa.png'),
(1, 2, 'Tecnica en Evisceraci&oacute;n y Toma de Muestas', '2009', 'ICF', 'https://www.forensesargentina.com.ar', './assets/logo-icf.png'),
(1, 3, 'Diplomatura en Delitos Inform&aacute;ticos y Evidencia Digital', '2016', 'UAI', 'http://uai.edu.ar', './assets/logo-uai.png'),
(1, 4, 'Especialista en Reconstruccion Virtual de Casos Criminales', '2017', 'RVF', 'http://www.reconstruccionforense.com', './assets/logo-rvf-png'),
(1, 5, 'Diplomatura en Perfiles Criminales', '2017', 'Uni. Aconcagua', 'http://www.uda.edu.ar', './assets/logo-uac.png');

-- --------------------------------------------------------

--
-- Table structure for table `estudio_formal_seq`
--

CREATE TABLE `estudio_formal_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `estudio_formal_seq`
--

INSERT INTO `estudio_formal_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `estudio_tic`
--

CREATE TABLE `estudio_tic` (
  `id_persona` int(11) NOT NULL,
  `id_tic` int(11) NOT NULL,
  `curso_tic` varchar(255) DEFAULT NULL,
  `periodo_tic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `nombre_inst_tic` varchar(255) NOT NULL,
  `url_inst_tic` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url_img_tic` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `estudio_tic`
--

INSERT INTO `estudio_tic` (`id_persona`, `id_tic`, `curso_tic`, `periodo_tic`, `nombre_inst_tic`, `url_inst_tic`, `url_img_tic`) VALUES
(1, 1, 'An&aacute;lisis y Construcci&oacute;n de Modelos Relacionales', '1998', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 2, 'Introducci&oacute;n a Oracle y PL/SQL', '2003', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 3, 'Forms VS 5 y Reports 3', '2003', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 4, 'Aplicando mySQL con PHP', '2008', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 5, 'Taller sobre Consultas y Reportes Business Object', '2010', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 6, 'Business Intelligence I', '2018', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 7, 'Business Intelligence II', '2023', 'Hacienda', 'https://capacitacion.mecon.gob.ar', './assets/logo-mecon.png'),
(1, 8, 'Programaci&oacute;n C++', '2019', 'INAP', 'https://capacitacion.inap.gob.ar', './assets/logo-inap.png'),
(1, 9, 'S&eacute; programar', '2022', 'INAP', 'https://capacitacion.inap.gob.ar', './assets/logo-inap.png'),
(1, 10, 'Yo Programo', '2022/2023', 'AP', 'https://argentinaprograma.inti.gob.ar', './assets/logo-ap.png');

-- --------------------------------------------------------

--
-- Table structure for table `estudio_tic_seq`
--

CREATE TABLE `estudio_tic_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `estudio_tic_seq`
--

INSERT INTO `estudio_tic_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `laboral`
--

CREATE TABLE `laboral` (
  `id_persona` int(11) NOT NULL,
  `id_laboral` int(11) NOT NULL,
  `nombre_empresa` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `periodo_empresa` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `desc_empresa` longtext CHARACTER SET utf8 COLLATE utf8_general_ci,
  `url_empresa` varchar(255) DEFAULT NULL,
  `url_img_lab` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `laboral`
--

INSERT INTO `laboral` (`id_persona`, `id_laboral`, `nombre_empresa`, `periodo_empresa`, `desc_empresa`, `url_empresa`, `url_img_lab`) VALUES
(1, 1, 'Mecon', '2018-actual', '<ul>\r\n<li>Responsable del an&aacute;lisis de la Deuda Exigible del Estado Nacional.</li>\r\n<li>Co-responsable del an&aacute;lisis de la Deuda P&uacute;blica del Estado Nacional.</li>\r\n<li>Referente de la Contadur&iacute;a General de la Naci&oacute;n para la definici&oacute;n de DATAMARTS.</li>\r\n<li>Referente por la Contadur&iacute;a General de la Naci&oacute;n en las inform&aacute;ticos relacionados con el m&oacute;dulo de retenciones.</li>\r\n</ul>', 'https://www.argentina.gob.ar/economia/sechacienda/cgn', './assets/logo-mecon.png'),
(1, 2, 'DNM-Moreno', '2016-2018', '<ul>\r\n<li>Responsable del &aacute;rea de Certificaciones.</li>\r\n<li>Asistente en el registro de datos biom&eacute;tricos.</li>\r\n<li>Tramitaci&oacute;n de visado.</li>\r\n<li>Tramitaci&oacute;n de residencias y DNI para extranjeros.</li>\r\n</ul>', 'https://www.argentina.gob.ar/interior/migraciones', './assets/logo-migraciones.png'),
(1, 3, 'Min.Econ.', '1993-2016', '<ul>\r\n<li>Dise&#241;o, desarrollo y mantenimiento del sistema de Minutas Contables.</li>\r\n<li>Desarrollo de procesos de automatizaci&oacute;n para agilizar las tareas del sector.</li>\r\n<li>An&aacute;lisis de Cuentas Corrientes a Pagar y Cuentas de Resultado Negativo.</li>\r\n<li>Data entry.</li>\r\n</ul>', 'https://www.argentina.gob.ar/economia/sechacienda/cgn', './assets/logo-mecon.png');

-- --------------------------------------------------------

--
-- Table structure for table `laboral_seq`
--

CREATE TABLE `laboral_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `laboral_seq`
--

INSERT INTO `laboral_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id_persona` int(11) NOT NULL,
  `acerca_persona` longtext CHARACTER SET utf8 COLLATE utf8_general_ci,
  `apellido_persona` varchar(255) DEFAULT NULL,
  `celu_persona` varchar(255) DEFAULT NULL,
  `email_persona` varchar(255) DEFAULT NULL,
  `nombre_persona` varchar(255) NOT NULL,
  `sub_titulo` varchar(255) DEFAULT NULL,
  `url_img_persona` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id_persona`, `acerca_persona`, `apellido_persona`, `celu_persona`, `email_persona`, `nombre_persona`, `sub_titulo`, `url_img_persona`) VALUES
(1, 'Nac&iacute; en CABA un <b>23 de septiembre</b>, con el Sol en <b>libra</b>por eso soy muy curiosa y me gusta aprender de todo, por ejemplo: astrolog&iacute;a. Soy fan&aacute;tica de <b>Boca</b>, de esas que van a la cancha. Me gusta mucho <b>leer</b>, aunque trato de esquivar los libros digitales, prefiero palpar el libro real. Voy al gim todos los d&iacute;as para hacer <b>spinning</b>, a veces tambi&eacute;n tomo clases de <b>zumba</b> y otras de <b>bachata</b>. Mis hobbies son las <b>manualidades en porcelana fr&iacute;a</b> y el <b>origami.</b> Aprend&iacute; a programar metiendo los dedos, despu&eacute;s hice algunos cursos a trav&eacute;s de la oficina. Actualmente, vivo en <b>Moreno (GBA Oeste)</b> con mi hijo humano y mi hija de cuatro patas.', 'Borsani', '+54.11.6964-2886', 'licsilborsa@yahoo.com.ar', 'Silvana Paula', 'Stack Full Web Developer Jr (ponele)', './assets/yo.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `persona_seq`
--

CREATE TABLE `persona_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona_seq`
--

INSERT INTO `persona_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `proyecto`
--

CREATE TABLE `proyecto` (
  `id_persona` int(11) NOT NULL,
  `id_py` int(11) NOT NULL,
  `nombre_py` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `periodo_py` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `desc_py` longtext CHARACTER SET utf8 COLLATE utf8_general_ci,
  `foto_py` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyecto`
--

INSERT INTO `proyecto` (`id_persona`, `id_py`, `nombre_py`, `periodo_py`, `desc_py`, `foto_py`) VALUES
(1, 1, 'Mi portfolio', '2022-2023', 'Mi segundo gran proyecto, todav&iacute;a en proceso. Con el cual estoy aprendiendo enormemente, pero tambien padeciendo de manera proporcional.', 0),
(1, 2, 'Ingenier&iacute;a del eSIDIF', '2007', 'Me toc&oacute; participar en definiciones funcionales para los m&oacute;dulos de <i>\"Pasajes y Vi&aacute;ticos\"</i> y <i>\"Fondo Rotatorio y Cajas Chicas\"</i>, actualmente vigente a trav&eacute;s de internet <i>(eSIDIF)</i>.', 0),
(1, 3, 'Facturador para kiosco', '2003', 'Fu&eacute; un trabajo para una persona amiga, realizado con MS Access y Visual Basic. Contaba con un controlador de stock de mercader&iacute;a y control de caja. Estuvo en funcionamiento unos 4 a&#241;os, hasta que cerr&oacute; el negocio para irse a vivir afuera.', 0),
(1, 4, 'Sistema de Ajustes Contables', '1998', 'Fu&eacute; mi primer gran proyecto, con el que m&aacute;s aprend&iacute;. Era un sistema en el que cada usuario habilitado cargaba las modificaciones Contables que consideraba necesarias para el an&aacute;lisis a su cargo, luego un usuario de nivel superior lo autorizaba y finalmente se imprim&iacute;a para cargarlo formalmente en el sistema propio. Realizado con MS Access 97 y Visual Basic. Se acced&iacute;a con usuario y clave, ten&iacute;a un men&uacute; para navegar entre las ocpiones disponibles, seg&uacute;n los niveles de acceso. Hab&iacute;a formularios de carga, formularios de consulta y reportes con diferentes tipos \r\nde impresiones (detallada, sumarizada, por cuenta contable, por organismo, etc).\r\nEstuvo vigente por 3 años, hasta que se diseñ&oacute; el sistema nuevo y se incorpor&oacute; la idea de los ajustes.', 0);

-- --------------------------------------------------------

--
-- Table structure for table `proyecto_seq`
--

CREATE TABLE `proyecto_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `proyecto_seq`
--

INSERT INTO `proyecto_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `redes`
--

CREATE TABLE `redes` (
  `id_red` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `nombre_red` varchar(255) NOT NULL,
  `url_red` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `url_img_red` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `redes`
--

INSERT INTO `redes` (`id_red`, `id_persona`, `nombre_red`, `url_red`, `url_img_red`) VALUES
(1, 1, 'Facebook', 'http://www.facebook.com/Tobias.te.amo', './assets/face.png'),
(2, 1, 'Pinterest', 'https://ar.pinterest.com/silborsa', './assets/pint.png'),
(3, 1, 'LinkedIn', 'https://www.linkedin.com/in/licspb/', './assets/lin.png'),
(4, 1, 'Telegram', 'https://t.me/51lv4n4_ok', './assets/tgm.png');

-- --------------------------------------------------------

--
-- Table structure for table `redes_seq`
--

CREATE TABLE `redes_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `redes_seq`
--

INSERT INTO `redes_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `rol`
--

CREATE TABLE `rol` (
  `id_rol` int(11) NOT NULL,
  `rol_nombre` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rol`
--

INSERT INTO `rol` (`id_rol`, `rol_nombre`) VALUES
(1, 'ROLE_ADMIN'),
(2, 'ROLE_USER');

-- --------------------------------------------------------

--
-- Table structure for table `rol_seq`
--

CREATE TABLE `rol_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `rol_seq`
--

INSERT INTO `rol_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

-- --------------------------------------------------------

--
-- Table structure for table `usuario`
--

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL,
  `email_usuario` varchar(255) NOT NULL,
  `nombre` varchar(255) NOT NULL,
  `nombre_usuario` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario`
--

INSERT INTO `usuario` (`id_usuario`, `email_usuario`, `nombre`, `nombre_usuario`, `password`) VALUES
(1, 'admin@admin.com', 'admin', 'admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `usuario_rol`
--

CREATE TABLE `usuario_rol` (
  `usuario_id_usuario` int(11) NOT NULL,
  `rol_id_usuario` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario_rol`
--

INSERT INTO `usuario_rol` (`usuario_id_usuario`, `rol_id_usuario`) VALUES
(1, 1),
(1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `usuario_seq`
--

CREATE TABLE `usuario_seq` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `usuario_seq`
--

INSERT INTO `usuario_seq` (`next_val`) VALUES
(1),
(1),
(1),
(1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `blandas`
--
ALTER TABLE `blandas`
  ADD PRIMARY KEY (`id_blanda`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `duras`
--
ALTER TABLE `duras`
  ADD PRIMARY KEY (`id_dura`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `estudio_formal`
--
ALTER TABLE `estudio_formal`
  ADD PRIMARY KEY (`id_estudio`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `estudio_tic`
--
ALTER TABLE `estudio_tic`
  ADD PRIMARY KEY (`id_tic`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `laboral`
--
ALTER TABLE `laboral`
  ADD PRIMARY KEY (`id_laboral`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id_persona`);

--
-- Indexes for table `proyecto`
--
ALTER TABLE `proyecto`
  ADD PRIMARY KEY (`id_py`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `redes`
--
ALTER TABLE `redes`
  ADD PRIMARY KEY (`id_red`),
  ADD KEY `fk_persona_id_persona` (`id_persona`) USING BTREE;

--
-- Indexes for table `rol`
--
ALTER TABLE `rol`
  ADD PRIMARY KEY (`id_rol`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_usuario`),
  ADD UNIQUE KEY `UK_puhr3k3l7bj71hb7hk7ktpxn0` (`nombre_usuario`);

--
-- Indexes for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD PRIMARY KEY (`usuario_id_usuario`,`rol_id_usuario`),
  ADD KEY `FK6kj06e7tqeko1o0ge7604peft` (`rol_id_usuario`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `usuario_rol`
--
ALTER TABLE `usuario_rol`
  ADD CONSTRAINT `FK6kj06e7tqeko1o0ge7604peft` FOREIGN KEY (`rol_id_usuario`) REFERENCES `rol` (`id_rol`),
  ADD CONSTRAINT `FKpcxpmhgrf0w0c8u3pouxaqttw` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
