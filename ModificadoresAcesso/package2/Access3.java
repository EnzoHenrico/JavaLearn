package JavaLearn.ModificadoresAcesso.package2;

import JavaLearn.ModificadoresAcesso.package1.Access1;
import JavaLearn.ModificadoresAcesso.package1.AccessAbstract;

public class Access3 extends AccessAbstract{

    public static void main(String[] args) {
        
        // Instancia de outro package necessita de importação ↑
        Access1 access = new Access1();

        // Para obeter os métodos de uma classe abstrata é necessário extendela
        Access3 abstractClass = new Access3();

        // Valor dos objetos abstratos
        System.out.println(abstractClass.key);
        System.out.println(abstractClass.getKey());

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
