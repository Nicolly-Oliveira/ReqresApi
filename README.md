# Plano de Teste

**Desafio Tecnico RPE - Automação Reqres API**

*versão 1.0*

## Histórico das alterações

   Data    | Versão |    Descrição   | Autor(a)
-----------|--------|----------------|-----------------
02/04/2023 |  1.0   | Release incial | Nicolly Oliveira


## 1 - Introdução

Desafio proposto pela RPE com intuito de testar o nível técnico para uma vaga de estagio QA. Este documento descreve os requisitos a testar, os  tipos de testes definidos para cada iteração, cenários de teste, casos de teste, estratégia de teste e o cronograma dos testes ao longo do projeto. As seções servem para permitir que todos do projeto acompanhem a evolução dos testes.

Informações a respeito da aplicação:
- Reqres simula cenários reais de aplicação;

## 2 - Requisitos a Testar

Aqui conter os casos de uso e requisitos identificados como objetos dos testes ao longo do desenvolvimento do projeto.
Assim sendo, sempre que novos requisitos a testar, que não constem como requisitos do sistema, forem identificados ou, simplesmente, por questões de organização e clareza, esta seção deve ser atualizada.

Segue alguns do casos de uso e requisitos:

### Casos de uso:

Identificador do caso de uso | Nome do caso de uso
-----------------------------|----------------------------------------------------------------------------------------------------------------------
id UC1                       | Cadastrar usuário
id UC2                       | Efetuar login
id UC3                       | Buscar lista de usuário
id UC4                       | Buscar usuário por ID
id UC5                       | Alterar usuário por ID
id UC6                       | Deletar usuário por ID

### Requisitos:

Identificador do requisito   | Nome do requisito
-----------------------------|---------------------
id req1                      | Validar funcionalidade do endpoint Get
id req2                      | Validar funcionalidade do endpoint Post
id req3                      | Validar funcionalidade do endpoint Put
id req3                      | Validar funcionalidade do endpoint Patch
id req3                      | Validar funcionalidade do endpoint Delete


## 3 - Tipos de teste

Abaixo segue os tipos de testes escolhidos para cada iteração do projeto.

- Teste de API;
- Teste exploratório;

Mais informações sobre os tipos de teste e abordagens utilizadas, ir para o seção Estratégia de Teste.

### 3.1 - Cenários de Teste 

Baseados nos requisitos, este são alguns dos cenário que precisam ser validados no sistema.

 - Cenário de teste 01: 
 
