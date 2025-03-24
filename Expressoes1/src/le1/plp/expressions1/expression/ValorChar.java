package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Objetos desta classe encapsulam valor char.
 */
public class ValorChar extends ValorConcreto<Character> {
	
	public ValorChar(char valor) {
		super(valor);
	}
	
	/**
	 * Retorna os tipos possiveis desta expressao.
	 * 
	 * @param amb
	 *            o ambiente de compila��o.
	 * 
	 * @return os tipos possiveis desta expressao.
	 */
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.CHAR;
	}

    @Override
	public String toString() {
		return String.format("\'%s\'", super.toString());
	}
}
