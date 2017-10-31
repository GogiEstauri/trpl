-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Oct 31, 2017 at 07:13 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ppl2`
--

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `id` int(10) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `nama` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `level` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`id`, `username`, `password`, `nama`, `email`, `level`) VALUES
(1, 'admin', 'admin', 'joyo subargo', 'enan@gmail.com', 3),
(2, 'tpk', 'tpk', 'bagio', 'bagiosuper@gmail.com', 1),
(3, 'af', 'af', 'nano nani', 'eaea2@gmail.com', 2);

-- --------------------------------------------------------

--
-- Table structure for table `pembibitan`
--

CREATE TABLE `pembibitan` (
  `no_pembibitan` int(10) NOT NULL,
  `tgl_pembibitan` date NOT NULL,
  `ukuran` int(10) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pembibitan`
--

INSERT INTO `pembibitan` (`no_pembibitan`, `tgl_pembibitan`, `ukuran`, `status`) VALUES
(1, '2017-10-12', 30, 'belum terverifikasi');

-- --------------------------------------------------------

--
-- Table structure for table `pemeliharaan`
--

CREATE TABLE `pemeliharaan` (
  `no_pemeliharaan` int(10) NOT NULL,
  `tgl_pelaksanaan` date NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pemeliharaan`
--

INSERT INTO `pemeliharaan` (`no_pemeliharaan`, `tgl_pelaksanaan`, `status`) VALUES
(1, '2017-10-09', 'belum terverifikasi');

-- --------------------------------------------------------

--
-- Table structure for table `penerimaan_kayu`
--

CREATE TABLE `penerimaan_kayu` (
  `id_penerimaan` int(10) NOT NULL,
  `tgl_penerimaan` date NOT NULL,
  `tgl_pengiriman` date NOT NULL,
  `keterangan` varchar(20) NOT NULL,
  `nama_afdelling` varchar(20) NOT NULL,
  `jumlah_pohon` int(10) NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `penerimaan_kayu`
--

INSERT INTO `penerimaan_kayu` (`id_penerimaan`, `tgl_penerimaan`, `tgl_pengiriman`, `keterangan`, `nama_afdelling`, `jumlah_pohon`, `status`) VALUES
(1, '2017-10-11', '2017-10-15', 'A2', 'Pt Salam', 300, 'belum terverifikasi'),
(2, '2017-10-26', '2017-10-26', 'A1', 'PT Jaya Makmur', 600, 'belum terverifikasi');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `pembibitan`
--
ALTER TABLE `pembibitan`
  ADD PRIMARY KEY (`no_pembibitan`);

--
-- Indexes for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  ADD PRIMARY KEY (`no_pemeliharaan`);

--
-- Indexes for table `penerimaan_kayu`
--
ALTER TABLE `penerimaan_kayu`
  ADD PRIMARY KEY (`id_penerimaan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `pembibitan`
--
ALTER TABLE `pembibitan`
  MODIFY `no_pembibitan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `pemeliharaan`
--
ALTER TABLE `pemeliharaan`
  MODIFY `no_pemeliharaan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `penerimaan_kayu`
--
ALTER TABLE `penerimaan_kayu`
  MODIFY `id_penerimaan` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
