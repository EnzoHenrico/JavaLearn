package JavaLearn.ModificadoresAcesso.package1;

abstract public class AccessAbstract {
    
    public String key = "Classes abstreatas são inacessíveis por instancia";
    private String privateKey = "Só é possível acessar os objetos por subclasses";

    public String getKey(){

        return privateKey;
    }  
}

