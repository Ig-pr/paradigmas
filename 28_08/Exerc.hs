module Exerc where

retorne1 :: (String, String, Char) -> String

retorne1 (k,_,_) = k

retorne2 :: (String, String, Char) -> String

retorne2 (_,l,_) = l

retorne3 :: (String, String, Char) -> Char

retorne3 (_,_,m) = m


base :: Int -> (String, String, Char)
  base x
    |x == 1 = ("joao", "mestre", 'm')
    |x == 2 = ("jonas", "doutor", 'm')
    |x == 3 = ("joice", "mestre", 'f')
    |x == 4 = ("janete", "doutor", 'f')
    |x == 5 = ("jocileide", "doutor", 'f')
    |otherwise = ("ninguem", 'x')



r





contMestre :: Char -> Int
contMestre (retorne3)
  | (h:t) t == 'x' = 0
  | (_,m,_) m == "mestre" = 1 + contMestre(base(x + 1)) 
  | otherwise = contMestre(x + 1)