public abstract class SparePart extends Item{
    int count;
    public SparePart(){}
    public SparePart(int count){
        this.count = count;
    }
    public int getCount(){
        return this.count;
    }
    public void setCount(int count){
        this.count = count;
    }
}
