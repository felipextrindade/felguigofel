//Guilherme Pereira de Souza Del Rio Bertola 0030481513020
#include <stdio.h>
#include <stdlib.h>
typedef struct tad1 {
    int num;
    struct tad1 *prox;
} pilha;
void inicializar(pilha *topo){
    topo->num = NULL;
    topo->prox = NULL;
    topo = NULL;
}
void pop(pilha *topo){
    topo = topo->prox;
}
void consulta(pilha *topo){
    printf("\nO item do topo eh: %d\n",topo->num);
    printf("O endereco do topo eh: %p\n",topo);
    printf("O endereco do prox eh: %p\n",topo->prox);
}
pilha *push(pilha *topo){
    int item;
    pilha *aux;
    printf("\nDigite o numero a inserir:");
    scanf("%d",&item);
    aux = malloc(sizeof(pilha));
    aux->num = item;
    aux->prox = topo;
    return aux;
}
int main()
{
    int escolha;
    pilha *topo;
    topo = malloc(sizeof(pilha));
    inicializar(topo);
    for(;;){
        printf("escolha um item:\n");
        printf("|\t 1 - PUSH              |\n");
        printf("|\t 2 - POP               |\n");
        printf("|\t 3 - Consultar topo    |\n");
        printf("|\t 4 - Limpar/Inicializar|\n");
        printf("|\t 5 - Fim               |\n");
        printf("Item:");
        scanf("%d",&escolha);
        switch (escolha)
        {
        case 1:
            topo = push(topo);
            break;
        case 2:
            pop(topo);
            break;
        case 3:
            consulta(topo);
            break;
        case 4:
            inicializar(topo);
            break;
        default:
            return 0;
        }
    }
}

