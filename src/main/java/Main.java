import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("cat");

        Set<Pet> myPets = new HashSet<>();
        myPets.add(wuffi);
        myPets.add(mutzi);

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("bird");
        myPets.add(tweety);

        for (Pet anyPet : myPets) {
            System.out.println("Ich füttere " + anyPet);
        }
    }
}
