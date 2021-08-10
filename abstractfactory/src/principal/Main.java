package principal;

import objetos.FabricaY;
import objetos.FabricaX;
/**
 * 
 * @author Dione
 *
 */
public class Main {

	public static void main(String[] args) {
		
		System.out.println("\n********************************");
		System.out.println("<<<<<<<<< F�BRICA X >>>>>>>\n");
	
		FabricaX x = new FabricaX();

		x.fabricarCaixaSom().exibir();
		x.fabricarInstrTeclado().exibir();
		
		System.out.println("********************************");
		System.out.println("<<<<<<<<< FABRICA Y >>>>>>>\n");
	
		FabricaY y = new FabricaY();

		y.fabricarCaixaSom().exibir();
		y.fabricarInstrTeclado().exibir();
	}
}
