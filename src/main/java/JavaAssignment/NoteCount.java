package JavaAssignment;
//2. Write a program that will count number of notes from given array
//        [1000,500,200,100,50,20,10,5,2,1]
//        Input: 562
//        Output:
//        500 1
//        50 1
//        10 1
//        2 1
public class NoteCount {
    public static void main(String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int amount = 562;

        System.out.println("Amount: " + amount);
        System.out.println("Notes: ");

        for (int i = 0; i < notes.length; i++) {
            int count = amount / notes[i];
            if (count > 0) {
                System.out.println(notes[i] + " " + count);
                amount = amount - count * notes[i];
            }
        }
    }
}
