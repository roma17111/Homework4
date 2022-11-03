public class Main {
    public static void main(String[] args) {
        int age =3;
        if (age >= 18)
        {System.out.println("Поздравляю с совершеннолетием.");}

    if (age < 18)
        {System.out.println("вам стоит немного подождать. Вы ещё не достигли совершеннолетияю");}

    int people = 19;
    if (people >=7 && people <18) {System.out.println("Ребёнок ходит в школу");}
    if (people >=18 && people <24) {System.out.println("человек уже закончил школу и может отправляться в университет.");}
    if (people >=24) {System.out.println("человек окончил университет и ему пора искать первую работу");}

    int vagon = 1;
    if (vagon >=0 && vagon < 60) {System.out.println("В вагоне есть сидячие и стоячие места");}
    if (vagon >=60 && vagon <102) {System.out.println("В вагоне только стоячие места");}
    if (vagon >=102) {System.out.println(" вагон уже полностью забит.");}


    }
}