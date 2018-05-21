class BangBang {
    public static void main(String [] args){
        DingDing d = new DingDing();

        d. snare = false;
        d.playSnare();
        d.playTopHat();
    }
}

class DingDing{
    boolean topHat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHat(){
        System.out.println("ding ding da-ding");
    }
}

