module Condicionais where 



podeBeber :: Int->String


podeBeber x = if x >= 18
   then "Pode"
   else "Não Pode"


{-
podeBeber x
   | x >= 18 = "Pode"
   | otherwise = "Nao Pode"
-}

ehPositivo :: Int->String
{-
   ehPositivo x = if x > 0
   then "Positivo"
   else if x < 0 
      then "Negativo"
      else "Zero"
-}

ehPositivo x
   | x > 0 = "Positivo"
   | x < 0 = "Negativo"
   | otherwise = "Zero"

ehBissexto :: Int->Bool

{-
ehBissexto x = if mod x 4 == 0 && mod x 400 == 0 
  then True
  else if mod x 4 == 0 && mod x 100 /= 0
     then True
     else False
-}

{-
ehBissexto x =
   if eh4 == 0 && eh400 == 0
      then True
      else if eh4 == 0 && eh100 /= 0
         then True
         else False
    where
       eh4 = mod x 4
       eh400 = mod x 400
       eh100 = mod x 100
-}

ehBissexto x
   | eh4 == 0 && eh400 == 0 = True
   | eh4 == 0 && eh100 /= 0 = True
   | otherwise = False
   where
       eh4 = mod x 4
       eh400 = mod x 400
       eh100 = mod x 100