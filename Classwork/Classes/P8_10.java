class Scratch {
    public static void main(String[] args) {
        
    }
}

class VotingMachine{
    int democrats = 0;
    int republicans = 0;

    private void voteDemocrats(){
        democrats++;
    }
    private void voteRepublicans(){
        republicans++;
    }
    private void reset() {
        democrats = 0;
        republicans = 0;

    }
    private void tally(){
        System.out.println("Democrats votes = " + democrats + "\n" + "Republicans votes = " + republicans + "\n");
    }
}