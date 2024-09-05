public class Dog{
    String name;
    String brred;
    int age;
    String color;
    public Dog(String name,String brred,int age,String color ){
        this.name=name;
        this.brred=brred;
        this.age=age;
        this.color=color;
    }
    public String getName(){return name;}
    public String getBrred(){return brred;}
    public int getAge(){return age;}
    public String getColor(){return color;}
    @Override public String toString(){
        return("Hi my name is"+this.getName()+"\n My Breed(),age and color are"+this.getBrred()+","+this.getColor());
    }

    public static void main(String[] args) {
        Dog tuffy =new Dog("tuffy","papillon",'S',"white");
        System.out.println(tuffy.toString());
        
    }
}
