package Java.ModificadoresAcesso.src.package1;

// Para instanciar classes do mesmo package não é necessário importa-las

public class Access2 {
    public static void main(String[] args) {
        
        // Instancia para chamada de métodos da classe "Access1"       
        Access1 access = new Access1();

        //(public) Visível na classe em qualquer escopo
        System.out.println(access.hours);
        
        // (private)O private só pode ser acessado na classe em que foi declarado
        //System.out.println(access.minutes); --> "access" não encontra o objeto "minutes"
       
        // (protected) A visibilidade e acesso de "seconds" é restrita ao package, portanto é acessível 
        System.out.println(access.secounds);
        
        // (default) Possui visibilidade plena no package, porém não pode ser importado 
        System.out.println(access.milisecounds);
        
    } 
}
