package JavaLearn.ModificadoresAcesso.src.package2;

// Para instaciar uma classe de outro pacote é necessário importar o arquivo da classe
import JavaLearn.ModificadoresAcesso.src.package1.Access1;

public class Access3 {

    public void acces3() {
        
        Access1 access = new Access1();

        //(public) Possui visibilidade em outros pacotes
        System.out.println(access.hours);

        //(protected) A visibilidade é restrita ao package em que foi declarado 
        //System.out.println(access.secounds); -> access não encontra "secounds" neste escopo

        //(private) Só é possivel acessar métodos privados fora de seu package através de encapsulamento
        System.out.println(access.getMinutes());
    
        //(default) Não é visivel em importações
        //System.out.println(access.milisecounds);
    }
}
