import java.util.ArrayList;
import java.util.Arrays;
import java.util.EmptyStackException;

public class Main {

    public static void main(String[] args) throws Exception {

        //Minuit :
        int time = 0;
        moveEmployeesOut();
        updateAllRooms(time);

        //7h :
        time = 7;
        time = passTime(time);
        updateAllRooms(time);

        //8h :
        ArrayList<Integer> employees = new ArrayList<>(Arrays.asList(5,3,7,2));
        ArrayList<Integer> rooms = new ArrayList<>(Arrays.asList(1,1,2,3));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //9h :
        employees = new ArrayList<>(Arrays.asList(7,6,3,8,9,11));
        rooms = new ArrayList<>(Arrays.asList(4,5,4,4,4,4));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //10h :
        employees = new ArrayList<>(Arrays.asList(8,13,17,9,11,1,14,16));
        rooms = new ArrayList<>(Arrays.asList(6,6,6,6,6,6,6,6));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //11h :
        time = passTime(time);

        //12h :
        employees = new ArrayList<>(Arrays.asList(6,5,8,9,14,11,16,13,17,1,3));
        rooms = new ArrayList<>(Arrays.asList(3,2,2,2,2,2,2,2,2,2,2));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //13h :
        employees = new ArrayList<>(Arrays.asList(5,8,9,14,11,16,6,13,19,17,15,1,3));
        rooms = new ArrayList<>(Arrays.asList(1,4,4,4,4,6,6,6,6,6,6,6,6));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //14h :
        employees = new ArrayList<>(Arrays.asList(16,13,17,8,9,14,11));
        rooms = new ArrayList<>(Arrays.asList(2,3,5,4,4,4,4));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //15h : ON CHANGE PAS LES GENS MAIS LA COULEUR
        time = passTime(time);

        //16h :
        time = passTime(time);

        //17h :
        employees = new ArrayList<>(Arrays.asList(13, 11,17, 1,3,19));
        rooms = new ArrayList<>(Arrays.asList(2, 1, 1,1,1,1));
        moveEmployees(employees, rooms);
        updateAllRooms(time);
        time = passTime(time);

        //18h :
        moveEmployeesOut();
        updateAllRooms(time);
        time = passTime(time);
    }

    private static void updateAllRooms(int time) throws Exception {
        for (int i = 1; i <= 6; i++) {
            Room room = Controllers.getRoom(i);

            if (room.isEmpty()) {
                room.light.turnOff();
                System.out.println("Lights off in room " + i + "!");
            } else {
                room.light.turnOn();
                System.out.println("Lights on in room " + i + "!");
            }
            Controllers.updateLight(room.light.isTurnedOn(), Light.getDayColor(time), room.light.getId());
        }
        showAllRooms();
    }

    public static void showAllRooms() throws Exception {
        for (int i = 1; i <= 6; i++) {
            Room room = Controllers.getRoom(i);
            System.out.println(room);
        }
    }

    private static void moveEmployees(ArrayList<Integer> employees, ArrayList<Integer> destinations) throws Exception {
        assert(employees.size() == destinations.size());

        for (int i = 0; i < employees.size(); i++) {
            Controllers.updateEmployeePosition(employees.get(i), destinations.get(i));
        }
    }

    private static void moveEmployeesOut() throws Exception {
        for (int i = 1; i <= 19; i++) {
            Controllers.updateEmployeePosition(i, 1);
        }
        System.out.println("\nEveryone's out!\nKidding, they're all sleeping in the reception XD\n");
    }

    private static int passTime(int time) {
        time ++;
        System.out.println("\n*********************");
        System.out.println("It's " + time + "H00");
        System.out.println("*********************");
        return time;
    }
}
