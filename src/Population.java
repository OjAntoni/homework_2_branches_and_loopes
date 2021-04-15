public class Population {
    public static void main(String[] args) {
        int population = 10000000;
        int birth_coef =14;
        int death_coef = 8;

        for(int i = 0; i < 10; i++){
            population = population + (int)((birth_coef - death_coef) * population/1000.0);
            if(birth_coef > 7){
                birth_coef -= 1;
            }
            if(death_coef > 6){
               death_coef -= 1;
            }
        }

        System.out.println(population);
    }
}
