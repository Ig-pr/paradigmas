module Exerc_type where

type Nome = String
type Media = Int
type Aluno = (Nome, Media)
type Turma = [Aluno]

aprovados :: Turma-> Int-> [Nome]

aprovados tma nota = [n | (n, m) <- tma, m >= nota]