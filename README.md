# Rede Neural Simplificada
Uma rede neural de estrutura simples para aprendizado escrita em Java.
Este projeto foi baseado na explicação de Victor Dias que se encontra neste endereço:
https://www.youtube.com/watch?v=NZlIYr1slAk

## Arquitetura

- Neurônio: Unidade básica de processamento da rede;
- Rede Neural: Uma quantidade determinada de camadas;
- Ecosistema: Um ambiente para treinar e testar a RN. Este ambiente entrega seu estado (outputs) para a RN e recebe decisões (inputs) para interagir no ambiente;
- Evolução: Sistema que cria os indivíduos (RN) de uma população, coloca em um ambiente, recebendo o(s) vencedor(es), gera uma nova população através de mutação, colocando em um novo ambiente e assim por diante até uma quantidade recebida de gerações, retornando, ao final, o DNA vencedor.
