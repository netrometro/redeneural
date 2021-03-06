# Rede Neural Simplificada
Uma rede neural de estrutura simples para aprendizado escrita em Java.
Este projeto foi baseado na explicação de Victor Dias que se encontra neste endereço:
https://www.youtube.com/watch?v=NZlIYr1slAk

## Arquitetura

- Neurônio: Unidade básica de processamento da rede;
- Rede Neural: Uma quantidade determinada de camadas;
- Ecosistema: Um ambiente para treinar e testar a RN. Este ambiente entrega seu estado (outputs) para a RN e recebe decisões (inputs) para interagir no ambiente;
- Evolução: Sistema que cria os indivíduos (RN) de uma população, coloca em um ambiente, recebendo o(s) vencedor(es), gera uma nova população através de mutação, colocando em um novo ambiente e assim por diante até uma quantidade recebida de gerações, retornando, ao final, o DNA vencedor.

## Linguagem

- Foi utilizado Java puro sem nenhuma biblioteca externa.

## Ecosistema

- O ecosistema é um jogo de corrida onde cada piloto (RN) escolhe entre três alternativas (A,B,C) cada uma delas impussiona o carro uma quantidade fixa de vezes;
- Quando o piloto chega em uma parte determinada da pista, os valores de A, B e C são trocados entre si. Isto acontece mais uma vez ante do final da corrida;
- É esperado que a RN aprenda em cada seguimento da pista, qual dos valores A, B e C é melhor;
- Durante os testes a RN aprendeu na 16 geração a melhor maneira de se pilotar nesta pista.

## Segundo ecosistema

- O segundo ecosistema consiste no jogo Super Senha, em que, através de pistas e sugestões um jogador tenta decifrar uma senha.
- Ainda não está pronto e funcional. A estrutura do novo jogo é diferente porque apenas um jogador joga contra o sistema (a senha).
- Escolher quais serão os inputs é o mais difícil, coloquei o tabuleiro todo mas a rede neural não consegue entender as relações entre elas. Precisa simplificar muito para diminuir os inputs e facilitar a vida da rede neural.
- Sem tempo no momento para isto.
