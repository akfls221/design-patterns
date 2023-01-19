package com.example.designpatterns.composit;

public class Client {

    public static void main(String[] args) {
        Bag bag = new Bag();
        Item item1 = new Item("방충봉", 100);
        Item item2 = new Item("도란검", 400);

        bag.add(item1);
        bag.add(item2);

        Client client = new Client();
        client.printPrice(item1);
        client.printPrice(item2);
        client.printPrice(bag);

    }

    private void printPrice(Component component) {
        System.out.println(component.getPrice());
    }
}
