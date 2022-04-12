package Java.ModificadoresAcesso.src.package1;

/** 
 
 * Modificadores de Acesso são normas passadas a variáveis e métodos que mudam seu acesso e visibilidade

 * ↓ Esses modificadores são ↓
 
 * default (toda variável declarada sem nenhum modificador é um "default")
 * public
 * private
 * protected
 
 */

public class Access1 {
// Nessa classe temos informações a serem passadas para outras classe e consequentemente metodos

    public int hours = 15;
    private int minutes = 24;
    protected int secounds = 50;
    int milisecounds = 12; // default

    public int getMinutes(){
        return minutes;
    }

// Variáveis passadas para Acces2
}
