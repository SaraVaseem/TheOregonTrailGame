public class Food extends Item{
    
    public void starve(WagonMember member){
        if(this.getCount() == 0){
            member.health -= 4;
        }
    }
}
