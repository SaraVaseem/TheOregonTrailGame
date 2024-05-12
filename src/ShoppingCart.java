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
        if(index == 1) {
            return 20;
        } else if (index == 2) {
            return .2;
        } else if(index == 3) {
            return 10;
        } else if(index == 4) {
            return .1;
        } else if(index == 5) {
            return 10;
        } else if(index == 6) {
            return 10;
        } else if(index == 7) {
            return 10;
        }
        return 0;
    }
}