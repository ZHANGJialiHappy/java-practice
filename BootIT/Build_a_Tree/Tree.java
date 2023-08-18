package Build_a_Tree;

public class Tree {
    double height;
    int age;
    double growth_rate;
    int max_age;

    Tree(double h, int a, double r, int m_a) {
        height = h;
        age = a;
        growth_rate = r;
        max_age = m_a;
    }

    void display() {
        if (age % 5 > 0) {
            System.out.println("Your tree is currently" + age + "years old.");
            System.out.println("It has reached the height of" + height + " cm.");
        } else
            System.out.println("Your tree is currently" + age + "years old.");

    }

    void grow() {
        while (age < max_age && age % 5 != 0) {
            age += 1;
            System.out.println("And your tree just grew a year older!");
        }
    }

}