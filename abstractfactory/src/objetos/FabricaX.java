package objetos;

import abstratas.AbstractFactory;
import abstratas.CaixaSom;
import abstratas.InstrTeclado;

/**
 * 
 * @author Dione
 *
 */

public class FabricaX extends AbstractFactory {
	// filha da classe principal

	@Override
	public CaixaSom fabricarCaixaSom() {

		return new CaixaSomX();
	}

	@Override
	public InstrTeclado fabricarInstrTeclado() {

		return new TecladoX();
	}

}
