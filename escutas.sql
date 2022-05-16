-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 11-Fev-2022 às 14:56
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.1.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `escutas`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `escuta`
--

CREATE TABLE `escuta` (
  `id` int(11) NOT NULL,
  `tipo` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `nomeEscuta` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `nomeCeluda` varchar(10) COLLATE utf8_unicode_ci NOT NULL,
  `dados` varchar(35) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Extraindo dados da tabela `escuta`
--

INSERT INTO `escuta` (`id`, `tipo`, `nomeEscuta`, `nomeCeluda`, `dados`) VALUES
(480, 'Aud', 'E1', 'C1', 'a4AYrE2FJxLkQfOVQJW4X7JcebsHiA'),
(481, 'Aud', 'E1', 'C1', 'aVRm0zEJqSLL70TYufij0kKRuJp52T'),
(482, 'Aud', 'E1', 'C1', 'sLTLQk5zYfBPyewTkfFUbXqgB0Ays2'),
(483, 'Aud', 'E1', 'C1', 'NUjLomnLXItSvsVFSY4bJC0evXt6ob'),
(484, 'Aud', 'E1', 'C1', 'Oc6zvxlflF0bJu10kGhETllg7VMnpD'),
(485, 'Aud', 'E1', 'C1', 'wNWCIfRuRdKuQ42uBn7k2qsDeSURdF'),
(486, 'Aud', 'E1', 'C1', 'Sp5KnFr2NOBE7KAC94t07ZHbI2rA44'),
(487, 'Aud', 'E1', 'C1', 'B90xYz8WJsuqmFkEJDTLl9rVS4mrDs'),
(488, 'Aud', 'E1', 'C1', 'cfZw0zb2oeJ744U5c528lZtJ5f736B'),
(489, 'Aud', 'E1', 'C1', 'NKboKSXwkQmj9D87qOGau78KAshk9m'),
(490, 'Ima', 'E1', 'C2', 'LSYjIEALGTtHXZ3P2C0T76EBkmyu44'),
(491, 'Ima', 'E1', 'C2', 'XsTGSwkw12qUBO1YPKsUK9QRwKrKcN'),
(492, 'Ima', 'E1', 'C2', 'PPrD2KUfREtG829kXh3IrD2nBqmZFf'),
(493, 'Ima', 'E1', 'C2', 'QnjY5lZhZRO8u7tVdOZ4YKVKG8ekZB'),
(494, 'Ima', 'E1', 'C2', '9n0FA9uOnddYoPDVMgepQ4T7kRzcnR'),
(495, 'Ima', 'E1', 'C2', 'wVInNURCOy6vo4hR4Xb3SI0MnWTrzE'),
(496, 'Ima', 'E1', 'C2', 'gcbdrinKSlylKnWbYEGPgwDQIswLhJ'),
(497, 'Ima', 'E1', 'C2', 'V2gyjuCXScSpJRdFhqAT6bcAJEQqqd'),
(498, 'Ima', 'E1', 'C2', '4oBeX1xJFWd0MD1NLDJoY6JsLIMnGX'),
(499, 'Ima', 'E1', 'C2', 'qTfiznEMeLeEKWPSJjX4ycZCPoQLUE'),
(500, 'Aud', 'E1', 'C1', 'ne8XBuwSp1qUUyhofnOFC7TSLbItyo'),
(501, 'Aud', 'E1', 'C1', '6d6v6uaI2qmJzS9kYJzXohkVOuMxfQ'),
(502, 'Aud', 'E1', 'C1', 'Et1jMehQ4WXKuWXkbfPn4TCtJJr63K'),
(503, 'Aud', 'E1', 'C1', 'MulFMucoDtjE9ptGriXoLh2Sqfrn7B'),
(504, 'Aud', 'E1', 'C1', 'XLzIV6GKx4I0CxChsFEulzDYVA4s9L'),
(505, 'Aud', 'E1', 'C1', 'VerHDOe8iSgCuD4LvGE1pfb8BO7f7O'),
(506, 'Aud', 'E1', 'C1', 'o93gNtT3FoNnWG2dfQ3Kxwu4Usu5dQ'),
(507, 'Aud', 'E1', 'C1', 'qkeG55PA9A8JjJDMtkM7fSW1vAzf4y'),
(508, 'Aud', 'E1', 'C1', '2Gd41SSOxArUCmkfE7Dcex4YsW1PcJ'),
(509, 'Aud', 'E1', 'C1', 'xIJoDVBpTNT11IGLDbEazovt14Dg7g'),
(510, 'Ima', 'E1', 'C2', 'cvSKWPGwYIlKKHxmuKoIIvKUJsCwu8'),
(511, 'Ima', 'E1', 'C2', '0o11nGXljpM3YgAOMlen9VNeXVDg6I'),
(512, 'Ima', 'E1', 'C2', 'dz8voPLxhRFEZglBUYkXzCP3At8pYG'),
(513, 'Ima', 'E1', 'C2', 'L0rpSPiI4n3IY7hMXMGE9hoJbY2Lgs'),
(514, 'Ima', 'E1', 'C2', 'Pjb0nbuGbGa8bFKcD2alOUIxGMtTjA'),
(515, 'Ima', 'E1', 'C2', 'IW6UfXUMTucZpOlnmBkOV8dRSZmvSO'),
(516, 'Ima', 'E1', 'C2', 'mhx0Av3PnkHRMW4vUMyozA2ztXDcsW'),
(517, 'Ima', 'E1', 'C2', 'uieUNXZLwakjHonlcAd7t8phdlQVu2'),
(518, 'Ima', 'E1', 'C2', 'luXFJUB9OIcW6EwkqNcwtIuE6hTDuV'),
(519, 'Ima', 'E1', 'C2', 'j4tia38nKO4YxMmLCnR8rcmRvab49g'),
(520, 'Ima', 'E1', 'C2', 'OMRQBCtzfSnpW5X5P9NvUVWAMjgBUv'),
(521, 'Ima', 'E1', 'C2', 'nWvlA079uf9Lmw4kTkP72UClKz1GZz'),
(522, 'Aud', 'E1', 'C1', 'MtnOtN7xhXuuru6h1Q8oBzeStlSlUs'),
(523, 'Aud', 'E1', 'C1', '1ihq1B1IRM4yti3nDvat4qRDGFweZQ'),
(524, 'Aud', 'E1', 'C1', 'DD0QMRAPYBUmm8b1JoekA0CcMU4JHr'),
(525, 'Aud', 'E1', 'C1', 'twJlbmMcW2HcPR2v3yP9swXcgiPVrL'),
(526, 'Aud', 'E1', 'C1', 'C7BsSDCG93EMjLPwJbU0i8PJ47OCje'),
(527, 'Aud', 'E1', 'C1', 'XFWBAGHEYtcXVpjchvvHuKSFAA4X1k'),
(528, 'Aud', 'E1', 'C1', 'yabNroCIdYPtd7d6IRozxsqOwfoR2q'),
(529, 'Aud', 'E1', 'C1', 'bg9Ql2fOMgM5DzDCvs4d3gqcZSOzFP'),
(530, 'Aud', 'E1', 'C1', 'r9iaB1kkgIlBZfSfZABRdaDQHfkNZQ'),
(531, 'Ima', 'E1', 'C2', 'QgTnmzbCqNX3Ih21tu3ujKKhGB7dh6'),
(532, 'Ima', 'E1', 'C2', '7ngQPn70NB6IJcKrlVBTANEH0RzAjz'),
(533, 'Ima', 'E1', 'C2', 'mYUOrNUYKSGPm7gQVVmNMp6CFzgRit'),
(534, 'Ima', 'E1', 'C2', 'FbG8wtEEMpO2Ohrv6uRlttcQdizlCq'),
(535, 'Ima', 'E1', 'C2', 'ZfY8HrTotCJH87NOqtXxmGtTWjFDmO'),
(536, 'Ima', 'E1', 'C2', '8p00mb8Df4ZRf1cyQyDVT6ZGtj2Mpl'),
(537, 'Ima', 'E1', 'C2', 'r0XYtKnTA00hLrFDs0LPUVZWtgYz3w'),
(538, 'Ima', 'E1', 'C2', 'ga0jSlJjcOEH4BiXaRZOQ887WGntqa'),
(539, 'Ima', 'E1', 'C2', 'VLYjvYjw5Ci3ltROeL7ovs0f3lY0rB'),
(540, 'Aud', 'E1', 'C1', 'zotSQk0WlfqbUfKRs2Czj3HwH5fS3p'),
(541, 'Aud', 'E1', 'C1', 'Y3K0zzmsebBpV0ouog9MIKPpPIQIRK'),
(542, 'Aud', 'E1', 'C1', 'QmOEVxDH8IYDkonnGYqOmSJQQlFcEw'),
(543, 'Aud', 'E1', 'C1', 'qvgutZwwvVqY7Zpf4MrVyCOjenqvoM'),
(544, 'Aud', 'E1', 'C1', 'imVjQLwLMJcwxudNjwceWPdP9MKmKK'),
(545, 'Aud', 'E1', 'C1', 'gRFNex3vJ0HQo0uJzaeOl5H7VRszEo'),
(546, 'Aud', 'E1', 'C1', 'yHm3CcXN7IwBHxVlNxQG7Dn6AgJ95t'),
(547, 'Aud', 'E1', 'C1', 'wzBgCj4HyiN7KmIVJljBrwS6CvHLmW'),
(548, 'Aud', 'E1', 'C1', 'vfGVJudUPPwxrcqPHbUrYGCGFeAO4V'),
(549, 'Aud', 'E1', 'C1', 'qoJ6LMaFbtnVmR8CTTG0WPOsV93s8Q'),
(550, 'Aud', 'E1', 'C1', 'v7YWYRTwT2p9J28GqPnzwk741lAKjF'),
(551, 'Aud', 'E1', 'C1', '7aAMkt3rxegzztHUsWVDIITXUuVb3X'),
(552, 'Aud', 'E1', 'C1', 'sbaWMWo2rxY80MMpyVEhmroCxNJoOZ'),
(553, 'Aud', 'E1', 'C1', 'ITb9CyVxG5DQJ8yBnh6oktAwq78LpA'),
(554, 'Aud', 'E1', 'C1', '2eMvwT5UYTXnbQeklrUh5m1C9mqUXb'),
(555, 'Aud', 'E1', 'C1', 'VSeGzByiIedehF6BH0OpEMih7LeDG1'),
(556, 'Aud', 'E1', 'C1', 'vYwaSw1ja9cCoVeMzCNh9j0s5fLjtG'),
(557, 'Aud', 'E1', 'C1', 'YaFM4CsI3oRoBmU9kcHKSbrB68xu75'),
(558, 'Aud', 'E1', 'C1', 'mut2jPd12LO7SUcBG9Q3ZiTJs0RsoS'),
(559, 'Aud', 'E1', 'C1', 'cQAdUFopW3FqlvRfLnQgukmTnaQXnK'),
(560, 'Aud', 'E1', 'C1', 'yCxNh1gKF7mKbSxT6jWxaTyYbPNnPa'),
(561, 'Ima', 'E1', 'C2', 'yzilfqfKHUHDMaKhNTn7oJhRINtyHc'),
(562, 'Ima', 'E1', 'C2', '4vcHBkWMyOfvbH4VPoDjTET6fn130g'),
(563, 'Ima', 'E1', 'C2', 'lubBzEvdUqXDp4fvQGX6iEc1i2Wril'),
(564, 'Aud', 'E1', 'C1', 'CLEqooDrYPzHZmn3gliH740QStgdnn'),
(565, 'Aud', 'E1', 'C1', 'E817cabQthI9odlnbZXXf87yGxAeeT'),
(566, 'Aud', 'E1', 'C1', 'zqHwS1Zk4UKfxpLb60itGOJasLmOzV'),
(567, 'Aud', 'E1', 'C1', 'H5YkPkMS9mT3TjARRDJy76kbMMF9aN'),
(568, 'Aud', 'E1', 'C1', 'cUNH6K2Dk50WBRuqMyEOjBcCgI2RwS'),
(569, 'Aud', 'E1', 'C1', 'nBPOjKW8nauAuzQAloJAMTLreLHDNS'),
(570, 'Aud', 'E1', 'C1', '9WCzBSAIo7AC5iUCCvPibVEdJLvnvV'),
(571, 'Aud', 'E1', 'C1', 'QtjT6i14ZpsJQRGwgQLCYwnsnsbLkS'),
(572, 'Aud', 'E1', 'C1', 'YaleITz6Q95xQ6sa5zADKaZ2SsH1w8'),
(573, 'Aud', 'E1', 'C1', 'YMZqJqu8tYgRMuG4PPsd2QZFpn0lrp'),
(574, 'Ima', 'E1', 'C2', 'hcvIaf2UNzljdZflwvVgzwshFzjREb'),
(575, 'Ima', 'E1', 'C2', 'AoIFNZ4Vd9p65EH0xawc4DnwhZ4VO2'),
(576, 'Ima', 'E1', 'C2', 'GwMGtqtbb6ReZSCtce3u2vXkhNq3vv'),
(577, 'Ima', 'E1', 'C2', 'Hl9s74V7rztaW5bUorUc9R6wAMhAYw'),
(578, 'Ima', 'E1', 'C2', 'd5YS7wqrKsXOsRSMemxEIfMMWLcPys'),
(579, 'Ima', 'E1', 'C2', '60Tp5Pajsnxb7Wt8oDL6pzElmognib'),
(580, 'Ima', 'E1', 'C2', 'X4zidI0pe0Bc85TYHlQbV5iqK2IWHt'),
(581, 'Aud', 'E1', 'C1', '9DjeOg9Bn3eCZHaO2dI6RR3BDo2ori'),
(582, 'Aud', 'E1', 'C1', 'flkpp1gWXwXazMJl8T1YFos3cvUsTS'),
(583, 'Aud', 'E1', 'C1', 'CraRl8XbJy67vFwa918mCvAwcrOIV3'),
(584, 'Aud', 'E1', 'C1', '8HFBwkPfIz933nhLnVJk2hGb9sNkzt'),
(585, 'Aud', 'E1', 'C1', 'I5trpSmvhC02aazBn3SksBaAqpLxHS'),
(586, 'Aud', 'E1', 'C1', '2CixuVaqCBz7GTfdeDCcVuXUaHgmP4'),
(587, 'Aud', 'E1', 'C1', 'p8U9WNhKh1ussfaw6QvV1Nh7pGclHC');

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `escuta`
--
ALTER TABLE `escuta`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `escuta`
--
ALTER TABLE `escuta`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=588;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
