import introducao.bichos.Animal;
import introducao.bichos.Mamifero;


public class App2 {
    public static void main(String[] args) {
        //SUPERCLASSE
        Animal animal = new Animal();
        animal.setSexo("feminino");

        System.out.println(animal.getClass());
        System.out.println(animal.hashCode());

        //SUBCLASSE
        Mamifero mamifero = new Mamifero();
        mamifero.setSexo("masculino");
        mamifero.setGeraleite(false);
        System.out.println(mamifero.getClass());
        System.out.println(mamifero.hashCode());

        Animal animal2 = mamifero;
        //CAST - CONVERSÃO
        System.out.println(((Mamifero)animal2).isGeraleite());
        System.out.println(animal2.getSexo());
        System.out.println(animal2.getClass());
        System.out.println(animal2.hashCode());

    }
}
