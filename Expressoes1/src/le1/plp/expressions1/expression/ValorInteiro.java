package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.TipoPrimitivo;

/**
 * Objetos desta classe encapsulam valor inteiro.
 */
public class ValorInteiro extends ValorNumerico {
	public ValorInteiro(int valor) {
		super(valor, TipoPrimitivo.INTEIRO);
	}
}
