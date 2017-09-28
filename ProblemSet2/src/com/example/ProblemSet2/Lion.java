package com.example.ProblemSet2;

public class Lion {
    public static void main(String[] args) {
        String [] places = new String[7];

            places [0] = "Africa";

            places [1] = "North America";

            places [2] = "South America";

            places [3] = "Asia";

            places [4] = "Australia";


        Animal a1 = new Animal();
        Animal a2 = new Animal("Lion", places, 190.0f, 12);

        System.out.print(a1);
        System.out.print(a2);
    }//End of main
}//End of Lion Class
