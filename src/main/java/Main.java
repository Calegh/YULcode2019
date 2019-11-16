public class Main {

    public static void main(String[] args) throws Exception {

        //while (true) {
            //for (int i = 0; i <=6; i++) {
                //Employee employee = Controllers.getEmployee(1);
                Room room = Controllers.getRoom(3);
                System.out.println(room);

                if (room.isEmpty()) {
                    room.light.turnOff();
                    System.out.println("Lights off!");
                } else {
                    room.light.turnOn();
                    System.out.println("Lights on!");
                }

                Controllers.updateLight(room.light.isTurnedOn(), room.light.getHexColor(), room.light.getId());

                room = Controllers.getRoom(3);
                System.out.println(room);
            //}
        //}
    }
}
