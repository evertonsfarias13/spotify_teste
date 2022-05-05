# Teste - API do SPOTIFY
<p> Resumo: [GET] Obter uma faixa • Obter várias faixas • Obter um álbum • Obter vários álbuns
  • Obter as faixas de um álbum • Obter as faixas de uma lista de reprodução • Obter as faixas salvas de um usuário</p>

## Sobre o Teste:
<p> Consultar faixas de músicas e albuns, consumindo as API's do SPOTIFY, utilizando o Postman e o Rest Assured do JAVA como alternativa ao CYPRESS</p>
<p> O Teste consiste em obter o "responses" com os dados de cada faixa, albúm, playlist solicitadas e validar o status code</p>

## Tecnologias e ferramentas Utilizadas:
Postman - IDE Eclipse - Linguagem JAVA com Framework Rest Assured + Junit - GIT

## Como executar?
<p>Pré-Requisitos: Ter instalado na sua máquina o GIT, a IDE Eclipse e o Popstman. </p>

<p>Abrir o Postman e importar o arquivo Json "SPOTIFY.postman_collection.json"</p>

<p>Clonar repositório: gh repo clone evertonsfarias13/spotify_teste  </p>
<p>Utilizar o Eclipse para ter acesso a workspace do projeto "Spotify.projeto"</p>


## Relatório da minha experiência:
<p>Foi utilizado o Postman para realizar os cenários e obter os resultados. Exportei a collection em  arquivo Json . 
 Com relação ao CYPRESS, eu tinha mencionado na entrevista que ainda não tinha habilidades, tentei estudar e aplicar neste desafio mas estava perdendo bastante tempo.
 Resolvi tentar improvisar e utilizar um framework com um projeto MAVEN no JAVA + Rest Assured + Junit e mesmo assim não consegui obter acesso pois o token não funcionou, conforme o "response"

{
    "error": {
        "status": 401,
        "message": "No token provided"
    }
}  
  

   Como sou cliente, utilizei meu próprio usuário do spotify para acessar as tracks.
   Acessei o spotify developer para consultar a documentação das APIs e também estudar como funciona a questão de autorização e token de acesso. 
Também tive que registrar uma aplicação no menu "dashboard" em spotify developer, para conseguir registrar um client id e conseguir realizar a configuração no Postman.
 - Depois acessei o postman e criei uma collection para obter acesso ao token do spotify
 utilizando a url: https://accounts.spotify.com/api/token. Quando criei a aplicação no dashboard do spotify, foi gerado um cliente id e um secret id
e para obter um access token no postman, eu tive que informar esses dados junto com o callback url do postamn.
- Feito isso, foi aberto uma tela "Request token" já logado com meu usuário spotify. 
- O token é gerado, porém ele expira a cada uma hora, então eu tinha que solicitar quando necessário.
Ao realizar o teste no postamn (send) retorna o "response" com a mensagem "token expired" sendo assim, basta acessar "authorization - type OAUTH - clicar no botão Get new Token - Use Token.
Eaí podemos realizar um novo teste e obter o response esperado com as informações.
A experiência foi ótima, tive que pesquisar e estudar um pouco sobre os tokens de acesso do spotify para entender o funcionamento, apesar da dificuldade e o não sucesso utilizando o JAVA com restAssured
foi de grande satisfação e aprendizado.   </p>
