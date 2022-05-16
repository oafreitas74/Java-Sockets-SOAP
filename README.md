[Trabalho de Sistemas Distribuídos]
Licenciatura em Informática e Comunicações – 3º ano

O esquema proposto apresenta, no essencial, um sistema de Cibersegurança. O
referido sistema, tem por propósito efetuar a obtenção de dados através de uma
rede de escutas (E) capaz de obter dados áudio, imagem e vídeo. Desta forma, cada
peça E deve ser simulada (através de texto gerado aleatoriamente e com
periodicidade variável) como sendo uma escuta de um dado tipo de dados (i.e. áudio,
vídeo, imagem). Cada uma das escutas deve conter o seguinte formato: Tipo de
Escuta, Nome e Dados (e.g. Aud|E1|asdasdasdd2423asdsdsd).
Cada vez que são obtidos dados pelas peças E, os dados obtidos deverão ser enviados
para a Célula que os gere, usando a tecnologia Sockets. Esta peça (Célula) deverá
armazenar, temporariamente, slots de 10 escutas recebidas. Quando são atingidas 10
escutas, estas deverão ser enviadas (usando a tecnologia Sockets) para o Centro de
Comando, com a indicação da designação da célula que os envia, sendo eliminadas
de seguida na Célula.
Cada vez que o Centro de Comando recebe dados, os mesmos serão enviados para o
Centro de Armazenamento de Dados, através da tecnologia SOAP Web Services, que
os armazenará numa Base de Dados MySQL.
Por fim, O Centro de Comando deverá ser capaz de mostrar, em tempo real, todos os
dados que estão a ser recebidos. Caso o centro de comandos não receba dados de
uma dada Célula durante 60 segundos, o Centro de Comando deverá despoletar um
pedido de envio de dados a essa Célula. Essa Célula, enviará, com este pedido, todos
os dados do seu slot, mesmo que ainda sejam inferiores a 10 (nota: caso não existam
dados na célula, deverá ser enviado o texto “sem dados”.
