public class NullPointer {
    public static void causeError(){
        String txt = null;
        System.out.println(txt.length()); // this causes error
    }

    public static void handleError(){
        try{
            String txt = null;
            System.out.println(txt.length());
        } catch(NullPointerException e){
            System.out.println("Caught NullPointerException");
        }
    }

    public static void main(String[] args){
        handleError();
    }
}
