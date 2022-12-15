public class Hero {
    public class Hero1 {private int health;

        private int damage;

        private String superskill;


        private String name;

        public Hero1(int health, int damage, String superskill, String name){
            this.health = health;
            this.damage = damage;
            this.superskill = superskill;
            this.name = name;

        }
        public Hero1(int health, int damage, String name){
            this.health = health;
            this.damage = damage;
            this.name = name;


        }
        public int getHealth (){
            return health;
        }
        public int getDamage (){
            return damage;
        }
        public String getSyperskill (){
            return  superskill;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }


    }

}
