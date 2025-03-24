package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;

/**
 * Objetos desta classe encapsulam valores numericos (reais e inteiros)
 */
public class ValorNumerico extends ValorConcreto<Double> {

    private Tipo tipo;
	
	public ValorNumerico(double valor, Tipo tipo) {
		super(valor);
        this.tipo = tipo;
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
		return this.tipo;
	}

    @Override
	public String toString() {
        if (this.tipo == TipoPrimitivo.INTEIRO) {
		    return String.format("%d", (int) Math.round(this.valor()));
        }

        return String.format("%f", this.valor());
	}
}
