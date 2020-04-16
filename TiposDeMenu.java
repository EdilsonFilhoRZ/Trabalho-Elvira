package TelaInicial;

import java.io.IOException;
import java.util.Scanner;

public final class TiposDeMenu {
	private static String NomeLogo = "                       LOTUS CLASS";
	
	
public static void MenuPrincipal() throws InterruptedException, IOException {	
			
				
		try {
			TiposDeMenu.MenuLocal("                     (Menu Principal)");
			Scanner input = new Scanner(System.in);
			System.out.println("O que deseja?");	
				int escolhaPrimaria = input.nextInt();	
					switch (escolhaPrimaria) {
						case 1: {
							//ContaCorrente
							break;
						}
						
						case 2:{
							//ContaPoupanca
							break;	
						}
						
						case 3:{
							//ContaEspecial
							break;
						}
						
						case 4:{
							//Sair
							break;
						}
						
						default:
										//Trata o erro caso digite um numero invalido...
									System.out.println("Opção Invalida!"); 
								MenuPrincipal();
							break;	
						}
					} catch (Exception casoSstring) {
						//Trata o erro caso escreva uma String...
				System.out.println("Opçãp Invalida");
			MenuPrincipal();
		}
    }



public static void MenuSecundario() {
	
	try {
		TiposDeMenu.MenuLocal("Menu Secundario");
		System.out.println("O que deseja?");	
		Scanner input = new Scanner(System.in);
		int escolhaSecundaria = input.nextInt();	
		switch (escolhaSecundaria) {
			case 1: {
				//Abertura de Conta	
				break;
			}
			
			case 2:{
				//Listagem das Contas
				break;	
			}
			
			case 3:{
				//return Menu
				break;
			}
			default:
				//Trata o erro caso digite um numero invalido...
				System.out.println("Opção Invalida!"); 
			MenuSecundario();
		}
	} catch (Exception casoString) {
		//Trata o erro caso escreva uma String...
		System.out.println("Opção Invalida!"); 
		MenuSecundario();
		
	}
}


	
public static void MenuLocal(String local) {
	//Muda o nome do local onde esta navegando...
	System.out.println(NomeLogo +"\n"+local);
	
}


	

}

