import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("cat");

        Map<String, Pet> myPets = new HashMap<>();
        myPets.put(wuffi.getName(), wuffi);
        myPets.put(mutzi.getName(), mutzi);

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("bird");
        myPets.put(tweety.getName(), tweety);

        for (Pet anyPet : myPets.values()) {
            System.out.println("Ich füttere " + anyPet);
        }

        Pet found = myPets.get("Mutzi");
        System.out.println("Gefunden wurde " + found);
    }
}
