package u7_advanceoops;
class Mobile{
    String brand;
    int ram;
    double rom;
    Mobile(){ //constructor
        this.brand="kuch dal";
        this.ram=0;
        this.rom=0;
    }
}
public class Test {
    public static void main(String[] args){
        Mobile m=new Mobile();
        System.out.println(m.brand);
    }
    
}
