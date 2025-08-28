public class Neested_class {
    private static String msg="hi";
    public static class NeestedStaticClass{
        public void printMesaage(){
            System.out.println("hello: "+msg);
        }
    }
    // public class Main {
    // public static void main(String[] args) {
    //     Neested_class.NeestedStaticClass obj = new Neested_class.NeestedStaticClass();
    //     obj.printMesaage();
    //}
//}

}
