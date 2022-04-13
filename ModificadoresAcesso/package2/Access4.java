package JavaLearn.ModificadoresAcesso.package2;

import JavaLearn.ModificadoresAcesso.package1.Access1;

public class Access4 extends Access1 {

    public static void main(String[] args) {
        
        // A instancia muda para a subclasse, que extende os parametros de outra classe
        Access4 access = new Access4();

        //(public) Possui visibilidade e acesso em subclasses
        System.out.println(access.hours);    
        
        //(private) Private não possui visibilidade em subclasses
        //System.out.println(access.minutes);
        
        //(protected) O "protected" é visível em uma sua subclasse de sua classe de origem
        System.out.println(access.secounds);

        //(default) Não possui visibilidade em subclasses
        //System.out.println(access.milissecounds);
    }    
}
