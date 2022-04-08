
public class Main {
    public static void main(String[] args) {
        String[] namesAndSpeed = {"Kostya_0", "Rafael_8", "Sasha_6", "Misha_3"};
        String[] survivorsNames = getSurvivorsPlayers(namesAndSpeed);


        for (String name : survivorsNames) {
            System.out.println(name);
        }

    }

    public static String[] getSurvivorsPlayers(String[] array) {
        int nominalSpeed = 5;
        String[] names = new String[array.length];

        for(int i = 0; i < array.length; i++) {
            String[] elements = array[i].split("_"); // elements = ["Kostya", "500"]
            int speed = Integer.parseInt(elements[1]); // берем скорость каждого человека и превращаем в число
            if (speed >= nominalSpeed) { // сравниваем скорость каждого человека с номинальной
                names[i] = elements[0]; //добавляем в массив имя того кто выжил
            }
        }
        return names;
    }
}

















