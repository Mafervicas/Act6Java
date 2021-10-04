import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Deck {

    private List<Card> allCardsRevuelto= new ArrayList<>();
    public static void main(String [] args){


    }




    public void  Shuffle (){
        List<Card> allCards= new ArrayList<>();

        String [] palo  = {"Corazones", "Diamantes", "Naipe", "Treboles"};
        String [] color  = {"Rojo", "Negro"};
        String [] valor  = {"2","3","4","5","6","7","8","9","10","J","Q","K","A"};


        String j;
        for (int i= 0; i< palo.length; i++){
           if (i<2){
              j= color[0];
           }
           else
               j= color[1];
                for (int k= 0; k< valor.length; k++){



                    allCards.add((new Card(palo[i], j, valor[k])));

                }

        }


        List<Integer> numeros= new ArrayList<>();
        for (int i= 0; i<52 ; i++) {
            numeros.add(i+1);
        }


        int valuerandom=51;
        for (int i= 0; i<allCards.size() ; i++) {

            int random = (int) (Math.random()*valuerandom);
            allCardsRevuelto.add(allCards.get(random));
            numeros.remove(random);
            valuerandom--;
        }



        System.out.println("Mazo revuelto");

    }




    public void Head(){
        Card carta1= (Card) allCardsRevuelto.get(1);


        carta1.Imprimir();
        allCardsRevuelto.remove(1);

        System.out.println("Quedan "+ allCardsRevuelto.size()+" en el mazo");

    }

    public void Pick(){

        int random = (int) (Math.random()*allCardsRevuelto.size());

        Card cartaPick = (Card) allCardsRevuelto.get(random);
        cartaPick.Imprimir();
        allCardsRevuelto.remove(random);

        System.out.println("Quedan "+ allCardsRevuelto.size()+" en el mazo");
    }

    public void Hand(){

        Card carta1 = (Card) allCardsRevuelto.get(1);
        allCardsRevuelto.remove(1);
        carta1.Imprimir();
        Card carta2 = (Card) allCardsRevuelto.get(2);
        allCardsRevuelto.remove(1);
        carta2.Imprimir();
        Card carta3 = (Card) allCardsRevuelto.get(3);
        allCardsRevuelto.remove(1);
        carta3.Imprimir();
        Card carta4 = (Card) allCardsRevuelto.get(4);
        allCardsRevuelto.remove(1);
        carta4.Imprimir();
        Card carta5 = (Card) allCardsRevuelto.get(5);
        allCardsRevuelto.remove(1);
        carta5.Imprimir();

        System.out.println("Quedan "+ allCardsRevuelto.size()+" en el mazo");
    }
}
