package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

/**
* Um objeto desta classe representa uma Expressao de Subtracao.
*/
public class ExpSub extends ExpBinaria {

	/**
	 * Controi uma Expressao de Subtracao com as sub-expressoes especificadas.
	 * Assume-se que estas expressoes resultam em <code>ValorNumerico</code>
	 * quando avaliadas.
	 *
	 * @param esq Expressao da esquerda
	 * @param dir Expressao da direita
	 */
	public ExpSub(Expressao esq, Expressao dir) {
		super(esq, dir, "-");
	}

	/**
	 * Retorna o valor da Expressao de Subtracao
	 * 
	 * @param amb
	 *            o ambiente de execu��o.
	 */
	public Valor avaliar(AmbienteExecucao amb) {
		TipoPrimitivo tipoExpr = getEsq() instanceof ValorReal ? TipoPrimitivo.REAL : TipoPrimitivo.INTEIRO;

		return new ValorNumerico(
				((ValorNumerico)getEsq().avaliar(amb)).valor() -
				((ValorNumerico)getDir().avaliar(amb)).valor(), tipoExpr
		);
	}

	/**
	 * Realiza a verificacao de tipos desta expressao.
	 *
	 * @param amb
	 *            o ambiente de compila��o.
	 *
	 * @return <code>true</code> se os tipos da expressao sao validos;
	 *         <code>false</code> caso contrario.
	 */
	protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb) {
		boolean esqNumerico = getEsq().getTipo(amb).eInteiro() || getEsq().getTipo(amb).eReal();
		boolean dirNumerico =  getDir().getTipo(amb).eInteiro() || getDir().getTipo(amb).eReal();
		boolean esqDirIguais = getEsq().getTipo(amb).eIgual(getDir().getTipo(amb));

		return esqNumerico && dirNumerico && esqDirIguais;
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
		return TipoPrimitivo.INTEIRO;
	}

}
