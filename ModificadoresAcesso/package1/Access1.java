package JavaLearn.ModificadoresAcesso.package1;
/** Modificadores de Acesso são normas passadas a variáveis e métodos que mudam seu acesso e visibilidade

 * ↓ Esses modificadores são ↓
 
 * default (toda variável declarada sem nenhum modificador é um "default")
 * public
 * private
 * protected
 
 */

public class Access1 {

    // ↓ Objetos a serem passados para outras classes
    public int hours = 15;
    private int minutes = 24;
    protected int secounds = 50;
    
    // default
    int milisecounds = 12; 

    // Método de encapsulamento para variável privada
    public int getMinutes(){
        return minutes;
    }
}
