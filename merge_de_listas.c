 // Felipe Augusto Trindade      RA: 0030481513011
// Felipe Siqueira Pinheiro     RA: 0030481513014

#include <stdio.h>
struct regLista
{
    int valor;
    char sexo;
    struct regLista *prox;
};

struct regLista *criarLista()
{
    int peso;
    char sexo;
    struct regLista *inicio, *aux, *ant, *aux2;
/* inicializando a variável inicio com um endereco vazio */
    inicio = NULL;
    while(1)
    {
        printf("Informe o peso e sexo (separados por virgula): ");
        scanf("%d,%c", &peso, &sexo);
        if( peso < 0)
            break;
/* criando uma variável struct regLista dinamicamente */
        aux = (struct regLista *) malloc( sizeof(struct regLista) );
/* preenchendo os campos da variável criada dinamicamente */
        aux->valor = peso;
        aux->prox = NULL;
        if( inicio == NULL )
            inicio = aux;
        else    // procura posicao correta para incluir
        {
            //if (inicio->prox == NULL)//se o novo tem que ser incluido no inicio e jogar o inicio para a frente
			   if (inicio->valor > aux->valor)
                {   aux->prox = inicio;
                    inicio = aux;
                }
                //else
                //{
                    //inicio->prox = aux;
                //}


	        else   //começa os testes com os demais
	        {
	            aux2 = inicio->prox;
	            ant = inicio;
	            while ( aux2 != NULL )
	            {
	                if (aux2->valor >= aux->valor)
					{   aux->prox = aux2;
						ant->prox = aux;
						break;
					}
					else
					{   ant = aux2;
						aux2 = aux2->prox;
					}
	            }
	            if (aux2 == NULL)
				{
					ant->prox = aux;
	        	}
        }
    }
}
/* imprimindo os valores da lista */
    printf("\n\n\nConteudo da lista:\n");
    aux = inicio;
    while ( aux != NULL )
    {
        printf("%d - %c\n", aux->valor, aux->sexo);
        aux = aux->prox;
    }
    return inicio;

}

int main(){
    struct regLista *lista1, *lista2;

    lista1 = criarLista();
    lista2 = criarLista();
}
