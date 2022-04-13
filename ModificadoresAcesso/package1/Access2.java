package JavaLearn.ModificadoresAcesso.package1;
public class Access2 {

    public static void main(String[] args) {

        // Instancia para chamada de métodos da classe "Access1"       
        Access1 access = new Access1();

        //(public) Possui acesso e visibilidade
        System.out.println(access.hours);
        
        // (private) Só pode ser acessado diretamente na classe em que foi declarado
        //System.out.println(access.minutes); -> "access" não encontra o objeto "minutes"
        // ↓ é necessário um encapsulamento para acessar metodos privados de outra classe
        System.out.println(access.getMinutes());
       
        // (protected) A visibilidade é restrita ao package, portanto é acessível 
        System.out.println(access.secounds);
        
        // (default) Possui visibilidade plena no package, porém não pode ser importado 
        System.out.println(access.milisecounds);
    }
}
