module Positivo where

posi :: Float->Bool
posi x = x > 0

negati :: Float->Bool
negati x = x < 0

zero :: Float->Bool
zero x = x == 0

descobriSinal :: (Float->Bool)->[Float] -> [Float]
descobriSinal _ [] = []
descobriSinal func (c:r)
  | func c = c : descobriSinal func r
  | otherwise = descobriSinal func r