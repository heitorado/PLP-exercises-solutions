package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.TipoPrimitivo;

/**
 * Objetos desta classe encapsulam valor real.
 */
public class ValorReal extends ValorNumerico {
	public ValorReal(double valor) {
		super(valor, TipoPrimitivo.REAL);
	}
}