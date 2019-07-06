public class DrinkTest {
    public static void main(String[] args) {
        Drink drink1 = new Drink();
        drink1.name = "Vodka sunrsie";
        drink1.price = 21.5;
        drink1.isAlcoholic = true;

        drink1.ingredient1 = new Ingredient();
        drink1.ingredient1.name = "vodka";
        drink1.ingredient1.amount = 50;

        drink1.ingredient2 = new Ingredient();
        drink1.ingredient2.name = "orange juice";
        drink1.ingredient2.amount = 150;

        drink1.ingredient3 = new Ingredient();
        drink1.ingredient3.name = "grenadine";
        drink1.ingredient3.amount = 25;

        Drink drink2 = new Drink();
        drink2.name = "Kamikaze shot";
        drink2.price = 24;
        drink2.isAlcoholic = true;

        drink2.ingredient1 = new Ingredient();
        drink2.ingredient1.name = "vodka";
        drink2.ingredient1.amount = 40;

        drink2.ingredient2 = new Ingredient();
        drink2.ingredient2.name = "lemon juice";
        drink2.ingredient2.amount = 40;

        drink2.ingredient3 = new Ingredient();
        drink2.ingredient3.name = "blue curacao";
        drink2.ingredient3.amount = 40;

        System.out.println("Nazwa drinka: " + drink1.name);
        System.out.println("Cena drinka: " + drink1.price + " zl");
        System.out.println("Czy drink jest z alkoholem: " + drink1.isAlcoholic);
        System.out.println("Skladniki drinka to: " + drink1.ingredient1.name + ", " + drink1.ingredient2.name + " i " + drink1.ingredient3.name);
        System.out.println("Pojemnosc drinka: " + (drink1.ingredient1.amount + drink1.ingredient2.amount + drink1.ingredient3.amount));
        System.out.println("\n");

        System.out.println("Nazwa drinka: " + drink2.name);
        System.out.println("Cena drinka: " + drink2.price + " zl");
        System.out.println("Czy drink jest z alkoholem: " + drink2.isAlcoholic);
        System.out.println("Skladniki drinka to: " + drink2.ingredient1.name + ", " + drink2.ingredient2.name + " i " + drink2.ingredient3.name);
        System.out.println("Pojemnosc drinka: " + (drink2.ingredient1.amount + drink2.ingredient2.amount + drink2.ingredient3.amount));
    }
}
