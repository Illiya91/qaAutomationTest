package Lesson6;

class a {
    String nameMan;
    String nameWoman;

       a(String nameMan, String nameWoman) {
           this.nameMan = "Bill";
           this.nameWoman = "Jesica";
       }

       public void family(String nameMan,String nameWoman) {
           System.out.println("Husband" + this.nameMan + "Married on " + this.nameWoman);
       }

       public void life() {
           System.out.println("They are family");


       }

        static class B extends a {

           B(String nameMan, String nameWoman) {
               super(nameMan, nameWoman);


           }

           public static void main(String[] args) {
               a nameMan = new a("Default","Default");
           System.out.println(nameMan);
           }
       }
   }



