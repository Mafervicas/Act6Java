public class Main {

    public static void main(String [] args){

        Deck deck1= new Deck();
        System.out.println("Suffle");
        deck1.Shuffle();
        System.out.println("Head");
        deck1.Head();
        System.out.println("Pick");
        deck1.Pick();
        System.out.println("Hands");
        deck1.Hand();
        deck1.Hand();

    }
}
