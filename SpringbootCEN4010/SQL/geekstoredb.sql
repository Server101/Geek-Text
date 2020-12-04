-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 04, 2020 at 01:20 AM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `geekstoredb`
--

-- --------------------------------------------------------

--
-- Table structure for table `add_to_cart`
--

CREATE TABLE `add_to_cart` (
  `id` bigint(20) NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `added_date` datetime DEFAULT current_timestamp(),
  `user_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `add_to_cart`
--

INSERT INTO `add_to_cart` (`id`, `product_id`, `qty`, `price`, `added_date`, `user_id`) VALUES
(1, 2, 1, 150, NULL, 2),
(2, 2, 1, 150, NULL, 2);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `id` bigint(20) NOT NULL,
  `name` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`id`, `name`) VALUES
(1, 'Comics'),
(2, 'Novels'),
(3, 'Magazines'),
(4, 'Journals'),
(5, 'Others');

-- --------------------------------------------------------

--
-- Table structure for table `checkout_cart`
--

CREATE TABLE `checkout_cart` (
  `id` bigint(20) NOT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `order_date` datetime DEFAULT current_timestamp(),
  `user_id` int(11) DEFAULT NULL,
  `order_id` int(11) DEFAULT NULL,
  `payment_type` enum('COD','ONLINE') DEFAULT NULL,
  `delivery_address` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `checkout_cart`
--

INSERT INTO `checkout_cart` (`id`, `product_id`, `qty`, `price`, `order_date`, `user_id`, `order_id`, `payment_type`, `delivery_address`) VALUES
(10, 2, 6, 9150, '2020-01-28 21:52:18', 1, 21144, 'COD', 'test adding.'),
(11, 1, 1, 9150, '2020-01-28 21:52:18', 1, 21144, 'COD', 'test adding.'),
(12, 2, 1, 18000, '2020-04-04 23:07:52', 1, 27393, 'COD', 'delivery address'),
(13, 4, 3, 18000, '2020-04-04 23:07:52', 1, 27393, 'COD', 'delivery address'),
(14, 1, 1, 150, '2020-04-04 23:08:55', 1, 20865, 'COD', 'tsting.'),
(15, 1, 1, 1650, '2020-04-04 23:34:04', 1, 16909, 'COD', 'testing address '),
(16, 2, 1, 1650, '2020-04-04 23:34:04', 1, 16909, 'COD', 'testing address '),
(17, 2, 1, 3000, '2020-11-03 15:44:14', 1, 18052, 'COD', '36060 blah blah blah'),
(18, 3, 1, 3000, '2020-11-03 15:44:14', 1, 18052, 'COD', '36060 blah blah blah'),
(19, 1, 1, 8650, '2020-11-03 15:48:29', 1, 10454, 'COD', '131354 asd asd '),
(20, 2, 1, 8650, '2020-11-03 15:48:29', 1, 10454, 'COD', '131354 asd asd '),
(21, 3, 1, 8650, '2020-11-03 15:48:29', 1, 10454, 'COD', '131354 asd asd '),
(22, 4, 1, 8650, '2020-11-03 15:48:29', 1, 10454, 'COD', '131354 asd asd '),
(23, 1, 1, 3150, '2020-11-03 15:49:08', 1, 21836, 'COD', 'blah blah st'),
(24, 2, 1, 3150, '2020-11-03 15:49:08', 1, 21836, 'COD', 'blah blah st'),
(25, 3, 1, 3150, '2020-11-03 15:49:08', 1, 21836, 'COD', 'blah blah st'),
(26, 1, 1, 150, '2020-11-03 19:03:45', 1, 23766, 'COD', 'zxczxczxc'),
(27, 1, 1, 15, '2020-11-03 19:04:04', 1, 18368, 'COD', 'zxczxczxc'),
(28, 1, 1, 25, '2020-11-03 20:02:30', 1, 12169, 'COD', 'blah blac'),
(29, 2, 1, 25, '2020-11-03 20:02:30', 1, 12169, 'COD', 'blah blac'),
(30, 1, 1, 15, '2020-11-06 00:28:36', 1, 28042, 'COD', 'blah'),
(31, 1, 1, 37, '2020-11-19 20:06:39', 1, 13480, 'COD', 'obf;alsbfaslfn'),
(32, 2, 1, 37, '2020-11-19 20:06:39', 1, 13480, 'COD', 'obf;alsbfaslfn'),
(33, 3, 1, 37, '2020-11-19 20:06:39', 1, 13480, 'COD', 'obf;alsbfaslfn'),
(34, 1, 1, 37, '2020-11-24 18:59:55', 1, 15782, 'COD', 'fba;lsfba;lsf'),
(35, 2, 1, 37, '2020-11-24 18:59:55', 1, 15782, 'COD', 'fba;lsfba;lsf'),
(36, 3, 1, 37, '2020-11-24 18:59:55', 1, 15782, 'COD', 'fba;lsfba;lsf'),
(37, 1, 1, 37, '2020-12-03 17:27:30', 1, 15920, 'COD', 'blah blah'),
(38, 2, 1, 37, '2020-12-03 17:27:30', 1, 15920, 'COD', 'blah blah'),
(39, 3, 1, 37, '2020-12-03 17:27:30', 1, 15920, 'COD', 'blah blah');

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

CREATE TABLE `orders` (
  `id` bigint(20) NOT NULL,
  `order_id` varchar(40) DEFAULT NULL,
  `product_id` bigint(20) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `order_on` date DEFAULT NULL,
  `status` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` bigint(20) NOT NULL,
  `name` varchar(40) NOT NULL,
  `price` double DEFAULT NULL,
  `added_on` datetime DEFAULT current_timestamp(),
  `category_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `added_on`, `category_id`) VALUES
(1, 'Hulk', 15, '2019-05-10 00:00:00', 1),
(2, 'test2', 10, '2019-06-11 00:00:00', 2),
(3, 'test3', 12, '2019-06-11 00:00:00', 2),
(4, 'test4', 20, '2019-06-11 00:00:00', 3);

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `id` bigint(20) NOT NULL,
  `name` varchar(40) NOT NULL,
  `email` varchar(40) NOT NULL,
  `password` varchar(100) NOT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp(),
  `login_token` text DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  `address` text DEFAULT NULL,
  `is_email_verified` int(11) DEFAULT NULL,
  `mobile` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`id`, `name`, `email`, `password`, `created_at`, `login_token`, `type`, `address`, `is_email_verified`, `mobile`) VALUES
(1, 'test', 'test@gmail.com', 'test', '2020-01-17 20:59:52', NULL, NULL, NULL, 1, '123456789'),
(2, 'test1', 'test1@gmail.com', '123456', '2020-01-17 23:45:58', NULL, NULL, NULL, 1, '789465123'),
(10, 'Luis', 'luism.ayala@yahoo.com', 'test123', '2020-11-03 19:27:32', NULL, NULL, NULL, 1, '3215555555'),
(11, 'pp', 'malanga@gmail.com', 'pass', '2020-11-03 20:38:19', NULL, NULL, NULL, 1, '5556667777'),
(12, 'User', 'fiu@edu.com', 'pass', '2020-11-03 23:56:05', NULL, NULL, NULL, 1, '1112223333');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `add_to_cart`
--
ALTER TABLE `add_to_cart`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_pk_id` (`product_id`);

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `checkout_cart`
--
ALTER TABLE `checkout_cart`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`id`),
  ADD KEY `product_pk_id` (`product_id`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`),
  ADD KEY `category_id_fk` (`category_id`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `add_to_cart`
--
ALTER TABLE `add_to_cart`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `checkout_cart`
--
ALTER TABLE `checkout_cart`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;

--
-- AUTO_INCREMENT for table `orders`
--
ALTER TABLE `orders`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `users`
--
ALTER TABLE `users`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `product_pk_id` FOREIGN KEY (`product_id`) REFERENCES `products` (`id`);

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `category_id_fk` FOREIGN KEY (`category_id`) REFERENCES `category` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
