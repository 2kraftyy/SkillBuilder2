public class GameMaster {
    private static int totalExperiencePoints;

    public static void gainExperience(int x){
        totalExperiencePoints += x;
    }
    public static int getTeamXP(){
        return totalExperiencePoints;

    }
    public static void applyPowerUp(int xp){
        totalExperiencePoints += xp;
    }
    public static void applyPowerUp(double multiplier){
        totalExperiencePoints *= multiplier;
    }
    public static void resetGame(){
        totalExperiencePoints = 0;
    }
    public static void main(String[] args){
        gainExperience(100);
        applyPowerUp(500);
        applyPowerUp(2.5);
    }

}
