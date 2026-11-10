module Exerc3 where

-- Definindo os tipos dos elementos individuais
type Nome = String
type Titulo = String
type Genero = Char

-- Definindo o tipo da tupla
type Pesquisador = (Nome, Titulo, Genero)

-- Definindo o tipo da lista de tuplas
type Grupo = [Pesquisador]

base :: Int -> (String, String, Char)
base x
  |x == 1 = ("joao", "mestre", 'm')
  |x == 2 = ("jonas", "doutor", 'm')
  |x == 3 = ("joice", "mestre", 'f')
  |x == 4 = ("janete", "doutor", 'f')
  |x == 5 = ("jocileide", "doutor", 'f')
  |otherwise = ("ninguem", "", 'x')

-- Função recursiva que constrói a lista a partir de um índice inicial
formarLista :: Int -> Grupo
formarLista n
    | n > 5     = []                                   
    | otherwise = base n : formarLista (n + 1)         

devolveDoc :: Grupo->[Nome]
devolveDoc pesquisadores = [nome | (nome, titulo, genero) <- pesquisadores, titulo == "doutor" && genero == 'm' ]