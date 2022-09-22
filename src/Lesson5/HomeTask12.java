package Lesson5;

public class HomeTask12 {

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private String breed;
        private String anatomy;

        Cat(String name, int age, int weight, String breed, String anatomy) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.breed = breed;
            this.anatomy = anatomy;
        }

        public Cat() {

        }

        public void SayMeow() {
            System.out.println("Мяу!");
        }

        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
            public void setAge(int age) {
                this.age = age;

        }
        public int getWeight() {
            return weight;
        }
            public int setWeight(int weight) {
                return weight;
        }
        public String getBreed() {
            return breed;
        }
        public String setBreed(String breed) {
            return breed ;

        }
        public String getAnatomy() {
            return anatomy;

        }
        public void setAnatomy(String anatomy) {
            this.anatomy = anatomy;

        }
        public static void main(String[] args) {

            Cat barsik = new Cat("barsik",4,5,"Lion","Normal");
            String barsikName = barsik.getName();
            int barsikAge = barsik.getAge();
            int barsikWeight = barsik.getWeight();
            String barsikBreed = barsik.getBreed();
            String barsikAnatomy = barsik.getAnatomy();
            System.out.println("Имя кота: " + barsikName);
            System.out.println("Возраст кота: " + barsikAge);
            System.out.println("Вес кота: " + barsikWeight);
            System.out.println("Порода кота: " + barsikBreed);
            System.out.println("Анатомия кота: " + barsikAnatomy);
        }
    }
    }




