-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Oct 22, 2021 at 07:17 PM
-- Server version: 10.1.9-MariaDB
-- PHP Version: 7.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `perpustakaan`
--

-- --------------------------------------------------------

--
-- Table structure for table `anggota`
--

CREATE TABLE `anggota` (
  `kd_anggota` varchar(10) NOT NULL,
  `nisn` varchar(20) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `tempat_lahir` varchar(20) NOT NULL,
  `tanggal_lahir` date NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `nomer_hp` varchar(15) NOT NULL,
  `alamat` text NOT NULL,
  `jml_pinjam` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `anggota`
--

INSERT INTO `anggota` (`kd_anggota`, `nisn`, `nama_anggota`, `tempat_lahir`, `tanggal_lahir`, `kelas`, `nomer_hp`, `alamat`, `jml_pinjam`) VALUES
('20210001', '324234', 'Bagus', 'Jakarta', '2021-10-16', '7C', '4353453', 'adsasdasda', 2);

-- --------------------------------------------------------

--
-- Table structure for table `buku`
--

CREATE TABLE `buku` (
  `kd_buku` varchar(10) NOT NULL,
  `kategori` varchar(100) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `penulis` varchar(100) NOT NULL,
  `penerbit` varchar(100) NOT NULL,
  `tahun_terbit` varchar(4) NOT NULL,
  `jumlah` int(11) NOT NULL,
  `rak` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `buku`
--

INSERT INTO `buku` (`kd_buku`, `kategori`, `nama_buku`, `penulis`, `penerbit`, `tahun_terbit`, `jumlah`, `rak`) VALUES
('IS0001', 'IPS', 'asdas', 'sadsad', 'asdad', '434', 12, '12A');

-- --------------------------------------------------------

--
-- Table structure for table `kunjungan`
--

CREATE TABLE `kunjungan` (
  `kd_kunjungan` varchar(10) NOT NULL,
  `kd_anggota` varchar(10) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `tgl_kunjungan` date NOT NULL,
  `waktu_kunjungan` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `peminjaman`
--

CREATE TABLE `peminjaman` (
  `kd_peminjaman` varchar(10) NOT NULL,
  `kd_anggota` varchar(10) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `kelas` varchar(5) NOT NULL,
  `kd_buku` varchar(10) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `tgl_pinjam` date NOT NULL,
  `jatuh_tempo` date NOT NULL,
  `jumlah` int(1) NOT NULL,
  `ket` enum('Sudah kembali','Belum kembali','Hilang','') NOT NULL,
  `jml_pinjam` int(2) NOT NULL,
  `id_petugas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `peminjaman`
--
DELIMITER $$
CREATE TRIGGER `anggota_kembali` BEFORE DELETE ON `peminjaman` FOR EACH ROW BEGIN
update anggota SET jml_pinjam = jml_pinjam + old.jml_pinjam
WHERE kd_anggota = old.kd_anggota;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `anggota_pinjam` BEFORE INSERT ON `peminjaman` FOR EACH ROW BEGIN
update anggota SET jml_pinjam = jml_pinjam - new.jml_pinjam
WHERE kd_anggota = new.kd_anggota;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `kembali_buku` AFTER DELETE ON `peminjaman` FOR EACH ROW BEGIN
update buku SET jumlah = jumlah + old.jumlah
WHERE kd_buku = old.kd_buku;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `pinjam_buku` AFTER INSERT ON `peminjaman` FOR EACH ROW BEGIN
update buku SET jumlah = jumlah - new.jumlah
WHERE kd_buku = new.kd_buku;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `pengembalian_dan_denda`
--

CREATE TABLE `pengembalian_dan_denda` (
  `kd_pengembalian` varchar(10) NOT NULL,
  `kd_peminjaman` varchar(10) NOT NULL,
  `kd_anggota` varchar(10) NOT NULL,
  `nama_anggota` varchar(100) NOT NULL,
  `kd_buku` varchar(10) NOT NULL,
  `nama_buku` varchar(100) NOT NULL,
  `tgl_kembali` date NOT NULL,
  `denda` int(11) NOT NULL,
  `keterangan` enum('Telat','Tidak telat','Hilang','') NOT NULL,
  `jumlah` int(1) NOT NULL,
  `jml_pinjam` int(2) NOT NULL,
  `id_petugas` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Triggers `pengembalian_dan_denda`
--
DELIMITER $$
CREATE TRIGGER `anggota_kembalii` BEFORE INSERT ON `pengembalian_dan_denda` FOR EACH ROW BEGIN
update anggota SET jml_pinjam = jml_pinjam + new.jml_pinjam
WHERE kd_anggota = new.kd_anggota;
END
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `pengembalian_buku` AFTER INSERT ON `pengembalian_dan_denda` FOR EACH ROW BEGIN
update buku SET jumlah = jumlah + new.jumlah
WHERE kd_buku = new.kd_buku;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `petugas`
--

CREATE TABLE `petugas` (
  `id_petugas` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Nama` varchar(100) NOT NULL,
  `bagian` varchar(100) NOT NULL,
  `alamat` text NOT NULL,
  `status` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `petugas`
--

INSERT INTO `petugas` (`id_petugas`, `Username`, `Password`, `Nama`, `bagian`, `alamat`, `status`) VALUES
('P0001', 'bagus', '123', 'Bagus Rizky Febriyanto', 'Kepala Perpustakaan', 'Jl.Pertanian 2', 'Aktif'),
('P0002', 'Rizky', '123', 'Rizky Febrianto', 'Petugas Perpustakaan', 'Jl.Bojong soang 3 No 1 RT 01 RW 50', 'Tidak Aktif');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `anggota`
--
ALTER TABLE `anggota`
  ADD PRIMARY KEY (`kd_anggota`);

--
-- Indexes for table `buku`
--
ALTER TABLE `buku`
  ADD PRIMARY KEY (`kd_buku`);

--
-- Indexes for table `kunjungan`
--
ALTER TABLE `kunjungan`
  ADD PRIMARY KEY (`kd_kunjungan`);

--
-- Indexes for table `petugas`
--
ALTER TABLE `petugas`
  ADD PRIMARY KEY (`id_petugas`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
