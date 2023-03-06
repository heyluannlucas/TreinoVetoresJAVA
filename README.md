# TreinoVetoresJAVA

## Activity #1
#

Background information: 

Exercícios sobre VETORES.

Description of the activity: 

Todos os exercícios a seguir devem ser implementados na linguagem JAVA

1. Leia um vetor de 12 posições e em seguida ler também dois valores X e Y quaisquer correspondentes a duas posições no vetor. Ao final seu programa deverá escrever a soma dos valores encontrados nas respectivas posições X e Y.

2. Declare um vetor de 10 posições e o preencha-o. Após isso, mostre quais são os números ímpares deste vetor.

3. Leia um vetor de 16 posições e troque os 8 primeiros valores pelos 8 últimos. Escreva ao final o vetor obtido.

4. Leia um vetor de 20 posições e em seguida um valor X qualquer. Seu programa devera fazer uma busca do valor de X no vetor lido e informar a posição em que foi encontrado ou se não foi encontrado.

<br>

## Activity #2
#

Exercícios sobre MATRIZES.

Description of the activity: 

Todos os exercícios a seguir devem ser implementados na linguagem JAVA

1. Leia uma matriz 4 x 4 e escreva a localização (linha e a coluna) do maior valor.

2. Declare uma matriz 5 x 5. Faça com que o computador preencha com 1 a diagonal principal e com 0 os demais elementos. Escreva ao final a matriz obtida.

3. Leia uma matriz 6 x 6, conte e escreva quantos valores maiores que 10 ela possui.

4. Crie um programa que leia uma matriz 4 x 4 e conte quantos números pares a matriz contém e mostre a quantidade.

5. Crie um programa que peça para o usuário um número qualquer e busque-o na matriz. Caso o número exista, mostrar a posição (linha e coluna) no qual ele se encontra. Caso contrário, não é necessário mostrar nada.

<br>

## Activity #3
#

Background information: 

Exercícios sobre Switch-Case

Description of the activity: 

Todos os exercícios a seguir devem ser implementados na linguagem JAVA

1. Faça um programa que leia um número entre 0 e 10, e escreva este número por extenso. Por exemplo: O usuário digita 2. O programa deve escrever “Dois”. Caso o usuário digite um valor fora do intervalo, o programa deve escrever "Opção Inválida!"

2. Reescreva o código abaixo em JAVA, substituindo os if-else por switch-case:

 ```
início {
inteiro:opcao;
real: x;
real: y;
real: resultado;
enquanto(opcao != 5){
    escreva("Digite uma das opcoes desejadas:");
    escreva("1. Somar dois numeros");
    escreva("2. Subtrair dois numeros");
    escreva("3. Multiplicar dois numeros");
    escreva("4. Dividir dois numeros");
    escreva("5. SAIR");
    leia(opcao);
    se (opcao == 1) {
         leia("Digite o valor de x",x);
         leia("Digite o valor de y",y);
         resultado = x + y;
         escreva("O resultado da soma eh: ",resultado);
    }senão {
         se(opcao == 2){
               leia("Digite o valor de x",x);
               leia("Digite o valor de y",y);
               resultado = x - y;
               escreva("O resultado da subtracao eh: ",resultado); 
          }senão{
               se(opcao == 3){
                   leia("Digite o valor de x",x);
                   leia("Digite o valor de y",y);
                   resultado = x * y;
                   escreva("O resultado da multiplicacao eh: ",resultado);
               }senão{
                    se(opcao==4){
                           leia("Digite o valor de x",x);
                           leia("Digite o valor de y",y);
                           resultado = x / y;
                           escreva("O resultado da divisao eh: ",resultado);
                    }senão{
                           se(opcao <> 5){
                                    escreva("Opcao Invalida!");
                           }
                     }
                }
           }
       } 
    }
}
```
