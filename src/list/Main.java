package list;

public class Main {
    public static void main(String[] args) {
        List elementList = new List();
        elementList.add(5);
        elementList.add(3);
        elementList.add(8);
        elementList.print();

        Node existNode = elementList.search(8);
        Node notExistNode = elementList.search(15);
        System.out.println(existNode);
        System.out.println(notExistNode);

        System.out.println(elementList.delete(3));
        System.out.println(elementList.delete(15));
        System.out.println("_________________________________________________");
        elementList.print();

        System.out.println(elementList.delete(8));
        System.out.println("_________________________________________________");
        elementList.print();
    }
}
