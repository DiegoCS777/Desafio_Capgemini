# REPOSITÓRIO DO DESAFIO DE PROGRAMAÇÃO CAPGEMINI

### Olá! Esse é o Desafio de programação para a Academia Capgemini 2022. Aqui foram resolvidos os seguintes requisitos:

## Requisito 01

Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. A base e altura da escada devem ser iguais ao valor de n. A última linha não deve conter nenhum espaço.

Exemplo:

Entrada:

n = 6

Saída:

         *
        **
       ***
      ****
     *****
    ******



____________________________________________

## Requisito 02

Débora se inscreveu em uma rede social para se manter em contato com seus amigos. A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. O site considera uma senha forte quando ela satisfaz os seguintes critérios:
Possui no mínimo 6 caracteres.
Contém no mínimo 1 digito.
Contém no mínimo 1 letra em minúsculo.
Contém no mínimo 1 letra em maiúsculo.
Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados para uma string qualquer ser considerada segura.

Exemplo:

Entrada:

Ya3

Saída:

3

Ela pode tornar a senha segura adicionando 3 caracteres, por exemplo, &ab, transformando a senha em Ya3&ab. 2 caracteres não são suficientes visto que a senha precisa ter um tamanho mínimo de 6 caracteres.

____________________________________________

## Requisito 03
Duas palavras podem ser consideradas anagramas de si mesmas se as letras de uma palavra podem ser realocadas para formar a outra palavra. Dada uma string qualquer, desenvolva um algoritmo que encontre o número de pares de substrings que são anagramas.

Exemplo:

1) Exemplo 

Entrada:

ovo

Saída:

2

A lista de todos os anagramas pares são: [o, o], [ov, vo] que estão nas posições [[0], [2]], [[0, 1], [1, 2]] respectivamente. 


2) Exemplo

Entrada:

ifailuhkqq

Saída:

3

A lista de todos os anagramas pares são: [i, i], [q, q] e [ifa, fai] que estão nas posições [[0], [3]], [[8],  [9]] e [[0, 1, 2], [1, 2, 3]].

____________________________________________

### A resolução dos requisitos estão implementados na pasta src/main/java/com/diego.
### Os testes estão implementados na pasta src/test/java/com/diego.

#### Desafio 1

A resolução do requisito está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/main/java/com/diego/stair/Stair.java" margin="0 20" borderRadius="10px">Stair.java</a>.

O teste da resolução está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/test/java/com/diego/stairTest/StairTest.java" margin="0 20" borderRadius="10px">StairTest.java</a>.


____________________________________________

#### Desafio 2

A resolução do requisito está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/main/java/com/diego/password/PasswordValidation.java" margin="0 20" borderRadius="10px">PasswordValidation.java</a>.

O teste da resolução está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/test/java/com/diego/passwordTest/PasswordValidationTest.java" margin="0 20" borderRadius="10px">PasswordValidationTest</a>.

____________________________________________

#### Desafio 3

A resolução do requisito está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/main/java/com/diego/anagram/Anagram.java" margin="0 20" borderRadius="10px">Anagram.java</a>.

O teste da resolução está na pasta <a href="https://github.com/DiegoCS777/Desafio_Capgemini/blob/DiegoCS777-Desafio-Capgemini/src/test/java/com/diego/anagramTest/AnagramTest.java" margin="0 20" borderRadius="10px">AnagramTest.java</a>.

____________________________________________

### A resolução dos requisitos foram feitos em Java usando a IDE IntelliJ. Foi usado o Maven para gerenciamento de pacotes e Junit5 para implementação de testes unitários.

### Versões:

### IntelliJ: 

- _IntelliJ IDEA 2021.3.2 (Community Edition)_
- _Build #IC-213.6777.52, built on January 28, 2022_
- _Runtime version: 11.0.13+7-b1751.25 amd64 VM: OpenJDK 64-Bit Server VM by JetBrains s.r.o._

### Java:

- _Versão:_
- _Java versão 1.8.0_251_

### Gerenciamento de pacotes:

- _Maven versão 3.8.1_

### Testes Unitários:

- _Junit 5.8.2_

### Utilizar a IDE IntelliJ para executar os arquivos.
