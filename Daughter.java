class GrandFather {
    public void showG() {
        System.out.println("He is grandfather.");
    }
}

// inherits GrandFather properties
class Father extends GrandFather {
    public void showF() {
        System.out.println("He is father.");
    }
}

// inherits Father properties (multilevel)
class Son extends Father {
    public void showS() {
        System.out.println("He is son.");
    }
}

// inherits Father properties (hierarchical)
public class Daughter extends Father {

    public void showD() {
        System.out.println("She is daughter.");
    }

    public static void main(String args[]) {

        Son obj = new Son();
        obj.showS(); // Son method
        obj.showF(); // Father method
        obj.showG(); // GrandFather method

        Daughter obj2 = new Daughter();
        obj2.showD(); // Daughter method
        obj2.showF(); // Father method
        obj2.showG(); // GrandFather method
    }
}
