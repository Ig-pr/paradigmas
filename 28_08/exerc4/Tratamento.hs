module Tratamento where

concatSr :: String->String
concatSr nome = "Sr. " ++ nome

concatSra :: String->String
concatSra nome = "Sra. " ++ nome

concatSrta :: String->String
concatSrta nome = "Srta. " ++ nome


listaNomes :: (String->String)->[String] -> [String]
listaNomes _ [] = []
listaNomes func (h:t) = func h : listaNomes func t