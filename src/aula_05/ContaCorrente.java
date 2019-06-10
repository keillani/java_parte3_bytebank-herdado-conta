package aula_05;
//Quando uma classe herda de outra ela recebe seus atributos e métodos

public class ContaCorrente extends Conta {

    //chamando o construtor específico passando os parâmetros específicos
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //sobrescrita: assinatura deve ser igual
    //É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valor);
    }
}
