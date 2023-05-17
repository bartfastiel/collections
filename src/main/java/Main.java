import java.util.*;

public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("cat");

        // alt: Pet[] myPets = new Pet[2];
        Map<String, Pet> myPets = new HashMap<>();
        // myPets[0] = wuffi;
        myPets.put(wuffi.getName(), wuffi);
        //myPets[1] = mutzi;
        myPets.put(mutzi.getName(), mutzi);

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("bird");
        //myPets[2] = tweety;
        myPets.put(tweety.getName(), tweety);

        for (Pet anyPet : myPets.values()) {
            System.out.println("Ich füttere " + anyPet);
        }

        System.out.println("Mein Lieblingstier ist " + myPets.get("Wuffi"));
    }
}
