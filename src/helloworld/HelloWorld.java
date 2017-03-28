/**
 * Arquivo: HelloWorld/src/helloworld/HelloWorld.java
 */



/**
 * Um programa que diz Ola Mundo
 *
 * Instrucoes:
 * Abra o CMD e acesse a pasta HelloWorld, que contem as pastas
 * src (dos fontes) bin (os executaveis) e digite os comandos abaixo:
 *
 * PARA COMPILAR:
 * javac -d bin src\helloworld\HelloWorld.java
 *
 * PARA EXECUTAR:
 * java -cp bin helloworld.HelloWorld
 */
package helloworld;
public class HelloWorld {
	public static void main(String[] args) {
		if(args.length > 0){
			System.out.println("Ola, " + args[0]);
		}else{
			System.out.println("Ola, Mundo");
		}
	}
}
