# Hello-World-Java
Um programa que diz Ola Mundo
 Instrucoes:
 Abra o CMD e acesse a pasta HelloWorld, que contem as pastas
 src (dos fontes) bin (os executaveis) e digite os comandos abaixo:

 PARA COMPILAR:
 ```CMD
 javac -d bin src\helloworld\HelloWorld.java
```
 PARA EXECUTAR:
 ```CMD
 java -cp bin helloworld.HelloWorld
```

saída:
```CMD
Ola, Mundo
```

Para trocar "Mundo" por um nome, utilize um argumento na linha de comando:

comando:
```CMD
java -cp bin helloworld.HelloWorld Luis 
```
saída:
```CMD
Ola, Luis
```