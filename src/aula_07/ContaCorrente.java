package aula_07;
//Quando uma classe herda de outra ela recebe seus atributos e métodos
//A herança captura o que é comum e isola aquilo que é diferente entre classes.
//vantagem do uso de interfaces: Garante que todos os métodos de classes que implementam uma interface possam ser chamados com segurança.
//antagem do uso de composição e interfaces sobre o uso de herança:
//Com composições e interfaces teremos mais flexibilidade com nosso código, já que não nos prenderemos ao acoplamento que a herança propõe.

public class ContaCorrente extends Conta implements Tributavel {

    //chamando o construtor específico passando os parâmetros específicos
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    //sobrescrita: assinatura deve ser igual
    //É usada para sobrescrever o método da classe mãe, indicando que o método original foi alterado.
    @Override
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01;
    }

}
