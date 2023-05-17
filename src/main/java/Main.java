import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("cat");

        // alt: Pet[] myPets = new Pet[2];
        Set<Pet> myPets = new HashSet<>();
        // myPets[0] = wuffi;
        myPets.add(wuffi);
        //myPets[1] = mutzi;
        myPets.add(mutzi);

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("bird");
        //myPets[2] = tweety;
        myPets.add(tweety);

        for (Pet anyPet : myPets) {
            System.out.println("Ich füttere " + anyPet);
        }
    }
}
