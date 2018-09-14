class SwitchString{
    public static void main(String args[]){
        //here we're going to use a string to control a switch

        String command = "cancel";

        switch(command){
            case "connect":
                System.out.println("Connecting");
                break;
            case "cancel":
                System.out.println("Canceling");
                break;
            case "disconnet":
                System.out.println("Disconnecting");
                break;
            default:
                System.out.println("Command error");
                break;
        }
    }
}