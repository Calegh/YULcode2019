package SmartOffice;

import Peripherals.*;

public class OurHTTPServer {
    static final int port=8080;

    public static void main(String args[]) throws Exception{
        System.out.println(Controllers.getEmployee(1));
        System.out.println(Controllers.getRoom(2));
    }
}
