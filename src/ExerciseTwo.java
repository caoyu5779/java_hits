class ExerciseTwo {
    int size;
    String bread;
    String name;

    void bark(){
        System.out.print(size);
        System.out.print("wang wang");
    }
}

class DogTestDrive{
    public static void main(String[] args){
        ExerciseTwo d = new ExerciseTwo();
        d.size = 40;
        d.bark();
    }
}


