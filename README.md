# Demografico

# ALGORITMO

inicio

  enquanto existe habitantes sem registro faça
    exibir("Digite o sexo| Feminino( 0 ) | Masculino ( 1 )| Outros ( 2 ) | aqui: ");

    ler sexo[i];

    escolha sexo[i];
      caso 0 faça;
        cont_femi++;
      fimcaso;
      caso 1 faça;
        cont_masc++;
      fimcaso;
      caso 2 faça;
        cont_outros++;
      fimcaso;

    exibir("digite a idade: ");
    ler idade[i];

    media_idade_g += idade[i];

    se sexo[i] = 1 faça
      media_idade_m += idade[i];
    fimse;

    se idade >= 18 e <=35 faça
      cont_idade_18a35++;
    fimse;

    exibir("Digite a altura: ");
    ler altura[i];

    se sexo [i] = 0 faça
      media_alt_f += altura[i];
    fimse
fimenquanto

result_idade_g = media_idade_g / total_g;//Calculo Idade media do Grupo

result_alt_f = media_alt_f / cont_femi;//Calculo Altura media Feminina

result_idade_m = media_idade_m / cont_masc;//Calculo idade media Masculina

escreva( 	
  média da idade do grupo:
  média da altura das mulheres:
  média da idade dos homens:
  quantidade de pessoas que identificaram como outros:
  percentual de pessoas com idade entre 18 e 35 anos (inclusive):
  )
fim


 
# FLUXOGRAMA

![Fluxograma demografica](https://user-images.githubusercontent.com/104398779/169936356-243c8937-e2ef-4051-b1be-6846041ed00d.png)
