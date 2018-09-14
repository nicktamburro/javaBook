class VibeDirectory{
    public static void main(String[] args){
        String vibes[][] = {
            {"Spiritualized", "spacey, dreamy"},
            {"Sonic Youth", "noisey, arty"},
            {"Sparklehorse", "lovely, sad"}
        };

        int i;

        if(args.length != 1)
            System.out.println("Type java VibeDirectory <band name>");
        else{
            for (i=0; i<vibes.length; i++){
                if(numbers[i][0].equals(args[0])){
                    System.out.println(vibes[i][0] + ": " + vibes[i][1]);
                break;
            }
            if(i == vibes.length){
                Systtem.out.println("We don't know that band, or their vibe.");
            }
            }
        }
        }
    }
