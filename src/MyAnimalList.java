public class MyAnimalList {
    final Animal[] animals = new Animal[5];
    private int nextIndex = 0;
    public void add (Animal a) {
        if (nextIndex < animals.length) {
            animals[nextIndex] = a;
            System.out.println("Animal " + a.getName() +  " added to cell - " + nextIndex);
            nextIndex++;
        }
    }
}
