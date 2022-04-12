package Java.ModificadoresAcesso.src.package2;

// Para instaciar uma classe de outro pacote é necessário importar o arquivo da classe
import Java.ModificadoresAcesso.src.package1.Access1;

public class Access3 {
    public static void main(String[] args) {
        
        Access1 access = new Access1();

        //(public) A visibilidade e acesso são plenas como o default porém existe um marcador para organizar melhor o código
        System.out.println(access.hours);

        // (protected) A visibilidade e acesso de "seconds" é restrita ao package, portanto é acessível 
        //System.out.println(access.secounds);        

        //(private) Só é possivel acessar métodos privados fora de seu package através de encapsulamento
        System.out.println(access.getMinutes());
    
        // (default) 
        //System.out.println(access.milisecounds);
    }
    
}
