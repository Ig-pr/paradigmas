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

contMd :: Int->Int
contMd 0 = 0
contMd n
  |retChar n == "mestre" = 1 + contMd(n - 1)
  |otherwise = contMd (n - 1)

contDoc :: Int->Int
contDoc 0 = 0
contDoc n
  |retChar n == "doutor" = 1 + contDoc(n - 1)
  |otherwise = contDoc (n - 1)