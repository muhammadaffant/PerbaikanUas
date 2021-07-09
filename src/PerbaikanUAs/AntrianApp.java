package PerbaikanUAs;
public class AntrianApp {
    public static void main(String[] args) {
        // TODO code application logic here
     Antrian antrian = new Antrian(10);
        antrian.enqueue(50);
        antrian.display();
        antrian.enqueue(60);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        antrian.enqueue(70);
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        System.out.println("yang diambil dari antrian = " + antrian.dequeue());
        antrian.display();
        antrian.enqueue(54);
        antrian.display();
        System.out.println("nilai yang paling depan = " + antrian.peek());
        System.out.print("muhammad affan tamami");
        
    }
    
}