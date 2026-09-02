module Exerc_lista where
{-
numPares :: [Int] -> [Int]


numPares lista = [x*x | x <- [lista]]

-}

qualquerImpar :: [Int] -> [Int]
qualquerImpar lista = [x*x | x <- lista, mod x 2 == 1 ]
