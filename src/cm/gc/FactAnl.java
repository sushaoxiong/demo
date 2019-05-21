package cm.gc;

public class FactAnl {

    public Anl getAnl(String anl){
        if(anl == null){
            return null;
        }
        if(anl.equals("DOG")){
            return new Dog();
        }else{
            return new cat();
        }

    }
}
