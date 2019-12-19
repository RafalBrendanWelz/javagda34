package webinar1.myLinkedList;

public class Main {
    public static void main(String[] args) {

        MyLinkedList mojaLista = new MyLinkedList();
        System.out.println(mojaLista.toString());

        mojaLista.add(10);
        mojaLista.add(20);
        mojaLista.add(30);

        mojaLista.add(666, 2);



        System.out.println(mojaLista.toString());


    }
}