![CeTest01](https://user-images.githubusercontent.com/95318147/229337965-7abe5938-c32f-4da9-8d5c-92a2edb17a1b.PNG)

 - Cenário de teste 02:
 
![CeTest02](https://user-images.githubusercontent.com/95318147/229335135-3834bdc0-c545-4aff-a8db-ce8c6fa17dba.PNG)

 - Cenário de teste 03:

![CeTest03](https://user-images.githubusercontent.com/95318147/229340034-b4392f19-bdf3-4d86-8066-65c701b4bf6e.PNG)

 - Cenário de teste 04:
 
![CeTest04](https://user-images.githubusercontent.com/95318147/229340035-50733f93-b6ef-4178-bed9-a172f9a8a543.PNG)

### 3.2 - Casos de Teste

Para os cenários de teste temos os casos de testes relacionados.
Segue o passo a passo de como é realizado o teste baseados nos casos de teste descritos abaixo.

 - Caso de teste 01 (Segundo a ISO-2119-3 e Gherkin):

![CSTE1](https://user-images.githubusercontent.com/95318147/229339819-85348bb8-5027-4184-9604-d71f791585ae.PNG)

 - Caso de teste 02 (Segundo a ISO-2119-3 e Gherkin):

![CSTE2](https://user-images.githubusercontent.com/95318147/229339820-6445cecc-8163-4cba-86b0-83f0cb676626.PNG)

 - Caso de teste 03 (Segundo a ISO-2119-3 e Gherkin):

![CSTE3](https://user-images.githubusercontent.com/95318147/229339821-d610d31d-cf02-484f-a8d8-fa9bebed893b.PNG)

 - Caso de teste 04 (Segundo a ISO-2119-3 e Gherkin):

![CSTE4](https://user-images.githubusercontent.com/95318147/229339822-dc836b75-e6a2-47da-86d0-a5fa7ae6605b.PNG)

 - Caso de teste 05 (Segundo a ISO-2119-3 e Gherkin):

![CSTE5](https://user-images.githubusercontent.com/95318147/229339824-4affc7ee-9917-4b35-9486-b92846f35cd6.PNG)

 - Caso de teste 06 (Segundo a ISO-2119-3 e Gherkin):

![CSTE6](https://user-images.githubusercontent.com/95318147/229339827-ef9c23bb-3cff-4bd6-af84-410632f76f1a.PNG)

 - Caso de teste 07 (Segundo a ISO-2119-3 e Gherkin):

![CSTE7](https://user-images.githubusercontent.com/95318147/229339810-94167d62-5966-40d1-b250-a3a2409c37ba.PNG)

 - Caso de Teste 08 (Segundo a ISO-2119-3 e Gherkin):
 
![CSTE8](https://user-images.githubusercontent.com/95318147/229339811-b9cd0f57-8d49-4fdf-8067-ad69ba52253d.PNG)

 - Caso de Teste 09 (Segundo a ISO-2119-3 e Gherkin):
 
![CSTE9](https://user-images.githubusercontent.com/95318147/229339812-4f97eccb-5dc7-46b0-9661-3744d150b615.PNG)

 - Caso de Teste 10 (Segundo a ISO-2119-3 e Gherkin):
 
![CSTE10](https://user-images.githubusercontent.com/95318147/229339813-8f402674-116e-41d0-b887-71d51917223f.PNG)

 - Caso de Teste 11 (Segundo a ISO-2119-3 e Gherkin):
 
![CSTE11](https://user-images.githubusercontent.com/95318147/229339815-0aafe24c-a3e8-4bea-93e6-3b162c33ed63.PNG)

 - Caso de Teste 12 (Segundo a ISO-2119-3 e Gherkin):

![CSTE12](https://user-images.githubusercontent.com/95318147/229339817-57157d94-693f-449d-990b-d6b16d184e95.PNG)

 - Caso de Teste 13 (Segundo a ISO-2119-3 e Gherkin):

![CSTE13](https://user-images.githubusercontent.com/95318147/229339818-896425e4-b2e4-4aee-afa8-de1e9a35aa84.PNG)


## 4 - Estratégia de Teste

![Reqres API - Mind Map](https://user-images.githubusercontent.com/95318147/229334284-4bc4eb21-8658-44a6-b819-2664c9eb8d1f.png)


## 5 - Cronograma

Tipo de teste      | data de início | data de término
-------------------|----------------|-----------------
planejar teste     |   30/03/2023   | 30/03/2023
projetar teste     |   30/03/2023   | 30/03/2023
implementar teste  |   31/03/2023   | 31/03/2023
executar teste     |   01/04/2023   | 01/04/2023
avaliar teste      |   02/04/2023   | 02/04/2023


## 6 - Reportar Bug

 ### 6.1 - Bug ID-1
 
   #### Realizando login com senha inválida
  
   É possivel acessar a aplicação por meio de qualquer senha, apenas é necessário um email válido.

   #### Para Reproduzir
   
   Enviar uma requisição do tipo POST e no body colocar um email valido e uma senha invalida e realizar a requisição. 

   #### Comportamento Esperado
   
   Era esperado que o sistema não aprovasse o login com senha inválida.

   #### Prioridade
   
   <kbd>P0 - Prioridade Máxima</kbd>

   #### Desktop
    - OS: [e.g. Windows]
    - Intellij [e.g. chrome]
    - Junit 4

## 6 - Preocupações

   Nessa API, mesmo existindo token e id, não é necessária a autetivação do usuário para realizar as requisições. Devido a disso, certas funcionalidas podem estar vulneráveis a qualquer tipo de modificação por qualquer usuário. Por fim a API se comporta como é descrita na documentação do Swagger, mesmo não sendo as mais adequadas.


