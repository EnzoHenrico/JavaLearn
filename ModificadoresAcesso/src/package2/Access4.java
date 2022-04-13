package JavaLearn.ModificadoresAcesso.src.package2;

import JavaLearn.ModificadoresAcesso.src.package1.Access1;

public class Access4 extends Access1 {

    public void access4() {

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
