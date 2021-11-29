-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 29, 2021 at 10:33 AM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 7.3.28

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `fahmi_rachmadian`
--

-- --------------------------------------------------------

--
-- Table structure for table `fahmi_rachmadian`
--

CREATE TABLE `fahmi_rachmadian` (
  `nip` varchar(63) NOT NULL,
  `nama_lengkap` varchar(50) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `tempat_lahir` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `fahmi_rachmadian`
--

INSERT INTO `fahmi_rachmadian` (`nip`, `nama_lengkap`, `tanggal_lahir`, `tempat_lahir`) VALUES
('00001', 'Fahmi', '2000-02-11', 'Bandung'),
('00002', 'Dadang', '2000-03-15', 'Cimahi'),
('00003', 'Alex', '2000-07-04', 'Jakarta'),
('00004', 'Brew', '2000-11-20', 'Bandung'),
('00005', 'Siti', '2000-02-02', 'Cimahi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fahmi_rachmadian`
--
ALTER TABLE `fahmi_rachmadian`
  ADD PRIMARY KEY (`nip`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
