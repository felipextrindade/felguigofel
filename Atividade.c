// Guilherme Pereira de Souza Del Rio Bertola     RA: 0030481513020

#include <stdlib.h>
#include <stdio.h>
struct regLista
{
    int valor;
    char sexo;
    struct regLista *prox;
};

struct regLista *lista()
{
    int numero;
    char sex;
    struct regLista *inicio, *aux, *ant, *aux2;
/* inicializando a variável inicio com um endereco vazio */
    inicio = NULL;
    while(1)
    {
        //while (sex=!'m'&&sex!='M'&&sex!='f'&&sex!='F'){
            printf("Informe o peso e o sexo(peso,m/f): ");
            fflush(stdin);
            scanf("%d,%c", &numero,&sex);
        //}
        if( numero < 0 )
            break;
/* criando uma variável struct regLista dinamicamente */
        aux = (struct regLista *) malloc( sizeof(struct regLista) );
/* preenchendo os campos da variável criada dinamicamente */
        aux->valor = numero;
        aux->sexo = sex;
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
    aux = inicio;
    exibir(aux);
    return inicio;

}
struct regLista *unir(){
    struct regLista *lista1, *lista2,*listafinal,*ultimo;
    ultimo = (struct regLista *) malloc( sizeof(struct regLista) );
    listafinal = ultimo;
    lista1=lista();// inicializando as listas
    lista2=lista();
    if (lista1 == NULL){//caso a lista 1 seja vazia
        listafinal=lista2;
        return listafinal;
    }
    else{
        if (lista2==NULL){//caso a lista 2 seja vazia
            listafinal=lista1;
            return listafinal;
        }
        else{
            if (lista1->prox == NULL && lista2->prox == NULL){ //caso as listas sejam unitarias
                if (lista1->valor>=lista2->valor){
                    lista2->prox=lista1;
                    listafinal=lista2;
                }
                else{
                    lista1->prox=lista2;
                    listafinal=lista1;
                }
            }//caso as listas tenham tamanhos maiores que 1
            else{/* caso seja a primeira vez salvar o valor do menor na raiz "listafinal"*/
                if(lista1->valor>=lista2->valor){
                    ultimo->prox=lista2;
                    ultimo=lista2;
                    listafinal = ultimo;
                    lista2=lista2->prox;
                }
                else{
                    ultimo->prox=lista1;
                    ultimo=lista1;
                    listafinal = ultimo;
                    lista1=lista1->prox;
                }
                for(;;){//Loop de organização
                    if (lista1==NULL){//saida caso acebe os items da lista 1
                        ultimo->prox=lista2;
                        return listafinal;
                    }
                    else{//saida caso acebe os items da lista 2
                        if (lista2==NULL){
                            ultimo->prox=lista1;
                            return listafinal;
                        }
                        else{
                            if(lista1->valor>=lista2->valor){//checar quem é o maior copiar para o ultimo mover a lista um item para frente destruindo o anterior
                                ultimo->prox=lista2;
                                ultimo=lista2;
                                lista2=lista2->prox;
                            }
                            else{
                                ultimo->prox=lista1;
                                ultimo=lista1;
                                lista1=lista1->prox;
                            }
                        }
                    }
                }
            }
        }
    }
}
void exibir(struct regLista *x){
    printf("\n\nConteudo da lista:\n");
    while (x != NULL )
    {
        printf("%3.0d - %c\n", x->valor,x->sexo);
        x = x->prox;
    }
}
int main(){
    struct regLista *fim;
    fim = unir();
    printf("\n\n\nConteudo da lista final:");
    exibir(fim);
    return 0;
}

