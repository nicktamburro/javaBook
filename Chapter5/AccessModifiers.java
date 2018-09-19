class Access{
 private int alpha;
 public int beta;
 int gamma;  //since we don't specify, it uses default access

//method to access alpha
//remember it's void, it sets something, doesn't return anything'
    void setAlpha (int a){
        alpha = a;
    }
//this one returns something, an int
    int getAlpha(){
        return alpha;
    }
}

class AccessModifiers{
    public static void main(String[] args){
        Access ob = new Access();

        ob.setAlpha(-99);
        System.out.println("ob.alpha is " + ob.getAlpha());

       // ob.alpha = 10;
        //won't work, alpha is private

        //these are okay, the other two are public
        ob.beta = 88;
        ob.gamma = 99;
    }
}