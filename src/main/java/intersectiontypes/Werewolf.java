package intersectiontypes;

class Werewolf implements Wolf, Human {
    @Override
    public void talk() {
        System.out.println(" ... talks like a human!");
    }
    @Override
    public void howl() {
        System.out.println(" ... howls like a wolf!");
    }

}
