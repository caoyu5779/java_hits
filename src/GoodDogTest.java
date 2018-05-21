class GoodDog{
    private int size;

    public int getSize(){
        return size;
    }

    public void setSize(int s){
        size = s;
    }

    void bark(){
        if (size > 60){
            System.out.println("yes");
        } else if (size > 14){
            System.out.println("yeap");
        } else {
            System.out.println("no");
        }
    }
}

class GoodDogTest {

    public static void main(String [] args){
        GoodDog one = new GoodDog();

        one.setSize(70);

        GoodDog two = new GoodDog();
        two.setSize(8);

        System.out.println(one.getSize());
        System.out.println(two.getSize());

        one.bark();
        two.bark();
    }
}
