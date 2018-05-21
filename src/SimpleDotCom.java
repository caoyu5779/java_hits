public class SimpleDotCom{
    int[] locationCells;
    int numOfHits = 0;

    public void setLocationCells(int[] locs){
        locationCells = locs;
    }

    public String CheckYourself(String stringGuess){
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int ceil : locationCells){
            if (guess == ceil){
                result = "hit";
                numOfHits++;
                break;
            }
        }

        if (numOfHits == locationCells.length){
            result = "kill";
        }

        System.out.println(result);
        return result;
    }
}

class Test{
    public static void main(String[] args){
        SimpleDotCom dot = new SimpleDotCom();
        int[] locations = {1,2,3,4,5};
        dot.setLocationCells(locations);

        String userGuess = "2";
        dot.CheckYourself(userGuess);
    }

}