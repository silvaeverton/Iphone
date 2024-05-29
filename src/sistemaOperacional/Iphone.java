package sistemaOperacional;

import java.util.Scanner;
import sistemaOperacional.aplicativos.sistemaOperacional; 

public class Iphone {
    public static void main(String[] args) throws InterruptedException {
		
		Scanner scan = new Scanner(System.in);
		
		sistemaOperacional iphone = new sistemaOperacional();
		
		System.out.println(":::::: Seja Bem vindo! ::::::\n"
				+"\nO que deseja fazer?"
				);
		
		System.out.println("1. TELEFONE \n"
				+ "2. MÚSICA \n"
				+ "3. INTERNET \n"
				+ "4. MENU\n"
				+ "0. ENCERRAR \n");		
		System.out.print("POR FAVOR, DIGITE A OPÇÃO DESEJADA: ");
		int menuInicial = scan.nextInt();
		System.out.println("--------------------------------------");
				
		do {		
			switch (menuInicial) {
			
			case 1: {	
				System.out.println("\n::::::TELEFONE::::::\n"
						+ "1. LIGAR \n"
						+ "2. ATENDER \n"
						+ "3. INICIAR CORREIO DE VOZ \n"
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = scan.nextInt();					
				
				if(opcao == 1) {
					System.out.print("\nDIGITE O NUMERO: ");
					String numero = scan.next();
					Thread.sleep(1000);							
					iphone.ligar(numero);
				}
				else if(opcao == 2) {
					iphone.atender();
				}
				else if(opcao == 3){
					iphone.iniciarCorreioVoz();
				}
				else if(opcao == 4){
					menuInicial = 4;
				}
				else {
					System.out.println("\nOPÇÃO INVALIDA");							
				}							
				continue;			}
			
			case 2: {	
				System.out.println("\n::::::MÚSICA::::::\n"
						+ "1. SELECIONAR MUSICA \n"
						+ "2. TOCAR \n"
						+ "3. PAUSAR \n"
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = scan.nextInt();					
				
				if(opcao == 1) {
					System.out.print("\nQUAL MÚSICA DESEJA OUVIR? ");
					scan.nextLine();
					String musica = scan.nextLine();
					Thread.sleep(1000);							
					iphone.selecionarMusica(musica);
				}
				else if(opcao == 2) {					
					iphone.tocar();					
				}
				else if(opcao == 3){
					iphone.pausar();
				}
				else if(opcao == 4){
					menuInicial = 4;
				}
				else {
					System.out.println("\nOPÇÃO INVALIDA");							
				}							
				continue;
			}
			case 3: {	
				System.out.println("\n::::::NAVEGAR NA INTERNET::::::\n"
						+ "1. ACESSAR PAGINA WEB \n"
						+ "2. ATUALIZAR ABA \n"
						+ "3. NOVA ABA \n"
						+ "4. VOLTAR MENU"
						);
						
				System.out.print("DIGITE A OPÇÃO ESCOLHIDA: ");
				int opcao = scan.nextInt();					
				
				if(opcao == 1) {
					System.out.println("DIGITE O ENDEREÇO WEB QUE DESEJA: ");
					scan.nextLine();
					String url = scan.nextLine();
					Thread.sleep(1000);							
					iphone.exibirPagina(url);
				}
				else if(opcao == 2) {					
					iphone.atualizarAba();					
				}
				else if(opcao == 3){
					iphone.adicionarNovaAba();
				}
				else if(opcao == 4){
					menuInicial = 4;
				}
				else {
					System.out.println("OPÇÃO INVALIDA");							
				}							
				continue;
			}			
			case 4: {
				System.out.println("\n:::::: MENU ::::::\n"
						+"\nO que deseja fazer?"
						);
				
				System.out.println("1. TELEFONE \n"
						+ "2. MÚSICA \n"
						+ "3. INTERNET \n"
						+ "4. MENU\n"
						+ "0. ENCERRAR \n");		
				System.out.print("POR FAVOR, DIGITE A OPÇÃO DESEJADA: ");
				menuInicial = scan.nextInt();
				System.out.println("---------------------------------\n");				
				break;
				}			
			}			
					
		}while(menuInicial != 0);
		
		System.out.println("APLICAÇÃO ENCERRADA. OBRIGADO!"
				+ "");			
			
		scan.close();					
	}
}


