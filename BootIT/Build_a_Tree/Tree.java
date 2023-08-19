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
        if (age < max_age) {
            if (age % 5 != 0) {
                System.out.println("Your tree is currently " + age + " years old.");
                System.out.println("It has reached the height of " + height + " cm.");
            } else
                System.out.println("Your tree is currently " + age + " years old, and it gets flowers, and it's "
                        + height + " cm.");
        } else
            System.out.println("Your tree is dead");

    }

    void grow() {
        while (age < max_age) {
            age += 1;
            height += growth_rate;
            if (age % 100 == 0) {
                System.out.println("Your tree just grew a year older!");
                System.out.println("Congratulations! Your tree is " + age + " years old.");
            }

            else {
                if (age % 5 == 0 && age % 20 != 0) {
                    System.out.println("Your tree just grew a year older!");
                    System.out.println("It gets flowers, and it's " + age + " years old.");
                } else
                    System.out.println("Your tree just grew a year older! It's " + age + " years old.");
            }
        }
    }

}