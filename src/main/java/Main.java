import java.util.ArrayList;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) throws Exception {

        int time = 7;


        Controllers.updateEmployeePosition(7, 3);
        Controllers.updateEmployeePosition(8, 3);

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


        Controllers.updateEmployeePosition(7, 2);
        Controllers.updateEmployeePosition(8, 2);

        room = Controllers.getRoom(3);
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

    }

    public static void showAllRooms() throws Exception {
        for (int i = 1; i <= 6; i++) {
            Room room = Controllers.getRoom(i);
            System.out.println(room);
        }
    }

    public static void moveEmployees(ArrayList<Employee> employees, ArrayList<Room> destinations) throws Exception {
        assert(employees.size() == destinations.size());

        for (int i = 0; i < employees.size(); i++) {
            Controllers.updateEmployeePosition(employees.get(i).getId(), destinations.get(i).id);
        }
    }

    public static void moveEmployeesOut() {
        ArrayList<Employee> employees = 
    }
}
