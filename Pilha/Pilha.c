// Felipe Augusto Trindade      RA: 0030481513011
// Felipe Siqueira Pinheiro     RA: 0030481513014

#include <stdio.h>
struct pilha
{
    int valor;
    struct pilha *prox;
};

void conteudoLista(struct pilha *aux, struct pilha *raiz){
    aux = raiz;
    while ( aux != NULL ){
    printf("%d\n", aux->valor);
    aux = aux->prox;
    }
}

int main()
{
    int numero, opcao;
    struct pilha *raiz, *aux;

    raiz = NULL;

    while(opcao != 5){
        printf("\n1) Inserir um novo elemento no topo\n2) Remover o elemento do topo\n3) Consultar o elemento do topo\n4) Inicializar a pilha\n5) Fim\n\nOpção: ");
        scanf("%i", &opcao);
        if(opcao == 6)
        conteudoLista(aux, raiz);

        if(opcao == 1){
            printf("\nNumero: ");
            scanf("%i", &numero);
            if(numero < 0){
                break;
            }
            aux = (struct pilha *) malloc( sizeof(struct pilha) );

            aux->valor = numero;
            aux->prox = NULL;

            if(raiz == NULL)
                raiz = aux;
            else{
                aux->prox = raiz;
                raiz = aux;
            }
        }
        if(opcao == 2){
            if(raiz == NULL)
                printf("\nA pilha está vazia!\n");
            else{
                raiz = raiz->prox;
            }
        }
        if(opcao == 3)
            if(raiz == NULL)
                printf("\nA pilha está vazia!\n");
            else{
                printf("\nValor do topo: %i\n", raiz->valor);
            }

        if(opcao == 4){
            if(raiz == NULL)
                printf("\nA pilha está vazia!\n");
            else{
            raiz = NULL;
            printf("\nPilha inicializada!\n");
            }
        }
    }
    printf("\nEncerrado\n");
    return 0;
}
