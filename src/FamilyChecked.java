public class FamilyChecked {
    public static void main(String[] args) {
        Human grandfather1 = new Human("Андрей", true, 92);
        Human grandmother1 = new Human("Ольга", false, 71);

        Human grandfather2 = new Human("Алексей", true, 76);
        Human grandmother2 = new Human("Елизавета", false, 80);

        Human father = new Human("Епифан", true, 40, grandfather1, grandmother1);
        Human mother = new Human("Еремея", false, 38, grandfather2, grandmother2);

        Human child1 = new Human("Ептун", true, 19, father, mother);
        Human child2 = new Human("Елай", false, 20, father, mother);
        Human child3 = new Human("Столан", true, 22, father, mother);

        System.out.println(grandfather1);
        System.out.println(grandmother1);
        System.out.println(grandfather2);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(child1);
        System.out.println(child2);
        System.out.println(child3);
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age ) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }

            return text;
        }
    }
}
