public class Main {

    public static void main(String[] args) {
        Pet wuffi = new Pet();
        wuffi.setName("Wuffi");
        wuffi.setType("dog");

        Pet mutzi = new Pet();
        mutzi.setName("Mutzi");
        mutzi.setType("cat");

        Pet[] myPets = new Pet[2];
        myPets[0] = wuffi;
        myPets[1] = mutzi;

        Pet tweety = new Pet();
        tweety.setName("Tweety");
        tweety.setType("bird");
        myPets[2] = tweety;

        for (Pet anyPet : myPets) {
            System.out.println("Ich füttere " + anyPet);
        }
    }
}
