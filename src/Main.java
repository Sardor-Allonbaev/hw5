public class Main {
    public static void main(String[] args) {public class Main {
        public static void main(String[] args) {
            Boss boss = new Boss();
            boss.setHealth(1000);
            boss.setDamage(95);
            boss.setProtectionType("Physical");
            System.out.println("Boss info: " + boss.getHealth() + " " + boss.getDamage() + " " + boss.getProtectionType());
            Hero[] heroes = createHeroes();
            for (int i = 0; i < heroes.length; i++) {
                System.out.println(heroes[i].getName() + " info: " + heroes[i].getHealth() + " " + heroes[i].getDamage() + " " + heroes[i].getSuperskill());
            }

        }

        public static Hero[] createHeroes() {
            Hero Tank = new Hero(1000, 50, "Protection", "Tank");
            Hero Berserk = new Hero(100, 500,"Berserk");
            Hero Sam = new Hero(150, 150, "With awesome code ", "Sam");
            Hero[] heroesArray = new Hero[3];
            heroesArray[0] = Tank;
            heroesArray[1] = Berserk;
            heroesArray[2] = Sam;
            return heroesArray;

        }
    }

    }
}