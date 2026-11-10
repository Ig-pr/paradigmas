module Cubo where

cubo :: Int -> Int
cubo x = x * x * x
-- calcula o cubo dos elementos da lista
aoCubo :: [Int] -> [Int]
aoCubo [] = []
aoCubo (h:t) = cubo h : aoCubo t