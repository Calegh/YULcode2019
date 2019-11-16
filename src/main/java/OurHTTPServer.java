public class OurHTTPServer {
    static final int port=8080;

    public static void main(String args[]) throws Exception{
        System.out.println(Controllers.getEmployee(1));
        System.out.println(Controllers.getRoom(2));
        Controllers.updateLight(true, "32CD32", 2);
        System.out.println(Controllers.getRoom(2));
        Controllers.updateEmployePosition(3,4);
    }
}
