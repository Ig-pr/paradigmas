module Recursao where

fibo :: Int->Int

fibo n
    | n == 0 = 0
    | n == 1 = 1
    | otherwise = fibo(n-1) + fibo(n-2)

digitos :: Int->Int
digitos n
    | n == 0 = 0
    | otherwise = digitos(div n 10) + 1

soma :: Int->Int
soma n
   | div n 10 == 0 = n
   | otherwise = soma (div n 10) + mod n 10