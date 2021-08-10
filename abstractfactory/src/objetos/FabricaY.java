package objetos;

import abstratas.AbstractFactory;
import abstratas.CaixaSom;
import abstratas.InstrTeclado;

/**
 * 
 * @author Dione
 *
 */
public class FabricaY extends AbstractFactory {
	// filha da classe principal

	@Override
	public CaixaSom fabricarCaixaSom() {
		return new CaixaSomY();
	}

	@Override
	public InstrTeclado fabricarInstrTeclado() {
		return new TecladoY();

	}

}
