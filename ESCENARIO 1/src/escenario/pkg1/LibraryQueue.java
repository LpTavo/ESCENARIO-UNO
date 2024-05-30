import java.util.LinkedList;
import java.util.Queue;

public class LibraryQueue {
    public static void main(String[] args) {
        
        Queue<String> bookQueue = new LinkedList<>();

     
        bookQueue.offer("Libro de Matemáticas");
        bookQueue.offer("Libro de Historia");
        bookQueue.offer("Libro de Literatura");
        bookQueue.offer("Libro de Ciencias");
        bookQueue.offer("Libro de Economía");


        System.out.println("Orden de solicitud de los estudiantes:");
        while (!bookQueue.isEmpty()) {
            System.out.println(bookQueue.poll());
        }
    }
}

