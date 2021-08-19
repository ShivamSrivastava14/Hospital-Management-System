-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Aug 19, 2021 at 01:59 PM
-- Server version: 10.4.18-MariaDB
-- PHP Version: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hospitalmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `firstName` varchar(125) NOT NULL,
  `lastName` varchar(125) NOT NULL,
  `email` varchar(100) NOT NULL,
  `mobile` varchar(25) NOT NULL,
  `address` text NOT NULL,
  `password` varchar(100) NOT NULL,
  `type` varchar(20) NOT NULL,
  `confirmCode` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `firstName`, `lastName`, `email`, `mobile`, `address`, `password`, `type`, `confirmCode`) VALUES
(4, 'Shivam', 'Srivastava', 'shivamsri@gmail.com', '9084897341', 'Ghaziabad', 'admin', 'manager', '0');

-- --------------------------------------------------------

--
-- Table structure for table `appointment`
--

CREATE TABLE `appointment` (
  `dname` varchar(50) NOT NULL,
  `pname` varchar(50) NOT NULL,
  `pname2` varchar(50) DEFAULT NULL,
  `date` date NOT NULL,
  `time` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `appointment`
--

INSERT INTO `appointment` (`dname`, `pname`, `pname2`, `date`, `time`) VALUES
('Dr.Raghav Singhania', 'Roohi', 'Suri', '2021-08-19', '12:00 PM'),
('Dr.Raghav Singhania', 'Gopal Singh', 'Rajput', '2021-08-20', '01:00 PM'),
('Raveena Khanna', 'Roohi', 'Suri', '2021-08-19', '12:00 PM'),
('Dr.Raghav Singhania', 'Roohi', 'Suri', '2021-08-20', '01:00 PM');

-- --------------------------------------------------------

--
-- Table structure for table `bed`
--

CREATE TABLE `bed` (
  `bid` int(5) NOT NULL,
  `category` varchar(40) NOT NULL,
  `room` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `bed`
--

INSERT INTO `bed` (`bid`, `category`, `room`) VALUES
(1, 'ICU', 1),
(2, 'CCU', 2),
(3, 'Genernal Ward', 3),
(4, 'Emergency', 4),
(5, 'ICU', 5),
(6, 'Emergency', 6),
(7, 'ICU', 7),
(8, 'Genernal Ward', 8),
(9, 'CCU', 9),
(10, 'Genernal Ward', 10),
(11, 'Emergency', 11),
(12, 'ICU', 12),
(13, 'Genernal Ward', 13),
(14, 'CCU', 14),
(15, 'Emergency', 15),
(16, 'ICU', 16),
(17, 'Genernal Ward', 17);

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `D_no` varchar(5) NOT NULL,
  `departmentname` varchar(100) NOT NULL,
  `departmentdiscription` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `department`
--

INSERT INTO `department` (`D_no`, `departmentname`, `departmentdiscription`) VALUES
('1', 'Neurology', 'This is Neurology department.'),
('2', 'Dermetology', 'this is Dermetology department.'),
('3', 'dentist', 'This is a dentist department.'),
('4', 'Physiotherapy', 'This is a Physiotherapy department.'),
('5', 'Heart Attack Dept.', 'Heart Attack Department');

-- --------------------------------------------------------

--
-- Table structure for table `doctor`
--

CREATE TABLE `doctor` (
  `D_id` varchar(5) NOT NULL,
  `firstname` varchar(100) NOT NULL,
  `secondname` varchar(100) NOT NULL,
  `age` varchar(4) NOT NULL,
  `bloodgroup` varchar(6) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` text NOT NULL,
  `aadhaar` varchar(15) NOT NULL,
  `maritialstatus` varchar(50) NOT NULL,
  `city` varchar(100) NOT NULL,
  `specialization` varchar(500) NOT NULL,
  `phoneno` varchar(20) NOT NULL,
  `joiningdate` date NOT NULL,
  `leavingdate` date DEFAULT NULL,
  `username` varchar(500) NOT NULL,
  `password` varchar(20) NOT NULL,
  `timing` varchar(30) NOT NULL,
  `days` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `doctor`
--

INSERT INTO `doctor` (`D_id`, `firstname`, `secondname`, `age`, `bloodgroup`, `gender`, `address`, `aadhaar`, `maritialstatus`, `city`, `specialization`, `phoneno`, `joiningdate`, `leavingdate`, `username`, `password`, `timing`, `days`) VALUES
('1001', 'Dr.Raghav', 'Singhania', '45', 'B+', 'Male', 'Laxmi Nagar', '370041200421', 'Married', 'New Delhi', 'Neurology', '9084897341', '2018-08-03', '2022-08-03', 'raghav01', 'raghav', '10:00 AM', 'M-F'),
('1002', 'Raveena', 'Khanna', '50', 'A+', 'Female', 'Preet Vihar', '370041203456', 'Married', 'New Delhi', 'Physiotherapy', '9084562136', '2018-08-16', NULL, 'raveena02', 'raveena', '09:00 AM', 'M-Sa'),
('1003', 'Aaisha', 'Sharma', '35', 'B-', 'Female', 'Mandawali', '374127210563', 'Single', 'New Delhi', 'Dermetology', '9084897652', '2020-08-07', NULL, 'aaisha', 'aaisha03', '08:00AM', 'M-F'),
('1004', 'Naman', 'Roy', '52', 'A-', 'Male', 'Chandni Chok', '91254632545', 'Married', 'Delhi', 'dentist', '9084562314', '2021-05-21', NULL, 'naman', '1234', '11:00 AM', 'M-Th');

-- --------------------------------------------------------

--
-- Table structure for table `employees`
--

CREATE TABLE `employees` (
  `E_id` varchar(5) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `secondname` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `aadhaar` varchar(15) NOT NULL,
  `age` varchar(4) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `city` varchar(50) NOT NULL,
  `phoneno` varchar(12) NOT NULL,
  `emptype` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `employees`
--

INSERT INTO `employees` (`E_id`, `firstname`, `secondname`, `address`, `aadhaar`, `age`, `gender`, `city`, `phoneno`, `emptype`) VALUES
('1001', 'Harris', 'Khan', 'Laxmi Nagar', '374104213748', '30', 'Male', 'New Delhi', '9084897541', 'Therapist '),
('1002', 'Karishma', 'Kumari', 'Vijay Nagar', '374104213756', '50', 'Female', 'Ghaziabad', '9084897524', 'Nurse'),
('1004', 'Disha', 'Srivastava', 'Nirman Vihar', '632456214895', '35', 'Female', 'New Delhi', '9654123655', 'Accountant'),
('1005', 'Ravi', 'Sharma', 'Preet Vihar', '402356109854', '56', 'Male', 'New Delhi', '9654123548', 'Pharmacists');

-- --------------------------------------------------------

--
-- Table structure for table `medicine`
--

CREATE TABLE `medicine` (
  `name` text NOT NULL,
  `dailydose` text NOT NULL,
  `refno` int(7) NOT NULL,
  `dose` text NOT NULL,
  `sideeffects` text NOT NULL,
  `issuedate` text NOT NULL,
  `expirydate` text NOT NULL,
  `componyname` text NOT NULL,
  `storage` text NOT NULL,
  `price` text NOT NULL,
  `quantity` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `medicine`
--

INSERT INTO `medicine` (`name`, `dailydose`, `refno`, `dose`, `sideeffects`, `issuedate`, `expirydate`, `componyname`, `storage`, `price`, `quantity`) VALUES
('Norflex - TZ', '2 times', 1001, '400mg', 'No side efffect', '2021/07/25', '2022/07/25', 'Norflex', 'Placed in coolest place', '500', '1000'),
('paracetamol', '2 times', 1002, '400mg', 'No side efffect', '2021/07/25', '2022/07/25', 'Norflex', 'Placed in coolest place', '500', '1000'),
('fifo', '3 times', 1003, '400mg', 'No side efffect', '2021/07/25', '2022/07/25', 'Norflex', 'Placed in coolest place', '500', '1000'),
('Fifo - TZ', '3 times', 1005, '200', 'headche', '2021/08/26', '2022/07/25', 'Fifo Co. LTD. PVT.', 'Placed in coolest place', '200', '500'),
('LIFO - AZ', '2 times', 1006, '600mg', 'It can be addicted', '2021/08/25', '2022/08/25', 'LIFO pvt. ltd.', 'Placed in coolest place', '800', '500'),
('Norflex - TZ', '2 times', 1007, '400mg', 'No side efffect', '2021/07/25', '2022/07/25', 'Norflex', 'Placed in coolest place', '500', '1000'),
('fifo tz', '3 times', 1008, '400mg', 'No side efffect', '2021/07/25', '2022/07/25', 'Norflex', 'Placed in coolest place', '500', '1000');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` int(11) NOT NULL,
  `uid` int(11) DEFAULT NULL,
  `ofname` text NOT NULL,
  `pid` int(11) NOT NULL,
  `quantity` int(11) NOT NULL,
  `oplace` text NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `dstatus` varchar(10) NOT NULL DEFAULT 'no',
  `odate` timestamp NOT NULL DEFAULT current_timestamp(),
  `ddate` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`id`, `uid`, `ofname`, `pid`, `quantity`, `oplace`, `mobile`, `dstatus`, `odate`, `ddate`) VALUES
(1, NULL, 'Kashmiri Chador', 1, 2, 'Khilkhet, Dhaka', '01609876543', 'no', '2018-09-21 13:05:07', NULL),
(2, NULL, 'Nur Mohsin', 1, 3, 'Khilkhet, Dhaka', '01609876543', 'no', '2018-09-21 13:08:55', NULL),
(3, NULL, 'Nur Mohsin', 2, 4, 'Dhaka', '09876543123', 'no', '2018-09-21 13:13:04', NULL),
(4, NULL, 'Nur Mohsin', 4, 1, 'Manikganj', '798345', 'no', '2018-09-21 13:18:47', NULL),
(5, NULL, 'Nur Mohsin', 9, 4, 'Dhaka, Bangladesh', '01609876543', 'no', '2018-09-22 02:01:02', NULL),
(6, NULL, 'Nur Mohsin', 2, 1, 'Manikganj', '01609876543', 'no', '2018-09-22 02:09:29', NULL),
(7, 9, 'Nur Mohsin', 2, 1, 'Manikganj', '01609876543', 'no', '2018-09-22 02:10:46', NULL),
(8, 9, 'Nur Mohsin', 1, 1, 'Manikganj', '0994', 'no', '2018-09-22 03:04:13', NULL),
(9, 9, 'Kashmiri Chador', 12, 4, 'Dhaka', '01609876543', 'no', '2018-09-22 03:21:14', '2018-09-29'),
(10, 9, 'Chador', 13, 1, 'Dhaka', '01609876543', 'no', '2018-09-22 03:22:05', '2018-09-29');

-- --------------------------------------------------------

--
-- Table structure for table `patient`
--

CREATE TABLE `patient` (
  `P_id` int(11) NOT NULL,
  `FirstName` varchar(100) NOT NULL,
  `SecondName` varchar(100) DEFAULT NULL,
  `Age` varchar(3) NOT NULL,
  `MaritialStatus` varchar(20) NOT NULL,
  `Gender` varchar(10) NOT NULL,
  `Address` varchar(500) NOT NULL,
  `Aadhaar` varchar(16) NOT NULL,
  `PatientType` varchar(25) NOT NULL,
  `Date` date NOT NULL,
  `PhoneNo` varchar(10) NOT NULL,
  `BedNo` varchar(15) NOT NULL,
  `disease` varchar(200) DEFAULT NULL,
  `detail` text DEFAULT NULL,
  `tabletname` varchar(500) DEFAULT NULL,
  `dailydose` varchar(100) DEFAULT NULL,
  `company` varchar(500) DEFAULT NULL,
  `dose` varchar(20) DEFAULT NULL,
  `sideEffects` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `patient`
--

INSERT INTO `patient` (`P_id`, `FirstName`, `SecondName`, `Age`, `MaritialStatus`, `Gender`, `Address`, `Aadhaar`, `PatientType`, `Date`, `PhoneNo`, `BedNo`, `disease`, `detail`, `tabletname`, `dailydose`, `company`, `dose`, `sideEffects`) VALUES
(1001, 'Abhinav', 'Verma', '50', 'Married', 'Male', 'Laxmi Nagar New Delhi', '51246324453', 'Indoor Patient', '2021-08-16', '9084657412', '4', 'High Blood Presure', 'Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry\'s standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.', 'Norflex - TZ', '1', '', '300', ''),
(1002, 'Roohi', 'Suri', '30', 'Engaged', 'Female', 'Punjab', '370041203256', 'Outdoor Patient', '2021-08-17', '9654120358', '-', 'Low BP', 'Suffering from fever.', 'paracetamol', '2', 'Norflex', '', ''),
(1003, 'Rani Davi', 'Yadav', '56', 'Married', 'Female', 'Laxmi Nagar', '374124510432', 'Indoor Patient', '2021-08-16', '9084897341', '3', 'Heart Disease', 'This patient suffering from fever', 'Fifo - TZ', '3 times', '', '300', 'No'),
(1004, 'Gopal Singh', 'Rajput', '58', 'Married', 'Male', 'Mumbai', '650023145688', 'Outdoor Patient', '2021-08-02', '9091297387', '4', 'Maleria', 'suffering from fever', '', '', '', '', ''),
(1005, 'Ram Bihari', 'Vajpai', '60', 'Married', 'Male', 'Sonia Palace, Agra', '374124514125', 'Outdoor Patient', '2021-08-17', '9091297387', '4', 'fever', 'This patient suffering from fever gjhgjh', '', '', '', '', '');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(11) NOT NULL,
  `pName` varchar(100) NOT NULL,
  `price` int(11) NOT NULL,
  `description` text NOT NULL,
  `available` int(11) NOT NULL,
  `category` varchar(100) NOT NULL,
  `item` varchar(100) NOT NULL,
  `pCode` varchar(20) NOT NULL,
  `picture` text NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `pName`, `price`, `description`, `available`, `category`, `item`, `pCode`, `picture`, `date`) VALUES
(1, 'T-Shirt', 120, 'T-Shirt', 4, 'tshirt', 't-shirt', 't-007', 'MSTS14738.jpg', '2018-09-20 07:10:40'),
(2, 'Baborry wallet', 6000, 'Baborry-Double-Zipper-Coin-Bag-RFID-Blocking-Men-Wallets-New-Brand-PU-Leather-Wallet-Money-Purses', 3, 'wallet', 'wallet', 'w-004', 'IMG_1212.jpg', '2018-09-20 07:40:28'),
(3, 'Loafer Shoes', 2000, 'Loafer black shoes', 8, 'shoes', 'shoes', 's-001', '8544789_5_.jpg', '2018-09-20 08:33:57'),
(4, 'Artificial Belt', 1200, 'Black artificial belt', 9, 'belt', 'belt', 'b-001', '0283BLT.jpg', '2018-09-20 08:35:44'),
(5, 'Polo T-shirt', 500, 'Polo t-shirt', 10, 'tshirt', 't-shirt', 's-002', 'lp00-2.jpg', '2018-09-20 08:40:06'),
(6, 'T-shirt', 300, 'Polo colorful t-shirt', 12, 'tshirt', 't-shirt', 't-003', 'yellow_2_.jpg', '2018-09-20 08:41:18'),
(7, 'Tshirt', 200, 'Design t-shirt', 10, 'tshirt', 't-shirt', 't-004', 'MSTSV14042.jpg', '2018-09-20 08:42:11'),
(8, 'T-shirt', 200, 'Color t-shirt', 20, 'tshirt', 't-shirt', 't-005', 'MSTS14759.jpg', '2018-09-20 08:45:39'),
(9, 'Men\'s Tshirt', 500, 'Colorful men\'s t-shirt', 20, 'tshirt', 't-shirt', 't-006', 'MSTSV14046.jpg', '2018-09-20 08:57:07'),
(10, 'Sports tshirt', 1000, 'Real madrid t-shirt', 5, 'tshirt', 't-shirt', 't-007', 'MSTSV14039.jpg', '2018-09-20 08:58:38'),
(12, 'T-shirt', 300, 'Design t-shirt', 10, 'tshirt', 't-shirt', 't-010', 'MSTSV14049.jpg', '2018-09-20 09:02:04'),
(13, 'Leather Shoes', 2000, 'Best leather shoes', 10, 'shoes', 'shoes', 's-002', '8546789_5_.jpg', '2018-09-21 10:39:32'),
(14, 'Belt', 2000, 'Nice belt', 20, 'belt', 'belt', 'b-003', 'gbdl18_1.png', '2018-10-01 03:47:08'),
(15, 'Belt', 300, 'Nice one belt', 20, 'belt', 'belt', 'b-004', '101010_1_.jpg', '2018-10-01 03:48:09'),
(16, 'Mens Belt', 300, 'Mens belt', 15, 'belt', 'belt', 'b-005', 'image4_2.jpg', '2018-10-01 03:49:08'),
(17, 'Leather Wallet', 100, 'Leather wallet', 10, 'wallet', 'wallet', 'w-005', 'Baborry-Double-Zipper-Coin-Bag-RFID-Blocking-Men-Wallets-New-Brand-PU-Leather-Wallet-Money-Purses.jpg_640x640.jpg', '2018-10-01 03:51:52'),
(18, 'Wallet', 300, 'Wallet', 20, 'wallet', 'wallet', 'w-007', '1881_G.jpg', '2018-10-01 03:52:43'),
(19, 'Black walllet', 300, 'Black mens wallet', 20, 'wallet', 'wallet', 'w-009', 'image5_1_2.jpg', '2018-10-01 03:53:37'),
(20, 'Men\'s Shoes', 1200, 'Men\'s shoes', 23, 'shoes', 'shoes', 's-003', 'IMG_2429.jpg', '2018-10-01 03:56:41'),
(21, 'Shoes', 2000, 'Formal Shoes', 12, 'shoes', 'shoes', 's-004', 'G51A7054.jpg', '2018-10-01 03:57:24');

-- --------------------------------------------------------

--
-- Table structure for table `product_level`
--

CREATE TABLE `product_level` (
  `id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `v_shape` varchar(10) NOT NULL DEFAULT 'no',
  `polo` varchar(10) NOT NULL DEFAULT 'no',
  `clean_text` varchar(10) NOT NULL DEFAULT 'no',
  `design` varchar(10) NOT NULL DEFAULT 'no',
  `chain` varchar(10) NOT NULL DEFAULT 'no',
  `leather` varchar(10) NOT NULL DEFAULT 'no',
  `hook` varchar(10) NOT NULL DEFAULT 'no',
  `color` varchar(10) NOT NULL DEFAULT 'no',
  `formal` varchar(10) NOT NULL DEFAULT 'no',
  `converse` varchar(10) NOT NULL DEFAULT 'no',
  `loafer` varchar(10) NOT NULL DEFAULT 'no'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_level`
--

INSERT INTO `product_level` (`id`, `product_id`, `v_shape`, `polo`, `clean_text`, `design`, `chain`, `leather`, `hook`, `color`, `formal`, `converse`, `loafer`) VALUES
(1, 1, 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(2, 2, 'no', 'no', 'no', 'no', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no'),
(3, 3, 'no', 'no', 'no', 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'yes'),
(4, 4, 'no', 'no', 'no', 'no', 'no', 'yes', 'yes', 'no', 'no', 'no', 'no'),
(5, 5, 'no', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(6, 6, 'no', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(7, 7, 'yes', 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(8, 8, 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(9, 9, 'yes', 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(10, 10, 'yes', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(14, 14, 'no', 'no', 'no', 'no', 'no', 'yes', 'yes', 'no', 'no', 'no', 'no'),
(12, 12, 'yes', 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'no', 'no', 'no'),
(13, 13, 'no', 'no', 'no', 'no', 'no', 'yes', 'no', 'no', 'no', 'no', 'yes'),
(15, 15, 'no', 'no', 'no', 'no', 'no', 'yes', 'no', 'yes', 'no', 'no', 'no'),
(16, 16, 'no', 'no', 'no', 'no', 'no', 'yes', 'yes', 'yes', 'no', 'no', 'no'),
(17, 17, 'no', 'no', 'no', 'no', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no'),
(18, 18, 'no', 'no', 'no', 'no', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no'),
(19, 19, 'no', 'no', 'no', 'yes', 'yes', 'yes', 'no', 'no', 'no', 'no', 'no'),
(20, 20, 'no', 'no', 'no', 'no', 'no', 'yes', 'no', 'no', 'no', 'yes', 'no'),
(21, 21, 'no', 'no', 'no', 'no', 'no', 'yes', 'no', 'no', 'yes', 'no', 'no');

-- --------------------------------------------------------

--
-- Table structure for table `product_view`
--

CREATE TABLE `product_view` (
  `id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  `product_id` int(11) NOT NULL,
  `date` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `product_view`
--

INSERT INTO `product_view` (`id`, `user_id`, `product_id`, `date`) VALUES
(1, 9, 9, '2018-09-22 02:19:30'),
(2, 9, 7, '2018-09-27 02:47:43'),
(3, 9, 12, '2018-09-22 03:20:59'),
(4, 9, 10, '2018-09-29 03:07:11'),
(5, 9, 5, '2018-09-22 03:19:19'),
(6, 9, 8, '2018-09-21 15:57:50'),
(7, 9, 6, '2018-09-22 02:12:54'),
(8, 9, 1, '2018-09-22 03:03:36');

-- --------------------------------------------------------

--
-- Table structure for table `receptionist`
--

CREATE TABLE `receptionist` (
  `R_id` int(5) NOT NULL,
  `firstname` varchar(50) NOT NULL,
  `secondname` varchar(50) NOT NULL,
  `address` text NOT NULL,
  `aadhaar` varchar(15) NOT NULL,
  `age` varchar(4) NOT NULL,
  `gender` varchar(20) NOT NULL,
  `phoneno` varchar(12) NOT NULL,
  `city` varchar(50) NOT NULL,
  `username` varchar(15) NOT NULL,
  `password` varchar(15) NOT NULL,
  `joiningdate` varchar(15) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `receptionist`
--

INSERT INTO `receptionist` (`R_id`, `firstname`, `secondname`, `address`, `aadhaar`, `age`, `gender`, `phoneno`, `city`, `username`, `password`, `joiningdate`) VALUES
(1001, 'Priya', 'Sriyam', 'Laxmi Nagar', '374104219741', '28', 'Female', '9084897341', 'New Delhi', 'priya01', 'priya', '01/08/2018'),
(1002, 'Jackleen', 'Sharma', 'Chandni Chok', '374104219742', '32', 'Female', '9084897363', 'Delhi', 'jack02', 'jack', '05/03/2020');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` int(11) NOT NULL,
  `name` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(25) NOT NULL,
  `password` varchar(100) NOT NULL,
  `mobile` varchar(20) NOT NULL,
  `reg_time` timestamp NOT NULL DEFAULT current_timestamp(),
  `online` varchar(1) NOT NULL DEFAULT '0',
  `activation` varchar(3) NOT NULL DEFAULT 'yes'
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `username`, `password`, `mobile`, `reg_time`, `online`, `activation`) VALUES
(12, 'Mukul', 'mukul@gmail.com', 'mukul', '$5$rounds=535000$6PJhbzFlfJbcQbza$FbrPa3qqk1RJ5MSffRLO6LrQJXbgO8SudFuBpNf.wR7', '', '2018-07-23 14:09:14', '0', 'yes'),
(9, 'Nur Mohsin', 'mohsin@gmail.com', 'mohsin', '$5$rounds=535000$EnLkwqfGWGcWklRL$q9PbYw/TVXSzs.QpgUouZ3.6BzaPG2eLHkTyv.Qx80D', '123456789022', '2018-07-21 06:47:57', '1', 'yes'),
(14, 'Nur Mohsin', 'khan@gmail.com', 'khan', '$5$rounds=535000$wLKTQexvPQHueUsK$aFrFUXBHjrrAH61EFiYgj8cZECaaz8y6S5XS/zkkHw9', '', '2018-09-07 09:02:35', '0', 'yes'),
(13, 'Robin', 'robin@gmail.com', 'robin', '$5$rounds=535000$uiZc/VCwwa3XCTTe$Ec.JOjy4GkjpAXHtAvGt6pSc6KszajHgcyZy8v6Ivk1', '', '2018-07-26 12:36:57', '0', 'yes'),
(15, 'Sujon', 'sujon@yahoo.com', 'sujons', '$5$rounds=535000$aGykDT1yrocgTaDt$p2dDAMDz9g3N6o/Jj7QJY9B6NnMlUot.DCq/LOsCS13', '89345793753', '2018-09-08 13:58:36', '0', 'yes');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `bed`
--
ALTER TABLE `bed`
  ADD PRIMARY KEY (`bid`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`D_no`);

--
-- Indexes for table `doctor`
--
ALTER TABLE `doctor`
  ADD PRIMARY KEY (`D_id`);

--
-- Indexes for table `employees`
--
ALTER TABLE `employees`
  ADD PRIMARY KEY (`E_id`);

--
-- Indexes for table `medicine`
--
ALTER TABLE `medicine`
  ADD PRIMARY KEY (`refno`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `patient`
--
ALTER TABLE `patient`
  ADD PRIMARY KEY (`P_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_level`
--
ALTER TABLE `product_level`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `product_view`
--
ALTER TABLE `product_view`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `receptionist`
--
ALTER TABLE `receptionist`
  ADD PRIMARY KEY (`R_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `admin`
--
ALTER TABLE `admin`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `patient`
--
ALTER TABLE `patient`
  MODIFY `P_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1009;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `product_level`
--
ALTER TABLE `product_level`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `product_view`
--
ALTER TABLE `product_view`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
