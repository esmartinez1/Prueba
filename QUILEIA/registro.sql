-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 09-05-2019 a las 17:06:32
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `registro`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `Identificacion_P` varchar(15) NOT NULL,
  `Identificacion_M` int(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medico`
--

CREATE TABLE `medico` (
  `Nombre` varchar(30) NOT NULL,
  `Identificacion_M` varchar(15) NOT NULL,
  `Tipo_Identificacion` varchar(20) NOT NULL,
  `Numero_targeta` varchar(20) NOT NULL,
  `años_experiencia` decimal(2,0) NOT NULL,
  `Especialidad` varchar(30) NOT NULL,
  `Hora_inicio` varchar(6) NOT NULL,
  `Hora_final` varchar(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `medico`
--

INSERT INTO `medico` (`Nombre`, `Identificacion_M`, `Tipo_Identificacion`, `Numero_targeta`, `años_experiencia`, `Especialidad`, `Hora_inicio`, `Hora_final`) VALUES
('Esteban', '123456789', 'Cedula', '97564213', '2', 'cirujano', '09', '18');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `paciente`
--

CREATE TABLE `paciente` (
  `Nombre` varchar(50) NOT NULL,
  `Fecha_Nacimiento` date NOT NULL,
  `Identificacion_P` varchar(15) NOT NULL,
  `Tipo_Identificacion` varchar(25) NOT NULL,
  `EPS_Afiliacion` varchar(15) NOT NULL,
  `Historia_Clinica` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `medico`
--
ALTER TABLE `medico`
  ADD PRIMARY KEY (`Tipo_Identificacion`);

--
-- Indices de la tabla `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`Identificacion_P`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
