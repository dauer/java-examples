package intersectiontypes;

/*
 * Define an intersection type T which has to implement the X and Y interfaces
 */
public class IntersectionTypesExample <T extends Wolf & Human> {

    public void process(T type) {
        System.out.println("The werewolf:");
        type.howl();
        type.talk();
    }

    /*
     * Defining a type for the method only
     */
    public <S extends Wolf> void processing(S type) {
        System.out.println("The wolf: ");
        type.howl();
    }

    public static void main(String[] args) {
        Werewolf werewolf = new Werewolf();
        // If Werewolf isn't specified the compiler complains (but compiles)...
        IntersectionTypesExample<Werewolf> example = new IntersectionTypesExample<>();
        example.process(werewolf);
        example.processing(werewolf);
    }

}
