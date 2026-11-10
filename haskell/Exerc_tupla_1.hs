module Exerc_tupla_1 where


reSoma :: [Int] -> Int

reSoma [] = 0
reSoma (h : t) = h + reSoma t

impar :: Int -> Int
impar x
   | mod x 2 == 1 = x
   | otherwise 

listaImpar :: [Int] -> [Int]
listaImpar [] = []
listaImpar (h:t) = impar x : listaImpar t

listaRevert :: [Float] -> [Float]
listaRevert re = [x | x <- re, ]