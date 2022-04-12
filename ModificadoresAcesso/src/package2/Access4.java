package Java.ModificadoresAcesso.src.package2;

import Java.ModificadoresAcesso.src.package1.Access1;

public class Access4 extends Access1 {

    public void acces() {

        // A instancia muda para a subclasse, que extende os parametros de outra classe
        Access4 access = new Access4();
        
        // (protected) O "protected" é visível em uma sua subclasse que extende sua classe raiz 
        System.out.println(access.secounds);
    }
    
}
