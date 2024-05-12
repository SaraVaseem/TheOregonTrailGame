public class ShoppingCart {
    int[] shoppingCart;

    public ShoppingCart() {
        shoppingCart = new int[7];
    }

    public void setShoppingCart(int index, int count) {
        shoppingCart[index] = count;
    }

    public int getCount(int index) {
        return shoppingCart[index];
    }

    public double getPrice(int index) {
        switch(index) {
            case 1 :
                return 20;
                break;
            case 2 :
                return .2;
                break;
            case 3 :
                return 10;
                break;
            case 4 :
                return .1;
                break;
            case 5 :
                return 10;
                break;
            case 6 :
                return 10;
                break;
            case 7 :
                return 10;
                break;
        }
        return 0;
    }
}