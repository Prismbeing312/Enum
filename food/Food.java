package food;

public enum Food {
    PASTA(100){
        @Override
       public String doILike() {
            return "It's pretty good " + price;
        }
    }, SUSHI(300) {
        @Override
       public String doILike() {
            return "Love it!!! bring it with me now" + price;
        }
    }, INDIAN(20) {
        @Override
       public String doILike() {
            return "Just like Sushi, Love it!!!" + price;
        }
    }, PIZZA(30){
        @Override
       public String doILike() {
            return "Generally I would say I love it but meh " + price;
        }
    };


    protected int price;

    Food(int price) {
        this.price = price;
    }

   public abstract String doILike();

}
