public class Human {
    int height;
    int weight;
    int age;
    String sex;
    String name;

    public Human(){}

    public Human(int height, int weight, int age, String sex, String name){
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.sex = sex;
        this.name = name;
    }

    public static void main(String[] args) {
        Human mikola = new Human(175, 85, 22, "man", "Mikola");
        Human lana = new Human(165, 55, 22, "woman", "Lana");
        Human igor = new Human(185, 95, 32, "man", "Igor");

        System.out.println(mikola.height + " " + mikola.weight + " " + mikola.age + " " + mikola.sex + " " + mikola.name);
    }
}
