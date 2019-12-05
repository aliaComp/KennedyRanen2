import javax.xml.bind.SchemaOutputResolver;

public class MyFirstClass {
    public static void main(String[] args) {
        Cat myCat = new Cat();
        myCat.name = "Vasya";
       myCat.food = "Viskas";
       myCat.food2 = "Hills";


        myCat.eat("Viskas", "Hills");


    }

}
