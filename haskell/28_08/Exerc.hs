module Exerc where

retorne1 :: (String, String, Char) -> String

retorne1 (k,_,_) = k

retorne2 :: (String, String, Char) -> String

retorne2 (_,l,_) = l

retorne3 :: (String, String, Char) -> Char

retorne3 (_,_,m) = m


base :: Int -> (String, String, Char)
base x
  |x == 1 = ("joao", "mese", 'm')
  |x == 2 = ("jonas", "mese", 'm')
  |x == 3 = ("joice", "m", 'f')
  |x == 4 = ("janete", "doutor", 'f')
  |x == 5 = ("jocileide", "doutor", 'f')
  |otherwise = ("ninguem", ".vazio", 'x')


retChar :: Int->String
retChar x
  |x == 0 = "x"
  |otherwise = retorne2 (base x)

contMest :: Int->Int
contMest 0 = 0
contMest n
  |retChar n == "mestre" = 1 + contMest(n - 1)
  |otherwise = contMest (n - 1)

contDoc :: Int->Int
contDoc 0 = 0
contDoc n
  |retChar n == "doutor" = 1 + contDoc(n - 1)
  |otherwise = contDoc (n - 1)

contMD :: String->[(String, Int), (String, Int)]
contMD n = aux n 0 0
  where 
    aux 0 doutores mestres = [("doutores", doutores), ("mestres", mestres)]
    aux x doutores mestres
    | retorne2 (base)